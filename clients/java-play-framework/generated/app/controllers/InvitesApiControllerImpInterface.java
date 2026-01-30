package controllers;

import apimodels.Invite;
import apimodels.InviteDeleteResponse;
import apimodels.InviteListResponse;
import apimodels.InviteRequest;

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
public abstract class InvitesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result deleteInviteHttp(Http.Request request, String inviteId) throws Exception {
        InviteDeleteResponse obj = deleteInvite(request, inviteId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteDeleteResponse deleteInvite(Http.Request request, String inviteId) throws Exception;

    public Result inviteUserHttp(Http.Request request, InviteRequest inviteRequest) throws Exception {
        Invite obj = inviteUser(request, inviteRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Invite inviteUser(Http.Request request, InviteRequest inviteRequest) throws Exception;

    public Result listInvitesHttp(Http.Request request, Integer limit, String after) throws Exception {
        InviteListResponse obj = listInvites(request, limit, after);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteListResponse listInvites(Http.Request request, Integer limit, String after) throws Exception;

    public Result retrieveInviteHttp(Http.Request request, String inviteId) throws Exception {
        Invite obj = retrieveInvite(request, inviteId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Invite retrieveInvite(Http.Request request, String inviteId) throws Exception;

}
