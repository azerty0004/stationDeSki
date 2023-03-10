package tn.esprit.infini.stationdeski.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.infini.stationdeski.entities.Cours;
import tn.esprit.infini.stationdeski.entities.Moniteur;
import tn.esprit.infini.stationdeski.repository.CoursRepository;
import tn.esprit.infini.stationdeski.repository.MoniteurRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class MoniteurService implements  ImoniteurService{
    @Autowired
    CoursRepository coursRepository;
    @Autowired
    MoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        return moniteurRepository.save(e);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        return moniteurRepository.save(e);
    }

    @Override
    public Moniteur retrieveMoniteur(Long idMoniteur) {
        return moniteurRepository.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(Long idMoniteur) {
        moniteurRepository.deleteById(idMoniteur);

    }

    @Override
    public Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCourse) {

        Moniteur m =moniteurRepository.save(moniteur);
        Cours cours = coursRepository.findById(numCourse).get();
        m.getCours().add(cours);
        moniteurRepository.save(m);
        return m;


    }
}
