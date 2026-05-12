import java.util.HashMap;

/**
 * @author Anahita rajabi
 * @date May 12, 2026
 *
 * This program converts s Roman numeral into an integer.
 * A hashmap is used to store Roman numeral symbols and their values.
 * The program goes through the string from left to right.
 *
 * If current value is smaller than the next value,
 * it subtracts the current value.
 * otherwise, it adds the current value.
 */

class romanSolution{
    public int romanToInt(String s){
        //create hashmap

        HashMap<Character,Integer> map = new HashMap<>();

        //Store roman numeral values

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0;

        for (int i =0; i<s.length();i++){
            int current  = map.get(s.charAt(i));
            // check next character

            if (i<s.length() - 1 &&
            current<map.get(s.charAt(i+1))) {
                total -= current;
            }else{
                total += current;
            }
        }
        return total;
    }
}