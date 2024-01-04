module com.example.javadesktopsudokuapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javadesktopsudokuapp to javafx.fxml;
    exports com.example.javadesktopsudokuapp;
}