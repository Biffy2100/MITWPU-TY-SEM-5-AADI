public class C {
    public static void main(String[] args) {
        String x = "Aadi";
        int count = 0;
        
        for (int i = 0; i < x.length(); i++) {
            char a = x.charAt(i); 
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
                count++;
            }
        }

      
        System.out.println("Number of vowels: " + count);
    }
}