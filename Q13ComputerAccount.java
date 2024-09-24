package Q13;
import java.util.Scanner; //needed for type in password

public class Q13ComputerAccount {
	//properties realName, userName, and password
    private String realName;
    private String userName;
    private String password;
    //constructors for realName, userName, and password
    public Q13ComputerAccount(String realName, String userName, String password) {
		super();
		this.realName = realName;
		this.userName = userName;
		this.password = password;
	}
    //getters and setters for realName, userName, and password
    public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//methods 
	public void prints() {
        System.out.println("name: " +realName);
        System.out.println("username: "+ userName);
        System.out.println("old password: "+password);
    }
	//use scanner, hence why we use java.util.Scanner;
    public void changePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your new password:");
        //get users input for new pass
        password = scanner.nextLine(); 
        System.out.println("password updated!!");
    }
}
