public class _27_merge_sorted_array {
    public static void main(String[] args) {
        System.out.println("\nEnter your first sorted array :");
        int[] arr1 = _18_arrayInput.arrayelements();

        System.out.println("\nEnter your second sorted array :");
        int[] arr2 = _18_arrayInput.arrayelements();

        int[] mergedArray = merge(arr1, arr2);
        System.out.println("\nFinal sorted array is : ");
        _18_arrayInput.showArray(mergedArray);

    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = arr2[j];
                j++;
                k++;
            }

        }
        while (i < arr1.length) {
            newArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            newArr[k++] = arr2[j++];
        }

        return newArr;

    }

}