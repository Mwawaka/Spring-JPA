package Spring.JPA.controllers;

import Spring.JPA.entities.Course;
import Spring.JPA.entities.CourseMaterial;
import Spring.JPA.entities.Teacher;
import Spring.JPA.services.CourseMaterialService;
import Spring.JPA.services.CourseMaterialServiceImplementation;
import Spring.JPA.services.CourseService;
import Spring.JPA.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

  @Autowired
  private CourseMaterialService courseMaterialService;

  @Autowired
  private CourseService courseService;

  @Autowired
  private TeacherService teacherService;

    @PostMapping("/save-course-material")
    public CourseMaterial saveCourseMaterial(@RequestBody CourseMaterial courseMaterial){

        return courseMaterialService.saveCourseMaterial(courseMaterial);

    }

    @PostMapping("/save-course")
    public Course saveCourse(@RequestBody Course course){

      return courseService.saveCourse(course);

    }

    @PostMapping("/save-teacher")
    public Teacher saveTeacher(@RequestBody Teacher teacher){
      return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/get-course-materials")
    public List<CourseMaterial> getCourseMaterial(){

      return courseMaterialService.getCourseMaterial();

    }
}

