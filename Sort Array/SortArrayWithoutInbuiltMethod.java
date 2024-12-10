public class SortArrayWithoutInbuiltMethod {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
