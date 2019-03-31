import java.util.*;

public class Member{

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

	public getName(){
		return name;
	}
	public setName(String name){
		this.name = name;
	}
	public getBirthday(){
		return birthday;
	}
	public setBirthday(Date birthday){
		this.birthday = birthday;
	}
	public getAddress(){
		return address;
	}
	public setAddress(String address){
		this.address=address;
	}
	public getEmail(){
		return email;
	}
	public setAddress(String email){
		this.email=email;
	}
	public getGender(){
		return gender;
	}
	public setGender(char gender){
		this.gender=gender;
	}
}
