package tn.esprit.infini.stationdeski.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.infini.stationdeski.entities.Moniteur;
import tn.esprit.infini.stationdeski.services.ISkieur;
import tn.esprit.infini.stationdeski.services.ImoniteurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurController {
    ImoniteurService imoniteurService;
    @GetMapping("/retrieve-all-moniteurs")
    public List<Moniteur> getMoniteurs() {
        List<Moniteur> listMoniteurs = imoniteurService.retrieveAllMoniteurs();
        return listMoniteurs;
    }
}
