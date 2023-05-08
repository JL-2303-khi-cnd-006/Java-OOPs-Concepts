
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        /* Classes and objects */

        // Person person1 = new Person("Fiza", 25, "Female");
        // System.out.println("name of the person is "+person1.name);
        // System.out.println(person1.age);
        // System.out.println(person1.gender);

        // Rectangle react1 = new Rectangle(2, 5);
        // float area = react1.Area();
        // System.out.println("Area: "+area+" cm");
        // float perimeter = react1.Perimeter();
        // System.out.println("Perimeter: "+perimeter+" cm");

        // Calculator calculate = new Calculator(3.5, 10.25);
        // double sum = calculate.add();
        // double subtract = calculate.subtract();
        // double multiply = calculate.multiply();
        // double divide = calculate.divide();
        // String divideUpdated = NumberFormat.getPercentInstance().format(divide);
        // System.out.println("Sum: "+sum);
        // System.out.println("Substract: "+subtract);
        // System.out.println("Multiply: "+multiply);
        // System.out.println("Divide: "+divideUpdated);

        /*  Inheritance  */

        // Members member0 = new Members("ali", 12, 2020);
        // NormalMember member1 = new NormalMember("javeria", 006, 2022);
        // System.out.println(member0.annualFee);
        // System.out.println(member1.msg);
        // member1.setDiscount();
        // member1.calculateAnnualFee();
        // member1.displayMemberInfo();
        
        /* Polymorphism */
        
        Members[] clubMembers = new Members[7];

        clubMembers[0] = new NormalMember("fiza", 001, 2022);
        clubMembers[1] = new NormalMember("mansoor", 002, 2021);
        clubMembers[2] = new NormalMember("sami", 003, 2023);
        clubMembers[3] = new NormalMember("amna", 004, 2022);
        clubMembers[4] = new VIPMember("javeria", 005, 2022);
        clubMembers[5] = new Members("junaid", 006, 2021);
        clubMembers[6] = new VIPMember("hasan", 007, 2019);

        for(Members m : clubMembers){
            m.calculateAnnualFee();
            m.displayMemberInfo();
            System.out.println("");
        }
        
        
         

    }  
}
