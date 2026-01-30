package controllers;

import apimodels.AuditLogEventType;
import apimodels.ListAuditLogsEffectiveAtParameter;
import apimodels.ListAuditLogsResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogsApiControllerImp extends AuditLogsApiControllerImpInterface {
    @Override
    public ListAuditLogsResponse listAuditLogs(Http.Request request, ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) throws Exception {
        //Do your magic!!!
        return new ListAuditLogsResponse();
    }

}
