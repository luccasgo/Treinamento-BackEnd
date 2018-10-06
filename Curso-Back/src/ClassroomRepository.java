import java.util.List;
import java.util.ArrayList;
public class ClassroomRepository {
	
	List <Classroom> dbClassroom = new ArrayList <Classroom>();
	private Long sequencialClassroom = 0L;
	
	
	public Classroom createClassroom(Classroom classroom) {
		dbClassroom.add(classroom);
		return classroom;
	}
	
	public Classroom updateClassroom(Classroom classroom) {
		for (int i = 0; i < dbClassroom.size(); i++) {
			Classroom classRoom = dbClassroom.get(i);
			if (classRoom.equals(classRoom)) {
				dbClassroom.add(i,classroom);
				break;
			}
		}
		return classroom;
	}
	
	public void deletClassroom(Classroom classroom) {
		for (int i = 0; i < dbClassroom.size(); i++) {
			Classroom classroomActual = dbClassroom.get(i);
			if (classroomActual.equals(classroom)) {
				dbClassroom.remove(i);
				break;
			}
		}
	}
	

	public List<Classroom> readAll(Classroom classroom){
		return this.dbClassroom;
	}
	
	public void incSequenceClassroom() {
		this.sequencialClassroom++;
	}
	
}
