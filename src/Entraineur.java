import java.time.LocalDate;

public class Entraineur extends Personne {

    private double salaire;

    public Entraineur(int id, String nom, String prenom, String profession, LocalDate dateNaissance,
            String lieuNaissance,
            String adresse, String telephone, double salaire) {
        super(id, nom, prenom, profession, dateNaissance, lieuNaissance, adresse, telephone);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void afficher() {
        System.out.println("Entraineur:");
        super.afficher();
        System.out.println("   Salaire: " + salaire);
    }

}
