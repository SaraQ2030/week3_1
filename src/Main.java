//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account a=new Account();
        a.setId("3");
        a.setName("Maha");
        a.setBalance(5000);
        //--------------------------------       ACCOUNT      -------------------------------------------
        Account a1=new Account("Ahmed", "1" ,6000);
        Account a2=new Account("Omar", "2" ,1000);


        System.out.println(a1.getId()+"\t"+a1.getName()+"\t"+a1.getBalance()+"\t");
        System.out.println(a2.getId()+"\t"+a2.getName()+"\t"+a2.getBalance()+"\t");
        System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getBalance()+"\t");
//calling methods
        System.out.println("----------------------------------------");
//        System.out.println("The credit for  "+a.getName()+" "+a.credit(2000));
//        System.out.println("The debit for  "+a1.getName()+" "+a1.debit(100));




        a1.to_String();
        a2.to_String();
        a.to_String();


          System.out.println( a1.trans(a2,50));

        //------------------------------------------   EMPLOYEE --------------------------------------------------------
        System.out.println("-------------------------------------------------------------------------------------------");
        Employee e=new Employee("1","Saleh",5000);
        Employee e2=new Employee("2","Khalid",4000);
        Employee e3=new Employee("3","Nuha",4500);



        System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
        System.out.println(e2.getId()+"\t"+e2.getName()+"\t"+e2.getSalary());
        System.out.println(e3.getId()+"\t"+e3.getName()+"\t"+e3.getSalary());

e.to_String();
e2.to_String();
e3.to_String();

    }
}






