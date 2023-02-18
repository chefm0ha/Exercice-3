import java.time.LocalDate;

public class Athlete extends Personne {

    private LocalDate dateInscription;
    private Assurance assurance;

    public Athlete(int id, String nom, String prenom, String profession, LocalDate dateNaissance, String lieuNaissance,
            String adresse, String telephone, LocalDate dateInscription, Assurance assurance) {
        super(id, nom, prenom, profession, dateNaissance, lieuNaissance, adresse, telephone);
        this.dateInscription = dateInscription;
        this.assurance = assurance;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Assurance getAssurance() {
        return assurance;
    }

    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }

    public void afficher() {
        System.out.println("Athlete: ");
        super.afficher();
        System.out.println("   date d'inscription: " + dateInscription);

        assurance.afficher();
    }

    public boolean estAssure() {
        if (assurance == null || assurance.getDateFin().isBefore(LocalDate.now()))
            return false;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
