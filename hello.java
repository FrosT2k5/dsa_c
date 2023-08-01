import java.lang.System;
import java.util.*;
public class hello {
    public static void main(String[] args) {
        float p,r,n,si;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        p = scanner.nextFloat();
        System.out.print("Rate of interest: ");
        r = scanner.nextFloat();
        System.out.print("No of years: ");
        n = scanner.nextFloat();
        si = (p*r*n)/100;
        System.out.println("Simple Interest: "+si);
    }
}