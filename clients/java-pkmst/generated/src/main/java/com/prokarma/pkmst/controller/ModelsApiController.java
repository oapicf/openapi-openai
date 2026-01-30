package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.DeleteModelResponse;
import com.prokarma.pkmst.model.ListModelsResponse;
import com.prokarma.pkmst.model.Model;

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
public class ModelsApiController implements ModelsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ModelsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<DeleteModelResponse> deleteModel(@ApiParam(value = "The model to delete",required=true ) @PathVariable("model") String model,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteModelResponse>(objectMapper.readValue("", DeleteModelResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteModelResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListModelsResponse> listModels(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListModelsResponse>(objectMapper.readValue("", ListModelsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListModelsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Model> retrieveModel(@ApiParam(value = "The ID of the model to use for this request",required=true ) @PathVariable("model") String model,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Model>(objectMapper.readValue("", Model.class), HttpStatus.OK);
        }

        return new ResponseEntity<Model>(HttpStatus.OK);
    }

}
