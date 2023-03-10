package tn.esprit.infini.stationdeski.services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.infini.stationdeski.entities.Piste;
import tn.esprit.infini.stationdeski.entities.Skieur;
import tn.esprit.infini.stationdeski.repository.PisteRepository;
import tn.esprit.infini.stationdeski.repository.SkieurRep;

import java.util.List;

public class SkieurService implements  ISkieur{
    @Autowired
    SkieurRep skieurRep;
    @Autowired
    PisteRepository pisteRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRep.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur p) {
        return skieurRep.save(p);
    }

    @Override
    public Skieur updateSkieur(Skieur p) {
        return skieurRep.save(p);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRep.findById(numSkieur).get();
    }

    @Override
    public void deleteSkieur(Long numSkieur) {
      skieurRep.deleteById(numSkieur);

    }

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRep.findBynumSkieur(numSkieur);
        Piste piste = pisteRepository.findByNumPiste(numPiste);
        skieur.getPiste().add(piste);

        return skieur;
    }
}
