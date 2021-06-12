package Polymorphism;

public class Poly {

    static void runp(P pe)
    {
        pe.run();
        if (pe instanceof P2)
        {
            System.out.println("instance type verified");
            P2 pe2 = (P2) pe;
            pe2.run();
        }
    }

    public static void main(String...args)
    {
        P2 p = new P2();
        runp(p);
    }
}
