public class Calculator {

    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double addNum(){
        return num1 + num2;
    }

    public double subtractNum(){
        return num1 - num2;
    }

    public double multiplyNum(){
        return num1 * num2;
    }

    public double divideNum(){
        return num1 / num2;
    }
}
