/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateCompletionRequest;
import com.prokarma.pkmst.model.CreateCompletionResponse;

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
@Api(value = "Completions", description = "the Completions API")
public interface CompletionsApi {

    @ApiOperation(value = "Creates a completion for the provided prompt and parameters.", notes = "", response = CreateCompletionResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Completions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateCompletionResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/completions",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CreateCompletionResponse> createCompletion(@ApiParam(value = "" ,required=true )   @RequestBody CreateCompletionRequest createCompletionRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
