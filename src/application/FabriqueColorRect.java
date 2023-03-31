package application;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FabriqueColorRect extends ListCell<String>{
	@Override
	protected void updateItem(String item, boolean empty) {
		super.updateItem(item, empty);
		if (item != null) {
			
			Rectangle rect = new Rectangle(32, 32);
			rect.setFill(Color.web(item));
			setGraphic(rect);
			
			
			
		}
	}
}
