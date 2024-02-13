public class Tellimus {
    String tellija;
    double tellimuseSumma;
    String tellitavEse;

    public Tellimus(String _tellija, double _tellimuseSumma, String _tellitavEse) {
        this.tellija = _tellija;
        this.tellimuseSumma = _tellimuseSumma;
        this.tellitavEse = _tellitavEse;
    }

    public double tellimuseSummaDollarites() {
        return tellimuseSumma * 1.07;
    }

    public void tellijaNimeVahetus(String tellijaUusNimi) {
        tellija = tellijaUusNimi;
    }
}
