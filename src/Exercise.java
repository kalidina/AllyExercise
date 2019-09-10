public class Exercise {

    public static boolean isValidCharacter(Character c) {
        if (c.toString().matches("^[a-zA-Z]*$"))
            return true;
        return false;
    }

    public static String getSortedText(String inputStr) {
        char[] charArrStr = inputStr.toCharArray();
        StringBuffer result = new StringBuffer();

        int[] charCounter = new int[26];

        for ( int i=0; i<charArrStr.length; i++ ) {
            if ( isValidCharacter(charArrStr[i]) )
                charCounter[Character.toLowerCase(charArrStr[i]) - 'a']++;
        }

        for ( int j=0; j<26; j++ ) {
            for ( int k=0; k<charCounter[j]; k++ ) {
                result.append((char)('a' + j));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputStr = "When not studying nuclear physics, Bambi likes to play\n" +
                "beach volleyball.";
        String result = getSortedText(inputStr);
        System.out.println(result);

    }
}
