package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateVectorStoreFileBatchRequest;
import com.prokarma.pkmst.model.CreateVectorStoreFileRequest;
import com.prokarma.pkmst.model.CreateVectorStoreRequest;
import com.prokarma.pkmst.model.DeleteVectorStoreFileResponse;
import com.prokarma.pkmst.model.DeleteVectorStoreResponse;
import com.prokarma.pkmst.model.ListVectorStoreFilesResponse;
import com.prokarma.pkmst.model.ListVectorStoresResponse;
import com.prokarma.pkmst.model.UpdateVectorStoreRequest;
import com.prokarma.pkmst.model.VectorStoreFileBatchObject;
import com.prokarma.pkmst.model.VectorStoreFileObject;
import com.prokarma.pkmst.model.VectorStoreObject;

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
public class VectorStoresApiController implements VectorStoresApi {
    private final ObjectMapper objectMapper;
@Autowired
    public VectorStoresApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<VectorStoreFileBatchObject> cancelVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store that the file batch belongs to.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "The ID of the file batch to cancel.",required=true ) @PathVariable("batch_id") String batchId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VectorStoreFileBatchObject>(objectMapper.readValue("", VectorStoreFileBatchObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<VectorStoreFileBatchObject>(HttpStatus.OK);
    }

    public ResponseEntity<VectorStoreObject> createVectorStore(@ApiParam(value = "" ,required=true )   @RequestBody CreateVectorStoreRequest createVectorStoreRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VectorStoreObject>(objectMapper.readValue("", VectorStoreObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<VectorStoreObject>(HttpStatus.OK);
    }

    public ResponseEntity<VectorStoreFileObject> createVectorStoreFile(@ApiParam(value = "The ID of the vector store for which to create a File. ",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "" ,required=true )   @RequestBody CreateVectorStoreFileRequest createVectorStoreFileRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VectorStoreFileObject>(objectMapper.readValue("", VectorStoreFileObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<VectorStoreFileObject>(HttpStatus.OK);
    }

    public ResponseEntity<VectorStoreFileBatchObject> createVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store for which to create a File Batch. ",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "" ,required=true )   @RequestBody CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VectorStoreFileBatchObject>(objectMapper.readValue("", VectorStoreFileBatchObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<VectorStoreFileBatchObject>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteVectorStoreResponse> deleteVectorStore(@ApiParam(value = "The ID of the vector store to delete.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteVectorStoreResponse>(objectMapper.readValue("", DeleteVectorStoreResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteVectorStoreResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteVectorStoreFileResponse> deleteVectorStoreFile(@ApiParam(value = "The ID of the vector store that the file belongs to.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "The ID of the file to delete.",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteVectorStoreFileResponse>(objectMapper.readValue("", DeleteVectorStoreFileResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteVectorStoreFileResponse>(HttpStatus.OK);
    }

    public ResponseEntity<VectorStoreObject> getVectorStore(@ApiParam(value = "The ID of the vector store to retrieve.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VectorStoreObject>(objectMapper.readValue("", VectorStoreObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<VectorStoreObject>(HttpStatus.OK);
    }

    public ResponseEntity<VectorStoreFileObject> getVectorStoreFile(@ApiParam(value = "The ID of the vector store that the file belongs to.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "The ID of the file being retrieved.",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VectorStoreFileObject>(objectMapper.readValue("", VectorStoreFileObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<VectorStoreFileObject>(HttpStatus.OK);
    }

    public ResponseEntity<VectorStoreFileBatchObject> getVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store that the file batch belongs to.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "The ID of the file batch being retrieved.",required=true ) @PathVariable("batch_id") String batchId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VectorStoreFileBatchObject>(objectMapper.readValue("", VectorStoreFileBatchObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<VectorStoreFileBatchObject>(HttpStatus.OK);
    }

    public ResponseEntity<ListVectorStoreFilesResponse> listFilesInVectorStoreBatch(@ApiParam(value = "The ID of the vector store that the files belong to.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "The ID of the file batch that the files belong to.",required=true ) @PathVariable("batch_id") String batchId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @ApiParam(value = "Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.", allowableValues = "in_progress, completed, failed, cancelled")  @RequestParam(value = "filter", required = false) String filter,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListVectorStoreFilesResponse>(objectMapper.readValue("", ListVectorStoreFilesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListVectorStoreFilesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListVectorStoreFilesResponse> listVectorStoreFiles(@ApiParam(value = "The ID of the vector store that the files belong to.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @ApiParam(value = "Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.", allowableValues = "in_progress, completed, failed, cancelled")  @RequestParam(value = "filter", required = false) String filter,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListVectorStoreFilesResponse>(objectMapper.readValue("", ListVectorStoreFilesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListVectorStoreFilesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListVectorStoresResponse> listVectorStores(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListVectorStoresResponse>(objectMapper.readValue("", ListVectorStoresResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListVectorStoresResponse>(HttpStatus.OK);
    }

    public ResponseEntity<VectorStoreObject> modifyVectorStore(@ApiParam(value = "The ID of the vector store to modify.",required=true ) @PathVariable("vector_store_id") String vectorStoreId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateVectorStoreRequest updateVectorStoreRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VectorStoreObject>(objectMapper.readValue("", VectorStoreObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<VectorStoreObject>(HttpStatus.OK);
    }

}
