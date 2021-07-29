import java.util.*;
import java.io.*;


class CustomException extends Exception {
   String msg;
   CustomException(String exception) {
      msg = exception;
   }
   public String toString() {
      return (msg);
   }
}
class Main{
	static int accNO[] = {12345678, 87654321, 234567890,987654321};
	static String ifcsCode[] ={"IND12345IO", "IND9090IN", "IND3245IO", "IND000IO"};

	static void transferAmount(int acc,String ifcsName,int amt){
		boolean isAcc=false;
		try {
			for(int i=0;i<accNO.length;i++){
				if((accNO[i] == acc) && ifcsCode[i].equals(ifcsName)){
					isAcc = true;
					break;
				}
			}
			if(isAcc){
				System.out.println("The amount "+amt + " was transfered successfully to ACCNo :"+ acc);
			}else{
				throw new CustomException("Please check the ifcs code and account number !!!!!!!!!!!!!!");
			}
		} catch(CustomException e) {
			System.out.println(e);
		}

	}

	public static void main(String args[]) throws IOException{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Transfer the money to another account..........\n");
		System.out.println("Enter the transfer account number :");
		int acc=Integer.parseInt(reader.readLine());
		
		System.out.println("Enter the transfer ifcs code :");
		String ifcs=reader.readLine();
		System.out.println("Enter the amount :");
		int amt=Integer.parseInt(reader.readLine());
		

		if(!ifcs.isEmpty()){
			transferAmount(acc,ifcs,amt);
		}

		
	}
}