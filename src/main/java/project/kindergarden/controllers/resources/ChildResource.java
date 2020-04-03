package project.kindergarden.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project.kindergarden.models.request.ChildRequest;
import project.kindergarden.models.response.Child;
import project.kindergarden.models.service.ChildService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Component
public class ChildResource
{
    @Autowired
    ChildService Service;
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Child save(final ChildRequest childRequest) {
        return Service.save(childRequest);
    }
}
