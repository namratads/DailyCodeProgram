import java.util.*;
public class OccuranceChar{

public static void main(String[] args){
  
String name = "deepakdude";
char[] ch = name.toCharArray();
Map<Character,Integer> m = new HashMap();
for(char ch1 : ch){
  if(m.containsKey(ch1)){
      m.put(ch1 , m.get(ch1)+1);
     }else{
      m.put(ch1 , 1);
     }
   }
System.out.println(m);
}
}
         