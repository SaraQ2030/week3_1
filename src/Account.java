public class Account {
    private String Name;
    private String Id;
    private int Balance=0;

Account(){}
    Account(String Id,String Name){}
    Account (String Name, String Id, int Balance){
        this.Name=Name;
        this.Id=Id;
        this.Balance=Balance;

    }


    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }

    public void setId(String Id){
    this.Id=Id;
    }
    public String getId(){
    return Id;
    }

    public void setBalance(int Balance){
    this.Balance=Balance;
    }
    public int getBalance(){
    return Balance;
            }


public int credit(int amount){
    if(amount>Balance){
        System.out.printf("The balance is low");
    }else if(amount<=Balance){
      Balance=Balance-amount;
//        System.out.println("The updated balance : "+new_Balance);
    }

    return Balance;
}


public int debit(int amount ){
    int new_Balance=0;
    if(amount>0){
        new_Balance=amount+Balance;
    }
    return new_Balance;
}


    public int trans(Account to, int amount) {
        if(Balance >= amount){
//            from.Balance = from.Balance - amount;
            to.Balance = to.Balance + amount;
            System.out.println("successful transfer");
        } else {
            System.out.println("the Balance is low");
        }
        return amount;
    }

//public int transfer(Account c ,int amount) {
//    Account c
//    if (amount > c.Balance) {
//        System.out.println("The amount is out of balance ");
//    }
//else {
//        Balance += amount;
//    }
//return Balance;
//}
public void to_String(){
    System.out.println("The credit for  "+getName()+" "+credit(2000));
    System.out.println("The debit for  "+getName()+" "+debit(100));
}










}

