package Ternary_operator;

public class Lab066_Even_odd {
    public static void main(String[] args) {

        int x = 12;
       String result = x%2==0 ? "even":"odd";
        System.out.println(result);

        // Step 1 ->  Input, Output - data type
        int num = -13;
        // input -> int
        // output -> String -> even or odd

        // Step 2 ->
        // num%2 == 0 >  even else 1 odd.
        String result2 = (num%2==0) ? "even" : "odd";
        System.out.println(result2);

        // Edge Cases
        //  -negative, float.,0

    }
}
