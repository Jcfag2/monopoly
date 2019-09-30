package fr.gtm.monoptest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.monop.Case;
import fr.gtm.monop.Plateau;

public class PlateauTest {

	@Test
	public void testInitialisationPlateau() {
		Plateau test = new Plateau();
		test.initialisationPlateau();
		int cnt = 0;
		Case c = test.getCaseDepart();

		

		while (c.getNext() != test.getCaseDepart()) {
			System.out.println(c.getNomCase());
			System.out.println(c);
			c = c.getNext();
			cnt = cnt + 1;
			
		}
		cnt = cnt+1;
		System.out.println(c.getNomCase());
		System.out.println(c);

		assertEquals(40, cnt);

	}

}
