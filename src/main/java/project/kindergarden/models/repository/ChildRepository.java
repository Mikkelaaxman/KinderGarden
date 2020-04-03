package project.kindergarden.models.repository;


import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.kindergarden.models.model.ChildModel;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChildRepository extends JpaRepository<ChildModel, Integer>
{

    @Query(value = "SELECT * FROM kid", nativeQuery = true)
    String[] findthis();
}
