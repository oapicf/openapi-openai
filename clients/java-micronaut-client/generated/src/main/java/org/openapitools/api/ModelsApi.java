/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Client("${openapi-micronaut-client-base-path}")
public interface ModelsApi {
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     *
     * @param model The model to delete (required)
     * @return DeleteModelResponse
     */
    @Delete(uri="/models/{model}")
    @Consumes({"application/json"})
    Mono<DeleteModelResponse> deleteModel(
        @PathVariable(name="model") @NotNull String model
    );

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * @return ListModelsResponse
     */
    @Get(uri="/models")
    @Consumes({"application/json"})
    Mono<ListModelsResponse> listModels();

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * @param model The ID of the model to use for this request (required)
     * @return Model
     */
    @Get(uri="/models/{model}")
    @Consumes({"application/json"})
    Mono<Model> retrieveModel(
        @PathVariable(name="model") @NotNull String model
    );

}
