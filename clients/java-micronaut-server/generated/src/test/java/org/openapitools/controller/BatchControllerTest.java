package org.openapitools.controller;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;
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
 * API tests for BatchController
 */
@MicronautTest
public class BatchControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    BatchController controller;

    /**
     * This test is used to validate the implementation of cancelBatch() method
     *
     * The method should: Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelBatchMethodTest() {
        // given
        String batchId = "example";

        // when
        Batch result = controller.cancelBatch(batchId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/batches/{batch_id}/cancel' to the features of cancelBatch() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelBatchClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/batches/{batch_id}/cancel").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("batch_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@50099588");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Batch.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createBatch() method
     *
     * The method should: Creates and executes a batch from an uploaded file of requests
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createBatchMethodTest() {
        // given
        CreateBatchRequest createBatchRequest = new CreateBatchRequest("example", "example", "example");

        // when
        Batch result = controller.createBatch(createBatchRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/batches' to the features of createBatch() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createBatchClientApiTest() throws IOException {
        // given
        CreateBatchRequest body = new CreateBatchRequest("example", "example", "example");
        String uri = UriTemplate.of("/batches").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@5471182c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Batch.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listBatches() method
     *
     * The method should: List your organization&#39;s batches.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listBatchesMethodTest() {
        // given
        String after = "example";
        Integer limit = 20;

        // when
        ListBatchesResponse result = controller.listBatches(after, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/batches' to the features of listBatches() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listBatchesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/batches").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@711534f7");
        request.getParameters()
            .add("after", "example") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListBatchesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveBatch() method
     *
     * The method should: Retrieves a batch.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveBatchMethodTest() {
        // given
        String batchId = "example";

        // when
        Batch result = controller.retrieveBatch(batchId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/batches/{batch_id}' to the features of retrieveBatch() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveBatchClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/batches/{batch_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("batch_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@426e165f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Batch.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
