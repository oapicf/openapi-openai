package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DeleteModelResponse;
import org.openapitools.vertxweb.server.model.ListModelsResponse;
import org.openapitools.vertxweb.server.model.Model;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ModelsApi  {
    Future<ApiResponse<DeleteModelResponse>> deleteModel(String model);
    Future<ApiResponse<ListModelsResponse>> listModels();
    Future<ApiResponse<Model>> retrieveModel(String model);
}
