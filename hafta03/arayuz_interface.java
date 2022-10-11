package hafta03;

interface arayuz{
    void tc_no();
    void adres();
    void vergi_no();
}

class ar implements arayuz{

    @Override
    public void tc_no() {

    }

    @Override
    public void adres() {

    }

    @Override
    public void vergi_no() {

    }
}

public class arayuz_interface {
    /*arayuz a = new arayuz() { nesnesi oluşturulduğunda tanımlanmış methodlar override edilmek zorundadır.
        @Override
        public void tc_no() {

        }

        @Override
        public void adres() {

        }

        @Override
        public void vergi_no() {

        }
    }; */

    ar a = new ar(); //implement edilen sınıf üzerinden nesne üretilebilir

}
