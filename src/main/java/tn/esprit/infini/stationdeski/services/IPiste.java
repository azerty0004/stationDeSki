package tn.esprit.infini.stationdeski.services;

import tn.esprit.infini.stationdeski.entities.Piste;


import java.util.List;

public interface IPiste {
    Piste addPiste(Piste piste);

    List<Piste> retrieveAllpistes();

    Piste updatepiste(Piste piste);

    Piste retrievepiste(Long idPiste);

    void deletepiste(Long idFine);
}
