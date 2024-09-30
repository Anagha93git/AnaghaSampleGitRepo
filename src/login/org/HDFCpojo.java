package login.org;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class HDFCpojo {
	
	//Data members
	
	private String Username;
	private String Password; 
	static int balance;
	static Map <String,Integer> m;
	
	
	//Getters and setters
	//setters
	public void setUsername(String S) {
		
		if(S.equals("Ravi@user1")) {
			this.Username = "Username of Ravi is validated";
		}
		else if (S.equals("Anand@user2")) {
			this.Username = "Username of Anand is validated";
		}
		else if (S.equals("Babu@user3")) {
			this.Username = "Username of Babu is validated";
		}
		else this .Username = "Username is not validated";
	}
	
	public void setPassword(String S) {
		
		if(S.equals("Ravi@123") && 
				this.Username.contains("Ravi")) {
			this.Password = "Account of Ravi is Valid";
		}
		else if (S.equals("Anand@123") && 
				this.Username.contains("Anand")) {
			this.Password ="Account of Anand is Valid";
		}
		else if (S.equals("Babu@123") && 
				this.Username.contains("Babu"))  {
			this.Password = "Account of Babu is Valid";
		}
		else this.Password = "Not Valid Account";
	}
		

	public void setBalance(int a) {
		
		if(a==1 && this.Password.equals("Account of Ravi is Valid")) { 
			this.balance = m.get("Ravi@user1");
	  } 
	  else if(a==2 && this.Password.equals("Account of Anand is Valid")) { 
	   this.balance = m.get("Anand@user2"); 
	  } 
	  else if(a==3 && this.Password.equals("Account of Babu is Valid")) { 
	   this.balance = m.get("Babu@user3"); 
	  } 
	  else { 
	   this.balance=0; 
	  } 
	 } 
	
	public static void readDataFromTextFile() throws IOException {
		File f = new File("C:\\Users\\sugat\\eclipse-workspace\\APISampleTest\\src\\ExternalFiles\\APITestSample.txt");
		List<String>readLines = FileUtils.readLines(f);
		m= new LinkedHashMap();
		
		for (int i = 0;i<readLines.size();i++) {
			
			String individualLine = readLines.get(i);
			String []individualLineWords = individualLine.split(",");
			String username = individualLineWords[0];
			String balanceString = individualLineWords[2];
			int balance = Integer.parseInt(balanceString);
			m.put(username, balance);
			
		}
	}
	
	//Getters
	public String getUsername() {
		return Username;	
	}
	
	public String getPassword() {
		return Password;
	}
	public int getBalance() {
		return balance;
	}
	}


