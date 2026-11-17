public class Average
{
    //Problem 1: two ints
    public static double average(int a, int b) {
        return (a + b) / 2.0;
        
    }
    //Problem 2: three ints
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    //Problem 3: four ints
    public static double average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    public static void main(String[] args) {
        System.out.println("Average of 3, 4: " + average(3, 4));
        System.out.println("Average of 1, 2, 4: " + average(1, 2, 4));
        System.out.println("Average of 1, 2, 3, 4: " + average(1, 2, 3, 4));
    }
}