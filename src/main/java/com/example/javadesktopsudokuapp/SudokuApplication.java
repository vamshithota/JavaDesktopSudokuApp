package com.example.javadesktopsudokuapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {

    //private

//    private UserInterfaceImpl uiImpl;
//
//    @Override
//    public void start(Stage primaryStage) throws IOException {
//        //Get SudokuGame object for a new game
//        uiImpl = new UserInterfaceImpl(primaryStage);
//
//        try {
//            SudokuBuildLogic.build(uiImpl);
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw e;
//        }
//    }


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SudokuApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}