public class DuplicateElementsFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6};
        findDuplicates(array);
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
