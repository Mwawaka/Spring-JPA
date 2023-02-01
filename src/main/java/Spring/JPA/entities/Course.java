package Spring.JPA.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

    @Id
    @SequenceGenerator(name="course_sequence",sequenceName = "course_sequence")
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "course_sequence")
    private Long courseId;

    @Column(name="title")
    private String title;

    @Column(name="credit")
    private Integer credit;

    @OneToOne(mappedBy = "course",
              cascade = CascadeType.ALL,
               fetch = FetchType.EAGER)
    private CourseMaterial courseMaterial;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name="teacher_id",referencedColumnName = "teacherId")
    private Teacher teacher;


    @ManyToMany()
    @JoinTable(name = "student_course_mapping",joinColumns = @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    ),
    inverseJoinColumns = @JoinColumn(
            name = "student_id",
            referencedColumnName = "studentId"
    ))
    private List<Student> students;


}
