package progression;

public class ArithmeticProgression extends Progression{
    public ArithmeticProgression(double firstA, double difference){
        super(firstA, difference);
    }

    @Override
    public double iTerm(int i) throws ArithmeticException{
        if(i >= 0) {
            return firstA + i * difference;
        }
        else{
            throw new ArithmeticException("wrong sequence number");
        }
    }

    @Override
    public double sum(int n) throws ArithmeticException{
        if(n >= 0) {
            double aN = iTerm(n);
            return (n + 1) * ((aN + firstA) / 2);
        }
        else{
            throw new ArithmeticException("wrong sequence number");
        }
    }
}
