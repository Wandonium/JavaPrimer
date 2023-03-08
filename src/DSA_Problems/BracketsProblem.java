package DSA_Problems;

import java.util.HashMap;

public class BracketsProblem {
    public static void main(String[] args) {
        String input = "()";
        char[] charArr = input.toCharArray();
        boolean valid = false;
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        for(int i=0;i<charArr.length;i++) {
            System.out.println("charArr[i]: " + charArr[i]);
            System.out.println("brackets.get(charArr[i]): " + brackets.get(charArr[i]));
            for(int j=i;j<charArr.length;j++) {
                if(charArr[j] == brackets.get(charArr[i])) {
                    valid = true;
                }
            }
            if(!valid) break;
        }
        System.out.println("valid: " + valid);
    }
}
