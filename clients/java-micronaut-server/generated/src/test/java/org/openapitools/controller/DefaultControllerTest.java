package org.openapitools.controller;

import org.openapitools.model.AdminApiKey;
import org.openapitools.model.AdminApiKeysCreateRequest;
import org.openapitools.model.AdminApiKeysDelete200Response;
import org.openapitools.model.ApiKeyList;
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
 * API tests for DefaultController
 */
@MicronautTest
public class DefaultControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    DefaultController controller;

    /**
     * This test is used to validate the implementation of adminApiKeysCreate() method
     *
     * The method should: Create an organization admin API key
     *
     * Create a new admin-level API key for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adminApiKeysCreateMethodTest() {
        // given
        AdminApiKeysCreateRequest adminApiKeysCreateRequest = new AdminApiKeysCreateRequest("New Admin Key");

        // when
        AdminApiKey result = controller.adminApiKeysCreate(adminApiKeysCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/admin_api_keys' to the features of adminApiKeysCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adminApiKeysCreateClientApiTest() throws IOException {
        // given
        AdminApiKeysCreateRequest body = new AdminApiKeysCreateRequest("New Admin Key");
        String uri = UriTemplate.of("/organization/admin_api_keys").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@18fe293d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdminApiKey.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adminApiKeysDelete() method
     *
     * The method should: Delete an organization admin API key
     *
     * Delete the specified admin API key.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adminApiKeysDeleteMethodTest() {
        // given
        String keyId = "example";

        // when
        AdminApiKeysDelete200Response result = controller.adminApiKeysDelete(keyId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/admin_api_keys/{key_id}' to the features of adminApiKeysDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adminApiKeysDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/admin_api_keys/{key_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("key_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@73344756");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdminApiKeysDelete200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adminApiKeysGet() method
     *
     * The method should: Retrieve a single organization API key
     *
     * Get details for a specific organization API key by its ID.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adminApiKeysGetMethodTest() {
        // given
        String keyId = "example";

        // when
        AdminApiKey result = controller.adminApiKeysGet(keyId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/admin_api_keys/{key_id}' to the features of adminApiKeysGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adminApiKeysGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/admin_api_keys/{key_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("key_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@737935a4");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdminApiKey.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adminApiKeysList() method
     *
     * The method should: List organization API keys
     *
     * Retrieve a paginated list of organization admin API keys.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adminApiKeysListMethodTest() {
        // given
        String after = "example";
        String order = "asc";
        Integer limit = 20;

        // when
        ApiKeyList result = controller.adminApiKeysList(after, order, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/admin_api_keys' to the features of adminApiKeysList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adminApiKeysListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/admin_api_keys").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@46a7b47");
        request.getParameters()
            .add("after", "example") // The query parameter format should be 
            .add("order", "asc") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ApiKeyList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
