// 3. Реализовать простой калькулятор

import java.util.*;

public class Zadacha3 {
    public static void main(String[] args)

    {
  
      Scanner con = new Scanner(System.in);
  
      int a = con.nextInt();
  
      String ch = con.next();
  
      int b = con.nextInt();
  
     
  
      int res = 0;
  
      if (ch.equals("+")) res = a + b;
  
      if (ch.equals("-")) res = a - b;
  
      if (ch.equals("*")) res = a * b;
  
      if (ch.equals("/")) res = a / b;
  
   
  
      System.out.println(res);
  
      con.close();
  
    }
}
