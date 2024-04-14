package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateImageEditRequestModel;
import org.openapitools.server.api.model.CreateImageRequest;
import java.io.File;
import org.openapitools.server.api.model.ImagesResponse;
import org.openapitools.server.api.MainApiException;

public final class ImagesApiException extends MainApiException {
    public ImagesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ImagesApiException Images_createImage_200_Exception = new ImagesApiException(200, "OK");
    public static final ImagesApiException Images_createImageEdit_200_Exception = new ImagesApiException(200, "OK");
    public static final ImagesApiException Images_createImageVariation_200_Exception = new ImagesApiException(200, "OK");
    

}