package hafta08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_kume_giris {
    public static void main(String[] args) {
        Set<Integer> k1 = new HashSet<>();
        k1.add(2);
        k1.add(3);
        k1.add(1);
        k1.add(2);
        k1.add(5);
        System.out.println(k1);

        HashSet<String> k2 = new HashSet<>();
        k2.add("Ali");
        k2.add("Zeynep");
        k2.add("Cihan");
        k2.add("Ali");
        k2.add("Kamil");
        System.out.println(k2);

        System.out.println(k2.size());

        TreeSet<Float> tk=new TreeSet<>();
        tk.add(1.0f);
        tk.add(1.4f);
        tk.add(2.3f);
        tk.add(0.5f);
        System.out.println(tk);

        //küme iţlemleri
        HashSet<Integer> A = new HashSet<>(Arrays.asList(0,2,3,5,8));
        HashSet<Integer> B = new HashSet<>(Arrays.asList(1,2,4,5,7));

        //Birleşim
        //A.addAll(B);
        //System.out.println(A);

        //Kesişim
        //A.retainAll(B);
        //System.out.println(A);

        //Fark
        A.removeAll(B);
        System.out.println(A);

    }
}
