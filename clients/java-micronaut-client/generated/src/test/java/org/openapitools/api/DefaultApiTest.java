package org.openapitools.api;

import org.openapitools.model.AdminApiKey;
import org.openapitools.model.AdminApiKeysCreateRequest;
import org.openapitools.model.AdminApiKeysDelete200Response;
import org.openapitools.model.ApiKeyList;
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
 * API tests for DefaultApi
 */
@MicronautTest
public class DefaultApiTest {

    @Inject
    DefaultApi api;

    
    /**
     * Create an organization admin API key
     *
     * Create a new admin-level API key for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void adminApiKeysCreateTest() {
        // given
        AdminApiKeysCreateRequest adminApiKeysCreateRequest = new AdminApiKeysCreateRequest("New Admin Key");

        // when
        AdminApiKey body = api.adminApiKeysCreate(adminApiKeysCreateRequest).block();

        // then
        // TODO implement the adminApiKeysCreateTest()
    }

    
    /**
     * Delete an organization admin API key
     *
     * Delete the specified admin API key.
     */
    @Test
    @Disabled("Not Implemented")
    public void adminApiKeysDeleteTest() {
        // given
        String keyId = "example";

        // when
        AdminApiKeysDelete200Response body = api.adminApiKeysDelete(keyId).block();

        // then
        // TODO implement the adminApiKeysDeleteTest()
    }

    
    /**
     * Retrieve a single organization API key
     *
     * Get details for a specific organization API key by its ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void adminApiKeysGetTest() {
        // given
        String keyId = "example";

        // when
        AdminApiKey body = api.adminApiKeysGet(keyId).block();

        // then
        // TODO implement the adminApiKeysGetTest()
    }

    
    /**
     * List organization API keys
     *
     * Retrieve a paginated list of organization admin API keys.
     */
    @Test
    @Disabled("Not Implemented")
    public void adminApiKeysListTest() {
        // given
        String after = "example";
        String order = "asc";
        Integer limit = 20;

        // when
        ApiKeyList body = api.adminApiKeysList(after, order, limit).block();

        // then
        // TODO implement the adminApiKeysListTest()
    }

    
}
