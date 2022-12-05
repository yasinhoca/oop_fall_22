package hafta09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexGiris {
    public static void main(String[] args) {
        //Regex
        //Regular Expressions

        String s = "dal sarkar kartal kalkar, kartal kalkar dal sarkar";

        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(s);

        int sayac=0;
        while(m.find()) sayac++;

        System.out.println(sayac);

    }
}
