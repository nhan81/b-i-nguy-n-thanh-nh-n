package bt;

import bt.Bt;
import bt.Bt;
import bt.b2;
import bt.b2;
import bt.b2;
import bt.b3;
import bt.b3;
import bt.b3;
import java.util.Scanner;

public class b4
{
    public static void menu ()
    {
       System.out.println("b1");
       System.out.println("b2");
       System.out.println("b3");
       Scanner sc = new Scanner(System.in);
       int chon = sc.nextInt();
       switch(chon)
       {
           case 1: Bt.ptb1();
           break;
           case 2: b2.ptb2();
           break;
           case 3:b3.tinhtiendien();
           break;
           case 4: break;
           default:  
               System.out.println("nhap sai ");
       }
    }
     public static void main(String[] arg)
   {
       menu();
   }
}
