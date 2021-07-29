// import java.io.*;

// class Member {
//   private String name;
//   private int age;
//   private String phone_number;
//   private String address;
//   private int salary;

//    public Member(String name,int age,String phoneNum,String add,int sal)
//     {
//         this.name=name;
//         this.age=age;
//         this.phone_number=phoneNum;
//         this.address=add;
//         this.salary=sal;
//     }
//     public String getName() {
//     return name;
//     }
//     public void setName(String name) {
//     this.name = name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public void setPhone_number(String phone_number) {
//         this.phone_number = phone_number;
//     }
//     public String getPhone_number() {
//         return phone_number;
//     }
//     public void setAddress(String address) {
//         this.address = address;
//     }
//     public String getAddress() {
//         return address;
//     }
//     public int getSalary() {
//         return salary;
//       }
//       public void setSalary(int salary) {
//         this.salary = salary;
//       }
//     void printSalary(){
//         System.out.println("Now "+this.name+" salary has increments "+this.salary);
//     }
// }
// class Employee extends Member {
//     private String specialization;
//     private String department;


//     Employee(String name,int age,String phone_number,String address,int salary,String specialization,String dep)
//     {
//         super(name,age,phone_number,address,salary);
//         this.specialization=specialization;
//         this.department=dep;
//     } 
//     public void setSpecialization(String specialization) {
//         this.specialization = specialization;
//     }
//     public String getSpecialization() {
//         return specialization;
//     }

//     public void setDepartment(String department) {
//         this.department = department;
//     }
//     public String getDepartment() {
//         return department;
//     }
//     void incSalary(int bonus){
//         int salary =super.getSalary()+bonus; 
//         super.setSalary(salary);     
//     }
// }

// class Manager extends Member {
//     private String specialization;
//     private String department;

//     Manager(String name,int age,String phone_number,String address,int salary,String specialization,String dep)
//     {
//        super(name,age,phone_number,address,salary);
//        this.specialization=specialization;
//        this.department=dep;
//     } 
//     public void setSpecialization(String specialization) {
//         this.specialization = specialization;
//     }
//     public String getSpecialization() {
//         return specialization;
//     }
//     public void setDepartment(String department) {
//         this.department = department;
//     }
//     public String getDepartment() {
//         return department;
//     }
//     void incSalary(int bonus){
//         int salary =super.getSalary()+bonus; 
//         super.setSalary(salary);     
//     }
// }

// class Main { 
//     public static void main(String[] args) throws IOException{ 
//         BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter the total employee's");
//         int emp_mem = Integer.parseInt(reader.readLine());
//         Employee[] empObj = new Employee[emp_mem];

//         for (int i = 0; i < empObj.length; i++) {
//             System.out.println("Enter the emp name "+(i+1));
//             String name=reader.readLine();
//             System.out.println("Enter the emp age "+(i+1));
//             int age=Integer.parseInt(reader.readLine());
//             System.out.println("Enter the emp phone number "+(i+1));
//             String ph=reader.readLine();
//             System.out.println("Enter the emp address "+(i+1));
//             String add=reader.readLine();
//             System.out.println("Enter the emp salary "+(i+1));
//             int sal=Integer.parseInt(reader.readLine());
//             System.out.println("Enter the emp specialization "+(i+1));
//             String spel=reader.readLine();
//             System.out.println("Enter the emp department "+(i+1));
//             String dep=reader.readLine();
//             empObj[i] = new Employee(name,age,ph,add,sal,spel,dep);

//         }

//         System.out.println("Enter the total Manager's");
//         int man_mem = Integer.parseInt(reader.readLine());
//         Manager manObj[] = new Manager[man_mem];
//         for (int i = 0; i < manObj.length; i++) {
//             System.out.println("Enter the man name "+(i+1));
//             String name=reader.readLine();
//             System.out.println("Enter the man age "+(i+1));
//             int age=Integer.parseInt(reader.readLine());
//             System.out.println("Enter the man phone number "+(i+1));
//             String ph=reader.readLine();
//             System.out.println("Enter the man address "+(i+1));
//             String add=reader.readLine();
//             System.out.println("Enter the man salary "+(i+1));
//             int sal=Integer.parseInt(reader.readLine());
//             System.out.println("Enter the man specialization "+(i+1));
//             String spel=reader.readLine();
//             System.out.println("Enter the man department "+(i+1));
//             String dep=reader.readLine();
//             manObj[i] = new Manager(name,age,ph,add,sal,spel,dep);
//         } 

//         System.out.println("List\n1. All employee and Manager details \n 2. Increment process\n 3.Exit");
//         System.out.println("select option :"); 
//         int option = Integer.parseInt(reader.readLine());
//         switch (option) {
//             case 1:
//                 System.out.println("Emp Name | Age | Number | Address | salary | specialization | Department" );

