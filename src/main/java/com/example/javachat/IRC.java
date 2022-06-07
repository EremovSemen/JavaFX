package com.example.javachat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class IRC extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(IRC.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("IRC");
        stage.setScene(scene);
        stage.show();


        TextArea textArea = new TextArea();
        textArea.setPromptText("Введенный текст появится здесь");
        textArea.setEditable(false);
        TextField textField = new TextField();
        textField.setPromptText("Введите текст");
        Button append = new Button("Ввод");
        append.setDefaultButton(true);

        append.setOnAction(event -> {
            textArea.setText(textArea.getText() + textField.getText() + "\n");
            textField.clear();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(
                textArea,
                textField,  append

        );
        layout.setPadding(new Insets(10));
        stage.setScene(new Scene(layout));
        stage.show();


}

    public static void main(String[] args) {
        launch();
    }
}