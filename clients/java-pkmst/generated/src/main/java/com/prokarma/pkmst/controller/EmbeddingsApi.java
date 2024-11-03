/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateEmbeddingRequest;
import com.prokarma.pkmst.model.CreateEmbeddingResponse;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-03T11:07:18.723034005Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Api(value = "Embeddings", description = "the Embeddings API")
public interface EmbeddingsApi {

    @ApiOperation(value = "Creates an embedding vector representing the input text.", notes = "", response = CreateEmbeddingResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Embeddings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateEmbeddingResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/embeddings",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CreateEmbeddingResponse> createEmbedding(@ApiParam(value = "" ,required=true )   @RequestBody CreateEmbeddingRequest createEmbeddingRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
