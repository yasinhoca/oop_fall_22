package hafta07;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class soru1_lambda_cozum {
    public static void main(String[] args) {
        Random r = new Random();
        // sıfır ile on arasında 10 sayı oluşturarak aşağıdaki lambda sorularını çözünüz
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<10;i++) l.add(r.nextInt(10));
        System.out.println(l);

        // her elemana 5 ekle
        List<Integer> l1 = l.stream().map(p->p+5).collect(Collectors.toList());
        System.out.println(l1);

        // 2 ile 8 arasındakileri filtrele
        List<Integer> l2 = l.stream().filter(p->(p>2 && p<8)).collect(Collectors.toList());
        System.out.println(l2);

        //reduce ile çıkarma
        Optional<Integer> toplam = l.stream().reduce((p1, p2)->p1-p2);
        System.out.println(toplam.get());

        //çift ise 1 ekle, tek ise bir çıkart
        List<Integer> l3= l.stream().map(p->p%2==0?p+1:p-1).collect(Collectors.toList());
        System.out.println(l3);

        //çift olanları ikiye bölerek filtreleyiniz?
        List<Integer> l4= l.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(l4);
        List<Integer> l5= l4.stream().map(p->p/2).collect(Collectors.toList());
        System.out.println(l5);

        //listedeki en küçük sayıyı buldurunuz
        Optional<Integer> sart2 = l.stream().reduce((p1,p2)->p1<p2?p1:p2);
        System.out.println(sart2.get());

    }

}
