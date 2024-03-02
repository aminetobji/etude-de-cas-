package tn.esprit.etudedecas.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Foyer;
import tn.esprit.etudedecas.services.IFoyerService;

import java.util.List;

@RestController
public class FoyerRestController {
    @Autowired
    private IFoyerService iFoyerService;


    @PostMapping("/addFoyer")
    public Foyer AddFoyer(@RequestBody Foyer f){

        return iFoyerService.addFoyer(f);

    }

    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f){
        return iFoyerService.updateFoyer(f);

    }
    @GetMapping("/getAll")
    public List<Foyer> getAllFoyer(){
        return iFoyerService.getAllFoyer();
    }

    @GetMapping("/getFoyer/{idF}")
    public Foyer findById(long idF){
        return iFoyerService.getFoyerById(idF);

    }
    @DeleteMapping("/supprimer/{idf}")
    public void deletFoyer (long idf){
        iFoyerService.deleteFoyer(idf);
    }
}
