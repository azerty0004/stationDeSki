package tn.esprit.infini.stationdeski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Moniteur")
public class Moniteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numMoniteur")
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;
    @OneToMany()
    private Set<Cours> cours;

    public Long getNumMoniteur() {
        return numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public Date getDateRecru() {
        return dateRecru;
    }

    public Set<Cours> getCours() {
        return cours;

    }

    public void setNumMoniteur(Long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public void setDateRecru(Date dateRecru) {
        this.dateRecru = dateRecru;
    }

    public void setCours(Set<Cours> cours) {
        this.cours = cours;
    }
}
