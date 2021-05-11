public class MyStackTester {
    public static void main(String[] args) {
        System.out.println("Создаем стек:");
        MyStack stack = new MyStack();
        stack.push("6-й патрон");
        stack.push("5-й патрон");
        stack.push("4-й патрон");
        stack.push("3-й патрон");
        stack.push("2-й патрон");
        stack.push("1-й патрон");
        stack.iterator();
        System.out.println("Размер очереди:" + stack.size());

        System.out.println("\nВозвращаем первый элемент в стеке (LIFO):");
        System.out.println(stack.peek());


        System.out.println("\nВозвращаем первый элемент и удаляем из стека:");
        stack.pop();
        System.out.println("Очередь после удаления:");
        stack.iterator();
        System.out.println("Размер очереди:" + stack.size());

        System.out.println("\nУдаляем элемент по индексу 1:");
        stack.remove(1);
        System.out.println("Очередь после удаления:");
        stack.iterator();

        System.out.println("Размер очереди:" + stack.size());
        System.out.println("\nОчищаем очередь.");
        stack.clear();
        System.out.println("Пробуем вывести очищенную очередь:");
        stack.iterator();
        System.out.println("Размер очищенной очереди:" + stack.size());
    }
}
