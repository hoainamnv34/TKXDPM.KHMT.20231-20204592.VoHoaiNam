package com.example.aims.view;

import com.example.aims.entity.Cart;
import com.example.aims.entity.Media;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CartScreenController implements Initializable {
    @FXML
    GridPane gridPane;

    @FXML
    Text subtotalText;

    @FXML
    Text amountText;

    @FXML
    Button placeOrderBtn;

    Cart cart;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        gridPane.setHgap(10);
        gridPane.setVgap(20);

    }

    void initView() {
        for(int i = 1; i <= cart.getListCartMedia().size(); i++) {
            Media media = cart.getListCartMedia().get(i-1).getMedia();
            Image image = new Image(getClass().getResourceAsStream("images.jpeg"));
            ImageView imageView = new ImageView();
            imageView.setImage(image);
            imageView.setFitHeight(57);
            imageView.setFitWidth(50);
            gridPane.add(new CheckBox(),0, i);
            gridPane.add(new HBox(imageView, new Text()),1, i);
            gridPane.add(new Text("100"),2, i);
            gridPane.add(new Spinner<Integer>(),3, i);
            gridPane.add(new Text("100"),4, i);
            gridPane.add(new Button("delete"),5, i);
        }
    }

    @FXML
    protected void Submit(ActionEvent event) {

    }
}
