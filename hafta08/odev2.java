package hafta08;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class odev2 {
    public static void main(String[] args) {
        Random r = new Random();

        TreeSet<Integer> A = new TreeSet<>();
        TreeSet<Integer> B = new TreeSet<>();

        while(true){
            A.add(r.nextInt(50));
            if(A.size()==20) break;
        }

        while(true){
            B.add(r.nextInt(50));
            if(B.size()==20) break;
        }

        System.out.println(A);
        System.out.println(B);

        //A.addAll(B);
        //A.retainAll(B);
        A.removeAll(B);
        System.out.println(A);

    }
}
