package project.kindergarden.models.converters;

import org.springframework.stereotype.Component;
import project.kindergarden.models.model.ChildModel;
import project.kindergarden.models.request.ChildRequest;
import project.kindergarden.models.response.Child;

@Component
public class ChildConverter implements ModelConverter<ChildRequest, ChildModel, Child>
{

    @Override
    public ChildModel requestToModel(ChildRequest request)
    {
        ChildModel model = new ChildModel();
        model.setFirstName(request.getFirstName());
        model.setLastName(request.getLastName());
        return model;
    }


    @Override
    public Child modelToResponse(ChildModel model)
    {
        Child response = new Child();
        response.setId(model.getChild_Id());
        response.setFirstName(model.getFirstName());
        response.setLastName(model.getLastName());
        return response;
    }
}
