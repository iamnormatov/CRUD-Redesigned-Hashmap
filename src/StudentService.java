import java.util.HashMap;
import java.util.Map;
 
public class StudentService {
    private Map<Integer, Student> studentMap;
    private Integer studentIndex;
    public StudentService (){
        this.studentMap = new HashMap<>();
        this.studentIndex = 0;
    }
    public String createStudent(Integer mapId, Student student){
        if (mapId == null){
            return "Error keyword";
        }
        if (student.getAge() < 0){
            return "Wrong age";
        }
        student.setStudentId(++this.studentIndex);
        this.studentMap.put(mapId, student);
        return "Student successful created";
    }
    public String getStudent(Integer mapId){
        if (this.studentMap.containsKey(mapId)){
            return this.studentMap.get(mapId).toStudent();
        }
        return "Student is not found";
    }
    public String updateStudent(Integer mapId, Student student){
        Integer studentOn;
        if (this.studentMap.containsKey(mapId)){
            studentOn = this.studentMap.get(mapId).getStudentId();
            student.setStudentId(studentOn);
            this.studentMap.replace(mapId, this.studentMap.get(mapId), student);
            return "Student successful updated";
        }
        return "Student is not found";
    }
    public String deleteStudent(Integer mapId){
        if (this.studentMap.containsKey(mapId)){
           if (this.studentMap.remove(mapId, this.studentMap.get(mapId))){
               return "Student successful removed";
           }
        }
        return "Student is not found";
    }
}
