package org.openapitools.api.interfaces;

import org.openapitools.model.RealtimeSessionCreateRequest;
import org.openapitools.model.RealtimeSessionCreateResponse;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface RealtimeService {

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     * 
     *
     * @param realtimeSessionCreateRequest Create an ephemeral API key with the given session configuration. (required)
     * @return RealtimeSessionCreateResponse
     */
    RealtimeSessionCreateResponse createRealtimeSession(
        RealtimeSessionCreateRequest realtimeSessionCreateRequest
    );
}
