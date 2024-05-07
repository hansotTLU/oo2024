package ee.tlu.proovikt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToodeRepository extends JpaRepository<Toode, Long> {
    // Toode    või     List<Toode>

    List<Toode> findByHindBetween(double hindStart, double hindEnd);

    Toode findFirstByHindNotNullOrderByHindDesc();


    // Pole controlleris aga pmst käib nii sõnadega (sisaldab *x*, algab *x*):
    List<Toode> findByNimiContains(String nimi);

    List<Toode> findByNimiStartsWith(String nimi);

    List<Toode> findByKategooria_Id(Long id);


}
