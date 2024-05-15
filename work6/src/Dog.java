import java.util.Scanner;
import java.io.*;
/**
 * Класс, описывающий объект собаки
 */
public class Dog extends Basovi implements Inter{
    /** Поле возраст собаки */
    private int age;

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return возраст собаки
     */
    public int getAge(){
        return age;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void reading(int count) throws Exception {
        Basovi[] dogs = new Basovi[count];
        for (int i = 0; i < count; i++){
            Scanner in = new Scanner(System.in);
            dogs[i].setVladelec(in.next());
            dogs[i].setBreed(in.next());
        }
        FileWriter vladelecAndBreed = new FileWriter("vladelecAndBreed.txt");
        for (Basovi d : dogs) {
            vladelecAndBreed.write(d.toString() + "\n");
        }
        vladelecAndBreed.close();
    }
}
