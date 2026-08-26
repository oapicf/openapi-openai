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

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'AuditLogs'",
                             version = "7.24.0")
public interface AuditLogsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/", this::listAuditLogs);
    }


    /**
     * GET /organization/audit_logs : List user actions and configuration changes within this organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void listAuditLogs(ServerRequest request, ServerResponse response);
}
