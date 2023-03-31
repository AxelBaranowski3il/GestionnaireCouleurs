package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
	
	public void ecritureFile() {
		
	}
	
	public void lectureFile() {
		try
	    {
	        // Le fichier d'entrée
	        File file = new File(pathSauvFile);    
	        // Créer l'objet File Reader
	        FileReader fr = new FileReader(file);  
	        // Créer l'objet BufferedReader        
	        BufferedReader br = new BufferedReader(fr);  
	        StringBuffer sb = new StringBuffer();    
	        String line;
	        while((line = br.readLine()) != null)
	        {
		        // ajoute la ligne au buffer
		        sb.append(line);      
		        sb.append("\n");     
	        }
	        fr.close();    
	        System.out.println("Contenu du fichier: ");
	        System.out.println(sb.toString());  
	    }
	    catch(IOException e)
	    {
	    	e.printStackTrace();
	    }
	}
	
	public static void main(String[] args ) {
		ArrayList<String> c = new ArrayList<>();
		ModelGestionnaire m = new ModelGestionnaire(c, "sauv.txt");
		m.lectureFile();
		
	}
	
	
}
