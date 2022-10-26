package main;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import personnages.Chef;
import lieux.Village;


public class Test {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 69);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		Village village = new Village("Village des Irréductibles",30);
		Chef abraracourcix = new Chef("Abraracourcix",6,8,village);
		//Gaulois gaulois = village.trouverHabitant(30);
		//index 30 out of range 30
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//Le gaulois existe déjà, c'est Astérix
		
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.setChef(abraracourcix);
		village.afficherVillageois();
		System.out.println("_______________________________________________________________________________________");
		System.out.println("\n");
		//TP1
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion(6);
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	
		
		
		
		
	}
}