//                 for (int i = 0; i < empObj.length; i++) {
//                     System.out.println(empObj[i].getName()+"|"+empObj[i].getAge()+"|"+empObj[i].getPhone_number()+"|"+
//                         empObj[i].getAddress()+"|"+empObj[i].getSalary()+"|"+empObj[i].getSpecialization()+"|"+empObj[i].getDepartment());
//                 }
//                 System.out.println("");
//                 System.out.println("Manager Name | Age | Number | Address | salary | specialization | Department" );
//                 for (int i = 0; i < manObj.length; i++) {
//                     System.out.println(manObj[i].getName()+"|"+manObj[i].getAge()+"|"+manObj[i].getPhone_number()+"|"+
//                         manObj[i].getAddress()+"|"+manObj[i].getSalary()+"|"+manObj[i].getSpecialization()+"|"+manObj[i].getDepartment());
//                 }
//                 break;
//             case 2:
//                 System.out.println("1. Manager \n 2. Employee\n 3.Exit");
//                 System.out.println("select option :"); 
//                 int incOption = Integer.parseInt(reader.readLine());
//                 switch (incOption) {
//                     case 1:
//                         System.out.println("Choose yout department :\n");
//                         String manDep=reader.readLine();
//                         for (int i = 0; i < manObj.length; i++) {
//                             if (manDep.equals(manObj[i].getDepartment())) {
//                                 manObj[i].incSalary(5000);
//                             }
//                         }
//                         for (int i = 0; i < manObj.length; i++) {
//                             if (manDep.equals(manObj[i].getDepartment())) {
//                                 manObj[i].printSalary();
//                             }
//                         }
//                         break;
//                     case 2:
//                         System.out.println("Choose yout department :\n");
//                         String empDep=reader.readLine();
//                         for (int i = 0; i < empObj.length; i++) {
//                             if (empDep.equals(empObj[i].getDepartment())) {
//                                 empObj[i].incSalary(1000);
//                             }
//                         }
//                         for (int i = 0; i < empObj.length; i++) {
//                             if (empDep.equals(empObj[i].getDepartment())) {
//                                 empObj[i].printSalary();
//                             }
//                         }
//                         break;
//                     case 3:
//                         System.out.println("Good Bye..");
//                         break;
//                 }
//                 break;
//             case 3:
//                 System.out.println("Good Bye..");
//                 break;
//         }             
//     } 
// }

import java.io.*;
import java.util.*;
abstract class Song{
    private String singerName;
    private ArrayList<String> songs;
    public void setSingerName(String singerName) {
      this.singerName = singerName;
  }
  public String getSingerName() {
      return singerName;
  }
  public void setSongs(ArrayList<String> songs) {
      this.songs = songs;
  }
  public ArrayList<String> getSongs() {
      return songs;
  }
  abstract public void details(String song);
}

class Gaan  extends Song  
{     
    public void details(String song)   
    {  
        System.out.println("Singer :"+this.getSingerName());
        System.out.println("Song :"+song); 
        System.out.println("Type :"+"Gana");  
    }  
} 
class Devotional  extends Song  
{  
    public void details(String song)   
    {  
        System.out.println("Singer :"+this.getSingerName());
        System.out.println("Song :"+song); 
        System.out.println("Type :"+"Devotional");    
    }  
} 

class Main
{
    public static void main(String[] args) throws IOException{
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
//Get gana singer details from user
        System.out.println("Enter the Gana singer name");
        String ganaSingerName=reader.readLine();
        ArrayList<String> ganaArr=new ArrayList<String>();
        System.out.println("Enter the total songs");
        int ganaCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < ganaCount; i++) {
            System.out.println("Enter the song name "+(i+1));
            ganaArr.add(reader.readLine());           
        }
        Song ganaObj=new Gana();
        ganaObj.setSingerName(ganaSingerName);
        ganaObj.setSongs(ganaArr);         
//Get Devotional singer details from user
        System.out.println("Enter the Devotional singer name");
        String devoSingerName=reader.readLine();
        ArrayList<String> devoArr=new ArrayList<String>();
        System.out.println("Enter the total songs");
        int devoCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < devoCount; i++) {
            System.out.println("Enter the song name "+(i+1));
            devoArr.add(reader.readLine());           
        }
        Song devotionalObj=new Devotional();
        devotionalObj.setSingerName(devoSingerName);
        devotionalObj.setSongs(devoArr); 
//Search operation based on song
        System.out.println("Search operation:");
        System.out.println("search song :");
        String searchString=reader.readLine();
        boolean temp=false;
        System.out.println("\nDetails :");
        for(String s:ganaObj.getSongs()){
            if(s.contains(searchString)){
                ganaObj.details(s);
                temp=true;
            }
        }
        for(String e:devotionalObj.getSongs()){
            if(e.contains(searchString)){
                devotionalObj.details(e);
                temp=true;
            }
    
        }
        if(!temp){
            System.out.println("No song exit....");
        }
    }
}