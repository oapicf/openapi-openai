package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateChatCompletionRequest;
import com.prokarma.pkmst.model.CreateChatCompletionResponse;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T10:45:02.588292416Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class ChatApiController implements ChatApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ChatApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CreateChatCompletionResponse> createChatCompletion(@ApiParam(value = "" ,required=true )   @RequestBody CreateChatCompletionRequest createChatCompletionRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateChatCompletionResponse>(objectMapper.readValue("", CreateChatCompletionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateChatCompletionResponse>(HttpStatus.OK);
    }

}
