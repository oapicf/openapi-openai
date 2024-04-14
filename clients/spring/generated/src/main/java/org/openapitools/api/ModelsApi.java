/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Validated
@Tag(name = "OpenAI", description = "The OpenAI REST API")
public interface ModelsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /models/{model} : Delete a fine-tuned model. You must have the Owner role in your organization.
     *
     * @param model The model to delete (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteModel",
        summary = "Delete a fine-tuned model. You must have the Owner role in your organization.",
        tags = { "OpenAI" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DeleteModelResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/models/{model}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<DeleteModelResponse> deleteModel(
        @Parameter(name = "model", description = "The model to delete", required = true, in = ParameterIn.PATH) @PathVariable("model") String model
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"deleted\" : true, \"id\" : \"id\", \"object\" : \"object\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /models : Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "listModels",
        summary = "Lists the currently available models, and provides basic information about each one such as the owner and availability.",
        tags = { "OpenAI" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ListModelsResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/models",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ListModelsResponse> listModels(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"created\" : 0, \"owned_by\" : \"owned_by\", \"id\" : \"id\", \"object\" : \"object\" }, { \"created\" : 0, \"owned_by\" : \"owned_by\", \"id\" : \"id\", \"object\" : \"object\" } ], \"object\" : \"object\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /models/{model} : Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * @param model The ID of the model to use for this request (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "retrieveModel",
        summary = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.",
        tags = { "OpenAI" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Model.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/models/{model}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Model> retrieveModel(
        @Parameter(name = "model", description = "The ID of the model to use for this request", required = true, in = ParameterIn.PATH) @PathVariable("model") String model
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"created\" : 0, \"owned_by\" : \"owned_by\", \"id\" : \"id\", \"object\" : \"object\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}