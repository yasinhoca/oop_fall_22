package hafta02;

public class toplamlar extends hesapla{
        public int topla(int a,int b){ // hesapla sınıfındaki topla methodu iptal olur
            return a*2 + b*2; // artık nesne üzerinden bu method çalışır
            // bu işleme methodların override edilmesi denir.
        }

}
