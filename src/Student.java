public class Student extends MemberPUCP{
	
	private int codePUCP;
	private double craest;

	public Student(){

	}
	public Student(int codePUCP, double craest){
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
}