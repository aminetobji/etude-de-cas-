package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Bloc;

import java.util.List;

public interface IBloc {
    public Bloc addBloc(Bloc bloc);
    public Bloc updateBloc(Bloc bloc);
    public List<Bloc> getAllBloc();
    public Bloc getBlocById(Long idBloc);
    public void deliteBlocById(Long idBloc);
}
