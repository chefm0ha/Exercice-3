import java.time.LocalDate;
import java.util.LinkedList;

public class clubSportif {

        static LinkedList<Personne> listPersonnes = new LinkedList<Personne>();

        public static void listerAthletes() {
                for (Personne at : listPersonnes)
                        if (at instanceof Athlete)
                                at.afficher();
                System.out.println();
        }

        public static void listerAthletesNonAssure() {
                for (Personne at : listPersonnes)
                        if (at instanceof Athlete && !((Athlete) at).estAssure())
                                at.afficher();
                System.out.println();
        }

        public static void listerEntraineurs() {
                for (Personne en : listPersonnes)
                        if (en instanceof Entraineur)
                                en.afficher();
                System.out.println();
        }

        // public static Athlete getAthlete(int id) {
        // for (Athlete at : listAthlete) {
        // if (at.getId() == id)
        // return at;
        // }
        // return null;
        // }

        // public static Entraineur getEntraineur(int id) {
        // for (Entraineur at : listEntraineur) {
        // if (at.getId() == id)
        // return at;
        // }
        // return null;
        // }

        // public static void supprimerAthleteNonAssure(Athlete athlete) {

        // // Guard Clause
        // if (athlete.estAssure()) {
        // System.out.println("Cet athlete est assure!");
        // return;
        // }

        // boolean deleted = false;
        // for (Athlete at : listAthlete)
        // if (at.equals(athlete)) {
        // listAthlete.remove(at);
        // deleted = true;
        // break;
        // }
        // if (deleted)
        // System.out.println("L'athlete est supprime avec succes");
        // else
        // System.out.println("L'athlete n'existe pas");
        // }

        public static void main(String[] args) {

                Assurance a1 = new Assurance(LocalDate.of(2022, 7, 12), LocalDate.of(2021, 7, 13));
                Assurance a2 = new Assurance(LocalDate.of(2022, 4, 16), LocalDate.of(2023, 4, 17));

                Athlete at1 = new Athlete(1, "Yassir", "Benkirane", null, LocalDate.of(2002, 6, 14), "Tahla",
                                "Oualed Tayeb",
                                "0620336811",
                                LocalDate.of(2021, 7, 10), a1);

                Athlete at2 = new Athlete(2, "Noureddine", "Benkirane", "freeLance",
                                LocalDate.of(1962, 1, 1), "Casablanca",
                                "Hay Nakhil",
                                "0712839210", LocalDate.of(2021, 7, 10), a2);

                Entraineur en1 = new Entraineur(3, "said", "Elhafyani", null, LocalDate.of(2002, 8, 14), "Errachidia",
                                null, null, 6000);

                listPersonnes.add(at1);
                listPersonnes.add(at2);

                listPersonnes.add(en1);

                // listerAthletes();

                // System.out.println("Les atheletes non assure sont: ");
                // listerAthletesNonAssure();

                // listerEntraineurs();

                // Athlete at = getAthlete(3);

                // if (at == null)
                // System.out.println("Athlete not found!");
                // else
                // at.afficher();

                // Entraineur en = getEntraineur(3);

                // if (en == null)
                // System.out.println("Athlete not found!");
                // else
                // en.afficher();

                // supprimerAthleteNonAssure(at1);

                // listerAthletes();

        }

}
