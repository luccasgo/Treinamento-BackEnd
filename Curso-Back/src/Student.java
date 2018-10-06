
public class Student 
{	
	
	private Integer register;
	private String name;
	private String curso;
	private Long id;

	
	public Student(Integer register, String name, String curso) {
		super();
		this.register = register;
		this.name = name;
		this.curso = curso;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRegister() {
		return register;
	}
	public void setRegister(Integer register) {
		this.register = register;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Student [register=" + register + ", name=" + name + ", curso=" + curso + "]";
	}
	
	public boolean equals(Student student) {
		return !id.equals(student.id);
		}
}
