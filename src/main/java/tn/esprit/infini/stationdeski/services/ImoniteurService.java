package tn.esprit.infini.stationdeski.services;
import tn.esprit.infini.stationdeski.entities.Moniteur;

import java.util.List;

public interface ImoniteurService {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur e);

    Moniteur updateMoniteur (Moniteur e);

    Moniteur retrieveMoniteur (Long idMoniteur);

    void deleteMoniteur( Long idMoniteur);

    Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCourse);
}
