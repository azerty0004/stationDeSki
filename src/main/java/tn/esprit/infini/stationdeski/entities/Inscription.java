package tn.esprit.infini.stationdeski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="Inscription")
public class Inscription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInscription")
    private int numSemaine; // Clé primaire
    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Cours cours;


}
