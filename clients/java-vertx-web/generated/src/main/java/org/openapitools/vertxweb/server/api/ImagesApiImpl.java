package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateImageEditRequestModel;
import org.openapitools.vertxweb.server.model.CreateImageRequest;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.ImagesResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ImagesApiImpl implements ImagesApi {
    public Future<ApiResponse<ImagesResponse>> createImage(CreateImageRequest createImageRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ImagesResponse>> createImageEdit(FileUpload image, FileUpload mask) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ImagesResponse>> createImageVariation(FileUpload image) {
        return Future.failedFuture(new HttpException(501));
    }

}
