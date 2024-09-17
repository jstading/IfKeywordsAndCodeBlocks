public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }else{
            return (radius*radius*3.14159);
        }
    }

    public static double area(double num1, double num2){
        if (num1 < 0 || num2 < 0){
            return -1;
        }else{
            return(num1*num2);
        }
    }

}
