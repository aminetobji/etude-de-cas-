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
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc ;
    private String nomBloc ;
    private Long capaciteBloc ;
    @ManyToOne
    private Foyer foyer;
@OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambres;
}
