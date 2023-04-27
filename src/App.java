/*
 * File: App.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.27
 * Github: 
 * Licence: GNU GPL
 */


import control.MainControl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        MainControl mainControl = new MainControl();
        Scene scene = new Scene(mainControl.getMainView());
        // StackPane sPane = new StackPane();
        // Scene scene = new Scene(sPane);
        stage.setTitle("A paralelepipedon térfogata");
        stage.setScene(scene);
        stage.show();
    }
}
