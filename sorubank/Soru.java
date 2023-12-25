package sorubank;

public class Soru {
    int numara;
    String metin;
    String a,b,c,d;
    String cevap;

    public Soru(int numara, String metin, String a, String b, String c, String d, String cevap) {
        this.numara = numara;
        this.metin = metin;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.cevap = cevap;
    }
}
