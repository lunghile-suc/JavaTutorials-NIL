public class SwapNumbers {

    static void swapNumbers(int val1, int val2) {

        /* Create a temporary variable and assign its value to that of val1 */

        int tempNumber = val1;

        // change the value of val1 to val2
        val1 = val2;

        // assign the value of val2 to the tempNumber
        val2 = tempNumber;

        System.out.println("the value of val1 is = "+ val1 + " and the value of val2 = " + val2);
        
    }
    public static void main(String[] args) {

        // call the function  with the parameters
        swapNumbers(56, 34);
    }
}
