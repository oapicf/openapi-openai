package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.FineTune;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class FineTunesApiService {
    public abstract Response cancelFineTune(String fineTuneId
 ) throws NotFoundException;
    public abstract Response createFineTune(CreateFineTuneRequest createFineTuneRequest
 ) throws NotFoundException;
    public abstract Response listFineTuneEvents(String fineTuneId
 ,Boolean stream
 ) throws NotFoundException;
    public abstract Response listFineTunes() throws NotFoundException;
    public abstract Response retrieveFineTune(String fineTuneId
 ) throws NotFoundException;
}
