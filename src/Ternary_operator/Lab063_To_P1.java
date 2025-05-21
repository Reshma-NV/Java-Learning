package Ternary_operator;

public class Lab063_To_P1 {
    public static void main(String[] args) {
        int number = 5;
        String result = number > 0 ? "positive" : "negative";
//      int result = number > 0 ? "positive" : "negative"; --> It cant be possible the return type should be string.
        System.out.println(result);

    }
}
