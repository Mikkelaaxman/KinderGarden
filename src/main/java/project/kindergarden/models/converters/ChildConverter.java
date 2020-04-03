package project.kindergarden.models.converters;

import org.springframework.stereotype.Component;
import project.kindergarden.models.model.ChildModel;
import project.kindergarden.models.request.ChildRequest;
import project.kindergarden.models.response.Child;

import java.time.LocalDate;

@Component
public class ChildConverter implements ModelConverter<ChildRequest, ChildModel, Child>
{

    @Override //converts from a web request to a model
    public ChildModel requestToModel(ChildRequest request)
    {
        ChildModel model = new ChildModel();
        model.setFirstName(request.getFirstName());
        model.setLastName(request.getLastName());
        model.setStartDate(request.getKid_startdate());
        model.setBirthDate(request.getKid_birthdate() );

        return model;
    }


    @Override //converts from a model to a web response
    public Child modelToResponse(ChildModel model)
    {
        Child response = new Child();


        response.setId(model.getKid_id());
        response.setFirstName(model.getFirstName());
        response.setLastName(model.getLastName());
        /*
        response.setBirthDate(model.getBirthDate());
        response.setEndDate(model.getEndDate());
        response.setStartDate(model.getStartDate());
        */

        return response;
    }
}
