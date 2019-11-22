package com.company.isvestine;

import com.company.baze.LeidinysImpl;

public class KnygaImpl extends LeidinysImpl implements Knyga {
    private String pavadinimas;
    private boolean kietasVirselis;
    private String literaturosTipas;

    public KnygaImpl(String pavadinimas, boolean kietasVirselis, String literaturosTipas, String rusis, boolean periodinis, int puslapiuSkaicius){
        super(rusis,periodinis,puslapiuSkaicius);
        this.pavadinimas = pavadinimas;
        this.kietasVirselis = kietasVirselis;
        this.literaturosTipas = literaturosTipas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
    public String getliteraturosTipas() {
        return literaturosTipas;
    }

    public boolean getkietasVirselis() {
        return kietasVirselis;
    }
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
    public void setliteraturosTipas(String tipas) {
        this.literaturosTipas = tipas;
    }
    public void setkietasVirselis(boolean virselis) {
        this.kietasVirselis = virselis;
    }
}
