package hafta08;

import java.util.TreeMap;

public class treemap_giris {
    public static void main(String[] args) {
        TreeMap<String,Boolean> tmp= new TreeMap<>();
        tmp.put("Ali",true);
        tmp.put("Ayşe",false);
        tmp.put("Zeynep",false);
        tmp.put("Betül",true);

        System.out.println(tmp);
        System.out.println(tmp.get("Ayşe"));
        System.out.println(tmp.get("Yasin")); //null döndürür

        System.out.println(tmp.containsKey("Ahmet"));
    }
}
