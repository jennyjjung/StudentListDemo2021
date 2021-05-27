
package studentlistlive;

/**
 * This class creates a list of students.
 *
 * @author Juyoung Jung, May 26 2021
 */

public class Student {
    private String name;
    private String studentID;
    
    public Student() {}
    
    public Student(String givenName) {
        name = givenName;
    }

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
    
}
