package Spring.JPA.services;

import Spring.JPA.entities.CourseMaterial;

import java.util.List;

public interface CourseMaterialService {
    CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial);

    List<CourseMaterial> getCourseMaterial();
}
