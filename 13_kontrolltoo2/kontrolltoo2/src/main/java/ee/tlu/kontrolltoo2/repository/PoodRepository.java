package ee.tlu.kontrolltoo2.repository;

import ee.tlu.kontrolltoo2.entity.Pood;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PoodRepository extends JpaRepository<Pood, Long> {

    List<Pood> findByAvamineLessThanEqualAndSulgemineGreaterThanEqual(Long avamine, Long sulgemine);

    Pood findByNimetus(String nimetus);

    Pood findFirstByOrderByKulastajadDesc();

    List<Pood> findByKaubanduskeskus_NimetusAndAvamineLessThanEqualAndSulgemineGreaterThanEqual(String nimetus, Long avamine, Long sulgemine);

    List<Pood> findByKaubanduskeskus_Nimetus(String nimetus);

}
