
import java.util.HashMap;


// itenary tickets
class HashingQ {
  static String getStart(HashMap<String,String> tick){
    HashMap<String,String> revMap = new HashMap<>();
    for(String key: tick.keySet()){
      revMap.put(tick.get(key),key);
    }
    for(String key: tick.keySet()){
      if(!revMap.containsKey(key)){
        return key;
      }
    }
    return null;
  }
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("chennai","bengaluru");
    map.put("mumbai","delhi");
    map.put("goa","chennai");
    map.put("delhi","goa");
    String start = getStart(map);
    while(map.containsKey(start)){
      System.out.println(start);
      start = map.get(start);
    }
       
System.out.println(start);
  }
}


