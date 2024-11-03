package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DeleteModelResponse;
import org.openapitools.server.api.model.ListModelsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Model;

public final class ModelsApiException extends MainApiException {
    public ModelsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ModelsApiException Models_deleteModel_200_Exception = new ModelsApiException(200, "OK");
    public static final ModelsApiException Models_listModels_200_Exception = new ModelsApiException(200, "OK");
    public static final ModelsApiException Models_retrieveModel_200_Exception = new ModelsApiException(200, "OK");
    

}