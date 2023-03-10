package tn.esprit.infini.stationdeski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.infini.stationdeski.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
