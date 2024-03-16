package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.math.BigDecimal;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranscriptionResponse;
import org.openapitools.model.CreateTranslationResponse;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class AudioApiService {
    public abstract Response createTranscription(InputStream _fileInputStream, FileInfo _fileDetail
 ,CreateTranscriptionRequestModel model
 ,String prompt
 ,String responseFormat
 ,BigDecimal temperature
 ,String language
 ) throws NotFoundException;
    public abstract Response createTranslation(InputStream _fileInputStream, FileInfo _fileDetail
 ,CreateTranscriptionRequestModel model
 ,String prompt
 ,String responseFormat
 ,BigDecimal temperature
 ) throws NotFoundException;
}
