public class LargestThree{
 public static int max(int[] array) {
  int largest = array[0];

 for (int i = 1; i < array.length; i++) {
    if (array[i] > largest) {
    largest = array[i];
}
  }

return largest; 
}

 public static void main(String[] args) {
int[] numbers = {4, 9, 2};

    int result = max(numbers);

System.out.println("Largest number is: " + result);
    }
}
