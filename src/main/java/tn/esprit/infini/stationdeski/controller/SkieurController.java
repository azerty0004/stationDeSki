package tn.esprit.infini.stationdeski.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.infini.stationdeski.entities.Skieur;
import tn.esprit.infini.stationdeski.services.ISkieur;

import java.util.List;

public class SkieurController {
    ISkieur skieurService;
    @GetMapping("/getSkieurs")
    public List<Skieur> getSkieur() {
        List<Skieur> listSkieurs = skieurService.retrieveAllSkieurs();
        return listSkieurs;
    }
    @PostMapping("/ajouterSkieur")
    public Skieur ajouter(@RequestBody Skieur Skieur){
        return skieurService.addSkieur(Skieur);

    }
    @GetMapping("/afficherSkieur/{id}")
    public Skieur afficherAvecId(@PathVariable Long numSkieur){
        return skieurService.retrieveSkieur(numSkieur);
    }

    @PutMapping("/updateSkieur")
    public Skieur updateSkieur(@RequestBody Skieur s) {
        Skieur skieur = skieurService.updateSkieur(s);
        return skieur;
    }

    @DeleteMapping("/removeSkieur/{numSkieur}")
    public void removeSkieur(@PathVariable("numSkieur") Long numSkieur) {
        skieurService.deleteSkieur(numSkieur);
    }
    @PutMapping("/assignSkieurtopiste/{numSkieur}/{numPiste}")
    public Skieur assignSkieurToPiste(@PathVariable("numSkieur") Long numSkieur, @PathVariable ("numPiste") Long numPiste) { return skieurService.assignSkieurToPiste(numSkieur,numPiste); }


}
