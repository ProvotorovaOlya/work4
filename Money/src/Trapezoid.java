public class Trapezoid {
    private double x1, x2, x3, x4, y1, y2, y3, y4;

    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if((x1 != x2 && y1 != y2) || (x1 != x3 && y1 != y3) || (x1 != x4 && y1 != y4) || (x3 != x2 && y3 != y2) || (x4 != x2 && y4 != y2) || (x3 != x4 && y3 != y4)){
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.x4 = x4;
            this.y1 = y1;
            this.y2 = y2;
            this.y3 = y3;
            this.y4 = y4;
        }
        else{
            throw new RuntimeException("not trapezoid");
        }
    }
    public double lenght1(){
        double xy1 = Math.sqrt(Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2));
        return xy1;
    }
    public double lenght2(){
        double xy2 = Math.sqrt(Math.abs(x3 - x2) * Math.abs(x3 - x2) + Math.abs(y3 - y2) * Math.abs(y3 - y2));
        return xy2;
    }
    public double lenght3(){
        double xy3 = Math.sqrt(Math.abs(x3 - x4) * Math.abs(x3 - x4) + Math.abs(y3 - y4) * Math.abs(y3 - y4));
        return xy3;
    }
    public double lenght4(){
        double xy4 = Math.sqrt(Math.abs(x1 - x4) * Math.abs(x1 - x4) + Math.abs(y1 - y4) * Math.abs(y1 - y4));
        return xy4;
    }
    public boolean equilateral(){
        if(lenght1() == lenght3()){
            return true;
        }
        else if(lenght2() == lenght4()){
            return true;
        }
        else{
            return false;
        }
    }
    public double perimeter(){
        return lenght1() + lenght2() + lenght3() + lenght4();
    }
    public double squar(){ //когда lenght2, lenght4 - основания
        return ((lenght2() + lenght4()) / (4 * Math.abs(lenght2() - lenght4()))) * Math.sqrt((perimeter() / 2 - lenght2()) * (perimeter() / 2 - lenght4()) * (perimeter() / 2 - lenght1() - lenght2()) * (perimeter() / 2 - lenght2() - lenght4()));
    }
}
