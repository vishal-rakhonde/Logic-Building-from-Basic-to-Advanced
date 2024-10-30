import java.util.Scanner;
public class DuplicateElementsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        findDuplicates(array);
        sc.close();
    }

    public static void findDuplicates(int[] array) {
        boolean hasDuplicates = false;
        System.out.print("Duplicate elements found: ");
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.print("None");
        }
    }
}
