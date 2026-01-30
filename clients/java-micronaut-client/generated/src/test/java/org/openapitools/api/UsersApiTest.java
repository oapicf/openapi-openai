package org.openapitools.api;

import org.openapitools.model.User;
import org.openapitools.model.UserDeleteResponse;
import org.openapitools.model.UserListResponse;
import org.openapitools.model.UserRoleUpdateRequest;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for UsersApi
 */
@MicronautTest
public class UsersApiTest {

    @Inject
    UsersApi api;

    
    /**
     * Deletes a user from the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteUserTest() {
        // given
        String userId = "example";

        // when
        UserDeleteResponse body = api.deleteUser(userId).block();

        // then
        // TODO implement the deleteUserTest()
    }

    
    /**
     * Lists all of the users in the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void listUsersTest() {
        // given
        Integer limit = 20;
        String after = "example";

        // when
        UserListResponse body = api.listUsers(limit, after).block();

        // then
        // TODO implement the listUsersTest()
    }

    
    /**
     * Modifies a user&#39;s role in the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void modifyUserTest() {
        // given
        String userId = "example";
        UserRoleUpdateRequest userRoleUpdateRequest = new UserRoleUpdateRequest("example");

        // when
        User body = api.modifyUser(userId, userRoleUpdateRequest).block();

        // then
        // TODO implement the modifyUserTest()
    }

    
    /**
     * Retrieves a user by their identifier.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveUserTest() {
        // given
        String userId = "example";

        // when
        User body = api.retrieveUser(userId).block();

        // then
        // TODO implement the retrieveUserTest()
    }

    
}
