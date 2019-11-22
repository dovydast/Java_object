package com.company;

import com.company.baze.LeidinysImpl;

import com.company.isvestine.KnygaImpl;


public class Main {

    public static void main(String[] args) {

        LeidinysImpl leidinys1 = new LeidinysImpl("Knyga",false, 256);
        LeidinysImpl leidinys2 = new LeidinysImpl("Zurnalas", false,28);
        LeidinysImpl leidinys3 = new LeidinysImpl("Knyga", false,182);
        LeidinysImpl leidinys4 = new LeidinysImpl("Knyga", false,357);
        LeidinysImpl leidinys5 = new LeidinysImpl("Laikrastis", true,31);


        KnygaImpl knyga1 = new KnygaImpl("Spider-man", false,"Komiksai","Zurnalas",true,45);
        KnygaImpl knyga2 = new KnygaImpl("HarisPoteris",true,"Fantastika","Knyga", false,455);
        KnygaImpl knyga3 = new KnygaImpl("Audra",true,"Grozine","Knyga",false,689);
        KnygaImpl knyga4 = new KnygaImpl("Korikas",true,"Trileris","Knyga",false, 144);
        KnygaImpl knyga5 = new KnygaImpl("Gestanti Sviesa",true,"Trileris", "Knyga",false,495);
        KnygaImpl knyga6 = new KnygaImpl("Ausra",true,"Grozine", "Knyga",false,785);

        LeidinysImpl leidiniai [] = new LeidinysImpl[11];
        leidiniai[0] = leidinys1;
        leidiniai[1] = leidinys2;
        leidiniai[2] = leidinys3;
        leidiniai[3] = leidinys4;
        leidiniai[4] = leidinys5;
        leidiniai[5] = knyga1;
        leidiniai[6] = knyga2;
        leidiniai[7] = knyga3;
        leidiniai[8] = knyga4;
        leidiniai[9] = knyga5;
        leidiniai[10] = knyga6;

            for(LeidinysImpl leidinis: leidiniai){
                if(leidinis instanceof KnygaImpl){
                    KnygaImpl kng = (KnygaImpl) leidinis;
                   if(kng.getliteraturosTipas().equals("Grozine")){
                       System.out.println("Pavadinimas: " + kng.getPavadinimas() + " \nLiteraturos tipas: " + kng.getliteraturosTipas() + " \nPuslapiu skaicius: " + kng.getPuslapiuSkaicius() + "\n") ;
                   }
                }
            }

    }
}
