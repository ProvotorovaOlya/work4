package progression;

public abstract class Progression {
    protected double firstA;
    protected double difference;

    public Progression(double firstA, double difference){
        this.firstA = firstA;
        this.difference = difference;
    }
    /*у первого члена порядковый номер 0
    * если прогрессия состоит к примеру из 1 2 3
    * то n=2 */
    public abstract double sum(int n); //сумма прогрессии
    public abstract double iTerm(int i);  //член прогрессии
}
