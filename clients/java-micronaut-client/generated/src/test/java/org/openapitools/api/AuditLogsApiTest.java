package org.openapitools.api;

import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.model.ListAuditLogsResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for AuditLogsApi
 */
@MicronautTest
public class AuditLogsApiTest {

    @Inject
    AuditLogsApi api;

    
    /**
     * List user actions and configuration changes within this organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void listAuditLogsTest() {
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
        ListAuditLogsResponse body = api.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before).block();

        // then
        // TODO implement the listAuditLogsTest()
    }

    
}
