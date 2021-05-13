import java.util.Arrays;

public class MyArrayList <T>{
    private T [] array;
    private static final int DEFAULT_CAPACITY = 10;
    private int cursor;

    public MyArrayList () {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity){
        this.array = (T[]) new Object[capacity];
    }

    public T[] getArray() {
        return array;
    }

    public String fullCapacity() {
        T [] temp = array;
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        String [] temp = new String [cursor];
        System.arraycopy(array, 0, temp, 0, cursor);
        return Arrays.toString(temp);
    }

    //увеличиваем ёмкость массива
    private T [] addCapacity(){
        T [] temp = (T[]) new String[(int) (array.length * 1.5)];
        System.arraycopy(array, 0, temp, 0, array.length);
        return temp;
    }

    //добавляет элемент в конец массива
    public void add (T value) {
        if (cursor == array.length){
            array = (T[]) addCapacity();
        }
       array[cursor] = value;
       cursor++;
    }

    //проверяем индексы, не выходят ли они за границы массива
    private void isIndexExist(int index){
        if(index >= array.length || index<0) throw new java.lang.ArrayIndexOutOfBoundsException
                ("\n Несуществующий индекс." +
                        "\n Количество элементов в коллекции " + cursor + ". Емкость " + array.length);
        return;
        }


    //возвращает элемент под индексом
    public T get(int index) {
        //проверка корректности ввода
        isIndexExist(index);
        return array[index];
    }

    //удаляет элемент под индексом
    public void remove(int index) {
       //проверка корректности ввода
       isIndexExist(index);
       System.arraycopy(array, index+1, array, index, cursor-1-index);
       array[cursor-1] = null;
       cursor--;
    }

    //очищает коллекцию
    public void clear() {
        array = (T[]) new String [cursor];
        cursor=0;
    }

    //возвращает размер коллекции
    public int size() {
        return cursor;
    }
}
