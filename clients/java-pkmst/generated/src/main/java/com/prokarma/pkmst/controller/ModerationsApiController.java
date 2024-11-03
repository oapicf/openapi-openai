package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateModerationRequest;
import com.prokarma.pkmst.model.CreateModerationResponse;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-03T11:07:18.723034005Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
public class ModerationsApiController implements ModerationsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ModerationsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CreateModerationResponse> createModeration(@ApiParam(value = "" ,required=true )   @RequestBody CreateModerationRequest createModerationRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateModerationResponse>(objectMapper.readValue("", CreateModerationResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateModerationResponse>(HttpStatus.OK);
    }

}
