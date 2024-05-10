public class Student {
    private int id;
    private String name;
    private String fname;
    private String mname;
    private String grade;
    private int attendance;

    public Student(int id, String name,String fname, String mname, String grade,int attendance) {
        this.id = id;
        this.name = name;
        this.fname = fname;
        this.mname = mname;
        this.grade = grade;
        this.attendance = attendance;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getfName() {
    	return fname;
    }
    
    public void setfName(String fname) {
    	this.fname = fname;
    }
    
    public String getmName() {
    	return mname;
    }
    
    public void setmName(String mname) {
    	this.mname = mname;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public int getAttendance() {
    	return attendance;
    }
    public void setAttendance(int attendance) {
    	this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + "\tStudent Name: "+name +"\tFather Name: "+ fname + "\tMother Name: "+mname +
        		"\tGrade: " + grade + "\tAttendance: "+ attendance;
    }
}