package com.example.aims.view;

import com.example.aims.entity.Cart;
import com.example.aims.entity.CartMedia;
import com.example.aims.entity.Media;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;



public class MainScreenController extends Application {

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cart-view.fxml"));

            Parent root = loader.load();
            CartScreenController controller = loader.getController();

            controller.cart = createNewCart();
            controller.amountText.setText("hello");
            controller.initView();


            Scene scene = new Scene(root);
//            scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private Cart createNewCart() {


        Media media0 = new Media(0, "Boo1", "book", 40000, 20000, 10, "../assets/images.jpeg");
        Media media1 = new Media(0, "Book2", "book", 40000, 20000, 20, "../assets/images.jpeg");

        CartMedia cartMedia1 = new CartMedia(media0, 2, 40000 );
        CartMedia cartMedia2 = new CartMedia(media1, 1, 20000 );

        Cart cart = new Cart();
        cart.setListCartMedia(List.of(cartMedia1, cartMedia2));
        return cart;
    }


    public void on(String[] args) {
        launch(args);
    }
}
