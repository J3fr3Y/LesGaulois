package personnages;



public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		assert (force > 0): "La force doit être toujours positive";
		this.nom = nom;
		this.force = force;
		}
	public String getNom() {
		return nom;
	}
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat Minus est déjà bien protégé !");
			break;
		case 1:
			if( equipement.toString()==equipements[0].toString()) {
				System.out.println("Le soldat " + this.nom + "possède déjà un " + equipement.toString() + " !");
				break;
			}
		default :
			System.out.println("Le soldat " + this.nom + "s'équipe avec un " + equipement.toString());
		}
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		//précondition
		assert (force >0) : "La force d'un romain est toujours positive";
		int forceInit = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		//post condition
		assert (force < forceInit) : "\"la force d’un Romain a diminué";
	}
		
	
	
}

