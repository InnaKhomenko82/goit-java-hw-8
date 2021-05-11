public class MyLinkedList{
    private MyNode first;
    private MyNode last;
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
    public void add(String value) {
      MyNode lastTemp = last;
      MyNode newNode = new MyNode(lastTemp, value, null);
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
    public MyNode get(int index) {
        MyNode find = first;
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

        next.prev = prev;
        prev.next = next;
        rem.item = null;
        cursor--;
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

    class MyNode{
        MyLinkedList.MyNode prev;
        private String item;
        MyLinkedList.MyNode next;

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

