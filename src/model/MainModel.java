/*
 * File: MainModel.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.27
 * Github: 
 * Licence: GNU GPL
 */

package model;

public class MainModel {

    public MainModel() {
    }
    public Double calcParaVol(double inputa, double inputb, double inputc){
        Double vol = inputa * inputb * inputc;
        return vol;
    }
}
