
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

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

        // Members member0 = new Members("ali", 12, 2020);
        NormalMember member1 = new NormalMember("javeria", 006, 2022);
        // System.out.println(member0.annualFee);
        System.out.println(member1.msg);
        member1.setDiscount();
        member1.calculateAnnualFee();
        member1.displayMemberInfo();

        
        

    }  
}
