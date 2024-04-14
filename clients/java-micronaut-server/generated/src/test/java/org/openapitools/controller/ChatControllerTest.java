package org.openapitools.controller;

import org.openapitools.model.CreateChatCompletionRequest;
import org.openapitools.model.CreateChatCompletionResponse;
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
 * API tests for ChatController
 */
@MicronautTest
public class ChatControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ChatController controller;

    /**
     * This test is used to validate the implementation of createChatCompletion() method
     *
     * The method should: Creates a model response for the given chat conversation.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createChatCompletionMethodTest() {
        // given
        CreateChatCompletionRequest createChatCompletionRequest = new CreateChatCompletionRequest(Arrays.asList(), null);

        // when
        CreateChatCompletionResponse result = controller.createChatCompletion(createChatCompletionRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/chat/completions' to the features of createChatCompletion() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createChatCompletionClientApiTest() throws IOException {
        // given
        CreateChatCompletionRequest body = new CreateChatCompletionRequest(Arrays.asList(), null);
        String uri = UriTemplate.of("/chat/completions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateChatCompletionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
