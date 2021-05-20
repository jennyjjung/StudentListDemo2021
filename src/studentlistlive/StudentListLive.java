/*
    Name: Juyoung Jung
    Assignment: [assignment name]
    Program: Telecommunications Technology
    Date: [assignment due date here]

    Description:
    [program description in your own words]
*/



package studentlistlive;

/**
 * This class creates an array of objects
 *
 * @author jenny
 */

public class StudentListLive {

    public static void main(String[] args) {
        
        Student[] studentList = new Student[5];
        
        Student ola = new Student("Ola");
        
        studentList[0] = ola;
        System.out.println(studentList[0].getName());
        
        studentList[1] = new Student("Chi");
        System.out.println(studentList[1].getName());
        
        studentList[2] = new Student("Nadia");
        studentList[3] = new Student("Markus");
        studentList[4] = new Student("Vitalii");
        
        for (Student s: studentList) {
            System.out.println(s.getName());
        }
        
    }

}
