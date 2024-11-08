/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateImageEditRequestModel;
import com.prokarma.pkmst.model.CreateImageRequest;
import java.io.File;
import com.prokarma.pkmst.model.ImagesResponse;

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
@Api(value = "Images", description = "the Images API")
public interface ImagesApi {

    @ApiOperation(value = "Creates an image given a prompt.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/images/generations",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<ImagesResponse> createImage(@ApiParam(value = "" ,required=true )   @RequestBody CreateImageRequest createImageRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Creates an edited or extended image given an original image and a prompt.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/images/edits",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    ResponseEntity<ImagesResponse> createImageEdit(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile image,@ApiParam(value = "A text description of the desired image(s). The maximum length is 1000 characters.", required=true) @RequestPart(value="prompt", required=true)  String prompt,@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile mask,@ApiParam(value = "", defaultValue="dall-e-2") @RequestPart(value="model", required=false)  CreateImageEditRequestModel model,@ApiParam(value = "The number of images to generate. Must be between 1 and 10.", defaultValue="1") @RequestPart(value="n", required=false)  Integer n,@ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024") @RequestPart(value="size", required=false)  String size,@ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.", allowableValues="url, b64_json", defaultValue="url") @RequestPart(value="response_format", required=false)  String responseFormat,@ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ") @RequestPart(value="user", required=false)  String user, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Creates a variation of a given image.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/images/variations",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    ResponseEntity<ImagesResponse> createImageVariation(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile image,@ApiParam(value = "", defaultValue="dall-e-2") @RequestPart(value="model", required=false)  CreateImageEditRequestModel model,@ApiParam(value = "The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.", defaultValue="1") @RequestPart(value="n", required=false)  Integer n,@ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.", allowableValues="url, b64_json", defaultValue="url") @RequestPart(value="response_format", required=false)  String responseFormat,@ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024") @RequestPart(value="size", required=false)  String size,@ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ") @RequestPart(value="user", required=false)  String user, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
