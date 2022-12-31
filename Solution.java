public class Solution {

    public static boolean sevenBoom(int[] array) {

        for (int i : array) {

            String word = Integer.toString(i);
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == '7') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = { 3, 55, 70, 90, 86 };
        if (sevenBoom(array)) {
            System.out.println("boom!");
        }
        else {
            System.out.println("there is no 7 in the array");
        }
    }
}
