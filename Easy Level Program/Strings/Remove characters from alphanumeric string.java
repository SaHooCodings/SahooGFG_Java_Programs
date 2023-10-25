class Solution {
    String removeCharacters(String S) {
        int n = S.length();
        int digitCount = 0;

        // Convert the input string to a character array for in-place modification
        char[] chars = S.toCharArray();

        // Iterate through the character array and keep only the numeric characters
        for (int i = 0; i < n; i++) {
            char currentChar = chars[i];
            if (Character.isDigit(currentChar)) {
                chars[digitCount] = currentChar;
                digitCount++;
            }
        }

        // Create a new string with the numeric characters only
        return new String(chars, 0, digitCount);
    }
}
