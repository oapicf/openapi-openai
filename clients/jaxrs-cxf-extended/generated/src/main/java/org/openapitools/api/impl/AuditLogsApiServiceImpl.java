package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.model.ListAuditLogsResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class AuditLogsApiServiceImpl implements AuditLogsApi {
    /**
     * List user actions and configuration changes within this organization.
     *
     */
    @Override
    public ListAuditLogsResponse listAuditLogs(ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) {
        // TODO: Implement...
        return null;
    }

}
