package org.openapitools.controller;

import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.ImagesResponse;
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
 * API tests for ImagesController
 */
@MicronautTest
public class ImagesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ImagesController controller;

    /**
     * This test is used to validate the implementation of createImage() method
     *
     * The method should: Creates an image given a prompt.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageMethodTest() {
        // given
        CreateImageRequest createImageRequest = new CreateImageRequest("A cute baby sea otter");

        // when
        ImagesResponse result = controller.createImage(createImageRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/images/generations' to the features of createImage() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageClientApiTest() throws IOException {
        // given
        CreateImageRequest body = new CreateImageRequest("A cute baby sea otter");
        String uri = UriTemplate.of("/images/generations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2318651f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ImagesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createImageEdit() method
     *
     * The method should: Creates an edited or extended image given an original image and a prompt.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageEditMethodTest() {
        // given
        CompletedFileUpload image = null;
        String prompt = "example";
        CompletedFileUpload mask = null;
        CreateImageEditRequestModel model = new CreateImageEditRequestModel();
        Integer n = 1;
        String size = "1024x1024";
        String responseFormat = "url";
        String user = "example";

        // when
        ImagesResponse result = controller.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/images/edits' to the features of createImageEdit() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageEditClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("image", new FileReader(File.createTempFile("test", ".tmp")));
            put("prompt", "example");
            put("mask", new FileReader(File.createTempFile("test", ".tmp")));
            put("model", new CreateImageEditRequestModel());
            put("n", 1);
            put("size", "1024x1024");
            put("response_format", "url");
            put("user", "example");
        }};
        String uri = UriTemplate.of("/images/edits").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@3f04fb07");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ImagesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createImageVariation() method
     *
     * The method should: Creates a variation of a given image.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageVariationMethodTest() {
        // given
        CompletedFileUpload image = null;
        CreateImageEditRequestModel model = new CreateImageEditRequestModel();
        Integer n = 1;
        String responseFormat = "url";
        String size = "1024x1024";
        String user = "example";

        // when
        ImagesResponse result = controller.createImageVariation(image, model, n, responseFormat, size, user).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/images/variations' to the features of createImageVariation() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageVariationClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("image", new FileReader(File.createTempFile("test", ".tmp")));
            put("model", new CreateImageEditRequestModel());
            put("n", 1);
            put("response_format", "url");
            put("size", "1024x1024");
            put("user", "example");
        }};
        String uri = UriTemplate.of("/images/variations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@4718d320");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ImagesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
