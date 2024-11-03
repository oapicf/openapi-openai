package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class EmbeddingsApiServiceImpl implements EmbeddingsApi {
    /**
     * Creates an embedding vector representing the input text.
     *
     */
    public CreateEmbeddingResponse createEmbedding(CreateEmbeddingRequest createEmbeddingRequest) {
        // TODO: Implement...

        return null;
    }

}
