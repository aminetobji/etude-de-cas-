package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface IEtudiant {
    public Etudiant addEt(Etudiant e);
    public Etudiant updateEt(Etudiant e);
    public List<Etudiant> getAllEtud();
    public Etudiant getById(Long id);
    public void deleteEt(Long id);
    public List<Etudiant> getByNom(String nom);

    public List<Etudiant> getEtudiantByDateNaissance(Date dateD ,Date dateF);


}
