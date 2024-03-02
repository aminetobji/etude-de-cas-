package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
public List<Etudiant> findByNomEt(String nom);
public List<Etudiant> findByDateNaissanceBetween(Date dateD,Date dateF);


}
