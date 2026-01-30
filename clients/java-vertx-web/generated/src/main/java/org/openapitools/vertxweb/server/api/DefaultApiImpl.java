package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdminApiKey;
import org.openapitools.vertxweb.server.model.AdminApiKeysCreateRequest;
import org.openapitools.vertxweb.server.model.AdminApiKeysDelete200Response;
import org.openapitools.vertxweb.server.model.ApiKeyList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class DefaultApiImpl implements DefaultApi {
    public Future<ApiResponse<AdminApiKey>> adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdminApiKeysDelete200Response>> adminApiKeysDelete(String keyId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdminApiKey>> adminApiKeysGet(String keyId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ApiKeyList>> adminApiKeysList(String after, String order, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

}
