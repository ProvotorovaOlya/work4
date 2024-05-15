/**
 * Абстрактный класс, описывающий метод поиска
 */
public abstract class Abs_ut {
    /** Поле породы собаки */
    public String breed;

    /**
     *
     * @param breed Порода собаки
     */
    public abstract void setBreed(String breed);

    /**
     *
     * @return породу собаки
     */
    public abstract String getBreed();
    /**
     * Метод для поиска объекта типа dog с заданной породой
     * @param dogs Массив объектов типа Basovi
     * @param count Количество объектов
     * @return Порядковый номер объекта, если найден, иначе отрицательное число
     */
    public abstract int poisk(Basovi[] dogs, int count);
}
