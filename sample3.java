import java.io.*;
import java.util.*;

interface Invoice{  

	void invoice(String cusName,String[] selectedItems);  
}  
interface Market extends Invoice{  
	void order();  
}  
class Interface implements Market{  
	static String[] selectedItems;
	static List<List> products = new ArrayList<List>(List.of(List.of("Rice",100),List.of("Chicken",200),List.of("Mutton",600),List.of("Fish",150)));

	public void invoice(String cusName,String[] items){
		System.out.println("Your invoice!!!!!!!!\n\n");
		System.out.println("Customer Name :"+cusName);
		int totalAmt=0;
		System.out.format("%-20s%-20s\n","Name","Rate");
		for (int i = 0; i < items.length; i++) {
			totalAmt=totalAmt+(int) products.get(Integer.parseInt(items[i])-1).get(1);
            System.out.format("%-20s%-20s\n",products.get(Integer.parseInt(items[i])-1).get(0),products.get(Integer.parseInt(items[i])-1).get(1));
        }
        System.out.println("");
        System.out.println("Total Amount :"+totalAmt);
	}  
	public void order(){
		System.out.println("------------------------------");
		System.out.println("ITEM LIST...");
		Scanner sc=new Scanner(System.in);
		System.out.format("%-20s%-20s%-20s\n","No","Name","Rate");
		int i=1;
		for(List product:products){
			System.out.format("%-20s%-20s%-20s\n",(i),product.get(0),product.get(1));
			i=i+1;
		}
		System.out.println("Choose your items...");
		selectedItems=sc.nextLine().split(" ");
		System.out.println("Thankyou for your order sir!!!!!!!!");
		
	}  
	  
	public static void main(String args[]) throws IOException {  
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		Interface obj = new Interface(); 
		System.out.println("Wellcome to our market.......");
		System.out.println("Enter your name sir....");
		String cusName=reader.readLine();
		System.out.println("Order your items :"); 
		obj.order();
		obj.invoice(cusName,selectedItems);
        	  
 	}  
}