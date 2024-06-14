
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Employe E = new Employe("TARPAGA", "Rose", 2023);

	        Smartphone S1 = new Smartphone("Samsung", "Galaxy S21", "123-456-789");
	        Smartphone S2 = new Smartphone("Apple", "iPhone 12", "987-654-321");

	        E.ajouterSmartphone(S1);
	        E.ajouterSmartphone(S2);

	        E.afficher();

	        // Supprimer un smartphone
	        E.supprimerSmartphone(S1);

	        // Afficher à nouveau après la suppression
	        System.out.println("\nAprès suppression du smartphone:");
	        E.afficher();

	        // Rechercher le nombre de smartphones d'une marque particulière
	        String marqueRecherchee = "Apple";
	        int nbr = E.rechercherMarque(marqueRecherchee);
	        System.out.println("\nNombre de smartphones de marque " + marqueRecherchee + ": " + nbr);
	    }
	}


