package com.company.isvestine;

import com.company.bazine.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis {
    private String marke;
    private int duruSkaicius;
    private boolean varomasElektra;

    public AutomobilisImpl(String marke, int duruSkaicius, boolean varomasElektra, String tipas, boolean variklis, int pagaminimoMetai){
        super(tipas, variklis, pagaminimoMetai);
        this.marke = marke;
        this.duruSkaicius = duruSkaicius;
        this.varomasElektra = varomasElektra;
    }

    public String getMarke() {
        return marke;
    }
    public int getDuruSkaicius() {
        return duruSkaicius;
    }
    public boolean isVaromasElektra() {
        return varomasElektra;
    }
    public void setMarke(String marke) {
        this.marke = marke;
    }
    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }
    public void setVaromasElektra(boolean varomasElektra) {
        this.varomasElektra = varomasElektra;
    }
}
