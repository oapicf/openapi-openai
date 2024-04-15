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

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
@Tag(name = "Embeddings", description = "The Embeddings API")
public class EmbeddingsController {
    /**
     * Creates an embedding vector representing the input text.
     *
     * @param createEmbeddingRequest  (required)
     * @return CreateEmbeddingResponse
     */
    @Operation(
        operationId = "createEmbedding",
        summary = "Creates an embedding vector representing the input text.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreateEmbeddingResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "createEmbeddingRequest", required = true)
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Post(uri="/embeddings")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<CreateEmbeddingResponse> createEmbedding(
        @Body @NotNull @Valid CreateEmbeddingRequest createEmbeddingRequest
    ) {
        // TODO implement createEmbedding();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}