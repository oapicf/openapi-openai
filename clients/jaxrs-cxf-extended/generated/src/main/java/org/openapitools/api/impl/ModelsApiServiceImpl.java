package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;

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
public class ModelsApiServiceImpl implements ModelsApi {
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     *
     */
    @Override
    public DeleteModelResponse deleteModel(String model) {
        // TODO: Implement...
        return null;
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     */
    @Override
    public ListModelsResponse listModels() {
        // TODO: Implement...
        return null;
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     */
    @Override
    public Model retrieveModel(String model) {
        // TODO: Implement...
        return null;
    }

}
