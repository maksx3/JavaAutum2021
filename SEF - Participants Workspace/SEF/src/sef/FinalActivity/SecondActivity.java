package sef.FinalActivity;

public class SecondActivity {
    public static void main(String[] args){
        SecondActivity calculator = new SecondActivity();
    }

    public double sum(double firstName, double secondName){
        return firstName + secondName;
    }

    public double subtract(double firstName, double secondName) {
        return firstName - secondName;
    }

    public double divide(double firstName, double secondName){
        return firstName/secondName;
    }

    public double multiply(double firstName, double secondName){
        return firstName*secondName;
    }
}
