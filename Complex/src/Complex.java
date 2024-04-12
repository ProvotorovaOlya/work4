public class Complex {
    public double realPart;
    public double imaginaryPart;
    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart(){
        return realPart;
    }
    public double getImaginaryPart(){
        return imaginaryPart;
    }
    public String toString(){
        return realPart + " + " + imaginaryPart + "i";
    }
    public void sum(double a){
        realPart += a;
    }
    public void sum(Complex a){
        realPart += a.getRealPart();
        imaginaryPart += a.getImaginaryPart();
    }
    public void product(Complex a){
        realPart = realPart * a.getRealPart() - imaginaryPart * a.getImaginaryPart();
        imaginaryPart = realPart * a.getImaginaryPart() + a.getRealPart() * imaginaryPart;
    }
    public void product(double a){
        realPart *= a;
        imaginaryPart *= a;
    }
    public void del(double a){
        realPart /= a;
        imaginaryPart /= a;
    }
    public void del(Complex a){
        double newRealPart = (realPart * a.getRealPart() + imaginaryPart * a.getImaginaryPart()) / (a.getRealPart() * a.getRealPart() + a.getImaginaryPart() * a.getImaginaryPart());
        imaginaryPart = (a.getRealPart() * imaginaryPart - realPart * a.getImaginaryPart()) / (a.getRealPart() * a.getRealPart() + a.getImaginaryPart() * a.getImaginaryPart());
        realPart = newRealPart;
    }
    public void coupling(){
        imaginaryPart = -imaginaryPart;
    }
    public void pow(int a){
        Complex b  = new Complex(realPart,imaginaryPart);
        Complex New = new Complex(realPart,imaginaryPart);
        New.product(b);
        for(int i = 1; i < a; i++){
            New.product(b);
        }
    }
    public String trigonometric(){
        double r = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
        double cos_a = realPart / r;
        double sin_a = imaginaryPart / r;
        return r + "( cos arccos" + cos_a + " + sin arcsin" + sin_a + " )";
    }
}
