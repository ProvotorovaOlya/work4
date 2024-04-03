public class Fractions{
    private long wholePart;
    private short fractionalPart;

    public void Fractions(long numerator, short significant){
        if (significant > 0) {
            this.wholePart = numerator;
            this.fractionalPart = significant;
        }
        else {
            throw new ArithmeticException("Неверный знаменатель");
        }
    }

    public String toString(){
        return wholePart + "/" + fractionalPart;
    }
    public void add(long a){
        wholePart += fractionalPart * a;
    }
    public long getWholePart(){
        return wholePart;
    }

    public int getFractionalPart(){
        return fractionalPart;
    }

    public void setWholePart(long wholePart){
        this.wholePart = wholePart;
    }

    public void setFractionalPart(short fractionalPart){
        if (fractionalPart <= 0){
            throw new ArithmeticException("Неверный знаменатель");
        }
        else {
            this.fractionalPart = fractionalPart;
        }
    }

    public long wholePart(){
        return wholePart/fractionalPart;
    }
    public void fractionalize(){
        long nod = NOD(wholePart,fractionalPart);
        wholePart /= nod;
        fractionalPart /= nod;
    }
    private long NOD(long a, long b){
        if (b == 0){
            return a;
        }
        return NOD(b, a % b);
    }
    public void add(Fractions a){
        long temp = fractionalPart, newFractionalPart = a.getWholePart();
        fractionalPart *= a.getFractionalPart();
        wholePart *= a.getFractionalPart();
        newFractionalPart *= temp;
        wholePart += newFractionalPart;
        fractionalize();
    }
    public void subtraction(long a){
        wholePart -= fractionalPart * a;
    }
    public void subtraction(Fractions a){
        long temp = fractionalPart, numeratorNew = a.getWholePart();
        fractionalPart *= a.getFractionalPart();
        wholePart *= a.getFractionalPart();
        numeratorNew *= temp;
        wholePart -= numeratorNew;
        fractionalize();
    }
    public void multiplication(long a){
        wholePart *= a;
    }
    public void multiplication(Fractions a){
        wholePart *= a.getWholePart();
        fractionalPart *= a.getFractionalPart();
        fractionalize();
    }
    public void division(int a){
        if (a == 0){
            throw new ArithmeticException("Деление на 0");
        }
        else if (a > 0){
            fractionalPart *= a;
        }
        else {
            fractionalPart *= Math.abs(a);
            wholePart *= -1;
        }
    }
    public void division(Fractions a){
        if(a.getWholePart() > 0) {
            wholePart *= a.getFractionalPart();
            fractionalPart *= a.getWholePart();
        }
        else if (a.getWholePart() == 0){
            throw new ArithmeticException("Неверный знаменатель");
        }
        else {
            wholePart *= a.getFractionalPart() * -1;
            fractionalPart *= a.getWholePart() * -1;
        }
    }
    public String comparison(int a){
        if (a * fractionalPart > wholePart){
            return toString() + " > " + a;
        }
        else if (a * fractionalPart == wholePart){
            return toString() + " = " + a;
        }
        else{
            return toString() + " < " + a;
        }
    }
}
