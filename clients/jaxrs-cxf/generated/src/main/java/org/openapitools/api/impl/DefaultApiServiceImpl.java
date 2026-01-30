package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdminApiKey;
import org.openapitools.model.AdminApiKeysCreateRequest;
import org.openapitools.model.AdminApiKeysDelete200Response;
import org.openapitools.model.ApiKeyList;

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
public class DefaultApiServiceImpl implements DefaultApi {
    /**
     * Create an organization admin API key
     *
     * Create a new admin-level API key for the organization.
     *
     */
    public AdminApiKey adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete an organization admin API key
     *
     * Delete the specified admin API key.
     *
     */
    public AdminApiKeysDelete200Response adminApiKeysDelete(String keyId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieve a single organization API key
     *
     * Get details for a specific organization API key by its ID.
     *
     */
    public AdminApiKey adminApiKeysGet(String keyId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List organization API keys
     *
     * Retrieve a paginated list of organization admin API keys.
     *
     */
    public ApiKeyList adminApiKeysList(String after, String order, Integer limit) {
        // TODO: Implement...

        return null;
    }

}
