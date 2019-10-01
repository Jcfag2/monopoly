package fr.gtm.monop;

public class CaseDepart extends Case {

	public CaseDepart(String nomCase, String couleurCase, Case next) {
		super(nomCase, couleurCase, next);
	}
	@Override
	public void arreter(Joueur j) {
		j.solde = j.solde + 400;
		System.out.println(j.nomJoueur + " s'arrete sur la case depart et touche 400 euros");
		System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
		System.out.println("");
	}
	@Override
	public void passer(Joueur j) {
		j.solde = j.solde + 200;
		System.out.println(j.nomJoueur + " passe par la case départ et touche 200 euros");
		System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
		System.out.println("");
	}
	

	


}
