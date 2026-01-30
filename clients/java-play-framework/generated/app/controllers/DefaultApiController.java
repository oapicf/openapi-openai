package controllers;

import apimodels.AdminApiKey;
import apimodels.AdminApiKeysCreateRequest;
import apimodels.AdminApiKeysDelete200Response;
import apimodels.ApiKeyList;

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
public class DefaultApiController extends Controller {
    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DefaultApiController(Config configuration, DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adminApiKeysCreate(Http.Request request) throws Exception {
        JsonNode nodeadminApiKeysCreateRequest = request.body().asJson();
        AdminApiKeysCreateRequest adminApiKeysCreateRequest;
        if (nodeadminApiKeysCreateRequest != null) {
            adminApiKeysCreateRequest = mapper.readValue(nodeadminApiKeysCreateRequest.toString(), AdminApiKeysCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adminApiKeysCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'AdminApiKeysCreateRequest' parameter is required");
        }
        return imp.adminApiKeysCreateHttp(request, adminApiKeysCreateRequest);
    }

    @ApiAction
    public Result adminApiKeysDelete(Http.Request request, String keyId) throws Exception {
        return imp.adminApiKeysDeleteHttp(request, keyId);
    }

    @ApiAction
    public Result adminApiKeysGet(Http.Request request, String keyId) throws Exception {
        return imp.adminApiKeysGetHttp(request, keyId);
    }

    @ApiAction
    public Result adminApiKeysList(Http.Request request) throws Exception {
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = "asc";
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.adminApiKeysListHttp(request, after, order, limit);
    }

}
