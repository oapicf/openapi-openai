package org.openapitools.controller;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;
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
 * API tests for CompletionsController
 */
@MicronautTest
public class CompletionsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CompletionsController controller;

    /**
     * This test is used to validate the implementation of createCompletion() method
     *
     * The method should: Creates a completion for the provided prompt and parameters.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createCompletionMethodTest() {
        // given
        CreateCompletionRequest createCompletionRequest = new CreateCompletionRequest(null, null);

        // when
        CreateCompletionResponse result = controller.createCompletion(createCompletionRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/completions' to the features of createCompletion() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createCompletionClientApiTest() throws IOException {
        // given
        CreateCompletionRequest body = new CreateCompletionRequest(null, null);
        String uri = UriTemplate.of("/completions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@43c3354");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateCompletionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
