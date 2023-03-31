package application.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Couleur;

class TestCouleur {
	
	@Test
    public void testCouleur() {
		Couleur c = new Couleur(1, 2, 3, "r");
        assertEquals("#010203", c.getCouleur());
    }
	
	@Test
    public void testGetRed() {
		Couleur c = new Couleur(1, 2, 3, "r");
        assertEquals("1", String.valueOf(c.getRed()));
    }
	
	@Test
    public void testGetGreen() {
		Couleur c = new Couleur(1, 2, 3, "r");
        assertEquals("2", String.valueOf(c.getGreen()));
    }
	
	@Test
    public void testGetBlue() {
		Couleur c = new Couleur(1, 2, 3, "r");
        assertEquals("3", String.valueOf(c.getBlue()));
    }
	
	@Test
    public void testSetRed() {
		Couleur c = new Couleur(1, 2, 3, "r");
		c.setRed(3);
        assertEquals("3", String.valueOf(c.getRed()));
    }
	
	@Test
    public void testSetGreen() {
		Couleur c = new Couleur(1, 2, 3, "r");
		c.setGreen(7);
        assertEquals("7", String.valueOf(c.getGreen()));
    }
	
	@Test
    public void testSetBlue() {
		Couleur c = new Couleur(1, 2, 3, "r");
		c.setBlue(240);
        assertEquals("240", String.valueOf(c.getBlue()));
    }
	
	@Test
    public void testGetNomCouleur() {
		Couleur c = new Couleur(255, 0, 0, "red");
        assertEquals("red", String.valueOf(c.getNomCouleur()));
    }
	
	@Test
    public void testSetNomCouleur() {
		Couleur c = new Couleur(0, 0, 255, "r");
		c.setNomCouleur("Bleu");
        assertEquals("Bleu", String.valueOf(c.getNomCouleur()));
    }
	
}
