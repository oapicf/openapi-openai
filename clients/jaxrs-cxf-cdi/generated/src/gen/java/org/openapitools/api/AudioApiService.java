package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.math.BigDecimal;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranscriptionResponse;
import org.openapitools.model.CreateTranslationResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-16T01:13:26.699737416Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface AudioApiService {
      public Response createTranscription(InputStream _fileInputStream, Attachment _fileDetail, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, String language, SecurityContext securityContext);
      public Response createTranslation(InputStream _fileInputStream, Attachment _fileDetail, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, SecurityContext securityContext);
}
