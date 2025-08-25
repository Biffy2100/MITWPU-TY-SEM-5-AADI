public class E {
    
    public static void main(String[] args){
        String in = "!#$GeeeksforGeeks.Computer.Science.Portal!!";
        int chr=0;
        int dig=0;
        int space=0;
        int symbol=0;
        

        for(int i = 0;i<in.length();i++){
            char curr  = in.charAt(i);

            if(Character.isLetter(curr)){
                chr++;
            }
            else if(Character.isDigit(curr)){
                dig++;
            }
            else if(Character.isWhitespace(curr)){
                space++;
            }else{
                symbol++;
            }

        }
        System.out.println("Characters: "+ chr);
        System.out.println("Digit: "+ dig);
        System.out.println("Whitespaces: "+ space);
        System.out.println("Special Characters: "+ symbol);

    }
}
