public class Main {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        System.out.println(array.length);
        calculateSumOfArray(array);
        calculateAverageOfArray(array);

        calculateSumOfArray(new int[]{1, 2, 3, 4});
        calculateAverageOfArray(new int[]{1, 2, 3, 4});


    }

    //Sum of elements of Array
    public static int calculateSumOfArray(int[] x) {

        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            int num = x[i];
            sum += num;
        }
        System.out.println("Sum = " + sum);
        return sum;
    }

    //Average of elements of Array
    public static void calculateAverageOfArray(int[] x) {

        int sum = calculateSumOfArray(x);
        double average = (double) sum / x.length;
        System.out.println("Average = " + average);

    }
}