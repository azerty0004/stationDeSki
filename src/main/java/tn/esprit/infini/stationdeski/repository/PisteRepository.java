package tn.esprit.infini.stationdeski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.infini.stationdeski.entities.Piste;
import tn.esprit.infini.stationdeski.entities.Skieur;

import javax.persistence.criteria.CriteriaBuilder;

public interface PisteRepository extends JpaRepository<Piste, CriteriaBuilder.In> {
    Piste findByNumPiste(Long numPiste);

    void deleteByNumPiste(Long numPiste);
}
