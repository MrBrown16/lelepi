/*
 * File: MainControl.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.27
 * Github: https://github.com/MrBrown16/lelepi.git
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
            double inputa;
            double inputb;
            double inputc;
            if (mainModel.checkInput(inputaStr)) {
                inputa = Double.parseDouble(inputaStr);
            }else{
                inputa = 0;
            }
            if (mainModel.checkInput(inputaStr)) {
                inputb = Double.parseDouble(inputbStr);
            }else{
                inputb = 0;
            }
            if (mainModel.checkInput(inputaStr)) {
                inputc = Double.parseDouble(inputcStr);
            }
            else{
                inputc = 0;
            }
                       
            Double vol = mainModel.calcParaVol(inputa, inputb, inputc);
            if (vol == 0.0) {
                this.mainView.getVol().setValue("Nem megfelelő adatot adott meg, Próbálja újra!");
            }else{
                this.mainView.getVol().setValue(vol.toString());
            }
            
        });
    }


    public MainView getMainView() {
        return mainView;
    }
    
}
