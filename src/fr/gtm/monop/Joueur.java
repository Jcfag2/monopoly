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

	public void crediter(int montant) {
		solde = solde + montant;
	}

	public void debiter(int montant) {
		solde = solde - montant;
	}

	public void jouer(De d1, De d2) {
		d1.lancer();
		d2.lancer();

		Joueur.this.pionDuJoueur.deplacerPoin(d1, d2);
	}

}
