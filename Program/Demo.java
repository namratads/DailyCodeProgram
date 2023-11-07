import java.util.*;
public class Demo{

public static void main(String[] args){
  
String name = "namratashinde";
char[] ch = name.toCharArray();
Map<Character,Integer> m = new LinkedHashMap();
for(char ch1 : ch)
  {
    if(m.containsKey(ch1))
     {
      m.put(ch1 , m.get(ch1)+1);
     }else
     {
      m.put(ch1 , 1);
     }
   }
 Set<Character> times = m.keySet();
  for(Character ch2 : times )
{
    Integer i =m.get(ch2);
    if(i>1)
      {
        System.out.println("In given Text "+ ch2 + " is "+ i + " times");
       }
 }
}
}
        