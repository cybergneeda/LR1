import java.util.Arrays;
import java.util.Random;

public class Part_1 {
public static void main(String[] args) {
System.out.print("\033[H\033[2J");
int[] myArray = new int[10];
Random r = new Random();
for (int i = 0; i < myArray.length; i++) {
myArray[i] = r.nextInt(100);
}
System.out.println("Исходный массив: "+Arrays.toString(myArray));
int temp = 0;
for (int i = 0; i < myArray.length; i++)
for (int j = 0; j < myArray.length - 1; j++) {
if (myArray[j + 1] < myArray[j]) {
temp = myArray[j];
myArray[j] = myArray[j + 1];
myArray[j + 1] = temp;
}
}
System.out.println("Отсортированный массив: "+Arrays.toString(myArray));
}
}