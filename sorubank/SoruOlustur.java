package sorubank;

import java.util.ArrayList;

public class SoruOlustur{
    ArrayList<Soru> sorular = new ArrayList<>();
    SoruOlustur(){
        sorular.add(new Soru(1,
                "Birinci soru",
                "a şıkkı",
                "b şıkkı",
                "c şıkkı",
                "d şıkkı",
        "a şıkkı"));
        sorular.add(new Soru(2,
                "İkinci soru",
                "a şıkkı",
                "b şıkkı",
                "c şıkkı",
                "d şıkkı",
                "a şıkkı"));
        sorular.add(new Soru(3,
                "Üçüncü soru",
                "a şıkkı",
                "b şıkkı",
                "c şıkkı",
                "d şıkkı",
                "a şıkkı"));
        sorular.add(new Soru(4,
                "Dördüncü soru",
                "a şıkkı",
                "b şıkkı",
                "c şıkkı",
                "d şıkkı",
                "a şıkkı"));
        sorular.add(new Soru(5,
                "Beşinci soru",
                "a şıkkı",
                "b şıkkı",
                "c şıkkı",
                "d şıkkı",
                "a şıkkı"));
    }
}
