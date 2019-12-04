package com.company;

import com.company.bazine.Automobiliai;
import com.company.bazine.AutomobiliaiImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        AutomobiliaiImpl audi = new AutomobiliaiImpl("Audi",2008,600000,5);
        AutomobiliaiImpl bmw = new AutomobiliaiImpl("BMW",2011,45000,6);
        AutomobiliaiImpl opel = new AutomobiliaiImpl("Opel",2002,520000,3);
        AutomobiliaiImpl skoda = new AutomobiliaiImpl("Skoda", 2013, 150000, 5);
        AutomobiliaiImpl audi2 = new AutomobiliaiImpl("Audi",1995,600000,5);
        AutomobiliaiImpl bmw2 = new AutomobiliaiImpl("BMW",2011,330000,5);
        AutomobiliaiImpl opel2 = new AutomobiliaiImpl("Opel",1998,700000,3);
        AutomobiliaiImpl skoda2 = new AutomobiliaiImpl("Skoda", 2005, 1504500, 6);

        ArrayList<AutomobiliaiImpl> auto = new ArrayList<AutomobiliaiImpl>();
        auto.add(audi);
        auto.add(bmw);
        auto.add(opel);
        auto.add(skoda);
        auto.add(audi2);
        auto.add(bmw2);
        auto.add(opel2);
        auto.add(skoda2);

        System.out.println("Spausdiname paprastai");
        for(AutomobiliaiImpl automobilis: auto){
            if(automobilis.getRida() > 500000){
                automobilis.setRida(300000);
            }
            System.out.println(automobilis);
        }

       Iterator<AutomobiliaiImpl> i = auto.iterator();
        while(i.hasNext()){
            if(i.next().getMetai() < 2000) {
               i.remove();
            }
        }
        System.out.println(auto);

        Collections.sort(auto);
        System.out.println(auto);

    }
}
