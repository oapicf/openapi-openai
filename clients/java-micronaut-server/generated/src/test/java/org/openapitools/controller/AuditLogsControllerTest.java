package org.openapitools.controller;

import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.model.ListAuditLogsResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for AuditLogsController
 */
@MicronautTest
public class AuditLogsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AuditLogsController controller;

    /**
     * This test is used to validate the implementation of listAuditLogs() method
     *
     * The method should: List user actions and configuration changes within this organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listAuditLogsMethodTest() {
        // given
        ListAuditLogsEffectiveAtParameter effectiveAt = new ListAuditLogsEffectiveAtParameter();
        List<String> projectIds = Arrays.asList("example");
        List<AuditLogEventType> eventTypes = Arrays.asList();
        List<String> actorIds = Arrays.asList("example");
        List<String> actorEmails = Arrays.asList("example");
        List<String> resourceIds = Arrays.asList("example");
        Integer limit = 20;
        String after = "example";
        String before = "example";

        // when
        ListAuditLogsResponse result = controller.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/audit_logs' to the features of listAuditLogs() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listAuditLogsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/audit_logs").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3776a2f2");
        request.getParameters()
            .add("effective_at", String.valueOf(new ListAuditLogsEffectiveAtParameter())) // The query parameter format should be 
            .add("project_ids[]", Arrays.asList("example")) // The query format should be multi
            .add("event_types[]", Arrays.asList()) // The query format should be multi
            .add("actor_ids[]", Arrays.asList("example")) // The query format should be multi
            .add("actor_emails[]", Arrays.asList("example")) // The query format should be multi
            .add("resource_ids[]", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListAuditLogsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
