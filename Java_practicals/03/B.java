public class B {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer();
        s.append("racecar");

        String original = s.toString();
        String reversed = s.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
