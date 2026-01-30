package controllers;

import apimodels.AdminApiKey;
import apimodels.AdminApiKeysCreateRequest;
import apimodels.AdminApiKeysDelete200Response;
import apimodels.ApiKeyList;

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
public abstract class DefaultApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adminApiKeysCreateHttp(Http.Request request, AdminApiKeysCreateRequest adminApiKeysCreateRequest) throws Exception {
        AdminApiKey obj = adminApiKeysCreate(request, adminApiKeysCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdminApiKey adminApiKeysCreate(Http.Request request, AdminApiKeysCreateRequest adminApiKeysCreateRequest) throws Exception;

    public Result adminApiKeysDeleteHttp(Http.Request request, String keyId) throws Exception {
        AdminApiKeysDelete200Response obj = adminApiKeysDelete(request, keyId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdminApiKeysDelete200Response adminApiKeysDelete(Http.Request request, String keyId) throws Exception;

    public Result adminApiKeysGetHttp(Http.Request request, String keyId) throws Exception {
        AdminApiKey obj = adminApiKeysGet(request, keyId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdminApiKey adminApiKeysGet(Http.Request request, String keyId) throws Exception;

    public Result adminApiKeysListHttp(Http.Request request, String after, String order, Integer limit) throws Exception {
        ApiKeyList obj = adminApiKeysList(request, after, order, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApiKeyList adminApiKeysList(Http.Request request, String after, String order, Integer limit) throws Exception;

}
