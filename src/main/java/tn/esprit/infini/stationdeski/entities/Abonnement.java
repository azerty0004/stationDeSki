package tn.esprit.infini.stationdeski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Abonnement")

public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numAbon")
    private Long numAbon;
    private Date dateDebut;
    private Date dateFin;
    @Enumerated(EnumType.STRING)    ///
    private typeAbon TypeAbon;
    private Float prixAbon;

}
