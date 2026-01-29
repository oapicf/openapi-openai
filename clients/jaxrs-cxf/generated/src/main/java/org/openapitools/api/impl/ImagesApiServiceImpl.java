package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;

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
public class ImagesApiServiceImpl implements ImagesApi {
    /**
     * Creates an image given a prompt.
     *
     */
    public ImagesResponse createImage(CreateImageRequest createImageRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     */
    public ImagesResponse createImageEdit( Attachment imageDetail, String prompt,  Attachment maskDetail, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates a variation of a given image.
     *
     */
    public ImagesResponse createImageVariation( Attachment imageDetail, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user) {
        // TODO: Implement...

        return null;
    }

}
