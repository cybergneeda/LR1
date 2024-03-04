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
for (int i = 0; i < myArray.length-1; i++) {
int minPos=i;
for (int j = i+1; j < myArray.length; j++) {
    if (myArray[j]<myArray[minPos])
        minPos=j; 
}
    int temp = myArray[minPos];
    myArray[minPos]=myArray[i];
    myArray[i]=temp;
}
System.out.println("Отсортированный массив: "+Arrays.toString(myArray));
}
}