package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Batch;
import com.prokarma.pkmst.model.CreateBatchRequest;
import com.prokarma.pkmst.model.ListBatchesResponse;

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
public class BatchApiController implements BatchApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BatchApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Batch> cancelBatch(@ApiParam(value = "The ID of the batch to cancel.",required=true ) @PathVariable("batch_id") String batchId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Batch>(objectMapper.readValue("", Batch.class), HttpStatus.OK);
        }

        return new ResponseEntity<Batch>(HttpStatus.OK);
    }

    public ResponseEntity<Batch> createBatch(@ApiParam(value = "" ,required=true )   @RequestBody CreateBatchRequest createBatchRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Batch>(objectMapper.readValue("", Batch.class), HttpStatus.OK);
        }

        return new ResponseEntity<Batch>(HttpStatus.OK);
    }

    public ResponseEntity<ListBatchesResponse> listBatches(@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListBatchesResponse>(objectMapper.readValue("", ListBatchesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListBatchesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Batch> retrieveBatch(@ApiParam(value = "The ID of the batch to retrieve.",required=true ) @PathVariable("batch_id") String batchId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Batch>(objectMapper.readValue("", Batch.class), HttpStatus.OK);
        }

        return new ResponseEntity<Batch>(HttpStatus.OK);
    }

}
