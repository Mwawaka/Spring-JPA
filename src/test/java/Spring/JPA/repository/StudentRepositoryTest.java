package Spring.JPA.repository;

import Spring.JPA.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;


   public Student setUp(){

        Student student= Student.builder()
                .firstName("Elon")
                .lastName("Musk")
                .email("musk@gmail.com")
//                .guardianName("Alberto")
//                .guardianPhoneNumber("0874-904-838")
//                .guardianEmail("alberto@hues.com")
                .build();

        return student;
    }

    @Test
    public void saveStudent(){
        Student std=setUp();
        studentRepository.save(std);
    }

    @Test
    public void printStudents(){

       List<Student> studentList=studentRepository.findAll();
        for (Student std:studentList) {
            System.out.println(std);
        }
    }



}