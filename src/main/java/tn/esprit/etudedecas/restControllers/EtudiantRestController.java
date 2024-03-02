package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.services.IEtudiant;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {
    private IEtudiant iEtudiant;

    @PostMapping("/addEtud")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return iEtudiant.addEt(e);

    }

    @PutMapping("/updateEtud")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return iEtudiant.updateEt(e);

    }

    @GetMapping("/getAllEtud")
    public List<Etudiant> getAllEtud() {
        return iEtudiant.getAllEtud();
    }

    @GetMapping("/getById/{id}")
    public Etudiant getById(@PathVariable Long id) {
        return iEtudiant.getById(id);
    }

    @DeleteMapping("/deleteEt/{id}")
    public void deleteEt(@PathVariable Long id) {
        iEtudiant.deleteEt(id);
    }

    @GetMapping("/getbynom/{nom}")
    public List<Etudiant> getByNom(@PathVariable String nom) {
        return iEtudiant.getByNom(nom);


    }

    @GetMapping("/getbyNaissance/{dateD}/{dateF}")
    public List<Etudiant> findByDateNaissanceBetween(

            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateD,

            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateF) {
        // Convert LocalDate to Date if needed
        //Date startDate = Date.from(dateD.atStartOfDay(ZoneId.systemDefault()).toInstant());
        //Date endDate = Date.from(dateF.atStartOfDay(ZoneId.systemDefault()).toInstant());


        return iEtudiant.getEtudiantByDateNaissance(dateD, dateF);
    }
}

