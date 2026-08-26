package org.openapitools.server.api;

import org.openapitools.server.model.CreateModerationRequest;
import org.openapitools.server.model.CreateModerationResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class ModerationsServiceImpl implements ModerationsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void createModeration(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service ModerationsService is down. Goodbye!");
    }

}
