package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdminApiKey;
import com.prokarma.pkmst.model.AdminApiKeysCreateRequest;
import com.prokarma.pkmst.model.AdminApiKeysDelete200Response;
import com.prokarma.pkmst.model.ApiKeyList;

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
public class DefaultApiController implements DefaultApi {
    private final ObjectMapper objectMapper;
@Autowired
    public DefaultApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AdminApiKey> adminApiKeysCreate(@ApiParam(value = "" ,required=true )   @RequestBody AdminApiKeysCreateRequest adminApiKeysCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdminApiKey>(objectMapper.readValue("", AdminApiKey.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdminApiKey>(HttpStatus.OK);
    }

    public ResponseEntity<AdminApiKeysDelete200Response> adminApiKeysDelete(@ApiParam(value = "",required=true ) @PathVariable("key_id") String keyId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdminApiKeysDelete200Response>(objectMapper.readValue("", AdminApiKeysDelete200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdminApiKeysDelete200Response>(HttpStatus.OK);
    }

    public ResponseEntity<AdminApiKey> adminApiKeysGet(@ApiParam(value = "",required=true ) @PathVariable("key_id") String keyId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AdminApiKey>(objectMapper.readValue("", AdminApiKey.class), HttpStatus.OK);
        }

        return new ResponseEntity<AdminApiKey>(HttpStatus.OK);
    }

    public ResponseEntity<ApiKeyList> adminApiKeysList(@ApiParam(value = "")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "", allowableValues = "asc, desc", defaultValue = "asc")  @RequestParam(value = "order", required = false, defaultValue="asc") String order,
        @ApiParam(value = "", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ApiKeyList>(objectMapper.readValue("", ApiKeyList.class), HttpStatus.OK);
        }

        return new ResponseEntity<ApiKeyList>(HttpStatus.OK);
    }

}
