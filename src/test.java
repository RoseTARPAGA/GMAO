
public class test {


	public class Test {
	    public static void main(String[] args) {
	        Employe E = new Employe("ZEMODO", "Cheick", 1919);
	        Smartphone S = new Smartphone("Samsung", "Galaxy S21", "123-456-789");
	
	        E.setLeSmartphone(S);
	        E.afficher();
	    }
	}

}