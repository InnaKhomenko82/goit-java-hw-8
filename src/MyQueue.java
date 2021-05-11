public class MyQueue {

    private MyNode front;
    private MyNode rear;
    public int size;

    public MyNode getRear() {
        return rear;
    }

    public boolean hasNext(){
        return front.next!=null;
    }

    public void iterator(){
        MyNode term = front;
        if (term == null) {
            System.out.println("!Пустая очередь!");
            return;
        }
        System.out.print("~" + term.item + "~");
        for (int i = 0; i< size -1; i++)
        {
            if (hasNext()) {
                term = term.next;
                System.out.print(term.item + "~");
            }
        }
        System.out.println("");
    }

    //добавляет элемент в конец
    public void add(String value) {
        MyNode rearTemp = rear;
        MyNode newNode = new MyNode(rearTemp, value, null);
        rear = newNode;
        if (rearTemp == null){
            front = newNode;
        } else {
            rearTemp.next = newNode;
        }
        System.out.print("Добавлен " + size + "-й элемент: ");
        System.out.println(newNode);
        size++;
    }

    //возвращает элемент под индексом
    public MyNode get(int index) {
        MyNode find = front;
        for (int i=0; i<index; i++){
            find = find.next;
        }
        return find;
    }

    //удаляет элемент под индексом
    public void remove(int index) {
        MyNode rem = get(index);
        MyNode prev = rem.prev;
        MyNode next = rem.next;

        System.out.println("Удаляется " + rem);

        if (next == null){
            next = rear;
        }

        if (prev==null){
            front = next;
            size--;
        } else {
            next.prev = prev;
            prev.next = next;
            rem.item = null;
            size--;
        }
    }

    //очищает коллекцию
    public void clear() {
        size = 0;
        front = rear = null;
    }

    //возвращает размер коллекции
    public int size() {
        return size;
    }

    //возвращает первый элемент в очереди (FIFO)
    public MyNode peek(){
        return front;
    }

    //возвращает первый элемент в очереди и удаляет его из коллекции
    public MyNode poll(){
        MyNode poll = front;
        remove(0);
        return poll;
    }

    @Override
    public String toString() {
        //проверка на пустую коллекцию
        return front.item + " " + rear.item;
    }

    class MyNode{
        MyNode prev;
        private String item;
        MyNode next;

        public MyNode(MyNode prev, String item, MyNode next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString() {
            return "~" + item + "~";
        }
    }
}
