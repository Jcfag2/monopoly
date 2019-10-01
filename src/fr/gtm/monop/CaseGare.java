package fr.gtm.monop;

public class CaseGare extends CasePropriete {

	public CaseGare(String nomCase, String couleurCase, Case next, int prixAchat, int loyer, Joueur proprietaire) {
		super(nomCase, couleurCase, next, prixAchat, loyer, proprietaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arreter(Joueur j) {
			if (CaseGare.this.proprietaire == null) {
			if(j.isInterresse(prixAchat)) {
				j.debiter(prixAchat);
				CaseGare.this.proprietaire = j;
				System.out.println(j.nomJoueur + " d�pense " +prixAchat+ " euros et, achete la "+ CaseGare.this.nomCase);
				System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
				System.out.println("");
			}
		}else {
			j.debiter(loyer);
			CaseGare.this.proprietaire.crediter(loyer);
			System.out.println(j.nomJoueur + " paye un loyer � " + CaseGare.this.proprietaire.nomJoueur);
			System.out.println(j.nomJoueur + " a maintenant " + j.solde + " euros");
			System.out.println(CaseGare.this.proprietaire.nomJoueur + " a maintenant " + CaseGare.this.proprietaire.solde + " euros");
			System.out.println("");
		}
		
		}


	@Override
	public void passer(Joueur j) {
		// TODO Auto-generated method stub

	}

	
	
}
