package GraceSmallChops;

public class ArraySum {
    public static void main(String[] args) {
        int [] addNumbers = {8,14,12,5,3,4,6};
       int sum = 0;
        for (int i = 0; i < addNumbers.length ; i++) {
            sum = sum + addNumbers[i];
        }
            System.out.printf("The sum total of the array is: %n%d",sum);
    }
}
// The pseudocode
// initialize array addNumbers
// initialize sum to zero
//let i be the index and initialize it to zero
// then increment as long as i is less than the array length
// initialize the variable sum and add it to the array of index i.
// display the result.