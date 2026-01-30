package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.User;
import com.prokarma.pkmst.model.UserDeleteResponse;
import com.prokarma.pkmst.model.UserListResponse;
import com.prokarma.pkmst.model.UserRoleUpdateRequest;

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
public class UsersApiController implements UsersApi {
    private final ObjectMapper objectMapper;
@Autowired
    public UsersApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<UserDeleteResponse> deleteUser(@ApiParam(value = "The ID of the user.",required=true ) @PathVariable("user_id") String userId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserDeleteResponse>(objectMapper.readValue("", UserDeleteResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UserDeleteResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UserListResponse> listUsers(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UserListResponse>(objectMapper.readValue("", UserListResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UserListResponse>(HttpStatus.OK);
    }

    public ResponseEntity<User> modifyUser(@ApiParam(value = "The ID of the user.",required=true ) @PathVariable("user_id") String userId,
        @ApiParam(value = "The new user role to modify. This must be one of `owner` or `member`." ,required=true )   @RequestBody UserRoleUpdateRequest userRoleUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<User>(objectMapper.readValue("", User.class), HttpStatus.OK);
        }

        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<User> retrieveUser(@ApiParam(value = "The ID of the user.",required=true ) @PathVariable("user_id") String userId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<User>(objectMapper.readValue("", User.class), HttpStatus.OK);
        }

        return new ResponseEntity<User>(HttpStatus.OK);
    }

}
