package MainPackage.JavaBasics.literals;

public class IntegralLiterals {

    public static void main (String[] args){

        //===========Decimal Literals======================================
        int a =101;                    //0 to 9; (having base 10)
        System.out.println(a);

        //=========Octal Literals==========================================
                                      // That should be prefix with 0
        int b =0101;                 // (0 to 7),(having base 8)
        System.out.println(b);

        //=========Hexa Decimal Literals==========================================
                                      // That should be prefix with 0x or 0X
                                      // (0 to 9),(A to F) or (a to f) (having base 16)
        int c =0x10b;
        System.out.println(c);
        //=========Binary Literals==========================================
                                      // That should be prefix with 0b or 0B
                                      // (0 to 1), (having base 2)
        int d =0b1;
        int e =0b101;
        System.out.println(d);
        System.out.println(e);

    }
    }


