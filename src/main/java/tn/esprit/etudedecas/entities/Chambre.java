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
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idChambre ;
    private Long numeroChambre ;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @OneToMany
    private Set<Reservation> reservations;
@ManyToOne
    private Bloc bloc;
}
