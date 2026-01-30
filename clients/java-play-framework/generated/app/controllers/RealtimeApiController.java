package controllers;

import apimodels.RealtimeSessionCreateRequest;
import apimodels.RealtimeSessionCreateResponse;

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
public class RealtimeApiController extends Controller {
    private final RealtimeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RealtimeApiController(Config configuration, RealtimeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createRealtimeSession(Http.Request request) throws Exception {
        JsonNode noderealtimeSessionCreateRequest = request.body().asJson();
        RealtimeSessionCreateRequest realtimeSessionCreateRequest;
        if (noderealtimeSessionCreateRequest != null) {
            realtimeSessionCreateRequest = mapper.readValue(noderealtimeSessionCreateRequest.toString(), RealtimeSessionCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(realtimeSessionCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'RealtimeSessionCreateRequest' parameter is required");
        }
        return imp.createRealtimeSessionHttp(request, realtimeSessionCreateRequest);
    }

}
