public class MyQueueTester {
    public static void main(String[] args) {
        System.out.println("Создаем String очередь:");
        MyQueue <String> queue = new MyQueue <>();
        queue.add("Перший");
        queue.add("Другий");
        queue.add("Третій");
        queue.add("Четвертий");
        queue.add("П'ятий");
        System.out.println("Полученная очередь:");
        queue.iterator();
        System.out.println("Размер очереди:" + queue.size());

        System.out.println("\nВозвращаем первый элемент в очереди (FIFO):");
        System.out.println(queue.peek());
        System.out.println("\nВозвращаем первый элемент и удаляем из очереди:");
        queue.poll();
        System.out.println("Очередь после удаления:");
        queue.iterator();
        System.out.println("Размер очереди:" + queue.size());

        System.out.println("\nУдаляем элемент по индексу 3:");
        queue.remove(3);
        System.out.println("Очередь после удаления:");
        queue.iterator();
        System.out.println("Размер очереди:" + queue.size());
        System.out.println("\nОчищаем очередь.");
        queue.clear();
        System.out.println("Пробуем вывести очищенную очередь:");
        queue.iterator();
        System.out.println("Размер очищенной очереди:" + queue.size());
    }
}
