
public class StudentService {
	
	private StudentRepository studentRepository = new StudentRepository();
	
	public void addStudent(Student student) {
		
		if(student.getClass().equals("SI")) {
			studentRepository.creatStudent(student);
		}
		
	}
	//ATUALIZA SOMENTE SE O CURSO NAO FOI ALTERADO
	
	public void removeStudents(Student student) {
		this.studentRepository.deletStudent(student);
	}
	
	public void listAll(Student student) {
		this.studentRepository.readAll(student);
	}
}
