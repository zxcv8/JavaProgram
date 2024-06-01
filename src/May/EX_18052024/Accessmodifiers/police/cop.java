package May.EX_18052024.Accessmodifiers.police;

public class cop {
    public int gun;//public access by anyone
private String idcard;//private--only available to the cop

    public cop(int gun)
    {
        this.gun=gun;//PC

    }

    protected void canishoot() {
        System.out.println("ofcourse,shoot!");
    }
}
