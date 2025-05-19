package Java_Basics_Part2;

public class Lab024_PrintF {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.printf("your variable is %d", a);

        //%d = int, byte, long, short - datatype
        //%s = string
        //%f = float, double
        //%b = boolean
        char new_line='\n';
        int b = 20;
        System.out.printf("%d+ %d", a, b);
        System.out.println();
        System.out.printf("the value of a is %d + the value of b is %d", a, b);
        System.out.println();
        System.out.printf(" a is %d + b is %d", a, b);
        System.out.println();
        int num = 5;
        System.out.printf( new_line+"5*1=%d", num);
        System.out.printf(new_line+"5*2=%d", num * 2);
        System.out.printf(new_line+"5*3=%d", num * 3);
        System.out.printf(new_line+"5*4=%d", num * 4);
        System.out.printf(new_line+"5*5=%d", num * 5);
        System.out.printf(new_line+"5*6=%d", num * 6);
        System.out.printf(new_line+"5*7=%d", num * 7);
        System.out.printf(new_line+"5*8=%d", num * 8);
        System.out.printf(new_line+"5*9=%d", num * 9);
        System.out.printf(new_line+"5*10=%d", num * 10);
    }
}






