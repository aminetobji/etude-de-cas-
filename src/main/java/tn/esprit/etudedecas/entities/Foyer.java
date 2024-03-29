package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Foyer;
    private String nomFoyer;
    private Long capacityFoyer;
    @OneToOne(mappedBy = "foyer")

    private Universite universite;
    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocSet;

}
