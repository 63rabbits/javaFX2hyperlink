package javaFX2hyperlink;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HyperlinkController {

	@FXML
	private Hyperlink hyp01;

	@FXML
	private Hyperlink hyp02;

	@FXML
	private Hyperlink hyp03;

	@FXML
	private Button btn;

	@FXML
	private ImageView imv;

	private Image imgBook = new Image(this.getClass().getResourceAsStream("res/book.png"));
	private Image imgPen = new Image(this.getClass().getResourceAsStream("res/pencil.png"));
	private Image imgApp = new Image(this.getClass().getResourceAsStream("res/app.png"));

	@FXML
	void initialize() {
		assert hyp01 != null : "fx:id=\"hyp01\" was not injected: check your FXML file 'Hyperlink.fxml'.";
		assert hyp02 != null : "fx:id=\"hyp02\" was not injected: check your FXML file 'Hyperlink.fxml'.";
		assert hyp03 != null : "fx:id=\"hyp03\" was not injected: check your FXML file 'Hyperlink.fxml'.";
		assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'Hyperlink.fxml'.";
		assert imv != null : "fx:id=\"imv\" was not injected: check your FXML file 'Hyperlink.fxml'.";

		this.hyp01.setText("Learning");
		this.hyp02.setText("Coding");
		this.hyp03.setText("making");
	}

	@FXML
	void hyp01OnAction(ActionEvent event) {
		this.imv.setImage(imgBook);
	}

	@FXML
	void hyp02OnAction(ActionEvent event) {
		this.imv.setImage(imgPen);
	}

	@FXML
	void hyp03OnAction(ActionEvent event) {
		this.imv.setImage(imgApp);
	}

	@FXML
	void btnOnAction(ActionEvent event) {
		this.hyp01.setVisited(false);
		this.hyp02.setVisited(false);
		this.hyp03.setVisited(false);
	}
}
