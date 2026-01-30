package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CompleteUploadRequest;
import com.prokarma.pkmst.model.CreateUploadRequest;
import java.io.File;
import com.prokarma.pkmst.model.Upload;
import com.prokarma.pkmst.model.UploadPart;

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
public class UploadsApiController implements UploadsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public UploadsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<UploadPart> addUploadPart(@ApiParam(value = "The ID of the Upload. ",required=true ) @PathVariable("upload_id") String uploadId,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile data,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UploadPart>(objectMapper.readValue("", UploadPart.class), HttpStatus.OK);
        }

        return new ResponseEntity<UploadPart>(HttpStatus.OK);
    }

    public ResponseEntity<Upload> cancelUpload(@ApiParam(value = "The ID of the Upload. ",required=true ) @PathVariable("upload_id") String uploadId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Upload>(objectMapper.readValue("", Upload.class), HttpStatus.OK);
        }

        return new ResponseEntity<Upload>(HttpStatus.OK);
    }

    public ResponseEntity<Upload> completeUpload(@ApiParam(value = "The ID of the Upload. ",required=true ) @PathVariable("upload_id") String uploadId,
        @ApiParam(value = "" ,required=true )   @RequestBody CompleteUploadRequest completeUploadRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Upload>(objectMapper.readValue("", Upload.class), HttpStatus.OK);
        }

        return new ResponseEntity<Upload>(HttpStatus.OK);
    }

    public ResponseEntity<Upload> createUpload(@ApiParam(value = "" ,required=true )   @RequestBody CreateUploadRequest createUploadRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Upload>(objectMapper.readValue("", Upload.class), HttpStatus.OK);
        }

        return new ResponseEntity<Upload>(HttpStatus.OK);
    }

}
