public class MyStack <T> extends MyQueue {

    public void push(String value){
        add(value);
    }

    //возвращает первый элемент в стеке (LIFO)
    @Override
    public MyNode peek(){
        return getRear();
    }

    //возвращает первый элемент в стеке и удаляет его из коллекции
    public MyNode pop(){
        MyNode pop = getRear();
        remove(size-1);
        return pop;
    }
}
