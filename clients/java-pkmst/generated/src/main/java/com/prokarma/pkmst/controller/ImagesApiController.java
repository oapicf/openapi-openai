package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateImageEditRequestModel;
import com.prokarma.pkmst.model.CreateImageRequest;
import java.io.File;
import com.prokarma.pkmst.model.ImagesResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class ImagesApiController implements ImagesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ImagesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<ImagesResponse> createImage(@ApiParam(value = "" ,required=true )   @RequestBody CreateImageRequest createImageRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ImagesResponse>(objectMapper.readValue("", ImagesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ImagesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ImagesResponse> createImageEdit(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile image,
        @ApiParam(value = "A text description of the desired image(s). The maximum length is 1000 characters.", required=true) @RequestPart(value="prompt", required=true)  String prompt,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile mask,
        @ApiParam(value = "", defaultValue="dall-e-2") @RequestPart(value="model", required=false)  CreateImageEditRequestModel model,
        @ApiParam(value = "The number of images to generate. Must be between 1 and 10.", defaultValue="1") @RequestPart(value="n", required=false)  Integer n,
        @ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024") @RequestPart(value="size", required=false)  String size,
        @ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.", allowableValues="url, b64_json", defaultValue="url") @RequestPart(value="response_format", required=false)  String responseFormat,
        @ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ") @RequestPart(value="user", required=false)  String user,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ImagesResponse>(objectMapper.readValue("", ImagesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ImagesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ImagesResponse> createImageVariation(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile image,
        @ApiParam(value = "", defaultValue="dall-e-2") @RequestPart(value="model", required=false)  CreateImageEditRequestModel model,
        @ApiParam(value = "The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.", defaultValue="1") @RequestPart(value="n", required=false)  Integer n,
        @ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.", allowableValues="url, b64_json", defaultValue="url") @RequestPart(value="response_format", required=false)  String responseFormat,
        @ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024") @RequestPart(value="size", required=false)  String size,
        @ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ") @RequestPart(value="user", required=false)  String user,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ImagesResponse>(objectMapper.readValue("", ImagesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ImagesResponse>(HttpStatus.OK);
    }

}
