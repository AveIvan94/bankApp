
public class Main{
    public static void main(String[]args){
        Account user1= new Account("Ewa","Kowalska",5000, 12);
        System.out.println(user1.getBalance());
        user1.withdrawal(15);
        System.out.println(user1.getBalance());
    }
}