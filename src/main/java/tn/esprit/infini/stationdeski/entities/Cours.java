package tn.esprit.infini.stationdeski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Cours")
public class Cours implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numCours")
    @Id
    private Long numCours;
    private Integer niveau;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private TypeCourS TypeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float prix;
    @OneToMany(mappedBy="cours")
    private Set<Inscription> inscription;

    public Long getNumCours() {
        return numCours;
    }

    public void setNumCours(Long numCours) {
        this.numCours = numCours;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public TypeCourS getTypeCours() {
        return TypeCours;
    }

    public void setTypeCours(TypeCourS typeCours) {
        TypeCours = typeCours;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Set<Inscription> getInscription() {
        return inscription;
    }

    public void setInscription(Set<Inscription> inscription) {
        this.inscription = inscription;
    }
}
