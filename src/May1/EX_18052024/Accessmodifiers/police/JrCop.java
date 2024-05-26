package May1.EX_18052024.Accessmodifiers.police;

public class JrCop {
    public static void main(String[] args) {

        cop cop = new cop(10);
        System.out.println(cop.gun);
        cop.canishoot();
    }
}
