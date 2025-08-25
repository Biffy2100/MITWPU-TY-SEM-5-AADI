import java.util.*;

public class vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int count = 0;

        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
        sc.close();
    }
    
}
