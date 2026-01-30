package org.openapitools.api;

import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.model.ListAuditLogsResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("/organization/audit_logs")
@Api(value = "/", description = "")
public interface AuditLogsApi  {

    /**
     * List user actions and configuration changes within this organization.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List user actions and configuration changes within this organization.", tags={ "Audit Logs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Audit logs listed successfully.", response = ListAuditLogsResponse.class) })
    public ListAuditLogsResponse listAuditLogs(@QueryParam("effective_at") ListAuditLogsEffectiveAtParameter effectiveAt, @QueryParam("project_ids[]") List<String> projectIds, @QueryParam("event_types[]") List<AuditLogEventType> eventTypes, @QueryParam("actor_ids[]") List<String> actorIds, @QueryParam("actor_emails[]") List<String> actorEmails, @QueryParam("resource_ids[]") List<String> resourceIds, @QueryParam("limit") @DefaultValue("20") Integer limit, @QueryParam("after") String after, @QueryParam("before") String before);
}
