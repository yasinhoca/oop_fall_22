package hafta09;

import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
        // regex pattern örnekler

		/*
		 [abc]	a, b, or c (simple class)
		 [abc]? once
		 [abc]+ one or more
		 [abc]* zero or more
		 [^abc]	Any character except a, b, or c (negation)
		 [a-zA-Z]	a through z or A through Z, inclusive (range)
        [a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
        [a-z&&[def]]	d, e, or f (intersection)
        [a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
        [a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
		 */

        System.out.println(Pattern.matches("\\d", "1"));//true
        System.out.println(Pattern.matches("\\d", "123"));//false
        System.out.println(Pattern.matches("[\\d]{3}", "123"));//true
        System.out.println(Pattern.matches("[abc]", "abc"));//false
        System.out.println(Pattern.matches("[abc]{3}", "abc"));//true
        System.out.println(Pattern.matches("[ab]{3}", "aba"));//true
        System.out.println(Pattern.matches("[abc]{3}", "aaa"));//true
        System.out.println(Pattern.matches("[abc]{2}", "aac"));//false

        System.out.println(Pattern.matches("[0-9]{2}", "99"));//true
        System.out.println(Pattern.matches("[0-9]{2}", "12"));//true
        System.out.println(Pattern.matches("[0-9a-z]{4}", "3d4f"));//true
        System.out.println(Pattern.matches("[0-9a-z]{4}", "3D4f"));//false büyük D karakteri
        System.out.println(Pattern.matches("[0-9a-z]{4}", "1234"));//true

        System.out.println(Pattern.matches("[0-9&&[^5]]{4}", "1289"));//true 5 hariç 4 basamaklı sayı //ödev verilecek
        System.out.println(Pattern.matches("[a-zA-Z&&[^5-8]]{5}", "aA126"));//false
        System.out.println(Pattern.matches("[a-zA-Z&&[^5-8]]{5}", "aA123"));//false sayısal ifade aramıyoruz

        //API , GraphQL







    }
}
