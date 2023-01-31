package Spring.JPA.services;

import Spring.JPA.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student saveGuardian(Student student);

    List <Student> findStudentByFirstName(String firstname);

    Student findEmail(String emailId);

    int updateStudentName(String emailId,String firstname);
}
