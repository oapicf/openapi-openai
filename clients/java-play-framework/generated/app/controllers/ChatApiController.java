package controllers;

import apimodels.CreateChatCompletionRequest;
import apimodels.CreateChatCompletionResponse;

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
public class ChatApiController extends Controller {
    private final ChatApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ChatApiController(Config configuration, ChatApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createChatCompletion(Http.Request request) throws Exception {
        JsonNode nodecreateChatCompletionRequest = request.body().asJson();
        CreateChatCompletionRequest createChatCompletionRequest;
        if (nodecreateChatCompletionRequest != null) {
            createChatCompletionRequest = mapper.readValue(nodecreateChatCompletionRequest.toString(), CreateChatCompletionRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createChatCompletionRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateChatCompletionRequest' parameter is required");
        }
        return imp.createChatCompletionHttp(request, createChatCompletionRequest);
    }

}
