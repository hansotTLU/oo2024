package ee.tlu.kodus;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutoRepository extends JpaRepository<AutoEntity, String> {
}