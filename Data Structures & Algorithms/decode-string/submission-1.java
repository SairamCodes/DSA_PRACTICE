class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build the number (handles multi-digit numbers like 10 or 100)
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                // Save current state before entering brackets
                countStack.push(k);
                stringStack.push(currentStr);
                
                // Reset for the content inside brackets
                currentStr = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                // Bracket ends: repeat current string and combine with outer string
                int count = countStack.pop();
                StringBuilder prevStr = stringStack.pop();
                
                while (count > 0) {
                    prevStr.append(currentStr);
                    count--;
                }
                currentStr = prevStr;
            } else {
                // Regular character, just add to active string
                currentStr.append(c);
            }
        }

        return currentStr.toString();
    }
}