public class Main {
    public static void main(String[] args) {
        Complex complex = new Complex(-2,4);
        System.out.println(complex.toString());
        complex.sum(3);
        System.out.println(complex.toString());
        Complex New = new Complex(1,3);
        complex.sum(New);
        System.out.println(complex.toString());
        complex.product(2);
        System.out.println(complex.toString());
        complex.del(2);
        System.out.println(complex.toString());
        complex.coupling();
        System.out.println(complex.toString());
        complex.product(New);
        System.out.println(complex.toString());
        complex.del(New);
        System.out.println(complex.toString());
        complex.pow(2);
        System.out.println(complex.toString());
        System.out.println(complex.trigonometric());
    }
}