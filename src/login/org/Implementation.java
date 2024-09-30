package login.org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Implementation {
	
	public static void main (String[] args) throws IOException {
		
		HDFCpojo h = new HDFCpojo(); 
		  h.readDataFromTextFile(); 
		  h.setUsername("Ravi@user1"); 
		  h.setPassword("Ravi@123");
		  h.setBalance(1); 
		   
		  HDFCpojo h1 = new HDFCpojo(); 
		  h1.readDataFromTextFile(); 
		  h1.setUsername("Anand@user2"); 
		  h1.setPassword("Anand@123"); 
		  h1.setBalance(2); 
		   
		  HDFCpojo h2 = new HDFCpojo(); 
		  h2.readDataFromTextFile(); 
		  h2.setUsername("Babu@user3"); 
		  h2.setPassword("Babu@123"); 
		  h2.setBalance(3); 
		   
		  HDFCpojo h4 = new HDFCpojo(); 
		  h4.readDataFromTextFile(); 
		  h4.setUsername("Anand@user2"); 
		  h4.setPassword("Anand@123"); 
		  h4.setBalance(4);
		  
		//List - Generics - Similar Datatype - Wrapper 
		  //class - Pre defined class 
		    //List - Generics - User defined Wrapper Class  - 
		//  User defined List 
		    List<HDFCpojo> li = new ArrayList(); 
		    li.add(h); 
		    li.add(h1); 
		    li.add(h2); 
		    li.add(h4);
		    
		    System.out.println("=======User defined List========="); 
		    		  //Iterate  
		    		  for(int i=0; i<li.size(); i++) { 
		    		   HDFCpojo hdfcPojo = li.get(i); 
		    		   System.out.println(hdfcPojo.getBalance()); 
		    		  } 
		    		   
		    		  //User defind Set 
		    		  Set<HDFCpojo> si = new LinkedHashSet(); 
		    		  si.addAll(li);
		    		  
		    		  System.out.println("=====User defined set============="); 
		    				    //Iterate 
		    				    for(HDFCpojo s1:si) { 
		    				     System.out.println(s1.getBalance()); 
		    				    } 
		    				     
		    				    System.out.println("======User defined map==========="); 
		    				    Map<Integer, HDFCpojo> m = new LinkedHashMap(); 
		    				    m.put(10, h); 
		    				    m.put(20, h1); 
		    				    m.put(30, h2); 
		    				    m.put(40, h4); 
		    				     
		    				    //Iterate 
		    				    Collection<HDFCpojo> values = m.values(); 
		    				    for(HDFCpojo s1:values) {
		
		    				    	System.out.println(s1.getBalance()); 
		    				    } 
		    				     				     
		    				     
		    				   } 
		    				   
		    				  
	}

