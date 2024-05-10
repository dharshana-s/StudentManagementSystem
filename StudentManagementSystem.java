import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem 
{

    private List<Student> students = new ArrayList<>();

    // Create (Add) a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Read (View) all students
    public void viewStudents() {
        students.forEach(System.out::println);
    }

    // Update a student's details
    public void updateStudent(int id, String newName,String newfName,String newmName, String newGrade,int newAttendance)
    {
        for (Student s : students)
        {
            if (s.getId() == id) {
                s.setName(newName);
                s.setfName(newfName);
                s.setmName(newmName);
                s.setGrade(newGrade);
                s.setAttendance(newAttendance);
                break;
            }
        }
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    // Search student by name
    public Student searchStudentByName(String name) 
    {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // Search student by id
    public Student searchStudentById(int id) 
    {
        for (Student s : students) {
            if (s.getId()==id) 
            {
                return s;
            }
        }
        return null;
    }

}