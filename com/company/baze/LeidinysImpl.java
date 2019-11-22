package com.company.baze;

import com.company.isvestine.KnygaImpl;


public class LeidinysImpl implements Leidinys{
   private String rusis;
   private boolean periodinis;
   private  int puslapiuSkaicius;

   public LeidinysImpl(String rusis, boolean periodinis, int puslapiuSkaicius){
       this.rusis = rusis;
       this.periodinis = periodinis;
       this.puslapiuSkaicius = puslapiuSkaicius;
   }

    public boolean getPeriodinis() {
        return periodinis;
    }
    public String getRusis() {
        return rusis;
    }
    public int getPuslapiuSkaicius() {
        return puslapiuSkaicius;
    }
    public void setPeriodinis(boolean periodinis) {
        this.periodinis = periodinis;
    }
    public void setRusis(String rusis) {
        this.rusis = rusis;
    }
    public void setPuslapiuSkaicius(int puslapiuSkaicius) {
        this.puslapiuSkaicius = puslapiuSkaicius;
    }
}
