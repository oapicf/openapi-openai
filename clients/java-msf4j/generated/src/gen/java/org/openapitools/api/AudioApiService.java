package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.AudioResponseFormat;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class AudioApiService {
    public abstract Response createSpeech(CreateSpeechRequest createSpeechRequest
 ) throws NotFoundException;
    public abstract Response createTranscription(InputStream _fileInputStream, FileInfo _fileDetail
 ,CreateTranscriptionRequestModel model
 ,String language
 ,String prompt
 ,AudioResponseFormat responseFormat
 ,BigDecimal temperature
 ,List<String> timestampGranularities
 ) throws NotFoundException;
    public abstract Response createTranslation(InputStream _fileInputStream, FileInfo _fileDetail
 ,CreateTranscriptionRequestModel model
 ,String prompt
 ,AudioResponseFormat responseFormat
 ,BigDecimal temperature
 ) throws NotFoundException;
}
