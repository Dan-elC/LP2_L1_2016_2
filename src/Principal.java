import java.util.*;

public class Principal{
	public static void main(String[] args){
		EQuipu objEquipu = new EQuipu();
		Date date = new Date();

		//Create Teams
		Team team1 = new Team();

		Student student1 = new Student("Juan Perez",date,"asd","asd",'M',20101234,65.34);
		Professor professor1 = new Professor("Andrea Montenegro",date,"asd","asd",'F',20101234,"Contratado");
		External external1 = new External("Viviana Rivasoro",date,"asd","asd",'F','T');
		
		team1.addMember(student1);
		team1.addMember(professor1);
		team1.addMember(external1);

		objEquipu.getTeams().add(team1);

		String report = objEquipu.consultMembersEquipu(0);

		System.out.println(report);
	}
}