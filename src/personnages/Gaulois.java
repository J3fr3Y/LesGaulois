
package personnages;
import personnages.Romain;
import personnages.Druide;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	/*
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}*/
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}
	
	/*public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}*/
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *   
				effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		String phrase = "Merci Druide, je sens que ma force est " + this.effetPotion + " fois décuplée.";
		this.parler(phrase);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		}

	
		
	
}
