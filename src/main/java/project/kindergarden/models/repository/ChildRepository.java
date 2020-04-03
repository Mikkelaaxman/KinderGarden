package project.kindergarden.models.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.kindergarden.models.model.ChildModel;

@Repository
public interface ChildRepository extends JpaRepository<ChildModel, Long>
{

}
