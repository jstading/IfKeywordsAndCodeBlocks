public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        num1 = num1*1000;
        num2 = num2*1000;

        if (num1 > 0){
            num1 = Math.floor(num1);
            num2 = Math.floor(num2);
        }else{
            num1 = Math.ceil(num1);
            num2 = Math.ceil(num2);
        }


        if (num1 == num2){
            return true;
        }else{
            return false;
        }


    }
}
