class SubtractClass {
    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to subtract two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to subtract three integers
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Method to subtract an array of integers
    public int subtract(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result -= num;
        }
        return result;
    }
}

public class DriverClass {
    public static void main(String[] args) {
        SubtractClass subtractObj = new SubtractClass();

        // Using the first subtract method (integers)
        int result1 = subtractObj.subtract(10, 5);
        System.out.println("Result 1: " + result1);

        // Using the second subtract method (doubles)
        double result2 = subtractObj.subtract(7.5, 3.2);
        System.out.println("Result 2: " + result2);

        // Using the third subtract method (three integers)
        int result3 = subtractObj.subtract(20, 5, 3);
        System.out.println("Result 3: " + result3);

        // Using the fourth subtract method (array of integers)
        int[] numbers = {10, 2, 3};
        int result4 = subtractObj.subtract(numbers);
        System.out.println("Result 4: " + result4);
    }
}