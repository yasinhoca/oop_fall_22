package hafta06;

//
@FunctionalInterface
interface lmbd{
    void yaz();
}

public class l0_lambdaInterface {


    public static void main(String[] args) {
        lmbd l = new lmbd() {

            @Override
            public void yaz() {
                // TODO Auto-generated method stub

            }
        };

        l.yaz();

        lmbd l2 = ()->System.out.println("Merhaba");
        l2.yaz();


    }

}