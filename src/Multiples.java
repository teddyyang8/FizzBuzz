public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i < 1000; i++) {
            count += countMultiples(i);
        }
        System.out.println(count);
    }
    public static int countMultiples(int i) {
        // Check if i divides by 3 or 5
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // returns 1
        if (divisibleBy3 || divisibleBy5) {
            return 1;
        }
        return 0;
    }
}
