public class VIPMember extends Members {
    public VIPMember(){
        System.out.println("Hey, I am VIP");
    }
    public VIPMember(String name, int memberID, int memberSince){
        super(name, memberID, memberSince);
        // System.out.println("Good to know");
    }
    
    @Override
    public void calculateAnnualFee(){
        annualFee = 2*getDiscount();
    }
}
