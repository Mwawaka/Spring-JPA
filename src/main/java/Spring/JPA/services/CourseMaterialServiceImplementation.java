package Spring.JPA.services;

import Spring.JPA.entities.CourseMaterial;
import Spring.JPA.repository.CourseMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseMaterialServiceImplementation implements CourseMaterialService {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;
    @Override
    public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }

    @Override
    public List<CourseMaterial> getCourseMaterial() {
        return courseMaterialRepository.findAll();
    }
}
