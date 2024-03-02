package tn.esprit.etudedecas.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.repositories.BlocRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceimp implements IBloc {

    private BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getBlocById(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void deliteBlocById(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

}
