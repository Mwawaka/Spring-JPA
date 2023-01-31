package Spring.JPA.controllers;

import Spring.JPA.entities.Student;
import Spring.JPA.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/get-students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/firstname/{id}")
    public List<Student> findStudentByFirstName(@PathVariable("id")String firstname){

       return studentService.findStudentByFirstName(firstname);
    }

    @GetMapping("/find-email/{id}")
    public String findEmail(@PathVariable("id") String emailId){
        return studentService.findEmail(emailId).getLastName();
    }

    @PostMapping("/save-students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PostMapping("/save-guardian")
    public Student saveGuardian(@RequestBody Student student){

        return studentService.saveGuardian(student);
    }

    @PutMapping("/update/{emailId}")
    public String updateStudentDetails(@RequestBody String firstname,@PathVariable("emailId") String emailId){

     return "Has been successfully updated with int response" + studentService.updateStudentName(firstname,emailId);
    }
}
