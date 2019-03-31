import java.util.*;

public class Member extends Team{

	private static int code=0;
	private String name;
	private Date birthday;
	private String address;
	private String email;
	private char gender;

	public Member(String name, Date birthday, String address,	String email, char gender){
		this.name=name;
		this birthday = birthday;
		this.addess=addres;
		this.email=email;
		this.gender=gender;
		code++;
	}

	public Sring getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Date getBirthday(){
		return birthday;
	}
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getEmail(){
		return email;
	}
	public void setAddress(String email){
		this.email=email;
	}
	public char getGender(){
		return gender;
	}
	public void setGender(char gender){
		this.gender=gender;
	}
}
