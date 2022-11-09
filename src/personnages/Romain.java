package personnages;


public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	int nbEquipement = 0;
	private String texte;
	
	
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
		case 1:
			if( equipement.toString().equals(equipements[0].toString())) {
				System.out.println("Le soldat " + this.nom + "possède déjà un " + equipement.toString() + " !");
				break;
			}
	
		case 2:
			System.out.println("Le soldat Minus est déjà bien protégé !");
			break;
		
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
	/*
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
	}*/
		
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("Aïe");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
			}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}
	
	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null &&
				equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				}
				else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] =
				equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}
		
	}
	

