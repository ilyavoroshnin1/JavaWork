package Lexa10.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Krug krug1 = new Krug(5);
        Krug krug2 = new Krug(3);
        Pryamougolnik pryamougolnik1 = new Pryamougolnik(2,5);
        Pryamougolnik pryamougolnik2 = new Pryamougolnik(4,7);

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(krug1);
        figuras.add(krug2);
        figuras.add(pryamougolnik1);
        figuras.add(pryamougolnik2);

        for (Figura f :figuras){
            System.out.println(f.perimetr());

        }

    }
}
