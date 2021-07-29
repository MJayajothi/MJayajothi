// import java.util.Scanner;
// import java.io.*;


// class Event {x
//     private String eventName;
//     public String getEventName() {
//         return eventName;
//     }
//     public void setEventName(String newName) {
//         this.eventName = newName;
//     }
// }
// class Student {
//     private String stdName;
//     private String eventName;
    
//      public String getStdName() {
//         return stdName;
//     }
//     public void setStdName(String newName) {
//         this.stdName = newName;
//     }
    
//     public String getEventName() {
//         return eventName;
//     }
//     public void setEventName(String newName) {
//         this.eventName = newName;
//     }
// }

// class Main
// {
   
// 	public static void main(String[] args)throws IOException  {
	    
//         BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	    
//         System.out.print("Total Events");
//         int n = Integer.parseInt(reader.readLine());
//         Event event[] = new Event[n];
//         for (int i = 0; i < event.length; i++) {
//             event[i] = new Event();
//             System.out.println("Enter the event name");
//             event[i].setEventName(reader.readLine());
//         }
//         // for (int i = 0; i < event.length; i++) {
//         //     System.out.print(event[i].getEventName());
//         // }
        
//         System.out.print("Total Students");
//         int stds = Integer.parseInt(reader.readLine());
//         Student student[] = new Student[stds];
//         for (int i = 0; i < student.length; i++) {
//             student[i] = new Student();
//             System.out.println("Enter the student name");
//             student[i].setStdName(reader.readLine());
//             System.out.print("Choose ");
//             for (int j = 0; j < event.length; j++) {
//                 System.out.print((j+1)+")"+event[j].getEventName()+" ");
//             }
//             int option = Integer.parseInt(reader.readLine());
//             student[i].setEventName(event[option-1].getEventName());
//         }
        
//         System.out.println("Student Name "+" | "+" Event Name ");
        
//         for (int i = 0; i < student.length; i++) {
//             System.out.println((i+1)+". " +student[i].getStdName()+" | "+student[i].getEventName());
//         }
      
// 	}
// }




import java.io.*;
class Complex { 
    private Integer realNum; 
    private Integer imagNum; 
    public Complex(Integer realNum, Integer imagNum) { 
        this.realNum = realNum; 
        this.imagNum = imagNum;
        } 
        public String sum(Complex sec) 
        { 
            double real = this.realNum + sec.realNum;
            double img = this.imagNum + sec.imagNum; 
            return real + " + " + img + "i"; 
            } 
            
        public String difference(Complex sec) { 
            double real = this.realNum - sec.realNum; 
            double img = this.imagNum - sec.imagNum; 
            return real + " + " + img + "i";  
            
        }
         public String product(Complex sec) { 
            
            double real = this.realNum *sec.realNum - this.imagNum * sec.imagNum; 
            double img = this.realNum * sec.imagNum + this.imagNum * sec.realNum; 
            return real + " + " + img + "i"; 
            
        } 
    
}

public class Main { 
    public static void main(String[] args) throws IOException{ 
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first complex value");
        String[] fValue=reader.readLine().split("\\+|i");
        System.out.println("Enter the second complex value");
        String[] sValue=reader.readLine().split("\\+|i");
        
        Complex firstObj = new Complex(Integer.parseInt(fValue[0]), Integer.parseInt(fValue[1])); 
        Complex secObj = new Complex(Integer.parseInt(sValue[0]), Integer.parseInt(sValue[1])); 
        String sum = firstObj.sum(secObj); 
        String difference = firstObj.difference(secObj); 
        String product = firstObj.product(secObj); 
        
        System.out.println("Sum of two complex numbers: " + sum); 
        System.out.println("Difference of two complex numbers: " + difference);
        System.out.println("Product of two complex numbers: " + product);
    } 
    
}