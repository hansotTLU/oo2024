package ee.tlu.kodus;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<AutoEntity, String> {
}