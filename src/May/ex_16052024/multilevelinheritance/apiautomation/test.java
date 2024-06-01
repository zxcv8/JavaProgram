package May.ex_16052024.multilevelinheritance.apiautomation;

public class test extends basetest{

    void accessExcelAndSQL(){
        openExcelFile();
        openSQLConnection();
        System.out.println(API_VERSION);
        System.out.println(VERSION);
    }

    void openJSON(){
        System.out.println("Test");
    }
}
