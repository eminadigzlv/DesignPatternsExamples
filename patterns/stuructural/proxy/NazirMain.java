package patterns.stuructural.proxy;

public class NazirMain {
    public static void main(String[] args) {
        Nazir nazir = new Nazir();
        NazirMuavini muavin= new NazirMuavini(nazir);
        Vetendas vetendas= new Vetendas(muavin);
        vetendas.muracietEt();
    }
}
