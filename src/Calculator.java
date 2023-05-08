// Create a class called Calculator with attributes num1 and num2.
// Implement methods to add, subtract, multiply, and divide the two numbers, and to print out the result.

public class Calculator {
    double num1;
    double num2;
    
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1+num2;
    }
    public double subtract(){
        return num1-num2;
    }
    public double multiply(){
        return num1*num2;
    }
    public double divide(){
        return num1/num2;
    }
}
