module com.example.javachat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javachat to javafx.fxml;
    exports com.example.javachat;
}