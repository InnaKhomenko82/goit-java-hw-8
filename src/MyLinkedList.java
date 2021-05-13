public class MyLinkedList <T>{
    private MyNode <T> first;
    private MyNode <T> last;
    public int cursor;

    public boolean hasNext(){
        return first.next!=null;
    }

    public void iterator(){
        MyNode term = first;
        if (term == null) {
            System.out.println("!Пустая коллекция!");
            return;
        }
        System.out.print("~" + term.item + "~");
        for (int i=0; i<cursor-1; i++)
        {
            if (hasNext()) {
                term = term.next;
                System.out.print(term.item + "~");
            }
        }
        System.out.println("");
        }

    //добавляет элемент в конец
    public void add(T value) {
      MyNode <T> lastTemp = last;
      MyNode <T> newNode = new MyNode(lastTemp, value, null);
      last = newNode;
      if (lastTemp == null){
          first = newNode;
      } else {
          lastTemp.next = newNode;
      }
      System.out.print("Добавлен " + cursor + "-й элемент: ");
      System.out.println(newNode);
      cursor++;
    }

    //возвращает элемент под индексом
    public MyNode <T> get(int index) {
        MyNode <T> find = first;
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
            next = last;
        }

        if (prev==null){
            first = next;
            cursor--;
        } else {
            next.prev = prev;
            first = next;
            rem.item = null;
            cursor--;
        }

    }

    //очищает коллекцию
    public void clear() {
        cursor = 0;
        first = last = null;
    }

    //возвращает размер коллекции
    public int size() {
        return cursor;
    }

    @Override
    public String toString() {
        //проверка на пустую коллекцию
        return first.item + " " + last.item;
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

