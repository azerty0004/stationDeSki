package tn.esprit.infini.stationdeski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.infini.stationdeski.entities.Skieur;

public interface SkieurRep extends JpaRepository<Skieur,Long> {
Skieur findBynumSkieur(Long numSkieur);
}
