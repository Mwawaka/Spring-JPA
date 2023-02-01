package Spring.JPA.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CourseMaterial {

    @Id
    @SequenceGenerator(name = "course_material_sequence",sequenceName = "course_material_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_material_sequence")
    private Long courseMaterialId;

    @Column(name="course_url")
    private String url;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id",referencedColumnName = "courseId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    private Course course;
}
