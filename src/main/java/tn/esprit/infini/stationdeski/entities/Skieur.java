package tn.esprit.infini.stationdeski.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@AllArgsConstructor
@Entity
@Setter
@Getter
@Table(name="Skieur")
public class Skieur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    private Long numSkieur;
    private String nomS;

    private String prenom;
    private Date dateNaissance;
    private  String ville;
    @ManyToMany()
    private Set<Piste> piste;
    @OneToMany(mappedBy="skieur")
    private Set<Inscription> Inscriptions;
    @OneToOne
    private Abonnement abonnement;


    public Skieur() {

    }
}
