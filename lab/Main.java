package com.company;

import com.company.bazine.TransportasImpl;
import com.company.isvestine.AutomobilisImpl;

public class Main {

    public static void main(String[] args) {

        TransportasImpl transp1 = new TransportasImpl("Sausumos",true,2008);
        TransportasImpl transp2 = new TransportasImpl("Vandens", true, 2004);
        TransportasImpl transp3 = new TransportasImpl("Sausumos", false, 2009);
        TransportasImpl transp4 = new TransportasImpl("Oro", false, 1995);
        TransportasImpl transp5 = new TransportasImpl("Oro", false, 1988);

        AutomobilisImpl auto1 = new AutomobilisImpl("Audi A3",5,false,"sausumos", true, 2008);
        AutomobilisImpl auto2 = new AutomobilisImpl("Toyota Yaris",5,true,"sausumos", true, 2017);
        AutomobilisImpl auto3 = new AutomobilisImpl("BMW",5,false,"sausumos", true, 2011);
        AutomobilisImpl auto4 = new AutomobilisImpl("Hyundai i3",5,true,"sausumos", true, 2018);
        AutomobilisImpl auto5 = new AutomobilisImpl("VW Passat",5,false,"sausumos", true, 2005);


        TransportasImpl [] transportai = new TransportasImpl[10];
        transportai[0] = auto1;
        transportai[1] = auto2;
        transportai[2] = auto3;
        transportai[3] = auto5;
        transportai[4] = auto4;
        transportai[5]= transp1;
        transportai[6]= transp2;
        transportai[7]= transp3;
        transportai[8]= transp4;
        transportai[9]= transp5;


        for(TransportasImpl transportopriemone : transportai){
            if(transportopriemone instanceof AutomobilisImpl){
                AutomobilisImpl masina = (AutomobilisImpl) transportopriemone;
                if(masina.isVaromasElektra()){
                    System.out.println("\nAutomobilio Marke: \n" + masina.getMarke() + " - varoma elektra");
                }
            }
        }


    }
}
