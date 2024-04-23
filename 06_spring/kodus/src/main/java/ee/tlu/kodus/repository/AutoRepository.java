package ee.tlu.kodus.repository;

import ee.tlu.kodus.entity.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<AutoEntity, String> {
}