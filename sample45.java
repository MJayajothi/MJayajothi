import java.io.*;

abstract class Event {
    String name;
    String detail;
    String organiser;
    Event(){}
    Event(String name, String detail, String organiser)
    {
        this.name=name;
        this.detail=detail;
        this.organiser=organiser;
    }
    public String getName()
    {
        return name;
    }
    public String getDetail()
    {
        return detail;
    }
    public String getOrganiser()
    {
        return organiser;
    }
    public abstract Double calculateAmount() throws Exception;
}
class StageEvent extends Event{
    Integer noOfShows ;
    Double costPerShow=1000.00;
    StageEvent(){}
    StageEvent(String name,String detail,String organiser,Integer noOfShows){
        super(name,detail,organiser);
        this.noOfShows=noOfShows;
    }
    public Integer getNoOfShows()
    {
        return noOfShows;
    }
    public Double getCostPerShow()
    {
       return costPerShow;
    }
    public Double calculateAmount()throws ArithmeticException
    {
    	if(this.noOfShows > 0){
            return this.noOfShows*this.costPerShow;
        }else{
            throw new ArithmeticException("you given a zero for number of shows !!!!!!!");
        }
    }
}
class Exhibition extends Event {
    Integer noOfStalls;
	Double rentPerStall=2000.00;
    Exhibition(){}
    Exhibition(String name,String detail,String organiser,Integer noOfStalls){
        super(name,detail,organiser);
        this.noOfStalls=noOfStalls;
    }
    public Integer getNoOfStalls()
    {
        return noOfStalls;
    }
    public Double getRentPerStall()
    {
        return rentPerStall;
    }
	public Double calculateAmount()throws ArithmeticException
    {
    	if(this.noOfStalls > 0){
            return this.noOfStalls*this.rentPerStall;
        }else{
            throw new ArithmeticException("you given a zero for number of stalls !!!!!!!");
        }
    }
}
class ExceptionOverride {
	public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your choice"+"\n1.Exhibition"+"\n2.StageEvent");
        int n=Integer.parseInt(reader.readLine());
        if(n==1)
        {
        	System.out.println("Enter the details Event Name ,Detail ,Organiser Name,no of stalls");
	        // your input like this =>Book expo,Special sale,thiru,100
	        String[] s=reader.readLine().split(",");
	        System.out.println("Exhibition Details");
	        try {
		      	Exhibition e=new Exhibition(s[0],s[1],s[2],Integer.parseInt(s[3]));
	        	Double d=e.calculateAmount (); 
	        	System.out.println("Event Name:"+e.getName()+"\nDetail:"+e.getDetail()+"\nOrganiser Name:"+e.getOrganiser()+"\nTotal Cost:"+d);
		    } catch (ArithmeticException e) {
		      System.out.println(e.getMessage());
		    }
        }
        else if(n==2)
        {
        	System.out.println("Enter the details Event Name ,Detail ,Organiser Name,no of shows");
	         // your input like this =>Book expo,Special sale,thiru,100
	        String[] s1=reader.readLine().split(",");
	        System.out.println("StageEvent Details");
	        try {
		      	StageEvent s=new StageEvent(s1[0],s1[1],s1[2],Integer.parseInt(s1[3]));
	        	Double d=s.calculateAmount (); 
	        	System.out.println("Event Name:"+s.getName()+"\nDetail:"+s.getDetail()+"\nOrganiser Name:"+s.getOrganiser()+"\nTotal Cost:"+d);
		    } catch (ArithmeticException e) {
		      System.out.println(e.getMessage());
		    }
        }
        else
        {
            System.out.println("Invalid choice");
        }
	}
}