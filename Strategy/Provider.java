package Strategy;

public class Provider {
    
    private ProviderMethod ProviderMethod;
    
    //Method untuk merubah metode pada langganan
    public void setProviderMethod(ProviderMethod langganan){
        this.ProviderMethod = langganan;
    }

    //Method untuk mendapatkan metode pada langganan
    public ProviderMethod getProviderMethod(){
        return ProviderMethod;
    }

    //Method untuk melakukan chooseProvider yang dipilih berdasarkan input
    public void chooseProvider(){
        ProviderMethod.chooseProvider();
    }

}
