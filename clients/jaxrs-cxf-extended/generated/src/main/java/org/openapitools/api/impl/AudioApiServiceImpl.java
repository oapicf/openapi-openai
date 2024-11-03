package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;

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
public class AudioApiServiceImpl implements AudioApi {
    /**
     * Generates audio from the input text.
     *
     */
    @Override
    public File createSpeech(CreateSpeechRequest createSpeechRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Transcribes audio into the input language.
     *
     */
    @Override
    public CreateTranscription200Response createTranscription( Attachment _fileDetail, CreateTranscriptionRequestModel model, String language, String prompt, String responseFormat, BigDecimal temperature, List<String> timestampGranularities) {
        // TODO: Implement...
        return null;
    }

    /**
     * Translates audio into English.
     *
     */
    @Override
    public CreateTranslation200Response createTranslation( Attachment _fileDetail, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature) {
        // TODO: Implement...
        return null;
    }

}
