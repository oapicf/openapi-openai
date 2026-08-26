package org.openapitools.server.api;

import org.openapitools.server.model.DeleteModelResponse;
import java.util.HexFormat;
import org.openapitools.server.model.ListModelsResponse;
import org.openapitools.server.model.Model;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class ModelsServiceImpl implements ModelsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void deleteModel(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void listModels(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void retrieveModel(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service ModelsService is down. Goodbye!");
    }

}
