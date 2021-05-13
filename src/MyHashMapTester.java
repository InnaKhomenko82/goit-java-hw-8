public class MyHashMapTester {
    public static void main(String[] args) {
        System.out.println("\nСоздаем HashMap:");
        MyHashMap <String, String> hashMap = new MyHashMap <> ();
        hashMap.put("Первый", "First");
        hashMap.put("Второй", "Second");
        hashMap.put("Третий", "Fird");
        hashMap.put("Четвертый", "Fourth");
        hashMap.put("Пятый", "Fifth");
        System.out.println("Размер коллекции = " + hashMap.size());

        System.out.println("\nВозвращаем элементы MyHashMap по ключам:");
        System.out.println(hashMap.get("Первый"));
        System.out.println(hashMap.get("Третий"));
        System.out.println(hashMap.get("Четвертый"));

        System.out.println("\nУдаляем пары MyHashMap по ключу \"Третий\":");
        hashMap.remove("Третий");

        System.out.println("\nОчищаем MyHashMap:");
        hashMap.clear();
        System.out.println("Размер коллекции = " + hashMap.size());
    }
}
