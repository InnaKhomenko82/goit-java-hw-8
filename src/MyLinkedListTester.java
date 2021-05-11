import java.util.LinkedList;

public class MyLinkedListTester {

    public static void main(String[] args) {
        System.out.println("Создаем коллекцию.");
        MyLinkedList llist = new MyLinkedList();
        llist.add("First");
        llist.add("Second");
        llist.add("Fird");
        llist.add("Forth");
        System.out.println("Полученная коллекция:");
        llist.iterator();
        System.out.println("\nИщем элемент по индексу 1:");
        System.out.println(llist.get(1));
        System.out.println("\nУдаляем элемент по индексу 2:");
        llist.remove(2);
        System.out.println("Коллекция после удаления:");
        llist.iterator();
        System.out.println("Размер коллекции:" + llist.size());
        System.out.println("\nОчищаем коллекцию.");
        llist.clear();
        System.out.println("Пробуем вывести коллекцию:");
        llist.iterator();
        System.out.println("Размер очищенной коллекции:" + llist.size());
    }

}
