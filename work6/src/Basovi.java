import java.util.Scanner;

/**
 * Класс, описывающий объект владельца собаки
 */
public class Basovi extends Abs_ut{
    /** Поле фамилия владельца собаки */
    private String vladelec;

    /**
     *
     * @param vladelec
     */
    public void setVladelec(String vladelec) {
        this.vladelec = vladelec;
    }

    /**
     *
     * @return владельца собаки
     */
    public String getVladelec(){
        return vladelec;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }
    /**
     * {@inheritDoc}
     */
    public String getBreed(){
        return breed;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public int poisk(Basovi[] dogs, int count) {
        Scanner in = new Scanner(System.in);
        String newBreed = in.next();
        for(int i = 0; i < count; i++){
            if(dogs[i].getBreed().equals(newBreed)){
                return i + 1;
            }
        }
        return -1;
    }
}
