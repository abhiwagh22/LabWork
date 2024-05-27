//Write a java program to capitalize each word in string.

package LabQuestions;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        String str = "hello world! how are you?";
        
        // Split the string into words
        String[] words = str.split(" ");
        
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Iterate over each word
        for (String word : words) {
            // Capitalize the first letter of each word and append it to the result
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        
        // Convert StringBuilder to a string and trim any trailing spaces
        String capitalizedString = result.toString().trim();
        
        // Print the capitalized string
        System.out.println("Capitalized each word in String is: " + capitalizedString);
    }
}
