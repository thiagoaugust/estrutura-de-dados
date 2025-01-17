public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("tubaina ina inao"));
        System.out.println(lengthOfLastWordOther("tubaina ina inerty   "));
    }
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int i = words.length - 1;
        String word = words[i];

        return word.length();
    }

    public static int lengthOfLastWordOther(String s) {
        int counter = 0;
        boolean isCounting = false;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && isCounting){
                return counter;
            }
            if(s.charAt(i) != ' '){
                isCounting = true;
                counter++;
            }
        }

        return counter;
    }
}
