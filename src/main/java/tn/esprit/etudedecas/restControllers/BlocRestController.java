package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.services.IBloc;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    private IBloc iBloc;
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc){
        return iBloc.addBloc(bloc);

    }
    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc){
        return iBloc.updateBloc(bloc);

    }
    @GetMapping("/getAllBloc")
    public List<Bloc> getAllBloc(){
        return iBloc.getAllBloc();

    }
    @GetMapping("/getBlocById/{idBloc}")
    public Bloc getBlocById(@PathVariable Long idBloc){
        return iBloc.getBlocById(idBloc);

    }
    @DeleteMapping("/deleteBloc/{idBloc}")
    public void deleteBlocById(@PathVariable Long idBloc){
        iBloc.deliteBlocById(idBloc);

    }

}
