package controllers;

import apimodels.CreateCompletionRequest;
import apimodels.CreateCompletionResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CompletionsApiController extends Controller {
    private final CompletionsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CompletionsApiController(Config configuration, CompletionsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createCompletion(Http.Request request) throws Exception {
        JsonNode nodecreateCompletionRequest = request.body().asJson();
        CreateCompletionRequest createCompletionRequest;
        if (nodecreateCompletionRequest != null) {
            createCompletionRequest = mapper.readValue(nodecreateCompletionRequest.toString(), CreateCompletionRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createCompletionRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateCompletionRequest' parameter is required");
        }
        return imp.createCompletionHttp(request, createCompletionRequest);
    }

}
