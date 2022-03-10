package patterns.stuructural.proxy;

public class Vetendas {
    AbstractNazir abstractNazir;

    public Vetendas(AbstractNazir abstractNazir) {
        this.abstractNazir = abstractNazir;
    }

    void muracietEt(){
        System.out.println("Vetendas muraciet etdi");
        abstractNazir.qebulEt();

    }
}
