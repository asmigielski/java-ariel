package start;

public class Jp3 {

    public static void main(String[] args) {
//        P1
        String var1, var2, var3, var4;
        //P2
        var1 = "java";
        var2 = "test";
        var3 = var1 + var2;
//        p3
        var4 = var3 + "AAA";
//        p4
        System.out.println(var3.toUpperCase());
        System.out.println(var4.toUpperCase());
//        p5
        System.out.println(var4.length());
//        p6
        System.out.println("Index 2: " + var3.charAt(2));
        System.out.println("Index 5: " + var3.charAt(5));
        System.out.println(var4.charAt(var4.length() - 3));
//        p7
        System.out.println("VAR1 substr: " + var4.substring(0, 4));
        System.out.println("VAR2 substr: " + var4.substring(4, 8));
    }
}
