public class PlusOne {

    public static void main(String[] args) {
        plusOne(new int[]{9,8,9,9});
    }

    public static int[] plusOne(int[] digits) {
        int lastOne = digits.length - 1;

        for (int i = lastOne; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
