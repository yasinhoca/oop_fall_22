package hafta02;

public class hesapla {
    int a=10;
    int b=20;
    static float ortalama;

    public static float ortalama(int a,int b){
        return (float) (a+b)/2;
    }

    public static float ortalama(int a, int b, int c){ //üstteki ortalama methodu overload edildi
        return (float) (a+b+c)/3;
    }

    public int topla(int a,int b){
        return a + b;
    }

    //Constructer - Yapıcı method
    hesapla(){
        this.ortalama = (float) (this.a + this.b)/2;
    }

    //constructer methodu overload edelim
    hesapla(int a,int b){
        this.a = a; //burada sınıf değişkeni olan a ve b değişkenlerini
        this.b = b; // constructer method ile gönderdiğim iki değişkenle yeniden belirliyorum
        this.ortalama = (float)(this.a+this.b)/2;
    }


    public static void main(String[] args) {
        float ort = ortalama(5,8);
        System.out.println("Ortalama ="+ort);

        float ort3 = ortalama(13,17,19);
        System.out.println("Üçlü ortalama = "+ ort3);

        hesapla h = new hesapla(); //constructer method tam bu noktada çalışır
        System.out.println(ortalama);

        hesapla h2 = new hesapla(37,41);
        System.out.println(ortalama);

        toplamlar t = new toplamlar();
        System.out.println(t.topla(5,8));

    }
}
