import logo from './logo.svg';
import './App.css';

function App() {
  const [mitu, setMitu] = useState(0);
  const [autod, setAutod] = useState([]);
  const mudelRef = useRef();
  const kwRef = useRef();
  const mootoriSuurusRef = useRef();
  const mootoriTyypRef = useRef();
  const [autoosad, setAutoosad] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/autod")
    .then(response => response.json()) // koos metadataga (headerid, staatuskood, OK)
    .then(json => {
      setMitu(json.length);
      setAutod(json);
    }) // body
  }, []);

  useEffect(() => {
    fetch("http://localhost:8080/autoosad")
    .then(response => response.json()) // koos metadataga (headerid, staatuskood, OK)
    .then(json => {
      setAutoosad(json);
    }) // body
  }, []);


  function kustutaAuto(primaarvoti) {
    fetch("http://localhost:8080/api/autod/" + primaarvoti, {"method": "DELETE"})
      .then(response => response.json())
      .then(json => {
        setMitu(json.length);
        setAutod(json);
      }) // body
  }

  function kustutaAO(primaarvoti) {
    fetch("http://localhost:8080/autoosad/" + primaarvoti, {"method": "DELETE"})
      .then(response => response.json()) // koos metadataga (headerid, staatuskood, OK)
      .then(json => {
        setAutoosad(json);
      }) // body
  }


  function lisaAuto() {
    const auto = {
        "mudel": mudelRef.current.value,
        "kw": kwRef.current.value,
        "mootoriSuurus": mootoriSuurusRef.current.value,
        "mootoriTyyp": mootoriTyypRef.current.value
    }
    fetch("http://localhost:8080/api/autod", 
    {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(auto)
    })
   .then(response => response.json())
   .then(json => {
        setMitu(json.length);
        setAutod(json);
    })
  }


  const aoMudelRef = useRef();
  const mituRef = useRef();

  function lisaAO() {
    const lisatavAO = {
      "auto": {"mudel": aoMudelRef.current.value},
      "mitu": mituRef.current.value
    }
    fetch("http://localhost:8080/autoosad", 
    {
      "method": "POST",
      "body": JSON.stringify(lisatavAO),
      "headers": {"Content-Type": "application/json"}
    })
      .then(response => response.json())
      .then(json => {
        setAutoosad(json);
    })
  }


  return (
    <div className="App">
      <h1>AUTOD</h1>

      <label>Auto mudel</label> <br/>
      <input ref={mudelRef} type="text" /> <br/>
      <label>Auto KW</label> <br/>
      <input ref={kwRef} type="number" /> <br/>
      <label>Auto mootori suurus (L)</label> <br/>
      <input ref={mootoriSuurusRef} type="number" /> <br/>
      <label>Auto mootori tüüp (V6, V8, I6 jne)</label> <br/>
      <input ref={mootoriTyypRef} type="text" /> <br/>
      <button onClick={() => lisaAuto()}>Lisa</button> <br/>
      <br/>
      Laos on {mitu} erinevat auto mudelit:
      {autod.map(a => <div>• {a.mudel} | {a.kw} | {a.mootoriSuurus} | {a.mootoriTyyp} <button onClick={() => kustutaAuto(a.mudel)}>🗑️</button></div>)}
      <hr/>

      <label>Auto mudel (täpne mudel andmebaasist)</label> <br/>
      <input ref={aoMudelRef} type="text" /> <br/>
      <label>Kogus</label> <br/>
      <input ref={mituRef} type="number" /> <br/>
      <button onClick={() => lisaAO()}>Sisesta</button> <br/>
      {autoosad.map(ao => <div>• {ao.id} | {ao.auto?.mudel} | {ao.mitu} <button onClick={() => kustutaAO(ao.id)}>🗑️</button></div>)}
    </div>
  );
}

export default App;
