package hafta06;

import java.util.ArrayList;
import java.util.Random;

public class l1_lambdaListe_foreach {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> liste = new ArrayList<>();
        for(int i=0;i<10;i++) liste.add(r.nextInt(10));
        System.out.println(liste);

        liste.forEach(p->System.out.println(p.intValue()+3));
    }
}
