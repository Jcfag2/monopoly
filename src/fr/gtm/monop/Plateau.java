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

		casesMonop.add(new CaseDepart("Case départ", null, null));
		for (i = 1; i <= 3; i = i + 1) {
			casesMonop.add(new CaseDefault(Integer.toString(i+1), null, null));
		}
		casesMonop.add(new CaseImpots("Impots sur le revenu", null, null));
		for (i = 1; i <= 33; i = i + 1) {
			casesMonop.add(new CaseDefault(Integer.toString(i+5), null, null));
		}
		casesMonop.add(new CaseTaxeDeLuxe("Taxe de luxe", null, null));
		casesMonop.add(new CaseDefault("40", null, null));
		
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
