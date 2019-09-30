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
		
		for (i = 1; i <= 40; i = i + 1) {
			casesMonop.add(new Case(Integer.toString(i), null, null));
			
		}
		
		for (i = 0; i<=38; i = i+1) {
			casesMonop.get(i).setNext(casesMonop.get(i+1));
		}
		casesMonop.get(39).setNext(casesMonop.get(0));
		
	}

	public Case getCaseDepart() {

		Case depart = casesMonop.get(0);
		//System.out.println(depart);
		return depart;

	}

}
