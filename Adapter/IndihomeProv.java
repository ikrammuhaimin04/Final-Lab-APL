package Adapter;

public class IndihomeProv implements AdvancedInternetProvider{
    
     //Method yang akan mengoverride method yang ada pada class AdvancedInternetProvider
    @Override
    public void IndihomeProvider(String fileName) {
    }
 
    //Method yang akan mengoverride method yang ada pada class AdvancedInternetProvider
    @Override
    public void MyRepublicProvider(String fileName) {
       System.out.println("Berlangganan dengan MyRepublic. Dapatkan bonus sebesar:"+ fileName);		
    }
}
