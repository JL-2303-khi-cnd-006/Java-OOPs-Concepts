
import java.util.Scanner;

public class Members {
    public String msg = "Welcome to XYZ Fitness club";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    protected int discount = 50;

    public Members(){
        
        System.out.println("It has nothing to store in parentClass");
    }

    public Members(String pname, int pmemberID, int pmemberSince){
        name = pname;
        memberID = pmemberID;
        memberSince = pmemberSince;
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = input.nextLine();
        
        if (!password.equals("abcd")){
            System.out.println("Invalid Password");
        } else {
            System.out.println("Please enter the discount: ");
            discount = input.nextInt();
        }
        input.close();
    }

    public void displayMemberInfo(){
        System.out.println("Member name: "+ name);
        System.out.println("Member ID: "+ memberID);
        System.out.println("Member Since: "+ memberSince);
        System.out.println("Annual Fee: $"+ annualFee);
    }

    public void calculateAnnualFee(){
        annualFee = 0;
    }
}
