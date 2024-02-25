public class Employee {
    private String Id;
    private String Name;
    private int Salary;

       Employee(String Id, String Name , int Salary){
       this.Id=Id;
       this.Name=Name;
       this.Salary=Salary;
   }


    public String getId(){
       return Id;
    }

    public String getName(){
       return Name;
    }


    public int getSalary(){
       return Salary;
    }

    public double raisedSalary(double per){
           double r=per*this.Salary;
           return r ;
    }
public int annual_salary(int Salary){
   int basic=Salary;
    int daily=30*basic/100;
   int  rise_5=05*basic/100;
   int  annual= basic+rise_5+daily;
   return annual;
}

public void to_String(){
    System.out.print("The annual salary for  "+getName()+"  "+annual_salary(Salary));
    System.out.println("    The 15% of rais is   "+raisedSalary(0.05));

}



}
