import java.util.*;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String ,Integer> hm=new HashMap<String ,Integer>();
		
		hm.put("k", new Integer(200));
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("d", new Integer(100));
		hm.put("e", new Integer(200));
		hm.put("f", new Integer(200));
		
		// Traversing through the map 
        for (HashMap.Entry<String, Integer> me : hm.entrySet()) { 
            System.out.print(me.getKey() + ":"); 
            System.out.println(me.getValue());
        }
		
        
        System.out.println("==================================================================================");
        TreeMap<String ,Integer> t= new TreeMap<String ,Integer>();
        t.putAll(hm);
        
        for(Object o:t.entrySet())
        {
        	System.out.println(o);
        }
        

	}

}
