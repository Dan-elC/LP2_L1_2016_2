public abstract class MemberPUCP extends Member implements Consultable{

	public MemberPUCP(){

	}
	public MemberPUCP(String name, Date birthday, String address, String email, char gender){
		Super(name, birthday, address, email, gender);
	}

	public String consultData(){
		return "";
	}
}