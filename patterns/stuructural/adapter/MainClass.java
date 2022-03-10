package patterns.stuructural.adapter;

public class MainClass {
    public static void main(String[] args) {


       // HrSystem hrSystem = new OldSystem();
       NewHrSytem hrSytem= new NewHrSytem();
       HrSystem adapter = new Adapter(hrSytem);
       Client client = new Client(adapter);
        client.run();
    }
}