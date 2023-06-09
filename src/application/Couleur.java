package application;

/**
 * Classe couleur permettant de gérer les couleurs
 * fonctionnalités disponibles : 
 * - Constructeur 
 * - getCouleur()
 * - getRed()
 * - getGreen()
 * - getBlue()
 * - setRed(int r)
 * - setGreen(int g)
 * - setBlue(int b)
 * @author Axel Baranowski
 *
 */
public class Couleur {

	// Nom de la couleur en format web
	private String couleur;
	
	// Nom du label de la couleur
	private String nomCouleur;
	
	// Composante RED
	private int red;
	
	// Composante GREEN
	private int green;
		
	// Composante BLUE
	private int blue;
	
	/*
	 * Constructeur de Couleur
	 * Il prend en parametre les composantes RGB 
	 * et convertit la couleur dans un format web
	 */
	public Couleur (int r, int g, int b, String nomCouleur) {
		this.nomCouleur = nomCouleur;
		red = r;
		green = g;
		blue = b; 
		couleur = String.format("#%02X%02X%02X", r, g, b);
	}
	
	/*
	 * Affiche le label de la couleur
	 */
	public String getNomCouleur() {
		return nomCouleur;
	}
	
	/*
	 * Change le label de la couleur
	 */
	public void setNomCouleur(String nomCouleur) {
		this.nomCouleur = nomCouleur;
	}

	/*
	 * retourne la composante red
	 */
	public int getRed() {
		return red;
	}

	/*
	 * change la composante red
	 */
	public void setRed(int red) {
		this.red = red;
	}

	/*
	 * retourne la composante green
	 */
	public int getGreen() {
		return green;
	}

	/*
	 * change la composante green
	 */
	public void setGreen(int green) {
		this.green = green;
	}

	/*
	 * retourne la composante blue
	 */
	public int getBlue() {
		return blue;
	}

	/*
	 * change la composante blue
	 */
	public void setBlue(int blue) {
		this.blue = blue;
	}

	/*
	 * affiche la couleur en format web
	 */
	public String getCouleur() {
		return couleur;
	}
	
	
		
}
