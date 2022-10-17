package hafta04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_finally {
    public static void main(String[] args) {
        // try-catch
		/*
		try {
			int sonuc = 19 / 0;
			System.out.println(sonuc);
		} catch (ArithmeticException e) {
			System.out.println("Hata : " + e.getMessage());
		}
*/
        try {
            int a,b,sonuc;
            Scanner scan = new Scanner(System.in);
            System.out.println("İlk sayı:");
            a = scan.nextInt();
            System.out.println("İkinci sayı:");
            b = scan.nextInt();
            sonuc = a + b;
            System.out.println(sonuc);

        } catch(InputMismatchException e) {
            System.out.println("Lütfen integer değer giriniz!");
            System.out.println("Hata :" + e.getMessage());
        } finally {
            System.out.println("Ne olursa olsun yapılacak son iş!");
        }

    }

}
