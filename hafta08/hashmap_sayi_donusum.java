package hafta08;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap_sayi_donusum {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "bir");
        hm.put(2, "iki");
        hm.put(3, "üç");
        hm.put(4, "dört");
        hm.put(5, "beş");
        hm.put(6, "altı");
        hm.put(7, "yedi");
        hm.put(8, "sekiz");
        hm.put(9, "dokuz");
        hm.put(0, "");

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(1, "on");
        hm2.put(2, "yirmi");
        hm2.put(3, "otuz");
        hm2.put(4, "kırk");
        hm2.put(5, "elli");
        hm2.put(6, "altmış");
        hm2.put(7, "yetmiş");
        hm2.put(8, "seksen");
        hm2.put(9, "doksan");
        hm2.put(0, "");
        String s="";

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Bir sayı giriniz:");
            s = scan.next();
            if(Integer.parseInt(s)>0 && Integer.parseInt(s)<100) break;
            else System.out.println("Lütfen 2 basamaklı bir sayı giriniz!");
        }


        int o =  Integer.parseInt(Character.toString(s.charAt(0)));
        int b =  Integer.parseInt(Character.toString(s.charAt(1)));

        System.out.println(hm2.get(o)+" "+hm.get(b));
    }
}
