import java.util.*;

public class Example {
    public static void main(String[] args) {
        HashMap<String, Integer> age = new HashMap<String, Integer>();
        age.put("Joe", 29);
        age.put("Elsa", 27);
        age.put("Kevin", 32);
        age.put("Nick", 24);
        age.put("Olaf", 9);
        age.put("Ana", 17);

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(age.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("name = " + entry.getKey() + ", age = " + entry.getValue());
        }
    }
}
