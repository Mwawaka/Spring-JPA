package Spring.JPA.repository;

import Spring.JPA.entities.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    //method defined in the Spring data JPA
    List <Student> findByFirstNameContaining(String firstname);

//    custom method using JPQL query

    @Query("select s from Student s where s.guardian.email=?1")
    Student getStudentsByEmailAddress(String emailAddress);

    @Modifying
    @Transactional
    @Query(value = "update tbl_student  set \"first name\"=?1 where \"email address\"=:#{# emailId}",nativeQuery = true)
    int updateFirstNameByEmailAddress(String firstname ,@Param("emailId") String emailId);
}
