/**
 * @author Anahita Rajabi
 * @date May 12, 2026
 *
 * this program finds the longest common prefix in an array of Strings.
 * The program checks characters index by index.
 *
 * It compares the same index in every word.
 * If all characters are the same, it continues.
 * Otherwise, it stops and return the prefix.
 */

class commonSolution{
    public String longestCommonPrefix(String[] strs){
        String result = "";
        // go through each index of the first word
        for( int i = 0; i<strs[0].length();i++) {
            char current = strs[0].charAt(i);
            //compare this character with every other word
            for (int j = 1; j < strs.length; j++) {
                //if index is too long or character is different
                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return result;
                }
            }
            // if all words have same character, add it
            result = result + current;
        }
        return result;

    }
}