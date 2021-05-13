// An array is a collection of variables of the SAME TYPE.
// In an array, the elements are ordered and each one has a specific and constant position(index).
// Arrays are identified wit zero-based index numbers.

// To declare an array of integers for example: int[] arr;
// Next you need to define the array's capacity.
// For example(capacity): int[] arr = new int[5];

public class arrays {

    public static void example1() {
        int[] arr = new int[5];
        // The third index has been assigned a value of 42
        arr[2] = 42;
        System.out.println(arr[2]);
    }

    // Example of an array literal (can use when you know what values you will use for the array)
    public static void example2() {
        // The following code intializes an array containing 4 elements and stores the provided values.
        String[] myNames = {"A", "B", "C", "D"};
        System.out.println(myNames[2]);
    }

    // You can access the LENGTH of an array
    public static void example3() {
        int[] intArr = new int[5];
        System.out.println(intArr.length);
    }

    // We can calculate the sum of an array.
    public static void example4() {
        int[] myArr = {6, 42, 3, 7};
        int sum = 0;
        for(int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        arrays.example1();
        arrays.example2();
        arrays.example3();
        arrays.example4();
    }
}