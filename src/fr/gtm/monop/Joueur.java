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

	public int crediter(int montant) {
		return solde;
	}
	public int debiter(int montant) {
		return solde;
	}
	
	public void jouer(De d1, De d2) {
		d1.lancer();
		d2.lancer();
		
		Joueur.this.pionDuJoueur.deplacerPoin(d1, d2);
	}

}
