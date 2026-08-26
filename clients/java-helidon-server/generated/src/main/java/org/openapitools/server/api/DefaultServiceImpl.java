package org.openapitools.server.api;

import org.openapitools.server.model.AdminApiKey;
import org.openapitools.server.model.AdminApiKeysCreateRequest;
import org.openapitools.server.model.AdminApiKeysDelete200Response;
import org.openapitools.server.model.ApiKeyList;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class DefaultServiceImpl implements DefaultService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void adminApiKeysCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adminApiKeysDelete(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adminApiKeysGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adminApiKeysList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service DefaultService is down. Goodbye!");
    }

}
