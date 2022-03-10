package patterns.stuructural.proxy;

import java.util.Random;

public class NazirMuavini extends  AbstractNazir{
    AbstractNazir nazir;

    public NazirMuavini(AbstractNazir nazir) {
        this.nazir = nazir;
    }

    @Override
    void qebulEt() {
        Random random = new Random();
        int value=random.nextInt();
        if(value%7==0){
            nazir.qebulEt();
        }else {
            System.out.println("Muavin muracieti qebul etdi");
        }

    }
}
