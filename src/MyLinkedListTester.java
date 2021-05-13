import java.util.LinkedList;

public class MyLinkedListTester {

    public static void main(String[] args) {
        System.out.println("Создаем String коллекцию.");
        MyLinkedList <String> llist = new MyLinkedList <>();
        llist.add("First");
        llist.add("Second");
        llist.add("Fird");
        llist.add("Forth");
        System.out.println("Полученная коллекция:");
        llist.iterator();
        System.out.println("\nИщем элемент по индексу 1:");
        System.out.println(llist.get(1));
        System.out.println("\nУдаляем элемент по индексу 0:");
        llist.remove(0);
        System.out.println("Коллекция после удаления:");
        llist.iterator();
        System.out.println("Размер коллекции:" + llist.size());
        System.out.println("\nОчищаем коллекцию.");
        llist.clear();
        System.out.println("Пробуем вывести коллекцию:");
        llist.iterator();
        System.out.println("Размер очищенной коллекции:" + llist.size());

        System.out.println("\nСоздаем Integer коллекцию.");
        MyLinkedList <Integer> llist1 = new MyLinkedList <>();
        llist1.add(1);
        llist1.add(2);
        llist1.add(3);
        llist1.add(4);
        System.out.println("Полученная коллекция:");
        llist1.iterator();
        System.out.println("\nИщем элемент по индексу 1:");
        System.out.println(llist1.get(1));
        System.out.println("\nУдаляем элемент по индексу 0:");
        llist1.remove(0);
        System.out.println("Коллекция после удаления:");
        llist1.iterator();
        System.out.println("Размер коллекции:" + llist1.size());
        System.out.println("\nОчищаем коллекцию.");
        llist1.clear();
        System.out.println("Пробуем вывести коллекцию:");
        llist1.iterator();
        System.out.println("Размер очищенной коллекции:" + llist1.size());
    }

}
