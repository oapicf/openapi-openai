/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateModerationRequest;
import com.prokarma.pkmst.model.CreateModerationResponse;

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
@Api(value = "Moderations", description = "the Moderations API")
public interface ModerationsApi {

    @ApiOperation(value = "Classifies if text is potentially harmful.", notes = "", response = CreateModerationResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Moderations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateModerationResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/moderations",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CreateModerationResponse> createModeration(@ApiParam(value = "" ,required=true )   @RequestBody CreateModerationRequest createModerationRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
