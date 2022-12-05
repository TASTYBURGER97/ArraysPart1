public class Main {
    public static void main(String[] args) {
        task1();
    }


    public static void task1() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};

    }

    public static void task2() {
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();


        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();


        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();


    }
}

