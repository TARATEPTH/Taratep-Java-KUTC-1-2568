public class IfElseBasic
{
    public static void main(String[] args) {
        int number_1 = 10;
//        int number_2 = 11;

//        if (number_1 <= number_2) {
//            total = true;
//            System.out.println("number_1 is less than or equal to number_2: " + total);
//        } else {
//            total = false;
//            System.out.println("number_1 is greater than number_2: " + total);
//        }
        if (number_1 == 10) {
            System.out.println("equal");
        } else if (number_1 < 10) {
            System.out.println("less");
        } else {
            System.out.println("greater");
        }
    }
}
