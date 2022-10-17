package hafta04;

import java.util.Timer;
import java.util.TimerTask;

public class timer01 {
    static Timer t;
    static int sayac=10;
    static TimerTask gorev,gorev2;

    public static void main(String[] args) {
            t = new Timer();

        gorev = new TimerTask() {
            @Override
            public void run() {
                if(sayac<=0) {
                    t.cancel();
                } else {
                    sayac -= 3;
                    if(sayac>=0) System.out.print(sayac+"-");
                }

            }
        };

        gorev2 = new TimerTask(){
            @Override
            public void run() {
                sayac+=3;
                System.out.print(sayac+"-");
            }
        };

        t.schedule(gorev,0,1000); //gorev nesnesi program çalıştıktan sonra 0 milisaniye  her 1000 ms de çalışacak
        t.schedule(gorev2,0,2000);
    }

}
