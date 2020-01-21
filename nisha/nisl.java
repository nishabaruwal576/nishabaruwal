 class bank{
    String name;
    String address;
    Double balance;
    bank(String name,String address, double balance)
    {
        this.name=name;
        this.address=address;
        this.balance=balance;
    }
    void deposit (double amt){
        this.balance=this.balance+amt;
    }
    void withdraw(double amt){
        if(amt>this.balance){
            System.out.println("insufficient balance");
        }
        else{
            this.balance=this.balance+amt;
        }
    }
    void display (){
        System.out.println();
        System.out.println("name:"+this.name);
        System.out.println("address:"+this.address);
        System.out.println("balance:"+this.balance);
        System.out.println("===============");
    }
}
public class nisl{
    public static void main(String[]args){
        bank b =new bank("sunway","maitidevi",100000);
        b.deposit(2000);
        b.display();
        b.withdraw(5000);
        b.display();
        b.withdraw(1000);
        b.display();
    }
}
        
        