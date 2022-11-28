package hafta08;

import java.util.HashMap;

public class hashmap_giris {
    public static void main(String[] args) {
        HashMap<Integer,String> mp1 = new HashMap<>();
        mp1.put(1,"Bir"); //veri ekler
        mp1.put(2,"İki");
        HashMap<Integer,String> mp2 = new HashMap<>();
        mp2.put(3,"Üç");
        mp2.put(4,"Dört");

        System.out.println(mp1.get(1)+"-"+mp1.get(2)); //keye göre value döndürüyor
        System.out.println(mp1.containsKey(3));//böyle bir key içeriyor mu? kontrol eder
        System.out.println(mp1.size()); //map'in ikili kayıt sayısı
        System.out.println(mp1.values());
        mp1.putAll(mp2);//var olan kayıtları tekrar etmeden ekler
        System.out.println(mp1);
        mp1.remove(1); //keye göre siler
        System.out.println(mp1);
        mp1.clear(); //tamamını temizler
        System.out.println(mp1);
    }

}
