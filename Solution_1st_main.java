import java.util.HashMap;

public class Solution_1st_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Solution_1st_Country countryMap=new Solution_1st_Country();
countryMap.savecountrycapital("India", "Delhi");
countryMap.savecountrycapital("Japan", "Tokyo");

System.out.println(countryMap.getcapital("India"));
System.out.println(countryMap.getcountry("Tokyo"));
System.out.println(countryMap.arraylist());

HashMap<String, String> h2 = countryMap.swapkeyvalue();
System.out.println(h2);
	}

}
