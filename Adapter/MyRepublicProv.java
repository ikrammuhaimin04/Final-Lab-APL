package Adapter;

public class MyRepublicProv implements AdvancedInternetProvider{

    //Method yang akan mengoverride method yang ada pada class AdvancedInternetProvider
    @Override
   public void IndihomeProvider(String fileName) {
      System.out.println("Berlangganan dengan Indihome. Dapatkan bonus sebesar: "+ fileName);		
   }

   //Method yang akan mengoverride method yang ada pada class AdvancedInternetProvider
   @Override
   public void MyRepublicProvider(String fileName) {
   }
    
}
