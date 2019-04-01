import java.util.*;

public class Student extends MemberPUCP{
	
	private int codePUCP;
	private double craest;

	public Student(){

	}
	public Student(String name, Date birthday, String address, String email, char gender,int codePUCP, double craest){
		super(name, birthday, address, email, gender);
		this.codePUCP =codePUCP;
		this.craest = craest;
	}

	public int getCodePUCP(){
		return codePUCP;
	}
	public void setCodePUCP(int codePUCP){
		this.codePUCP = codePUCP;
	}
	public double getCraest(){
		return craest;
	}
	public void setCraest(double craest){
		this.craest=craest;
	}

	public String consultData(){

		return "Alumno:" + Integer.toString(codePUCP) + " - " + name + " - " + Double.toString(craest);
	}
}