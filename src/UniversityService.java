import java.util.HashMap;  
import java.util.Map;  

public class UniversityService {
    private Map<Integer, University> universityMap;
    private Integer univerIndex; 
    public UniversityService(){
        this.universityMap = new HashMap<>();
        this.univerIndex = 0;
    }

    public String createUniversity(Integer univerId, University university){
        if (univerId == null){
            return "Wrong University Id";
        }
        university.setId(++this.univerIndex);
        this.universityMap.put(univerId, university);
        return "University successful created";
    }

    public String getUniversity(Integer univerId){
        if (this.universityMap.containsKey(univerId)){
            return this.universityMap.get(univerId).toUniversity();
        }
        return "University is not found";
    }

    public String updateUniversity(Integer univerId, University university){
        Integer univerOn;
        if (this.universityMap.containsKey(univerId)){
            univerOn = this.universityMap.get(univerId).getId();
            university.setId(univerOn);
            this.universityMap.replace(univerId, this.universityMap.get(univerId), university);
            return "University successful updated";
        }
        return "University is not found";
    }

    public String deletedUniver(Integer univerId){
        if (this.universityMap.containsKey(univerId)){
            if (this.universityMap.remove(univerId, this.universityMap.get(univerId))){
                return "University successful deleted";
            }
        }
        return "University is not found";
    }
}
