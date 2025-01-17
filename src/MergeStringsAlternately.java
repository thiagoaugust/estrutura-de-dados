public class MergeStringsAlternately {

    public static void main(String[] args) {
        System.out.println("Word 1 maior == " + mergeAlternately("abcxip", "pqr"));
        System.out.println("Word 2 maior == " + mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        String together = "";

        for(int i = 0; i < word1.length() + word2.length(); i++){
            if(i < word1.length()){
                together += word1.charAt(i);
            }
            if(i < word2.length()){
                together += word2.charAt(i);
            }

        }
        return together;
    }
}
