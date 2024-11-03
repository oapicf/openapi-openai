package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;

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
public class ModerationsApiServiceImpl implements ModerationsApi {
    /**
     * Classifies if text is potentially harmful.
     *
     */
    @Override
    public CreateModerationResponse createModeration(CreateModerationRequest createModerationRequest) {
        // TODO: Implement...
        return null;
    }

}
