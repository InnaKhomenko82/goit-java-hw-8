import java.util.ArrayList;

public class MyArrayListTester {
    public static void main (String[] args) {

        System.out.println("\nСоздаем Integer MyArrayList с заданной емкостью 5 элементов, вносим пару значений:");
        MyArrayList <Integer> list1 = new MyArrayList <>(5);
        list1.add(88);
        list1.add(44);
        System.out.println(list1.fullCapacity());
        //System.out.println(list1);
        //System.out.println("capacity = " + list1.getArray().length);
        System.out.println("size = " + list1.size());

        System.out.println("\nСоздаем String MyArrayList с емкостью по умолчанию 10 элементов и вносим значения:");
        MyArrayList <String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        System.out.println(list.fullCapacity());
        System.out.println(list);

        System.out.println("size = " + list.size());

        System.out.println("\nДобавляем элементы в конец списка, при необходимости увеличиваем ёмкость в 1,5 раза:");
        System.out.println("Начальный список: " + list);
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("K");
        System.out.println(list.fullCapacity());
        System.out.println(list);

        System.out.println("Определяем размер коллекции после добавления элементов:");
        System.out.println("capacity = " + list.getArray().length);
        System.out.println("size = " + list.size());

        System.out.println("\nОпределяем элементы MyArrayList по индексам:");
        System.out.println("Элемент под индексом 1 = " + list.get(1));
        System.out.println("Элемент под индексом 5 = " + list.get(5));
        System.out.println("Элемент под индексом 8 = " + list.get(8));

        System.out.println("\nУдаляем элементы MyArrayList по индексам:");
        System.out.println("Начальный список: " + list);
        System.out.println("После удаления элемента под индексом 0(значение " + list.get(0) + ")");
        list.remove(0);
        System.out.println("получаем: " + list);
        System.out.println("После удаления элемента под индексом 0(значение " + list.get(0) + ")");
        list.remove(0);
        System.out.println("получаем: " + list);
        System.out.println("После удаления элемента под индексом 7(значение " + list.get(7) + ")");
        list.remove(7);
        System.out.println("получаем: " + list);

        System.out.println("\nОчищаем MyArrayList:");
        list.clear();
        System.out.println(list);
    }
}
