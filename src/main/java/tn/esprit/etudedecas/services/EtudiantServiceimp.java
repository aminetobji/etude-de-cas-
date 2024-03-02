package tn.esprit.etudedecas.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.repositories.EtudiantRepository;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServiceimp implements IEtudiant{
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEt(Etudiant e) {
        return etudiantRepository.save(e);

    }

    @Override
    public Etudiant updateEt(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> getAllEtud() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEt(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public List<Etudiant> getByNom(String nom) {
        return etudiantRepository.findByNomEt(nom);

    }

    @Override
    public List<Etudiant> getEtudiantByDateNaissance(Date dateDebut, Date dateFin) {
        return etudiantRepository.findByDateNaissanceBetween(dateDebut, dateFin);
    }
}
