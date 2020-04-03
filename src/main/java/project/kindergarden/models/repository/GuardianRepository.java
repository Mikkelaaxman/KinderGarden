package project.kindergarden.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.kindergarden.models.model.ChildModel;
import project.kindergarden.models.model.GuardianModel;

import java.util.List;

public interface GuardianRepository extends JpaRepository<ChildModel, Integer>
{

    @Query(value = "SELECT * FROM guardian", nativeQuery = true)
    List<ChildModel> findAllGuardians();


    @Query(value = "SELECT guardian.* FROM guardian  INNER JOIN kid ON kid_id = guardian_id WHERE guardian_id = ?1", nativeQuery = true)
    GuardianModel findGuardianByKidId(Integer id);



}

