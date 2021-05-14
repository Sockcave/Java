package Basics;
// Multidimensional arrays are arrays that contain OTHER ARRAYS.
// 

public class multidimensional_arrays {

    // Example of a 2D array
    public static void example1() {
        int[][] sample = { {1, 2, 3}, {4, 5, 6} };

        // The following accesses the first element in the second array of sample.
        int x = sample[1][0];
        System.out.println(x);
        // The array's two indexes are called row index and column index.
    }

    public static void example2() {
        String array[][] = { {"Hey", "John", "Bye"}, {"John", "Johnson", "Hello"}} ;
        System.out.println(array[1][1]);
    }

    //You can get and set a multidimensional array's elements using the same pair of square brackets.
    public static void example3() {
        int[][] myArr = { {1, 2, 3}, {4}, {5, 6, 7} };
        myArr[0][2] = 42;
        System.out.println(myArr[0][2]);
        int x = myArr[1][0]; //4
        System.out.println(x);
    }

    public static void example4() {
        int arr[] = new int[3];
        for(int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res);
    }

    public static void example5() {
        int result = 0;
        for(int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        multidimensional_arrays.example1();
        multidimensional_arrays.example2();
        multidimensional_arrays.example3();

        multidimensional_arrays.example4();
        multidimensional_arrays.example5();
    }
}

// In Java, you're not limited to just two-dimensional arrays. 
// Arrays can be nested within arrays to as many levels as your program needs. 
// All you need to declare an array with more than two dimensions, ...
//... is to add as many sets of empty brackets as you need. However, these are harder to maintain.
// Remember, that all array members must be of the same type.
