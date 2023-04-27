/*
 * File: MainControl.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.27
 * Github: 
 * Licence: GNU GPL
 */


package control;


import javafx.scene.control.Button;
import model.MainModel;
import view.MainView;

public class MainControl {
    MainView mainView;

    MainModel mainModel;

    public MainControl() {
        // MainView mainView
        // this.mainView = mainView;
        mainView = new MainView();
        mainModel = new MainModel();
        handleEvent();
            
    }
    private void handleEvent(){
        Button calcButton = this.mainView.getSubButton().getCalcButton();
        calcButton.setOnAction(e->{
            System.out.println("BU!");
            String inputaStr = this.mainView.getInputa().getValue();
            String inputbStr = this.mainView.getInputb().getValue();
            String inputcStr = this.mainView.getInputc().getValue();
            double inputa = Double.parseDouble(inputaStr);
            double inputb = Double.parseDouble(inputbStr);
            double inputc = Double.parseDouble(inputcStr);
            Double vol = mainModel.calcParaVol(inputa, inputb, inputc);
            this.mainView.getVol().setValue(vol.toString());
        });
    }

    private void checkInput(){
        
    }
    public MainView getMainView() {
        return mainView;
    }
    
}
