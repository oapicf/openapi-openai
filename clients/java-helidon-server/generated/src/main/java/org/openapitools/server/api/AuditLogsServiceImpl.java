package org.openapitools.server.api;

import org.openapitools.server.model.AuditLogEventType;
import java.util.stream.Collectors;
import java.util.HexFormat;
import java.util.List;
import org.openapitools.server.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.server.model.ListAuditLogsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class AuditLogsServiceImpl implements AuditLogsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void listAuditLogs(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AuditLogsService is down. Goodbye!");
    }

}
