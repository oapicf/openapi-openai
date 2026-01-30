package org.openapitools.controller;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;
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
 * API tests for ModerationsController
 */
@MicronautTest
public class ModerationsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ModerationsController controller;

    /**
     * This test is used to validate the implementation of createModeration() method
     *
     * The method should: Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createModerationMethodTest() {
        // given
        CreateModerationRequest createModerationRequest = new CreateModerationRequest(null);

        // when
        CreateModerationResponse result = controller.createModeration(createModerationRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/moderations' to the features of createModeration() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createModerationClientApiTest() throws IOException {
        // given
        CreateModerationRequest body = new CreateModerationRequest(null);
        String uri = UriTemplate.of("/moderations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@d367d7d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateModerationResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
