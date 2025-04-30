import java.util.*;
class Hashmap {
 


  public static void main(String[] args) {
     // creating a hashmap
  HashMap<String, Integer> map = new HashMap<>();
  // inserting values into hashmap
  // if key is existing then value updates and if key is not existing then it creates new value pair
  map.put("India",120);
  map.put("China",130);
  map.put("Usa",100);
  System.out.println(map);
  // searching
  if(map.containsKey("China")){
    System.out.println("key  is present in the map");
  }
  else{
    System.out.println("key is not present in the map");
  }
    System.out.println(map.get("China"));// key exists prints value
    System.out.println(map.get("indonasia"));// key does not exists prints null
   // iteration
   for( Map.Entry<String,Integer> e: map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
   }
   //remove
   map.remove("China");
   System.out.println(map);
  }
}
