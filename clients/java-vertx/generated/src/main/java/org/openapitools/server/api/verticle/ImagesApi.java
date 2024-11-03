package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateImageEditRequestModel;
import org.openapitools.server.api.model.CreateImageRequest;
import java.io.File;
import org.openapitools.server.api.model.ImagesResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ImagesApi  {
    //createImage
    void createImage(CreateImageRequest createImageRequest, Handler<AsyncResult<ImagesResponse>> handler);

    //createImageEdit
    void createImageEdit(File image, String prompt, File mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user, Handler<AsyncResult<ImagesResponse>> handler);

    //createImageVariation
    void createImageVariation(File image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user, Handler<AsyncResult<ImagesResponse>> handler);

}
