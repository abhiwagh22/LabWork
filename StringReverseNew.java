//WAP a program to reverse a given String without using reverse() method.

package LabQuestions;

public class StringReverseNew {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Initialize variables for indices
        int start = 0;
        int end = charArray.length - 1;
        
        // Iterate over the array, swapping characters from start to end
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            // Move indices towards each other
            start++;
            end--;
        }
        
        // Convert the character array back to a string
        String reversedString = new String(charArray);
        
        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);
    }
}
