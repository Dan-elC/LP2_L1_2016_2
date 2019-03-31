public class Professor{

	private int codePUCP;
	private String status;

	public Professor(){

	}
	public Professor(int codePUCP, String status){
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
	public void setStatus(double status){
		this.status=status;
	}
}