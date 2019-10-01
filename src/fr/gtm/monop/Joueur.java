package fr.gtm.monop;

public class Joueur {
	String nomJoueur;
	int solde;
	Pion pionDuJoueur;
	Monopoly monop;

	public Joueur(String nomJoueur, int solde, Pion pionDuJoueur) {
		super();
		this.nomJoueur = nomJoueur;
		this.solde = solde;
		this.pionDuJoueur = pionDuJoueur;
	}

	public void jouer(De d1, De d2) {
		Case old = pionDuJoueur.getPositionSurPlateau();
		Case p = pionDuJoueur.getPositionSurPlateau();
		d1.lancer();
		d2.lancer();
		for (int i = 0; i < (d1.valeur + d2.valeur); i = i + 1) {
			pionDuJoueur.setPositionSurPlateau(p.next);
			p = pionDuJoueur.getPositionSurPlateau();
		}
		int tot = d1.getValeur() + d2.getValeur();
		System.out.println(nomJoueur + " lance les dés et obtient " +d1.valeur+" et "+ d2.valeur);
		System.out.println("");
		System.out.println("Il se déplace de " + tot +" cases");
		System.out.println(nomJoueur+" était sur la case "+ old.nomCase +", il est maintenant sur la case " + p.nomCase);
		System.out.println("");
	}

}
