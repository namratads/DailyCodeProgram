import java.util.*;
public class OccuranceCharOnce{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter any Text");
String name = sc.nextLine();
sc.close();
char[] ch = name.toCharArray();
Map<Character,Integer> m = new LinkedHashMap();
for(char c : ch)
{ 
  if(m.containsKey(c))
     {
        m.put(c , m.get(c)+1);
     }
   else
     {
        m.put(c,1);
      }
}
Set<Character> a = m.keySet();
for(Character c : a)
{
    Integer ab =m.get(c);
    if(ab==1)
      {
        System.out.println("In given Text "+ c + " is "+ab+ " times");
       }
}
}
}




