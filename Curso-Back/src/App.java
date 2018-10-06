import java.util.List;
import java.util.ArrayList;
public class App 
{
	public static void main(String[] args) 
	{
		Classroom classroom = new Classroom (3223,false,12);	
		List<Student> students = new ArrayList();
		
		for (int i = 0; i < 10; i++) 
		{
			Student student = new Student((i*i + 3),"FULANO" + i, "SISTEMAS DE INFO");
			students.add(student);
		}
		
		
		List<Classroom> listOfClassrooms = new ArrayList <Classroom>();
		Team team = new Team(students,listOfClassrooms, 2);
		listOfClassrooms.add(classroom);
		
		
	}
}
