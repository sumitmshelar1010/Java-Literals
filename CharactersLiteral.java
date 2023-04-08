package MainPackage.JavaBasics.literals;

public class CharactersLiteral {
    public static void main(String[] args) {


        //-------------Character Literals------------//

        char ch = 'b';  // '' is must
        // As Per ASCII standard
        char MN = 50;
        char PR = 0110;    // in decimal = 72
        char DC = 0x62;   // in decimal = 98
        char WE = 0X72;   // in decimal = 114
        char PT = 0b111111;   // in decimal = 63
        char KL = 0B1111110;   // in decimal = 126
        char ll= 65535;  // Allowed range is 0 to 65535
        char d = 25000;
        


        System.out.println(ll);
        System.out.println(d);
        System.out.println(MN);
        System.out.println(PR);
        System.out.println(DC);
        System.out.println(WE);
        System.out.println(PT);
        System.out.println(KL);
        System.out.println(ch);

    }
}
