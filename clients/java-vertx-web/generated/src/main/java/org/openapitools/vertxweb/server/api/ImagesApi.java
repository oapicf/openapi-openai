package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateImageEditRequestModel;
import org.openapitools.vertxweb.server.model.CreateImageRequest;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.ImagesResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ImagesApi  {
    Future<ApiResponse<ImagesResponse>> createImage(CreateImageRequest createImageRequest);
    Future<ApiResponse<ImagesResponse>> createImageEdit(FileUpload image, FileUpload mask);
    Future<ApiResponse<ImagesResponse>> createImageVariation(FileUpload image);
}
