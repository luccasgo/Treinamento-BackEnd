import java.util.List;

public class Team 
{	
	private Long id;
	private List<Student> students;
	private List<Classroom> classroom;
	private Integer period;
	
	
	public Team(List<Student> students, List<Classroom> classroom, Integer period) {
		super();
		this.students = students;
		this.classroom = classroom;
		this.period = period;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Classroom> getClassroom() {
		return classroom;
	}
	public void setClassroom(List<Classroom> classroom) {
		this.classroom = classroom;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	
	@Override
	public String toString() {
		return "Team [students=" + students + ", classroom=" + classroom + ", period=" + period + "]";
	}
	
	public boolean equals(Team team) {
		return !id.equals(team.id);
		}
		
	
}
