package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ErrorResponse;
import com.prokarma.pkmst.model.Project;
import com.prokarma.pkmst.model.ProjectApiKey;
import com.prokarma.pkmst.model.ProjectApiKeyDeleteResponse;
import com.prokarma.pkmst.model.ProjectApiKeyListResponse;
import com.prokarma.pkmst.model.ProjectCreateRequest;
import com.prokarma.pkmst.model.ProjectListResponse;
import com.prokarma.pkmst.model.ProjectRateLimit;
import com.prokarma.pkmst.model.ProjectRateLimitListResponse;
import com.prokarma.pkmst.model.ProjectRateLimitUpdateRequest;
import com.prokarma.pkmst.model.ProjectServiceAccount;
import com.prokarma.pkmst.model.ProjectServiceAccountCreateRequest;
import com.prokarma.pkmst.model.ProjectServiceAccountCreateResponse;
import com.prokarma.pkmst.model.ProjectServiceAccountDeleteResponse;
import com.prokarma.pkmst.model.ProjectServiceAccountListResponse;
import com.prokarma.pkmst.model.ProjectUpdateRequest;
import com.prokarma.pkmst.model.ProjectUser;
import com.prokarma.pkmst.model.ProjectUserCreateRequest;
import com.prokarma.pkmst.model.ProjectUserDeleteResponse;
import com.prokarma.pkmst.model.ProjectUserListResponse;
import com.prokarma.pkmst.model.ProjectUserUpdateRequest;

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
public class ProjectsApiController implements ProjectsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ProjectsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Project> archiveProject(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Project>(objectMapper.readValue("", Project.class), HttpStatus.OK);
        }

        return new ResponseEntity<Project>(HttpStatus.OK);
    }

    public ResponseEntity<Project> createProject(@ApiParam(value = "The project create request payload." ,required=true )   @RequestBody ProjectCreateRequest projectCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Project>(objectMapper.readValue("", Project.class), HttpStatus.OK);
        }

        return new ResponseEntity<Project>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectServiceAccountCreateResponse> createProjectServiceAccount(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The project service account create request payload." ,required=true )   @RequestBody ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectServiceAccountCreateResponse>(objectMapper.readValue("", ProjectServiceAccountCreateResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectServiceAccountCreateResponse>(objectMapper.readValue("", ProjectServiceAccountCreateResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectServiceAccountCreateResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectUser> createProjectUser(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The project user create request payload." ,required=true )   @RequestBody ProjectUserCreateRequest projectUserCreateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUser>(objectMapper.readValue("", ProjectUser.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUser>(objectMapper.readValue("", ProjectUser.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectUser>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectApiKeyDeleteResponse> deleteProjectApiKey(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The ID of the API key.",required=true ) @PathVariable("key_id") String keyId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectApiKeyDeleteResponse>(objectMapper.readValue("", ProjectApiKeyDeleteResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectApiKeyDeleteResponse>(objectMapper.readValue("", ProjectApiKeyDeleteResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectApiKeyDeleteResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectServiceAccountDeleteResponse> deleteProjectServiceAccount(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The ID of the service account.",required=true ) @PathVariable("service_account_id") String serviceAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectServiceAccountDeleteResponse>(objectMapper.readValue("", ProjectServiceAccountDeleteResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectServiceAccountDeleteResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectUserDeleteResponse> deleteProjectUser(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The ID of the user.",required=true ) @PathVariable("user_id") String userId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUserDeleteResponse>(objectMapper.readValue("", ProjectUserDeleteResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUserDeleteResponse>(objectMapper.readValue("", ProjectUserDeleteResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectUserDeleteResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectApiKeyListResponse> listProjectApiKeys(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectApiKeyListResponse>(objectMapper.readValue("", ProjectApiKeyListResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectApiKeyListResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectRateLimitListResponse> listProjectRateLimits(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "A limit on the number of objects to be returned. The default is 100. ", defaultValue = "100")  @RequestParam(value = "limit", required = false, defaultValue="100") Integer limit,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectRateLimitListResponse>(objectMapper.readValue("", ProjectRateLimitListResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectRateLimitListResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectServiceAccountListResponse> listProjectServiceAccounts(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectServiceAccountListResponse>(objectMapper.readValue("", ProjectServiceAccountListResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectServiceAccountListResponse>(objectMapper.readValue("", ProjectServiceAccountListResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectServiceAccountListResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectUserListResponse> listProjectUsers(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUserListResponse>(objectMapper.readValue("", ProjectUserListResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUserListResponse>(objectMapper.readValue("", ProjectUserListResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectUserListResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectListResponse> listProjects(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.", defaultValue = "false")  @RequestParam(value = "include_archived", required = false, defaultValue="false") Boolean includeArchived,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectListResponse>(objectMapper.readValue("", ProjectListResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectListResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Project> modifyProject(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The project update request payload." ,required=true )   @RequestBody ProjectUpdateRequest projectUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Project>(objectMapper.readValue("", Project.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Project>(objectMapper.readValue("", Project.class), HttpStatus.OK);
        }

        return new ResponseEntity<Project>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectUser> modifyProjectUser(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The ID of the user.",required=true ) @PathVariable("user_id") String userId,
        @ApiParam(value = "The project user update request payload." ,required=true )   @RequestBody ProjectUserUpdateRequest projectUserUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUser>(objectMapper.readValue("", ProjectUser.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUser>(objectMapper.readValue("", ProjectUser.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectUser>(HttpStatus.OK);
    }

    public ResponseEntity<Project> retrieveProject(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Project>(objectMapper.readValue("", Project.class), HttpStatus.OK);
        }

        return new ResponseEntity<Project>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectApiKey> retrieveProjectApiKey(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The ID of the API key.",required=true ) @PathVariable("key_id") String keyId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectApiKey>(objectMapper.readValue("", ProjectApiKey.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectApiKey>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectServiceAccount> retrieveProjectServiceAccount(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The ID of the service account.",required=true ) @PathVariable("service_account_id") String serviceAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectServiceAccount>(objectMapper.readValue("", ProjectServiceAccount.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectServiceAccount>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectUser> retrieveProjectUser(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The ID of the user.",required=true ) @PathVariable("user_id") String userId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectUser>(objectMapper.readValue("", ProjectUser.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectUser>(HttpStatus.OK);
    }

    public ResponseEntity<ProjectRateLimit> updateProjectRateLimits(@ApiParam(value = "The ID of the project.",required=true ) @PathVariable("project_id") String projectId,
        @ApiParam(value = "The ID of the rate limit.",required=true ) @PathVariable("rate_limit_id") String rateLimitId,
        @ApiParam(value = "The project rate limit update request payload." ,required=true )   @RequestBody ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectRateLimit>(objectMapper.readValue("", ProjectRateLimit.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProjectRateLimit>(objectMapper.readValue("", ProjectRateLimit.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProjectRateLimit>(HttpStatus.OK);
    }

}
