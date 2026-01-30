package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.User;
import org.openapitools.model.UserDeleteResponse;
import org.openapitools.model.UserListResponse;
import org.openapitools.model.UserRoleUpdateRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class UsersApiServiceImpl implements UsersApi {
    /**
     * Deletes a user from the organization.
     *
     */
    public UserDeleteResponse deleteUser(String userId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Lists all of the users in the organization.
     *
     */
    public UserListResponse listUsers(Integer limit, String after) {
        // TODO: Implement...

        return null;
    }

    /**
     * Modifies a user&#39;s role in the organization.
     *
     */
    public User modifyUser(String userId, UserRoleUpdateRequest userRoleUpdateRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves a user by their identifier.
     *
     */
    public User retrieveUser(String userId) {
        // TODO: Implement...

        return null;
    }

}
