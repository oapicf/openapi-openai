package controllers;

import apimodels.AuditLogEventType;
import apimodels.ListAuditLogsEffectiveAtParameter;
import apimodels.ListAuditLogsResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogsApiController extends Controller {
    private final AuditLogsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AuditLogsApiController(Config configuration, AuditLogsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result listAuditLogs(Http.Request request) throws Exception {
        String valueeffectiveAt = request.getQueryString("effective_at");
        ListAuditLogsEffectiveAtParameter effectiveAt;
        if (valueeffectiveAt != null) {
            effectiveAt = valueeffectiveAt;
        } else {
            effectiveAt = null;
        }
        String[] projectIdsArray = request.queryString().get("project_ids[]");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] eventTypesArray = request.queryString().get("event_types[]");
        List<String> eventTypesList = OpenAPIUtils.parametersToList("multi", eventTypesArray);
        List<AuditLogEventType> eventTypes = new ArrayList<>();
        for (String curParam : eventTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                eventTypes.add(curParam);
            }
        }
        String[] actorIdsArray = request.queryString().get("actor_ids[]");
        List<String> actorIdsList = OpenAPIUtils.parametersToList("multi", actorIdsArray);
        List<String> actorIds = new ArrayList<>();
        for (String curParam : actorIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                actorIds.add(curParam);
            }
        }
        String[] actorEmailsArray = request.queryString().get("actor_emails[]");
        List<String> actorEmailsList = OpenAPIUtils.parametersToList("multi", actorEmailsArray);
        List<String> actorEmails = new ArrayList<>();
        for (String curParam : actorEmailsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                actorEmails.add(curParam);
            }
        }
        String[] resourceIdsArray = request.queryString().get("resource_ids[]");
        List<String> resourceIdsList = OpenAPIUtils.parametersToList("multi", resourceIdsArray);
        List<String> resourceIds = new ArrayList<>();
        for (String curParam : resourceIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                resourceIds.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        return imp.listAuditLogsHttp(request, effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before);
    }

}
