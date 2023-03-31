package application;

import java.awt.event.ActionEvent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Controleur {
	
	@FXML
	ListView<String> listview;
	
	@FXML
	ListView<String> imgRectColor;
	
	@FXML
	TextField nom;
	
	@FXML
	TextField red;
	
	@FXML
	TextField green;
	
	@FXML
	TextField blue;
	
	ObservableList<String> colorList = FXCollections.observableArrayList();
	
	@FXML
	private void initialize() {
		
		
		imgRectColor.setItems(colorList);
		imgRectColor.setCellFactory((ListView<String> lst)-> new FabriqueColorRect());
		imgRectColor.getSelectionModel().selectedIndexProperty().addListener(observable ->{
			System.out.println("Selection : indice " + listview.getSelectionModel().getSelectedIndex());
			System.out.println("Selection : item " + nom.getText() + "\n");
		});
		
		
		listview.setItems(colorList);
		listview.setCellFactory((ListView<String> lst)-> new FabriqueColor());
		listview.getSelectionModel().selectedIndexProperty().addListener(observable ->{
			System.out.println("Selection : indice " + listview.getSelectionModel().getSelectedIndex());
			System.out.println("Selection : item " + nom.getText() + "\n");
		});
	}
	
	private void fillColors() {
		int r = 0;
		int g = 0;
		int b = 0;
		if (!red.getText().isEmpty()) {
			r = Integer.parseInt(red.getText());
		}
		if (!green.getText().isEmpty()) {
			g = Integer.parseInt(green.getText());
		}
		if (!blue.getText().isEmpty()) {
			b = Integer.parseInt(blue.getText());
		}
		
		colorList.add(String.format("#%02X%02X%02X", r, g, b));
		
	}
	
	private void buttonClicked(ActionEvent evt) {
		fillColors();
	}
	
}