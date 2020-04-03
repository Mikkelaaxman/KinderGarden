package project.kindergarden.models.converters;

public interface ModelConverter <Q, M, S>
{
        M requestToModel(Q request);
        S modelToResponse(M model);
}

