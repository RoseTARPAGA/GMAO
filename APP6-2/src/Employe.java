import java.util.ArrayList;
import java.util.List;

public class Employe {
    private String nom;
    private String prenom;
    private int annee;
    private List<Smartphone> smartphones;

    public Employe(String nom, String prenom, int annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
        this.smartphones = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnnee() {
        return annee;
    }

    public void setNom(String leNom) {
        this.nom = leNom;
    }

    public void setAnnee(int an) {
        this.annee = an;
    }

    public int calculerAge(int anneeCourante) {
        return anneeCourante - annee;
    }

    public void ajouterSmartphone(Smartphone smart) {
        smartphones.add(smart);
    }

    public void supprimerSmartphone(Smartphone smart) {
        smartphones.remove(smart);
    }

    public int rechercherMarque(String marque) {
        int count = 0;
        for (Smartphone smart : smartphones) {
            if (smart.getMarque().equals(marque)) {
                count++;
            }
        }
        return count;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Année de naissance: " + annee);

        if (!smartphones.isEmpty()) {
            System.out.println("Smartphones:");
            for (Smartphone smart : smartphones) {
                smart.afficher();
            }
        }
    }
}