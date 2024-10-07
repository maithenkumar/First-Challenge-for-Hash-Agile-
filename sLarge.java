/*HATFD1025
Find the Second Largest Element in an Array
Write a program to find the second-largest element in an array of integers without using any
sorting
algorithms or built-in array functions.
Instructions: Traverse the array manually to find both the largest and second-largest elements
Code*/
public class sLarge {
public static void main(String[] args) {
int[] arr = {12, 35, 1, 10, 34, 1};
int fLarge = Integer.MIN_VALUE;
int sLarge = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
if (arr[i] > fLarge) {
sLarge = fLarge;
fLarge = arr[i];
}
else if (arr[i] > sLarge && arr[i] != fLarge) {
sLarge = arr[i];
}
}
if (sLarge == Integer.MIN_VALUE) {
System.out.println("No second largest element.");
}
else {
System.out.println("The second largest element is: " + sLarge);
}
}
}
	
