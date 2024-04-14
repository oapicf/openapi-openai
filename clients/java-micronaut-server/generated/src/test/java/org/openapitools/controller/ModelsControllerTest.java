package org.openapitools.controller;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
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
 * API tests for ModelsController
 */
@MicronautTest
public class ModelsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ModelsController controller;

    /**
     * This test is used to validate the implementation of deleteModel() method
     *
     * The method should: Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteModelMethodTest() {
        // given
        String model = "ft:gpt-3.5-turbo:acemeco:suffix:abc123";

        // when
        DeleteModelResponse result = controller.deleteModel(model).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models/{model}' to the features of deleteModel() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteModelClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models/{model}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("model", "ft:gpt-3.5-turbo:acemeco:suffix:abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteModelResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listModels() method
     *
     * The method should: Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listModelsMethodTest() {
        // given

        // when
        ListModelsResponse result = controller.listModels().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models' to the features of listModels() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listModelsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListModelsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveModel() method
     *
     * The method should: Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveModelMethodTest() {
        // given
        String model = "gpt-3.5-turbo";

        // when
        Model result = controller.retrieveModel(model).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models/{model}' to the features of retrieveModel() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveModelClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models/{model}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("model", "gpt-3.5-turbo");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Model.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
