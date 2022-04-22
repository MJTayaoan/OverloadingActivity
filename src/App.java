public class App {
    /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */
    private static int findSum(int num1, int num2){
        return num1 + num2;
    }
    private static int findSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * 
     * Create method that returns the greater integer value
     */

    private static int greaterValue(int num1, int num2) {
        if (num1 > num2)
        {
            return num1;
        }
        else if (num1 < num2)
        {
            return num2;
        }
        return greaterValue(25, 95);
    }
     
    /**
     * 
     * Create method that returns the greater double value
     */

    private static double greaterValue(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }
        else if (num1 < num2){
            return num2;
        }
            return greaterValue(2.52, 8.78);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("The sum of 15 and 80 is =" + App.findSum(15, 80));
        System.out.println("The sum of 35 and 60 and 95 is =" + App.findSum(35, 60, 95) + "\n");
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 25 and 95 is =  " + greaterValue(25,95));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 2.52 and 8.78 is = " + greaterValue(2.52,8.78));
    }
}
