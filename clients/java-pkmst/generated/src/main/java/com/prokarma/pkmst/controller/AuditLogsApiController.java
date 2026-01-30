package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AuditLogEventType;
import java.util.List;
import com.prokarma.pkmst.model.ListAuditLogsEffectiveAtParameter;
import com.prokarma.pkmst.model.ListAuditLogsResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class AuditLogsApiController implements AuditLogsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AuditLogsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ListAuditLogsResponse> listAuditLogs(@ApiParam(value = "Return only events whose `effective_at` (Unix seconds) is in this range.")  @RequestParam(value = "effective_at", required = false) ListAuditLogsEffectiveAtParameter effectiveAt,
        @ApiParam(value = "Return only events for these projects.")  @RequestParam(value = "project_ids[]", required = false) List<String> projectIds,
        @ApiParam(value = "Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).")  @RequestParam(value = "event_types[]", required = false) List<AuditLogEventType> eventTypes,
        @ApiParam(value = "Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.")  @RequestParam(value = "actor_ids[]", required = false) List<String> actorIds,
        @ApiParam(value = "Return only events performed by users with these emails.")  @RequestParam(value = "actor_emails[]", required = false) List<String> actorEmails,
        @ApiParam(value = "Return only events performed on these targets. For example, a project ID updated.")  @RequestParam(value = "resource_ids[]", required = false) List<String> resourceIds,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListAuditLogsResponse>(objectMapper.readValue("", ListAuditLogsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListAuditLogsResponse>(HttpStatus.OK);
    }

}
