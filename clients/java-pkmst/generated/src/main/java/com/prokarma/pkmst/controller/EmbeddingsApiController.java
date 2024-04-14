package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateEmbeddingRequest;
import com.prokarma.pkmst.model.CreateEmbeddingResponse;

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
public class EmbeddingsApiController implements EmbeddingsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public EmbeddingsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CreateEmbeddingResponse> createEmbedding(@ApiParam(value = "" ,required=true )   @RequestBody CreateEmbeddingRequest createEmbeddingRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateEmbeddingResponse>(objectMapper.readValue("", CreateEmbeddingResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateEmbeddingResponse>(HttpStatus.OK);
    }

}
