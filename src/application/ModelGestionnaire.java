package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;

public class ModelGestionnaire {
	
	// Collection de couleur 
	private ArrayList<String> colorList = new ArrayList<>();
	
	// Indice de la couleur affichée
	private int indice;
	
	// Nom du fichier de sauvegarde
	private String pathSauvFile;
	
	// Objet pour permettre la mise a jour de la couleur du rectangle
	private SimpleObjectProperty<Color> color = new SimpleObjectProperty<>();
	
	// Objet pour mettre à jour le label correspondant à l'indice de la couleur courante 
	// formaté de la façon suivante 'indice/taille collection'
	private SimpleStringProperty majLab;

	/*
	 * Constructeur de ModelGestionnaire
	 */
	public ModelGestionnaire(ArrayList<String> colorList, String pathSauvFile) {
		this.colorList = colorList;
		this.pathSauvFile = pathSauvFile;
	}
	
	
	/**
	 * methode pour ecrire dans le fichier 
	 */
	public void ecritureFile() {
		String ligne;
		try {
			PrintWriter fichierCible = new PrintWriter(pathSauvFile);
			
			fichierCible.println("Hello");
			fichierCible.close();
		} catch (IOException e) {
			System.out.println("Problème d'accès au ficher");
		}
	}
	
	
	/**
	 * Méthode pour lire dans le fichier 
	 */
	public void lectureFile() {
		String ligne;
		int a = 1;
		try {
			BufferedReader fichier = new BufferedReader(new FileReader(pathSauvFile));
			do {
				ligne = fichier.readLine();
				if (ligne != null) {
					System.out.println(a + " - " + ligne);
					a++;
				}
			} while (ligne != null);
			fichier.close();
		} catch (IOException e) {
			System.out.println("Probleme d'accès fichier");
		}
	}
	
	
	
	
}
