import java.util.HashMap;
import java.util.Map;
public class hash{
    public static void main(String[] args){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Navya",1);
        map.put("sahithi",2);
        map.put("sree", 3);
        map.put("chandu", 4);
        System.out.println(map.containsKey("laddu"));
        map.get("Navya");
        for(Map.Entry<String,Integer>e:map.entrySet()){
            e.getKey();
            e.getValue();
        }
    }

    }