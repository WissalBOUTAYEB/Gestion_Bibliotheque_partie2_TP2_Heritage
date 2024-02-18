package projet_bibliotheque;

public class classlivre {
	
	
    protected String titre;
	protected String auteur;
	protected int anee_Publication;
	
	public classlivre(String titre,String auteur,int anee_Publication) {
		
     this.titre=titre;     // Pour La Definition de Notre Constructeur
     this.auteur=auteur;
     this.anee_Publication=anee_Publication;
     
	}
	
	
	// Getters

	public String getTitre() {
	        return titre;
	    }

	    public String getAuteur() {
	        return auteur;
	    }

	    public int getAnneePublication() {
	        return anee_Publication;
	    }

	    // Setters
	    public void setTitre(String titre) {
	        this.titre = titre;
	    }

	    public void setAuteur(String auteur) {
	        this.auteur = auteur;
	    }

	    public void setAnneePublication(int anee_Publication) {
	        this.anee_Publication = anee_Publication;
	    }

	public  void afficherDetails( ) {  // la Methode Afficher Detailer Pour Afficher le Detail des Livre
		
		System.out.println("le Nom de Votre Livre est" + titre );
		System.out.println("L'Auteur est "+ auteur);
		
		System.out.println("L'Annee de Publication est "+ anee_Publication );
	}

	public static void main(String[] args) {     // Appel de Notre Function
		classlivre obg1= new classlivre("Harry_Potter","Jack",1951);
		classlivre obg2= new classlivre("la Boite A merveille","Ahmed Sefroui",1954);
		classlivre obg3= new classlivre("le Dernier jour D'un Condamnee","Victor Hugo",1921);
		obg1.afficherDetails();
		
		
		
		


	}	

}

