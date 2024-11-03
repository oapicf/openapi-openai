package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DeleteModelResponse;
import org.openapitools.server.api.model.ListModelsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Model;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ModelsApi  {
    //deleteModel
    void deleteModel(String model, Handler<AsyncResult<DeleteModelResponse>> handler);

    //listModels
    void listModels(Handler<AsyncResult<ListModelsResponse>> handler);

    //retrieveModel
    void retrieveModel(String model, Handler<AsyncResult<Model>> handler);

}
