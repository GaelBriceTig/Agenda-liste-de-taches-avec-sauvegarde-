package agenda;

import taches.Tache;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    /*
    * on crée une liste dans la quelle on vas stocker nos differents taches
    * */
    List<Tache> agendas = new ArrayList<Tache>();

    /*
    * function permettant d'ajouter une tache à notre agenda*/
    public void ajouterTache(Tache tache) {
        this.agendas.add(tache);
    }

    /*
    * function permettant de valider si une tache est terminé ou en cour*/
    public Boolean marquerCommeTerminee(Tache tache) {
        return null;
    }

    /* Tache permettant d'afficher la liste des taches presente dans ton agenda*/
    public void afficherTaches(){

        for (Tache tache : agendas) {
            System.out.println(agendas);
        }

    }
}
