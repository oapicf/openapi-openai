package org.openapitools.server.api;

import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.RealtimeSessionCreateRequest;
import org.openapitools.server.model.RealtimeSessionCreateResponse;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class RealtimeServiceImpl implements RealtimeService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void createRealtimeSession(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service RealtimeService is down. Goodbye!");
    }

}
