package org.openapitools.api.interfaces;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface ModelsService {

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * 
     *
     * @param model The model to delete (required)
     * @return DeleteModelResponse
     */
    DeleteModelResponse deleteModel(
        String model
    );

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * 
     *
     * @return ListModelsResponse
     */
    ListModelsResponse listModels(
    );

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * 
     *
     * @param model The ID of the model to use for this request (required)
     * @return Model
     */
    Model retrieveModel(
        String model
    );
}
