package tn.esprit.infini.stationdeski.services;

import tn.esprit.infini.stationdeski.entities.Skieur;

import java.util.List;

public interface ISkieur {
    Skieur addSkieur(Skieur skieur);

    List<Skieur> retrieveAllSkieurs();

    Skieur updateSkieur(Skieur skieur);

    Skieur retrieveSkieur(Long idFine);

    void deleteSkieur(Long idFine);
    Skieur assignSkieurToPiste(Long numSkieur,Long numPiste);
}
