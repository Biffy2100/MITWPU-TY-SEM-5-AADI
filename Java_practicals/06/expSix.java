try{package ThePackage;}catch(Exception e){}

public class expSix {
    public static void main(String[] args) throws Exception {

        try {
            useme u = new useme();

        } catch (MyException e) {
            System.out.println(e);
        }

        u.salary();
        u.area();
        u.percentage();
    }
}