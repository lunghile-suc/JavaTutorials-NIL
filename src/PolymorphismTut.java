public class PolymorphismTut {

    /*
         * Pollymorphism it's a way of doing one thing in many ways
         * In Java there are two types of polymorphism, Compile-time polymorphism and
         * runtime polymorphism
         * In complie-time polymorphism is achieved by function overloading and operator
         * overloading
         * Method overriding is when a method has the same name but it has different impplementations
         * In runtime polymorphism is achieved through method overriding
         * 
         */


    // Method with 2 integer parameters
    static int Multiply(int a, int b) {

        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // The same method but we the double parameters
    static double Multiply(double a, double b) {

        // Returns product of double numbers
        return a * b;
    }



    public static void main(String[] args) {

        System.out.println(Multiply(2, 4));
        System.out.println(Multiply(5.5, 6.3));
    }
}