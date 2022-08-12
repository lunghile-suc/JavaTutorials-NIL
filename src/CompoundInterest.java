public class CompoundInterest {
    public static void main(String[] args) {
        
        /* The formula for compound interest is: 
         *      Compound Interest = P(1 + R/100)r
         *      Where the 
         *      P is principle amount
         *      R is the rate
         *      T is the time span
         */

         double principleAmount = 500;
         double rate = 1.5;
         int timeSpan = 6;

         double CompoundInterest = 500 * (Math.pow((1 + rate / 100), timeSpan));
         
         System.out.println("The Compound Interest is: " + CompoundInterest);
    }
}
