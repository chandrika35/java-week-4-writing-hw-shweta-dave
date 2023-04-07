package programme_26_encapsulation;

public class Encapsulate {
    //private variables declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;
    //set method for name to access private variable name and setting the value for name
    public void setName(String name){
        this.name = name;
    }
    //get method for name to access private variable name and return the value for name
    public String getName(){
        return name;
    }
    //set method for rollNo to access private variable rollNo and setting the value for rollNo
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;


    }
   //get method for rollNo to access private variable rollNo ang return the value for rollNo
   public int getRollNo(){
        return rollNo;
   }
   //set method for age to access private variable age and setting the value for age
    public void setAge(int age){
        this.age = age;
    }
    //get method for age to access private variable age and return the value for age
    public int getAge(){
        return age;
    }
}
