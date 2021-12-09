import java.util.Scanner;
import Adapter.*;
import Strategy.*;

public class Main {
   public static void main(String[] args) {

      System.out.println("--------SELAMAT DATANG-------");
      System.out.println("CHOOSE YOUR INTERNET PROVIDER");
      System.out.println("=============================");
      System.out.println("Silahkan pilih provider pilihan mu");
      System.out.println("- Indihome");
      System.out.println("- MyRepublic");
      System.out.println("=============================");
      Scanner in = new Scanner(System.in);
      System.out.print("Input pilihan mu disini : ");
      String input = in.next();
      System.out.println("=====================");
      System.out.println("Provider Yang kamu pilih : " + input);

      InternetProvider ip = new InternetProvider();
      Provider p = null;
      p = new Provider();

      if( "Indihome".equalsIgnoreCase(input)){
         p.setProviderMethod(new ProviderIndihome());
         p.chooseProvider();
         ip.langganan("indihome", "5%");

      }else if("MyRepublic".equalsIgnoreCase(input)){
         p.setProviderMethod(new ProviderMyRepublic());
         p.chooseProvider();
         ip.langganan("myrepublic", "10%");
      }

      else{
          System.out.println("Input yang anda masukan salah");
      }
   }
}