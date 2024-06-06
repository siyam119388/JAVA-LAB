package Task4;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World";
        int[] result = countVC(input);
        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);
    }

    public static int[] countVC(String arg) {
        int[] counts = new int[2];
        int vowels = 0;
        int consonants = 0;
     
        arg = arg.toLowerCase();
        
        for (int i = 0; i < arg.length(); i++) {
            char ch = arg.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
          
            else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }
        
       
        counts[0] = vowels;
        counts[1] = consonants;
        
        return counts;
    }
}
