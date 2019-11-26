package com.company.bazine;

public class TransportasImpl implements Transportas {
    private String tipas;
    private boolean variklis;
    private int pagaminimoMetai;


    public TransportasImpl(String tipas, boolean variklis, int pagaminimoMetai){
        this.tipas = tipas;
        this.variklis = variklis;
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public String getTipas() {
        return tipas;
    }

    public int getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }


    public void setVariklis(boolean variklis) {
        this.variklis = variklis;
    }

    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public boolean isVariklis() {
        return variklis;
    }
}
