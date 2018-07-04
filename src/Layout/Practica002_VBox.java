package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Practica002_VBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button boton = new Button("Click aquí");
        Label etiqueta = new Label("Buen día");
        Rectangle rectangulo = new Rectangle(100, 200, Color.AQUA);

        VBox layout = new VBox();
        layout.setPadding(new Insets(10));

        layout.setSpacing(10);

        layout.getChildren().add(boton);
        layout.getChildren().add(etiqueta);
        layout.getChildren().add(rectangulo);

        Scene escena = new Scene(layout);

        primaryStage.setScene(escena);
        primaryStage.show();
    }
}
