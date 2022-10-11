package hafta03;

abstract class ornek{ //abstract sınıf
    abstract void get_tcno(); //abstract method en az 1 tane olmak zorunda

    abstract  void get_adres();

    void get_isim(){ // abstract omayan methodlarda tanımlanabilir
        //yapılacak işler
    }

}

class yeni extends ornek{

    @Override
    void get_tcno() { //abstract methodlar miras verilen sınıf içinde mutlaka tanımlanmalıdır
                            //böylece programcının bu methodları kullanması zorunlu hale getirilir.
    }

    @Override
    void get_adres() {

    }
}

public class soyut_abstract_class {
    public static void main(String[] args) {
        //ornek o = new ornek(); abstract sınıfın nesnesi üretilemez
        yeni y = new yeni(); //abstract sınıfın miras verdiği yeni sınıfının nesnesi oluşturulabilir

    }
}
