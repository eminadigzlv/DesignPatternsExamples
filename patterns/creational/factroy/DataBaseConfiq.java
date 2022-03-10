package patterns.creational.factroy;

public class DataBaseConfiq {
    public static void main(String[] args) {
        String database="oracle";

        if(database.equals("oracle")){
            new Oracle();
        }else if(database.equals("mySql"))
        {
            new MySql();
        }else if(database.equals("postgre")){
            new PostgreSql();
        }else{
            System.out.println("No Database");
        }
    }
}
