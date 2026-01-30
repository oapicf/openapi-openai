package org.openapitools.controller;

import org.openapitools.model.RealtimeSessionCreateRequest;
import org.openapitools.model.RealtimeSessionCreateResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for RealtimeController
 */
@MicronautTest
public class RealtimeControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    RealtimeController controller;

    /**
     * This test is used to validate the implementation of createRealtimeSession() method
     *
     * The method should: Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createRealtimeSessionMethodTest() {
        // given
        RealtimeSessionCreateRequest realtimeSessionCreateRequest = new RealtimeSessionCreateRequest("example");

        // when
        RealtimeSessionCreateResponse result = controller.createRealtimeSession(realtimeSessionCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/realtime/sessions' to the features of createRealtimeSession() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createRealtimeSessionClientApiTest() throws IOException {
        // given
        RealtimeSessionCreateRequest body = new RealtimeSessionCreateRequest("example");
        String uri = UriTemplate.of("/realtime/sessions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@5d388611");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RealtimeSessionCreateResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
