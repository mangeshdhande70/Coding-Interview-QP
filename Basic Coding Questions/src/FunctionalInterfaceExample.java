// QP -> Multiply Two Numbers Using Functional Interface

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Multiply multiply = (a, b) -> a * b;

//        Multiply multiply = new Multiply() {
//            @Override
//            public int multiply(int a, int b) {
//                return a * b;
//            }
//        };

        int ans = multiply.multiply(4, 5);
        System.out.println(ans);
    }

}

interface Multiply{
    int multiply(int a, int b);
}