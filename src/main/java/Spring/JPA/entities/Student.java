package Spring.JPA.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="tbl_student",uniqueConstraints = @UniqueConstraint(
        name="Email should be unique",columnNames = {"Email Address", "Guardian Email"}
))
@Data //generates the constructors,getters and setters
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student{

    @Id
    @SequenceGenerator( name="student_sequence",sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="student_sequence")
    private Long studentId;

    @Column(name = "First Name")
    private String firstName;

    @Column(name = "Last Name")
    private String lastName;

    @Column(name="Email Address",nullable = false)
    private  String email;

    @Embedded
    private Guardian guardian;


}
