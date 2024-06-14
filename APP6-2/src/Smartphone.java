
public class Smartphone {
	
	private String marque;
    private String modele;
    private String numeroTelephone;

    public Smartphone(String marque, String modele, String numeroTelephone) {
        this.marque = marque;
        this.modele = modele;
        this.numeroTelephone = numeroTelephone;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumero(String leNumeroTelephone) {
        this.numeroTelephone = leNumeroTelephone;
    }

    public void afficher() {
        System.out.println("Marque du smartphone: " + marque);
        System.out.println("Modèle du smartphone: " + modele);
        System.out.println("Numéro de téléphone: " + numeroTelephone);
    }}
