package database;


public class TestDatabase {
    public static void main(String[] args) {
        ConnectDatabase cd = new ConnectDatabase();
        cd.connectToDatabase();
        System.out.println(cd.getConnection());
        cd.disconnectToDatabase();
    }
}
