package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.DeleteFileResponse;
import java.io.File;
import com.prokarma.pkmst.model.ListFilesResponse;
import com.prokarma.pkmst.model.OpenAIFile;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-04-14T13:39:11.640510243Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
public class FilesApiController implements FilesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public FilesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<OpenAIFile> createFile(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,
        @ApiParam(value = "The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. ", required=true, allowableValues="fine-tune, assistants") @RequestPart(value="purpose", required=true)  String purpose,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OpenAIFile>(objectMapper.readValue("", OpenAIFile.class), HttpStatus.OK);
        }

        return new ResponseEntity<OpenAIFile>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteFileResponse> deleteFile(@ApiParam(value = "The ID of the file to use for this request.",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteFileResponse>(objectMapper.readValue("", DeleteFileResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteFileResponse>(HttpStatus.OK);
    }

    public ResponseEntity<String> downloadFile(@ApiParam(value = "The ID of the file to use for this request.",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<ListFilesResponse> listFiles(@ApiParam(value = "Only return files with the given purpose.")  @RequestParam(value = "purpose", required = false) String purpose,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListFilesResponse>(objectMapper.readValue("", ListFilesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListFilesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<OpenAIFile> retrieveFile(@ApiParam(value = "The ID of the file to use for this request.",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OpenAIFile>(objectMapper.readValue("", OpenAIFile.class), HttpStatus.OK);
        }

        return new ResponseEntity<OpenAIFile>(HttpStatus.OK);
    }

}
