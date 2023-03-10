package tn.esprit.infini.stationdeski.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.infini.stationdeski.entities.Piste;
import tn.esprit.infini.stationdeski.services.IPiste;
import tn.esprit.infini.stationdeski.services.PisteService;

import java.util.List;

public class PisteController {
  IPiste pisteService;
    @GetMapping("/getPistes")
    public List<Piste> getPiste() {
        List<Piste> listPistes = pisteService.retrieveAllpistes();
        return listPistes;
    }
    @PostMapping("/ajouterPiste")
    public Piste ajouter(@RequestBody Piste Piste){
        return pisteService.addPiste(Piste);

    }
    @GetMapping("/afficherPiste/{id}")
    public Piste afficherAvecId(@PathVariable Long numPiste){
        return pisteService.retrievepiste(numPiste);
    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste s) {
        Piste Piste = pisteService.updatepiste(s);
        return Piste;
    }

    @DeleteMapping("/removePiste/{numPiste}")
    public void removePiste(@PathVariable("numPiste") Long numPiste) {
        pisteService.deletepiste(numPiste);
    }


}
