import java.util.List;
import java.util.ArrayList;
public class StudentRepository 
{	
	private List<Student> dbStudents = new ArrayList<Student>();
	private Long sequencialStudents = 0L;
	
	
	public Student creatStudent (Student student) 
	{	student.setId(this.sequencialStudents);
		dbStudents.add(student);
		this.incSequenceStudents();
		return student;
		
	}
	
	public Student updateStudent(Student student) {
		for (int i = 0; i < dbStudents.size(); i++) {			
			Student studentActual = dbStudents.get(i);
			if (studentActual.equals(student)) {
				dbStudents.add(i,student);
				break;
			}
		}
		return student;
	}
	
	
	public void deletStudent(Student student) {
		for (int i = 0; i < dbStudents.size(); i++) {
			Student studentActual = dbStudents.get(i);
			if (studentActual.equals(student)) {
				dbStudents.remove(i);
				break;
			}
		}
	}
	
	
	public List<Student> readAll(Student student){
		return this.dbStudents;
	}
	
	public void incSequenceStudents() {
		this.sequencialStudents++;
	}
	
}
