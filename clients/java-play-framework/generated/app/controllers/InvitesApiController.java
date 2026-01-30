package controllers;

import apimodels.Invite;
import apimodels.InviteDeleteResponse;
import apimodels.InviteListResponse;
import apimodels.InviteRequest;

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
public class InvitesApiController extends Controller {
    private final InvitesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private InvitesApiController(Config configuration, InvitesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result deleteInvite(Http.Request request, String inviteId) throws Exception {
        return imp.deleteInviteHttp(request, inviteId);
    }

    @ApiAction
    public Result inviteUser(Http.Request request) throws Exception {
        JsonNode nodeinviteRequest = request.body().asJson();
        InviteRequest inviteRequest;
        if (nodeinviteRequest != null) {
            inviteRequest = mapper.readValue(nodeinviteRequest.toString(), InviteRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(inviteRequest);
            }
        } else {
            throw new IllegalArgumentException("'InviteRequest' parameter is required");
        }
        return imp.inviteUserHttp(request, inviteRequest);
    }

    @ApiAction
    public Result listInvites(Http.Request request) throws Exception {
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
        return imp.listInvitesHttp(request, limit, after);
    }

    @ApiAction
    public Result retrieveInvite(Http.Request request, String inviteId) throws Exception {
        return imp.retrieveInviteHttp(request, inviteId);
    }

}
