package project.kindergarden.models.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.kindergarden.models.converters.ChildConverter;
import project.kindergarden.models.model.ChildModel;
import project.kindergarden.models.repository.ChildRepository;
import project.kindergarden.models.request.ChildRequest;
import project.kindergarden.models.response.Child;

import javax.transaction.Transactional;

@Service
@Transactional
public class ChildService
{
    @Autowired
    ChildConverter childConverter;

    @Autowired
    ChildRepository childRepository;

    public Child save(final ChildRequest childRequest)
    {
        ChildModel childModel = childConverter.requestToModel(childRequest);

        return childConverter.modelToResponse(childRepository.save(childModel));
    }

}
