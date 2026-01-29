package org.openapitools.controller;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;
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
 * API tests for EmbeddingsController
 */
@MicronautTest
public class EmbeddingsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    EmbeddingsController controller;

    /**
     * This test is used to validate the implementation of createEmbedding() method
     *
     * The method should: Creates an embedding vector representing the input text.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createEmbeddingMethodTest() {
        // given
        CreateEmbeddingRequest createEmbeddingRequest = new CreateEmbeddingRequest(null, null);

        // when
        CreateEmbeddingResponse result = controller.createEmbedding(createEmbeddingRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/embeddings' to the features of createEmbedding() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createEmbeddingClientApiTest() throws IOException {
        // given
        CreateEmbeddingRequest body = new CreateEmbeddingRequest(null, null);
        String uri = UriTemplate.of("/embeddings").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@28796d0e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateEmbeddingResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
