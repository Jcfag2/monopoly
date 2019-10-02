package fr.gtm.monop;

public class CaseRue extends CasePropriete {

	public CaseRue(String nomCase, String couleurCase, Case next, int prixAchat, int loyer, Joueur proprietaire) {
		super(nomCase, couleurCase, next, prixAchat, loyer, proprietaire);

	}

	public CaseRue() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arreter(Joueur j) {
		if (CaseRue.this.proprietaire == null || CaseRue.this.proprietaire.solde < 0) {
			if (j.isInterresse(prixAchat)) {
				j.debiter(prixAchat);
				CaseRue.this.proprietaire = j;
				System.out.println(j.nomJoueur + " dépense " + prixAchat + " euros et, achete la propriété "
						+ CaseRue.this.nomCase);
				System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
				System.out.println("");
			}
		} else {
			if(CaseRue.this.proprietaire != j) {
			j.debiter(loyer * 10);
			CaseRue.this.proprietaire.crediter(loyer * 10);
			System.out.println(j.nomJoueur + " paye un loyer de " + loyer * 10 + " euros à "
					+ CaseRue.this.proprietaire.nomJoueur);
			System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
			System.out.println(CaseRue.this.proprietaire.nomJoueur + " a maintenant " + CaseRue.this.proprietaire.solde
					+ " euros");
			System.out.println("");
			}
		}

	}

	@Override
	public void passer(Joueur j) {

	}

}
