package controllers;

import apimodels.User;
import apimodels.UserDeleteResponse;
import apimodels.UserListResponse;
import apimodels.UserRoleUpdateRequest;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsersApiControllerImp extends UsersApiControllerImpInterface {
    @Override
    public UserDeleteResponse deleteUser(Http.Request request, String userId) throws Exception {
        //Do your magic!!!
        return new UserDeleteResponse();
    }

    @Override
    public UserListResponse listUsers(Http.Request request, Integer limit, String after) throws Exception {
        //Do your magic!!!
        return new UserListResponse();
    }

    @Override
    public User modifyUser(Http.Request request, String userId, UserRoleUpdateRequest userRoleUpdateRequest) throws Exception {
        //Do your magic!!!
        return new User();
    }

    @Override
    public User retrieveUser(Http.Request request, String userId) throws Exception {
        //Do your magic!!!
        return new User();
    }

}
