package fr.gtm.monop;

import java.util.ArrayList;
import java.util.List;

//
public class Plateau {
	List<Case> casesMonop = new ArrayList<Case>();

	public List<Case> getCasesMonop() {
		return casesMonop;
	}

	public void initialisationPlateau() {
		int i;
for(i=0; i<=39; i=i+1) {
	switch(i){
	case 0 : casesMonop.add(new CaseDepart("Case départ", null, null));
	break;
	case 3 : casesMonop.add(new CaseImpots("Impots sur le revenu", null, null));
	break;
	case 5 : casesMonop.add(new CaseGare("Gare Montparnasse", null, null, 200, 10, null));
	break;
	case 12 : casesMonop.add(new CaseCompagnie("Compagnie de distribution d'électricité", null, null, 150, 10, null));
	break;
	case 15 : casesMonop.add(new CaseGare("Gare de Lyon", null, null, 200, 10, null));
	break;
	case 25 : casesMonop.add(new CaseGare("Gare du Nord", null, null, 200, 10, null));
	break;
	case 28 : casesMonop.add(new CaseCompagnie("Compagnie de distribution des eaux", null, null, 150, 10, null));
	break;
	case 35 : casesMonop.add(new CaseGare("Gare Saint-Lazare", null, null, 200, 10, null));
	break;
	case 38 : casesMonop.add(new CaseTaxeDeLuxe("Taxe de luxe", null, null));
	break;
	default : casesMonop.add(new CaseRue(Integer.toString(i+1), null, null, 100, 10, null));	
	}
}
//		casesMonop.add(new CaseDepart("Case départ", null, null));
//		for (i = 1; i <= 3; i = i + 1) {
//			casesMonop.add(new CaseDefault(Integer.toString(i+1), null, null));
//		}
//		casesMonop.add(new CaseImpots("Impots sur le revenu", null, null));
//		for (i = 1; i <= 33; i = i + 1) {
//			casesMonop.add(new CaseDefault(Integer.toString(i+5), null, null));
//		}
//		casesMonop.add(new CaseTaxeDeLuxe("Taxe de luxe", null, null));
//		casesMonop.add(new CaseDefault("40", null, null));
//		
		for (i = 0; i <= 38; i = i + 1) {
			casesMonop.get(i).setNext(casesMonop.get(i + 1));
		}
		casesMonop.get(39).setNext(casesMonop.get(0));

	}

	public Case getCaseDepart() {

		Case depart = casesMonop.get(0);
		// System.out.println(depart);
		return depart;

	}

}
