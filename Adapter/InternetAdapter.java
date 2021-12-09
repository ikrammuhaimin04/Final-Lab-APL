package Adapter;

public class InternetAdapter implements InternetProv{
    
    AdvancedInternetProvider advancedInternetProvider;

    //Method Pengecekan Input
    public InternetAdapter(String providerType){

        if(providerType.equalsIgnoreCase("indihome") ){
            advancedInternetProvider = new MyRepublicProv();	
            
         }else if (providerType.equalsIgnoreCase("myrepublic")){
            advancedInternetProvider = new IndihomeProv();
        }
    }

    //Method yang akan mengoverride method yang ada pada class InternetProv
    @Override
    public void langganan(String providerType, String fileName) {
    
       if(providerType.equalsIgnoreCase("indihome")){
          advancedInternetProvider.IndihomeProvider(fileName);
       }
       else if(providerType.equalsIgnoreCase("myrepublic")){
          advancedInternetProvider.MyRepublicProvider(fileName);
       }
    }
}
