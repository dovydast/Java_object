package com.company.isvestine;

public interface Knyga {
    public String getPavadinimas();
    public boolean getkietasVirselis();
    public String getliteraturosTipas();
    public void setPavadinimas(String pavadinimas);
    public void setkietasVirselis(boolean virselis);
    public void setliteraturosTipas(String tipas);
}
