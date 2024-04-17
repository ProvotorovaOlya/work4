package progression;

public class GeometricProgression extends Progression{
    public GeometricProgression(double firstA, double difference){
        super(firstA, difference);
    }

    @Override
    public double iTerm(int i) throws ArithmeticException{
        if(i >= 0) {
            return firstA * Math.pow(difference, i);
        }
        else{
            throw new ArithmeticException("wrong sequence number");
        }
    }

    @Override
    public double sum(int n) throws ArithmeticException{
        if(n >= 0) {
            double aN = iTerm(n);
            return (firstA - aN * difference) / (1 - difference);
        }
        else{
            throw new ArithmeticException("wrong sequence number");
        }
    }
}
