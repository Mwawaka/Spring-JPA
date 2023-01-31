package Spring.JPA.services;

import Spring.JPA.entities.Student;
import Spring.JPA.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll() ;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student saveGuardian(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List <Student> findStudentByFirstName(String firstname) {
        return studentRepository.findByFirstNameContaining(firstname);
    }

    @Override
    public Student findEmail(String emailId) {
        return studentRepository.getStudentsByEmailAddress(emailId);
    }

    @Override

    public int updateStudentName(String firstname, String emailId) {
        return studentRepository.updateFirstNameByEmailAddress(firstname,emailId);
    }
}
