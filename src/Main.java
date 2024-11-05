public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] integerArray = new int[]{1, 2, 3};
        double[] fractionalArray = {1.57, 7.654, 9.986};
        int[] myArray = new int[]{3, 14, 53, 4};

        System.out.println("Задание 2");
        for (int i = 0; i < integerArray.length - 1; i++) {
            System.out.print(integerArray[i] + ", ");
        }
        System.out.println(integerArray[integerArray.length - 1]);

        for (int i = 0; i < fractionalArray.length - 1; i++) {
            System.out.print(fractionalArray[i] + ", ");
        }
        System.out.println(fractionalArray[fractionalArray.length - 1]);

        for (int i = 0; i < myArray.length - 1; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println(myArray[myArray.length - 1]);

        System.out.println("\nЗадание 3");
        for (int i = integerArray.length - 1; i > 0; i--) {
            System.out.print(integerArray[i] + ", ");
        }
        System.out.println(integerArray[0]);

        for (int i = fractionalArray.length - 1; i > 0; i--) {
            System.out.print(fractionalArray[i] + ", ");
        }
        System.out.println(fractionalArray[0]);

        for (int i = myArray.length - 1; i > 0; i--) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println(myArray[0]);

        System.out.println("\nзадание 4");
        for (int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] % 2 != 0){
                integerArray[i]++;
            }
            System.out.print(integerArray[i] + " ");
        }
    }
}