/*
 * File: MainView.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.27
 * Github: https://github.com/MrBrown16/lelepi.git
 * Licence: GNU GPL
 */


package view;

import com.github.mrbrown16.inputlib.ButtonPanel;
import com.github.mrbrown16.inputlib.InputPanel;
import com.github.mrbrown16.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainView extends VBox{
    TitlePanel title;
    TitlePanel name;
    InputPanel inputa;
    InputPanel inputb;
    InputPanel inputc;
    ButtonPanel subButton;
    InputPanel vol;

    
    public MainView() {
        this.title = new TitlePanel();
        this.name = new TitlePanel();
        this.inputa = new InputPanel();
        this.inputb = new InputPanel();
        this.inputc = new InputPanel();
        this.subButton = new ButtonPanel();
        this.vol = new InputPanel();
        
        setMainView();
        addMainView();       
    }
    
    private void setMainView(){
        title.setText("Paralelepipedon térfogat számítás");
        name.setText("Móra Barna Szoft_I_1_N 2023.04.27");
        inputa.setText("A-oldal: ");
        inputb.setText("B-oldal: ");
        inputc.setText("C-oldal");
        subButton.setText("Számít");
        vol.setText("A paralelepipedon térfogata: ");
    }
    private void addMainView(){
        this.getChildren().add(title);
        this.getChildren().add(name);
        this.getChildren().add(inputa);
        this.getChildren().add(inputb);
        this.getChildren().add(inputc);
        this.getChildren().add(subButton);
        this.getChildren().add(vol);
    }
    public TitlePanel getTitle() {
        return title;
    }

    public InputPanel getInputa() {
        return inputa;
    }

    public InputPanel getInputb() {
        return inputb;
    }

    public InputPanel getInputc() {
        return inputc;
    }

    public ButtonPanel getSubButton() {
        return subButton;
    }

    public InputPanel getVol() {
        return vol;
    }
    
}
