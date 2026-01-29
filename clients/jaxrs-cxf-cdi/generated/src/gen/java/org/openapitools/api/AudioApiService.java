package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T10:45:22.438122430Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface AudioApiService {
      public Response createSpeech(CreateSpeechRequest createSpeechRequest, SecurityContext securityContext);
      public Response createTranscription(Attachment _fileDetail, CreateTranscriptionRequestModel model, String language, String prompt, String responseFormat, BigDecimal temperature, List<String> timestampGranularities, SecurityContext securityContext);
      public Response createTranslation(Attachment _fileDetail, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, SecurityContext securityContext);
}
