import java.util.*;

public class Professor extends MemberPUCP{

	private int codePUCP;
	private String status;

	public Professor(){

	}
	public Professor(String name, Date birthday, String address, String email, char gender, int codePUCP, String status){
		super(name, birthday, address, email, gender);
		this.codePUCP=codePUCP;
		this.status=status;
	}

	public int getCodePUCP(){
		return codePUCP;
	}
	public void setCodePUCP(int codePUCP){
		this.codePUCP=codePUCP;
	}
	public String getStatus(){
		return status;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String consultData(){

		return "Profesor:" + Integer.toString(codePUCP) + " - " + getName() + " - " + status;
	}
}