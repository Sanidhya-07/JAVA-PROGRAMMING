
public class _26_array_palindrome {
    public static void main(String[] args) {
        int[] userArray = _18_arrayInput.arrayelements();
        System.out.println("Your array is : ");
        _18_arrayInput.showArray(userArray);

        boolean res = isPalindrome(userArray);
        if (res) {
            System.out.println("\nIt is palindrome.");
        } else {
            System.out.println("\nIt is not palindrome.");

        }

    }

    public static boolean isPalindrome(int[] userArray) {

        int j = userArray.length - 1;
        for (int i = 0; i < (userArray.length / 2); i++) {
            if (userArray[i] != userArray[j]) {
                return false;
            }
            j--;

        }
        return true;

    }
}
