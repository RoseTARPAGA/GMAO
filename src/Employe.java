public class Employe {
    private String nom;
    private String prenom;
    private int annee;
    private Smartphone leSmartphone;

    public Employe(String nom, String prenom, int annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
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

    public Smartphone getLeSmartphone() {
        return leSmartphone;
    }

    public void setNom(String leNom) {
        this.nom = leNom;
    }

    public void setAnnee(int an) {
        this.annee = an;
    }

    public void setLeSmartphone(Smartphone smart) {
        this.leSmartphone = smart;
    }

    public int calculerAge(int anneeCourante) {
        return anneeCourante - annee;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Année de naissance: " + annee);
        if (leSmartphone != null) {
            leSmartphone.afficher();
        }
        else System.out.println("pas de smartphone" );
    }
}

