package May.ex_16052024.multilevelinheritance.apiautomation;

public class lab177 {
    public static void main(String[] args) {
        //        Test t1 = new Test();
//        t1.openExcelFile();
//        t1.openSQLConnection();
//        int a = t1.API_VERSION;
//
        commontoall c = new test();
        c.openExcelFile();
        c.openJSON();
    }
}
