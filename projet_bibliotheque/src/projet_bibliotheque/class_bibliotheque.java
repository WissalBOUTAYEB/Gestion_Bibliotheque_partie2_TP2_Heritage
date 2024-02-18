package projet_bibliotheque;
import java.util.List;  
import java.util.ArrayList;




public class class_bibliotheque extends classlivre { // la Class Bibliotheque Herite de la Class Livre {
	
	 private List<classlivre> bookes;  // la Declaration de la liste des Livres
	 
	 public class_bibliotheque(String titre,String auteur,int anee_Publication)
	 {
		 
		 super(titre,auteur,anee_Publication); // L'appel du Constructeur de la superclass
		 this.bookes=new ArrayList<>();
	 }
		 
	 
	 // Implimentation de la Methode ajouterLivre
	 public void ajouterLivre(classlivre book) { 
		 bookes.add(book);   // la fonction add est predefinit 
		  
	 }
	 
	 public void  afficherLivres() {
		 
		 for(classlivre book: bookes) {
			 book.afficherDetails();  // la fonction afficherDetails est deja implimenter dans la superclass
		 }
		 
	 }
	 
	 
	 // Test de notre Class 
	 

	
		    public static void main(String[] args) {
		        // Création d'une Instance de la Class  bibliothèque
		    	class_bibliotheque my_bibliotheque= new class_bibliotheque("Dernier jour","Victor Hugo",1921);

		        // Ajout de quelques livres // la Creation D'une Instance de la class Livre
		        classlivre First_book = new classlivre("Boite a Merveille", "Ahmed Sefrioui", 1952);
		        classlivre Second_book = new classlivre("Antigone", "Jean ", 1941);
		        classlivre Thired_book = new classlivre("Candide", "J.K. Rowling", 1995);

		        my_bibliotheque.ajouterLivre(First_book); // Appel de la fonction Implimenter AjouterLivre
		        my_bibliotheque.ajouterLivre(Second_book);
		        my_bibliotheque.ajouterLivre(Thired_book);

		        
		        my_bibliotheque.afficherLivres(); // Affichage des listes de livres
		    }
		
}
		
		 
		
		 
		  
	            
	 
	 