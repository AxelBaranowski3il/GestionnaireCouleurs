package application.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Couleur;

class TestCouleur {
	
	@Test
    public void testCouleur() {
		Couleur c = new Couleur(1, 2, 3);
        assertEquals("#010203", c.getCouleur());
    }
	
	@Test
    public void testGetRed() {
		Couleur c = new Couleur(1, 2, 3);
        assertEquals("1", String.valueOf(c.getRed()));
    }
	
}
