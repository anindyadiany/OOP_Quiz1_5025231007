package Q13;
import java.util.Scanner;

//testing mainly about the change password
public class Q13ComputerAccountTest {
    public static void main(String[] args) {
        Q13ComputerAccount account = new Q13ComputerAccount("Anindya", "seijohhhhh", "11223344");
        account.prints();
        account.changePassword();
        account.prints();
    }
}
