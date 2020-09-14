import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 10;
        double m = (n + x/n)/2;
        while(Math.abs(m-n)>.00001)
        {
            n = m;
            m = (n + x/n)/2;
        }

        return m;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        // REPLACE WITH YOUR CODE HERE
        int fact = 1;
        for(int i = x; i>=1; i--)
        {
            fact*=i;
        }
        return fact;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        // REPLACE WITH YOUR CODE HERE
        int i=1;
        double E = 1;
        while(Math.E - E > 0.00000000001)
        {
            E += (1/factorial(i));
            i++;
            System.out.println(E);
        }
        return E;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive double");
        double a = scan.nextDouble();
        System.out.println(babylonian(a));
        System.out.println("Enter a positive int");
        int b = scan.nextInt();
        System.out.println(factorial(b));
        System.out.println("Enter a positive int");
        int c = scan.nextInt();
        System.out.println(calculateE()); 
        System.out.println(Math.E);       

        scan.close();
    }
}
