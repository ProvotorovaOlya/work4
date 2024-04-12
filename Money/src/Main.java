public class Main {
    public static void main(String[] args) {
        try{
            Trapezoid a1 = new Trapezoid(1,2,1,2,3,4,5,6);
        }
        catch (RuntimeException e){
            System.out.println("not trapezoid");
        }
    }
}