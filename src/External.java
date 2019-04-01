import java.util.*;

public class External extends Member{

	private char dedication;

	public External(){
	}
	public External(String name, Date birthday, String address, String email, char gender,char dedication){
		super(name, birthday, address, email, gender);
		this.dedication=dedication;
	}	
}