import java.util.*;

public class Team extends EQuipu{

	private List<Member> members;

	private String name;
	private String interest;

	public Team(){
		members = new ArrayList<Member>();
	}
	public List<Member> getMembers(){
		return members;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getInterest(){
		return interest;
	}
	public void setInterest(String interest){
		this.interest = interest;
	}
	public void addMember(Member member){
		members.add(member);
	}
}