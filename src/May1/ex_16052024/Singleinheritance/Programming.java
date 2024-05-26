package May1.ex_16052024.Singleinheritance;

public class Programming {

    int version;
    String author;

    Programming() {
        System.out.println("DC");
    }

    public Programming(int version, String author) {
        this.version = version;
        this.author = author;
    }

    void printinfo(){
        System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);
    }

    void bhk3(){
        System.out.println("3BHK");
    }

}
