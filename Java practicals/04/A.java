// Implementing wrapper class boxing, unboxing, and auto-boxing 
public class A {
    public static void main(String[] args) {
        int a = 10;
        Integer iBoxed = Integer.valueOf(a);
        int iUnboxed = iBoxed.intValue();
        Integer iAutoBoxed = a;
        int iAutoUnboxed = iBoxed;

        System.out.println("int value: " + a);
        System.out.println("Boxed Integer: " + iBoxed);
        System.out.println("Unboxed int: " + iUnboxed);
        System.out.println("Auto-boxed Integer: " + iAutoBoxed);
        System.out.println("Auto-unboxed int: " + iAutoUnboxed);

        char c = 'A';
        Character cBoxed = Character.valueOf(c);
        char cUnboxed = cBoxed.charValue();
        Character cAutoBoxed = c;
        char cAutoUnboxed = cBoxed;

        System.out.println("\nchar value: " + c);
        System.out.println("Boxed Character: " + cBoxed);
        System.out.println("Unboxed char: " + cUnboxed);
        System.out.println("Auto-boxed Character: " + cAutoBoxed);
        System.out.println("Auto-unboxed char: " + cAutoUnboxed);

        double d = 3.14;
        Double dBoxed = Double.valueOf(d);
        double dUnboxed = dBoxed.doubleValue();
        Double dAutoBoxed = d;
        double dAutoUnboxed = dBoxed;

        System.out.println("\ndouble value: " + d);
        System.out.println("Boxed Double: " + dBoxed);
        System.out.println("Unboxed double: " + dUnboxed);
        System.out.println("Auto-boxed Double: " + dAutoBoxed);
        System.out.println("Auto-unboxed double: " + dAutoUnboxed);

        boolean b = true;
        Boolean bBoxed = Boolean.valueOf(b);
        boolean bUnboxed = bBoxed.booleanValue();
        Boolean bAutoBoxed = b;
        boolean bAutoUnboxed = bBoxed;

        System.out.println("\nboolean value: " + b);
        System.out.println("Boxed Boolean: " + bBoxed);
        System.out.println("Unboxed boolean: " + bUnboxed);
        System.out.println("Auto-boxed Boolean: " + bAutoBoxed);
        System.out.println("Auto-unboxed boolean: " + bAutoUnboxed);
    }
}
