package tn.esprit.infini.stationdeski.services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.infini.stationdeski.entities.Piste;
import tn.esprit.infini.stationdeski.repository.PisteRepository;

import java.util.List;

public class PisteService implements  IPiste {
    @Autowired
    PisteRepository PisteRep;



    @Override
    public List<Piste> retrieveAllpistes() {
        return PisteRep.findAll();
    }

    @Override
    public Piste addPiste(Piste p) {
        return PisteRep.save(p);
    }

    @Override
    public Piste updatepiste(Piste p) {
        return PisteRep.save(p);
    }

    @Override
    public Piste retrievepiste(Long numPiste) {
        return PisteRep.findByNumPiste(numPiste);
    }

    @Override
    public void deletepiste(Long idPiste) {
        PisteRep.deleteByNumPiste(idPiste);


    }
}
