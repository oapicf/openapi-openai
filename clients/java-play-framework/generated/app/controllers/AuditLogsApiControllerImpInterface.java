package controllers;

import apimodels.AuditLogEventType;
import apimodels.ListAuditLogsEffectiveAtParameter;
import apimodels.ListAuditLogsResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class AuditLogsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result listAuditLogsHttp(Http.Request request, ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) throws Exception {
        ListAuditLogsResponse obj = listAuditLogs(request, effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListAuditLogsResponse listAuditLogs(Http.Request request, ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) throws Exception;

}
