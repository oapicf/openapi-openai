package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DeleteModelResponse;
import org.openapitools.vertxweb.server.model.ListModelsResponse;
import org.openapitools.vertxweb.server.model.Model;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ModelsApiImpl implements ModelsApi {
    public Future<ApiResponse<DeleteModelResponse>> deleteModel(String model) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListModelsResponse>> listModels() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Model>> retrieveModel(String model) {
        return Future.failedFuture(new HttpException(501));
    }

}
