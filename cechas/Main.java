package com.company;

import com.company.bazine.SuvestineImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        SuvestineImpl medinekoja = new SuvestineImpl("Operatorius","medine koja",1005,5.70);
        SuvestineImpl stalciukas = new SuvestineImpl("Stalius", "medinis stalciukas", 110, 10.80);
        SuvestineImpl rankenele = new SuvestineImpl("Gamybos darbuotojas", "medine rankenele", 8, 15.13);
        SuvestineImpl laikyklis = new SuvestineImpl("Operatorius", "laikyklis lentynai", 64, 26.48);
        SuvestineImpl dekoras = new SuvestineImpl("Stalius", "medzio dekoras", 13, 108.70);
        SuvestineImpl medinekoja2 = new SuvestineImpl("Operatorius","metaline koja",64,14.78);
        SuvestineImpl stalciukas2 = new SuvestineImpl("Stalius", "metalinis stalciukas", 68, 28.45);
        SuvestineImpl rankenele2 = new SuvestineImpl("Gamybos darbuotojas", "metaline rankenele", 1200, 39.17);
        SuvestineImpl laikyklis2 = new SuvestineImpl("Operatorius", "metalinis laikyklis lentynai", 36, 55.16);
        SuvestineImpl dekoras2 = new SuvestineImpl("Stalius", "metalinis dekoras", 19, 145.79);

        ArrayList<SuvestineImpl> dienosInfo = new ArrayList<SuvestineImpl>();

        dienosInfo.add(medinekoja);
        dienosInfo.add(medinekoja2);
        dienosInfo.add(stalciukas);
        dienosInfo.add(stalciukas2);
        dienosInfo.add(rankenele);
        dienosInfo.add(rankenele2);
        dienosInfo.add(laikyklis);
        dienosInfo.add(laikyklis2);
        dienosInfo.add(dekoras);
        dienosInfo.add(dekoras2);


        for(SuvestineImpl detaliuinfo: dienosInfo){
            double suma = 0;
            suma = detaliuinfo.getkiekis() * detaliuinfo.getdetaleskaina();
            if(detaliuinfo.getkiekis() < 1000){
                System.out.println("\nDetale: " + detaliuinfo.getdetale() + " \npagamintas kiekis: " + detaliuinfo.getkiekis() + "\nDetales kaina: " + detaliuinfo.getdetaleskaina() +  "\nsuma:  " + String.format("%.2f", suma) + "\nNORMA NEIVYKDYTA");
            }
            else {
                System.out.println("\nDetale: " + detaliuinfo.getdetale() + " \npagamintas kiekis: " + detaliuinfo.getkiekis() + "\nDetales kaina: " + detaliuinfo.getdetaleskaina() +  "\nsuma:  " + String.format("%.2f", suma) + "\nNORMA IVYKDYTA");
            }
        }

        System.out.println("\n------------------ Spausdiname pagal detaliu kieki nuo MAX iki MIN, jei kiekis vienodas pagal pavadinima nuo A iki Z --------------------\n");

        Collections.sort(dienosInfo);
        System.out.println(dienosInfo);

        Iterator<SuvestineImpl> i = dienosInfo.iterator();

        while(i.hasNext()){
            double suma = 0;
            if(i.next().getdetaleskaina() > 100){
                i.remove();
            }
        }
        System.out.println("\n------------------ JEI DETALE VIRSIJA 100 eur, SALINAME ELEMENTA IS SARASO --------------------\n");
        System.out.println(dienosInfo);
    }


}
