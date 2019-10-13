import java.util.HashMap;

public class Jardin {
	private int largeur;
	private int longueur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer> panier;
	
	public Jardin(int larg, int longr) {
		this.panier = new HashMap<String, Integer>();
		this.largeur = larg;
		this.longueur = longr;
		emplacement = new Emplacement[longr][larg];
	}
	
	public void ajouterPanier() {
		this.panier.put("Tomate",5);
		this.panier.put("Carotte",5);
		this.panier.put("Ail",5);
		this.panier.put("Betterave",5);
	}
}
	
