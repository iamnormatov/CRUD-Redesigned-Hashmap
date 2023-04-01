public class University {  
    private Integer Id;
    private String name; 
    private String address; 
    private String fakultet;
    private String duration;

    public University(String name, String address, String fakultet, String duration) {
        this.name = name;
        this.address = address; 
        this.fakultet = fakultet;
        this.duration = duration;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String toUniversity() {
        return "University{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", fakultet='" + fakultet + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
