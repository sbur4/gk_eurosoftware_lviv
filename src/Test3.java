import java.util.HashMap;
import java.util.Map;

public class Test3 {

    static class Entity {
        public String name;
        public int age;


        public Entity(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            return (name + age).hashCode();
        }
    }

    public static void main(String[] args) {
        Entity ent1 = new Entity("A", 15);
        Entity ent2 = new Entity("B", 25);
        Map<Entity, String> hMap = new HashMap<>();
        hMap.put(ent1, "RSA-512");
        System.out.println(hMap.containsKey(ent1));
        System.out.println(hMap.containsKey(ent2));
        ent1.name = "B";
        System.out.println(hMap.containsKey(ent1));
        System.out.println(hMap.containsKey(ent2));
    }
}

// true false false false