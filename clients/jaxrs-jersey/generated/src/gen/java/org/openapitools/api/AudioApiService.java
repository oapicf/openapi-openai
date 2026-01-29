package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class AudioApiService {
    public abstract Response createSpeech(CreateSpeechRequest createSpeechRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createTranscription(FormDataBodyPart _fileBodypart,CreateTranscriptionRequestModel model,String language,String prompt,String responseFormat,BigDecimal temperature,List<String> timestampGranularities,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createTranslation(FormDataBodyPart _fileBodypart,CreateTranscriptionRequestModel model,String prompt,String responseFormat,BigDecimal temperature,SecurityContext securityContext) throws NotFoundException;
}
