package project.kindergarden.models.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.kindergarden.models.converters.ChildConverter;
import project.kindergarden.models.model.ChildModel;
import project.kindergarden.models.model.GuardianModel;
import project.kindergarden.models.repository.ChildRepository;
import project.kindergarden.models.repository.GuardianRepository;
import project.kindergarden.models.request.ChildRequest;
import project.kindergarden.models.response.Child;

import java.util.List;

@Service
@Transactional
public class ModelService
{
    @Autowired
    ChildConverter childConverter;

    @Autowired
    ChildRepository childRepository;

    @Autowired
    GuardianRepository guardianRepository;


    public Child save(final ChildRequest childRequest)
    {
        ChildModel childModel = childConverter.requestToModel(childRequest);
        return childConverter.modelToResponse(childRepository.save(childModel));
    }

    public Child getChild(int id)
    {
        return childConverter.modelToResponse(childRepository.findKidById(id));
    }

    public List<Child> getAll()
    {
        return childConverter.modelToResponse(childRepository.findAllKids());
    }

    public GuardianModel getChildsGuardian(int id)
    {
        return guardianRepository.findGuardianByKidId(id);
    }



}
