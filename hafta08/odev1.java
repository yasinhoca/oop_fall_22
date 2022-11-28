package hafta08;

import java.util.HashMap;
import java.util.Map;

public class odev1 {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>(Map.of(1,"a",
                                                                                        2,"b",
                                                                                        3,"c",
                                                                                        4,"d"));
        m.put(5,"e");

        //1
        System.out.println(m);

        //2
        System.out.println(m.get(3));

        //3
        System.out.println(m.get(0));

        //4
        m.remove(2);
        System.out.println(m);

        //5
        m.putAll(Map.of(2,"iki",6,"f"));
        System.out.println(m);

        //6
        m.put(2,"b");
        System.out.println(m);

        //7
        System.out.println(m.containsKey(2));

        //8
        System.out.println(m.size());

        //9
        System.out.println(m.values());

        //10
        for (Map.Entry<Integer,String> e : m.entrySet()){
            System.out.println(e);
        }

        //11
        HashMap<Integer,String> m2 = new HashMap<>(Map.of(7,"g",
                                                                                            8,"h",
                                                                                            9,"i",
                                                                                            10,"j"));
        HashMap<Integer,String> m3 = new HashMap<>();

       m3.putAll(m);
       m3.putAll(m2);
        System.out.println(m3);


    }
}
