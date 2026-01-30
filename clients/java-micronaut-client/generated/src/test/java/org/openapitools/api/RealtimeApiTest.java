package org.openapitools.api;

import org.openapitools.model.RealtimeSessionCreateRequest;
import org.openapitools.model.RealtimeSessionCreateResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for RealtimeApi
 */
@MicronautTest
public class RealtimeApiTest {

    @Inject
    RealtimeApi api;

    
    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     */
    @Test
    @Disabled("Not Implemented")
    public void createRealtimeSessionTest() {
        // given
        RealtimeSessionCreateRequest realtimeSessionCreateRequest = new RealtimeSessionCreateRequest("example");

        // when
        RealtimeSessionCreateResponse body = api.createRealtimeSession(realtimeSessionCreateRequest).block();

        // then
        // TODO implement the createRealtimeSessionTest()
    }

    
}
