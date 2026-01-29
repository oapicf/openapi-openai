package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AudioApiServiceImpl extends AudioApiService {
    @Override
    public Response createSpeech(CreateSpeechRequest createSpeechRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createTranscription(FormDataBodyPart _fileBodypart, CreateTranscriptionRequestModel model, String language, String prompt, String responseFormat, BigDecimal temperature, List<String> timestampGranularities, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createTranslation(FormDataBodyPart _fileBodypart, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
