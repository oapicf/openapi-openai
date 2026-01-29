package controllers;

import apimodels.CreateEmbeddingRequest;
import apimodels.CreateEmbeddingResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EmbeddingsApiController extends Controller {
    private final EmbeddingsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private EmbeddingsApiController(Config configuration, EmbeddingsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createEmbedding(Http.Request request) throws Exception {
        JsonNode nodecreateEmbeddingRequest = request.body().asJson();
        CreateEmbeddingRequest createEmbeddingRequest;
        if (nodecreateEmbeddingRequest != null) {
            createEmbeddingRequest = mapper.readValue(nodecreateEmbeddingRequest.toString(), CreateEmbeddingRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createEmbeddingRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateEmbeddingRequest' parameter is required");
        }
        return imp.createEmbeddingHttp(request, createEmbeddingRequest);
    }

}
