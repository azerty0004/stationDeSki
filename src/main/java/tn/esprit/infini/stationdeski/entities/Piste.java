package tn.esprit.infini.stationdeski.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="Piste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPiste")
    private Integer idPiste;
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)    ///
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;
    @ManyToMany(mappedBy ="piste" )
    private Set<Skieur> skieur;
}
