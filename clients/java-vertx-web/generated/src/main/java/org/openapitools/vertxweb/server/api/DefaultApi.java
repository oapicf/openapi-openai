package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdminApiKey;
import org.openapitools.vertxweb.server.model.AdminApiKeysCreateRequest;
import org.openapitools.vertxweb.server.model.AdminApiKeysDelete200Response;
import org.openapitools.vertxweb.server.model.ApiKeyList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<AdminApiKey>> adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest);
    Future<ApiResponse<AdminApiKeysDelete200Response>> adminApiKeysDelete(String keyId);
    Future<ApiResponse<AdminApiKey>> adminApiKeysGet(String keyId);
    Future<ApiResponse<ApiKeyList>> adminApiKeysList(String after, String order, Integer limit);
}
