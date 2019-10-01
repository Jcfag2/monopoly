package fr.gtm.monop;

import java.util.ArrayList;
import java.util.List;

public class Monopoly {
	List<Joueur> joueurs = new ArrayList<Joueur>();
	Plateau plateau;
	De d1;
	De d2;

	public void addJoueur() {
		joueurs.add(new Joueur("Tom", 1500, new Pion("Sac d'argent")));
		joueurs.add(new Joueur("Tim", 1500, new Pion("Chaussure")));
		joueurs.add(new Joueur("Tam", 1500, new Pion("Cuirassé")));
		joueurs.add(new Joueur("Tem", 1500, new Pion("Dé à coudre")));
	}

	public void Jouer() {
		Plateau p = new Plateau();
		p.initialisationPlateau();
		De d1 = new De();
		De d2 = new De();
		for (Joueur j : joueurs) {
			j.pionDuJoueur.setPositionSurPlateau(p.getCaseDepart());
			j.pionDuJoueur.setJoueurDuPion(j);
		}

		for (int i = 0; i < 9; i = i + 1) {
			System.out.println("Tour numéro " + (i+1));
			System.out.println("");
			
			for (Joueur j : joueurs) {
				j.jouer(d1, d2);
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");

		}
	}

	public void getVainqueur() {

	}

}
