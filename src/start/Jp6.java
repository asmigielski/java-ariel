package start;

import java.util.Random;

public class Jp6 {
 public static void main(String[]args) {
     Random rnd = new Random();
     int var1 = rnd.nextInt(10) +1;
     System.out.println("varl = " + var1);
     int var2 = rnd.nextInt(10);
     System.out.println("var2 = + var2");

     System.out.println(var1 > var2);
     System.out.println(var1*2 > var2);
     System.out.println(var2 > var1 + 3 && var2 > var1 - 2);
     System.out.println((var1 * var2) % 2 == 0);
 }}
