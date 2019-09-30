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

		System.out.println(c.getNomCase());

		while (c.getNext() != test.getCaseDepart()) {
			c = c.getNext();
			cnt = cnt + 1;
			System.out.println(cnt);
		}

		assertEquals(39, cnt);

	}

}
