public class Main {
    public static void main(String[] args) {

        findNumberOccurrence(1);

    }

    public static void findNumberOccurrence(int x) {
        int[] array = {1, 5, 6, 7, 9, 3, 1, 2};   // x is number to search for

        int position;                             //Declare position

        for (int i = 0; i <= array.length; i++) {

            if (array[i] != x) {
                System.out.println("Number not found in the array");
                break;
            } else if (array[i] == x) {
                position = i;
                if (position < 5) {
                    System.out.println("Skip the first occurrence for number:" + x);
                }

                // If the position of the first occurrence is less than 5, skip it and continue searching
                for (i = 5; i < array.length; i++) {
                    if (array[i] == x) {
                        position = i;

                        System.out.println("the occurrence for number: " + x + " is at position:" + position);
                    }
                }
                break;           //Found the first occurrence, exit loop
            }
        }
    }


}


