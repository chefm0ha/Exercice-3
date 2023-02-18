import java.time.LocalDate;

public abstract class Personne {

    protected int id;
    protected String nom;
    protected String prenom;
    protected String profession;
    protected LocalDate dateNaissance;
    protected String lieuNaissance;
    protected String adresse;
    protected String telephone;

    public Personne(int id, String nom, String prenom, String profession, LocalDate dateNaissance, String lieuNaissance,
            String adresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public void afficher() {
        System.out.println("   id: " + id);
        System.out.println("   nom: " + nom);
        System.out.println("   prenom: " + prenom);
        System.out.println("   profession: " + profession);
        System.out.println("   date de naissance: " + dateNaissance);
        System.out.println("   lieu de naissance: " + lieuNaissance);
        System.out.println("   adresse: " + adresse);
        System.out.println("   telephone: " + telephone);
    }

    public int getId() {
        return id;
    }

}
