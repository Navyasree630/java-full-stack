import java.util.HashMap;
import java.util.Map;
class Hash{
    public static void main(String[] args) {
        
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Mamta",1 );
        map.put("Lalita  ",2);
        map.put("Veena", 3);
        map.put("Indhira", 4);

        System.out.println(map.containsKey("Reshma"));
        map.get("Veena");
        
        //Iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            e.getKey();
            e.getValue();
        }
    }
}