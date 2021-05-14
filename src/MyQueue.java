public class MyQueue <T> {

    private MyNode <T> front;
    private MyNode <T> rear;
    public int size;

    public MyNode <T> getRear() {
        return rear;
    }

    public void iterator(){
        MyNode term = front;
        if (term == null) {
            System.out.println("!Пустая очередь!");
            return;
        }
        System.out.print(term);
        for (int i = 0; i< size -1; i++)
        {
            if (term.next!=null) {
                term = term.next;
                System.out.print(term.item + "~");
            }
        }
        System.out.println("");
    }

    //добавляет элемент в конец
    public void add(T value) {
        MyNode <T> rearTemp = rear;
        MyNode <T> newNode = new MyNode(rearTemp, value, null);
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
    public MyNode <T> get(int index) {
        MyNode <T> find = front;
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
        if (prev==null){
            front = next;
        }
        if (next == null){
            next = prev;
            prev.next = null;
            rear = prev;
            size--;
        }  else {
            next.prev = prev;
            front = next;
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
    public MyNode <T> peek(){
        return front;
    }

    //возвращает первый элемент в очереди и удаляет его из коллекции
    public T poll(){
        MyNode <T> poll = front;
        remove(0);
        return (T) poll;
    }

    @Override
    public String toString() {
        //проверка на пустую коллекцию
        return front.item + " " + rear.item;
    }

    class MyNode <T>{
        MyNode prev;
        private T item;
        MyNode next;

        public MyNode(MyNode <T> prev, T item, MyNode <T> next) {
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
