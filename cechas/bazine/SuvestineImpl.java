package com.company.bazine;

import java.util.Comparator;

public class SuvestineImpl implements Suvestine, Comparable{
    private String darbininkas;
    private String detale;
    private int kiekis;
    private double detaleskaina;

    public SuvestineImpl(String darbininkas,String detale, int kiekis, double detaleskaina){
        this.darbininkas = darbininkas;
        this.detale = detale;
        this.kiekis = kiekis;
        this.detaleskaina = detaleskaina;
    }

    public String getdarbininkas() {
        return darbininkas;
    }
    public String getdetale() {
        return detale;
    }
    public int getkiekis() {
        return kiekis;
    }
    public double getdetaleskaina() {
        return detaleskaina;
    }

    public void setdarbininkas(String darbininkas) {
        this.darbininkas = darbininkas;
    }
    public void setdetale(String detale) {
        this.detale = detale;
    }
    public void setkiekis(int kiekis) {
        this.kiekis = kiekis;
    }
    public void setdetaleskaina(int detaleskaina) {
        this.detaleskaina = detaleskaina;
    }

    public String toString(){
        return "\nDetale: " + detale + " \nKiekis: " + kiekis + " \nDetales kaina: " + detaleskaina + "\n";
    }

    public int compareTo(Object o){
        return Comparator.comparing(SuvestineImpl::getkiekis).reversed()
                .thenComparing(SuvestineImpl::getdetale)
                .compare(this,(SuvestineImpl) o);
    }

}
