package May.ex_21052024.Abstraction.LoanEx;

abstract class Father {
    abstract void loan50K();
    void loan25K(){
        System.out.println("Done by Father");
    }
    Father(){}
}
