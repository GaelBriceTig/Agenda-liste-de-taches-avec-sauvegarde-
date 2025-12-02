package taches;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tache {

    private String titre;
    private String description;
    private LocalDateTime dateEcheance;
    private Boolean estTermine;

    public Tache(String titre, String description, LocalDateTime dateEcheance, Boolean estTermine) {
        this.titre = titre;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.estTermine = estTermine;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(LocalDateTime dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public Boolean getEstTermine() {
        return estTermine;
    }

    public void setEstTermine(Boolean estTermine) {
        this.estTermine = estTermine;
    }

    @Override
    public String toString() {
        return ("Tache {Titre: "+titre+", Description: "+ description +", dateEcheance: "+dateEcheance+ ", terminé :" + estTermine+"}");
    }
}
