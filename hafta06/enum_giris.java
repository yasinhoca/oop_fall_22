package hafta06;

//COLOR.RED;

enum Gunler{   //Color.RED
    PAZARTESİ, //0
    SALI, //1
    ÇARŞAMBA, //2
    PERŞEMBE, //3
    CUMA,
    CUMARTESİ,
    PAZAR
}

public class enum_giris {
    public static void main(String[] args) {
        Gunler g = Gunler.PAZARTESİ;
        System.out.println(g);
        System.out.println(g.compareTo(Gunler.PERŞEMBE));
        System.out.println(g.ordinal());
        System.out.println(Gunler.PAZAR.ordinal());

    }
}
