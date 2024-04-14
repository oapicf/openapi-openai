package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-04-14T13:38:52.193957698Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class AudioApiService {
    public abstract Response createSpeech(CreateSpeechRequest createSpeechRequest
 ) throws NotFoundException;
    public abstract Response createTranscription(InputStream _fileInputStream, FileInfo _fileDetail
 ,CreateTranscriptionRequestModel model
 ,String language
 ,String prompt
 ,String responseFormat
 ,BigDecimal temperature
 ,List<String> timestampGranularities
 ) throws NotFoundException;
    public abstract Response createTranslation(InputStream _fileInputStream, FileInfo _fileDetail
 ,CreateTranscriptionRequestModel model
 ,String prompt
 ,String responseFormat
 ,BigDecimal temperature
 ) throws NotFoundException;
}
