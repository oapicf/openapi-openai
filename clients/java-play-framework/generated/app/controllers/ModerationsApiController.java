package controllers;

import apimodels.CreateModerationRequest;
import apimodels.CreateModerationResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ModerationsApiController extends Controller {
    private final ModerationsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ModerationsApiController(Config configuration, ModerationsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createModeration(Http.Request request) throws Exception {
        JsonNode nodecreateModerationRequest = request.body().asJson();
        CreateModerationRequest createModerationRequest;
        if (nodecreateModerationRequest != null) {
            createModerationRequest = mapper.readValue(nodecreateModerationRequest.toString(), CreateModerationRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createModerationRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateModerationRequest' parameter is required");
        }
        return imp.createModerationHttp(request, createModerationRequest);
    }

}
