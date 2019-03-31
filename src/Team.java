import java.util.*;

public class Team extends EQuipu{

	private List<Member> members;

	private String name;
	private String interest;

	public Team(){
		teams = new ArrayList<Member>();
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
	public addMember(Member member){
		members.add(member);
	}
}