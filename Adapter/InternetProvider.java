package Adapter;

public class InternetProvider implements InternetProv {
    InternetAdapter internetAdapter;

    //Method yang akan mengoverride method yang ada pada class InternetProv
    @Override
    public void langganan(String providerType, String fileName) {

        if(providerType.equalsIgnoreCase("indihome") || providerType.equalsIgnoreCase("myrepublic")){
            internetAdapter = new InternetAdapter(providerType);
            internetAdapter.langganan(providerType, fileName);
    }
    else{
        System.out.println("Input yang anda masukan salah atau tidak tersedia" + providerType);
        }
    }
}
