package com.company.bazine;

import java.util.Comparator;

public class AutomobiliaiImpl implements Automobiliai, Comparable {
    private String marke;
    private int metai;
    private int rida;
    private int duruSkaicius;

    public AutomobiliaiImpl(String marke, int metai, int rida, int duruSkaicius){
        this.marke = marke;
        this.metai = metai;
        this.rida = rida;
        this.duruSkaicius = duruSkaicius;
    }
    public String getMarke() {
        return marke;
    }
    public void setMarke(String marke) {
        this.marke = marke;
    }
    public int getMetai() {
        return metai;
    }
    public void setMetai(int metai) {
        this.metai = metai;
    }
    public int getRida() {
        return rida;
    }
    public void setRida(int rida) {
        this.rida = rida;
    }
    public int getDuruSkaicius() {
        return duruSkaicius;
    }
    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    public String toString(){
        return "Automobilis { " + "Marke= " + marke + ' ' + "metai= " + metai + ' ' + "rida= " + rida + ' ' + "duruskaicius= " + duruSkaicius + " } \n";
    }

    public int compareTo(Object o){
        return Comparator.comparing(AutomobiliaiImpl :: getMarke)
                .thenComparing(AutomobiliaiImpl::getMetai)
                .thenComparing(AutomobiliaiImpl::getDuruSkaicius)
                .compare(this,(AutomobiliaiImpl) o);
    }
}
