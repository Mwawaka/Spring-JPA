package Spring.JPA.services;

import Spring.JPA.entities.Course;
import Spring.JPA.entities.CourseMaterial;
import Spring.JPA.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImplementation implements CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
