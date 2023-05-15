import java.util.HashMap;

public class MapsExample {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("age", 22);
        map.put("mbti","ESTP");

        System.out.println(map.get("mbti"));
    }
}
