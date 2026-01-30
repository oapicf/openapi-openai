package org.openapitools.controller;

import org.openapitools.model.User;
import org.openapitools.model.UserDeleteResponse;
import org.openapitools.model.UserListResponse;
import org.openapitools.model.UserRoleUpdateRequest;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for UsersController
 */
@MicronautTest
public class UsersControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    UsersController controller;

    /**
     * This test is used to validate the implementation of deleteUser() method
     *
     * The method should: Deletes a user from the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteUserMethodTest() {
        // given
        String userId = "example";

        // when
        UserDeleteResponse result = controller.deleteUser(userId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/users/{user_id}' to the features of deleteUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteUserClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/users/{user_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("user_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@11f505e8");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UserDeleteResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listUsers() method
     *
     * The method should: Lists all of the users in the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listUsersMethodTest() {
        // given
        Integer limit = 20;
        String after = "example";

        // when
        UserListResponse result = controller.listUsers(limit, after).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/users' to the features of listUsers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listUsersClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/users").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@119636bf");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("after", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UserListResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of modifyUser() method
     *
     * The method should: Modifies a user&#39;s role in the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyUserMethodTest() {
        // given
        String userId = "example";
        UserRoleUpdateRequest userRoleUpdateRequest = new UserRoleUpdateRequest("example");

        // when
        User result = controller.modifyUser(userId, userRoleUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/users/{user_id}' to the features of modifyUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyUserClientApiTest() throws IOException {
        // given
        UserRoleUpdateRequest body = new UserRoleUpdateRequest("example");
        String uri = UriTemplate.of("/organization/users/{user_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("user_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@6d37c176");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, User.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveUser() method
     *
     * The method should: Retrieves a user by their identifier.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveUserMethodTest() {
        // given
        String userId = "example";

        // when
        User result = controller.retrieveUser(userId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/users/{user_id}' to the features of retrieveUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveUserClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/users/{user_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("user_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@64b71b49");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, User.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
