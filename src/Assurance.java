import java.time.LocalDate;

public class Assurance {
    public LocalDate dateDebut;
    public LocalDate dateFin;

    public Assurance(LocalDate dateDebut, LocalDate dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Cette methode permet d'afficher une assurance
     */
    public void afficher() {
        System.out.println("Assurance: ");
        System.out.println("   dateDebut: " + dateDebut);
        System.out.println("   dateFin: " + dateFin);
    }

}
