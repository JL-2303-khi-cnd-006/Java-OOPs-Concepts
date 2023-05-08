
public class NormalMember extends Members{
    
    public NormalMember(){

        System.out.println("Child Xlass");
    }

    public NormalMember(String name, int memberID, int memberSince){
        super(name, memberID, memberSince);
        System.out.println("Have a nice day");
    }

    @Override
    public void calculateAnnualFee(){
        annualFee = (1-0.01*getDiscount())*(100 + 12*30);    
    }
}

