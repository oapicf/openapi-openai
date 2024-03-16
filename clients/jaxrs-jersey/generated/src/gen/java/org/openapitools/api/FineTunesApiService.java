package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.FineTune;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class FineTunesApiService {
    public abstract Response cancelFineTune(String fineTuneId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createFineTune(CreateFineTuneRequest createFineTuneRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listFineTuneEvents(String fineTuneId,Boolean stream,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listFineTunes(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveFineTune(String fineTuneId,SecurityContext securityContext) throws NotFoundException;
}
