package org.openapitools.controller;

import org.openapitools.model.UsageResponse;
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
 * API tests for UsageController
 */
@MicronautTest
public class UsageControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    UsageController controller;

    /**
     * This test is used to validate the implementation of usageAudioSpeeches() method
     *
     * The method should: Get audio speeches usage details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageAudioSpeechesMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> userIds = Arrays.asList("example");
        List<String> apiKeyIds = Arrays.asList("example");
        List<String> models = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse result = controller.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/usage/audio_speeches' to the features of usageAudioSpeeches() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageAudioSpeechesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/usage/audio_speeches").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@422179c7");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("user_ids", Arrays.asList("example")) // The query format should be multi
            .add("api_key_ids", Arrays.asList("example")) // The query format should be multi
            .add("models", Arrays.asList("example")) // The query format should be multi
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of usageAudioTranscriptions() method
     *
     * The method should: Get audio transcriptions usage details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageAudioTranscriptionsMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> userIds = Arrays.asList("example");
        List<String> apiKeyIds = Arrays.asList("example");
        List<String> models = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse result = controller.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/usage/audio_transcriptions' to the features of usageAudioTranscriptions() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageAudioTranscriptionsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/usage/audio_transcriptions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2a447744");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("user_ids", Arrays.asList("example")) // The query format should be multi
            .add("api_key_ids", Arrays.asList("example")) // The query format should be multi
            .add("models", Arrays.asList("example")) // The query format should be multi
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of usageCodeInterpreterSessions() method
     *
     * The method should: Get code interpreter sessions usage details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageCodeInterpreterSessionsMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse result = controller.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/usage/code_interpreter_sessions' to the features of usageCodeInterpreterSessions() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageCodeInterpreterSessionsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/usage/code_interpreter_sessions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@69d2cffb");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of usageCompletions() method
     *
     * The method should: Get completions usage details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageCompletionsMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> userIds = Arrays.asList("example");
        List<String> apiKeyIds = Arrays.asList("example");
        List<String> models = Arrays.asList("example");
        Boolean batch = false;
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse result = controller.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/usage/completions' to the features of usageCompletions() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageCompletionsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/usage/completions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7c1ac3b");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("user_ids", Arrays.asList("example")) // The query format should be multi
            .add("api_key_ids", Arrays.asList("example")) // The query format should be multi
            .add("models", Arrays.asList("example")) // The query format should be multi
            .add("batch", String.valueOf(false)) // The query parameter format should be 
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of usageCosts() method
     *
     * The method should: Get costs details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageCostsMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 7;
        String page = "example";

        // when
        UsageResponse result = controller.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/costs' to the features of usageCosts() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageCostsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/costs").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4e670245");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(7)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of usageEmbeddings() method
     *
     * The method should: Get embeddings usage details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageEmbeddingsMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> userIds = Arrays.asList("example");
        List<String> apiKeyIds = Arrays.asList("example");
        List<String> models = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse result = controller.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/usage/embeddings' to the features of usageEmbeddings() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageEmbeddingsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/usage/embeddings").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4790a29a");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("user_ids", Arrays.asList("example")) // The query format should be multi
            .add("api_key_ids", Arrays.asList("example")) // The query format should be multi
            .add("models", Arrays.asList("example")) // The query format should be multi
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of usageImages() method
     *
     * The method should: Get images usage details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageImagesMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> sources = Arrays.asList("example");
        List<String> sizes = Arrays.asList("example");
        List<String> projectIds = Arrays.asList("example");
        List<String> userIds = Arrays.asList("example");
        List<String> apiKeyIds = Arrays.asList("example");
        List<String> models = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse result = controller.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/usage/images' to the features of usageImages() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageImagesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/usage/images").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@38421084");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("sources", Arrays.asList("example")) // The query format should be multi
            .add("sizes", Arrays.asList("example")) // The query format should be multi
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("user_ids", Arrays.asList("example")) // The query format should be multi
            .add("api_key_ids", Arrays.asList("example")) // The query format should be multi
            .add("models", Arrays.asList("example")) // The query format should be multi
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of usageModerations() method
     *
     * The method should: Get moderations usage details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageModerationsMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> userIds = Arrays.asList("example");
        List<String> apiKeyIds = Arrays.asList("example");
        List<String> models = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse result = controller.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/usage/moderations' to the features of usageModerations() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageModerationsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/usage/moderations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@32e8c3c3");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("user_ids", Arrays.asList("example")) // The query format should be multi
            .add("api_key_ids", Arrays.asList("example")) // The query format should be multi
            .add("models", Arrays.asList("example")) // The query format should be multi
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of usageVectorStores() method
     *
     * The method should: Get vector stores usage details for the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void usageVectorStoresMethodTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse result = controller.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/usage/vector_stores' to the features of usageVectorStores() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void usageVectorStoresClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/usage/vector_stores").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@44eb9af1");
        request.getParameters()
            .add("start_time", String.valueOf(56)) // The query parameter format should be 
            .add("end_time", String.valueOf(56)) // The query parameter format should be 
            .add("bucket_width", "1d") // The query parameter format should be 
            .add("project_ids", Arrays.asList("example")) // The query format should be multi
            .add("group_by", Arrays.asList("example")) // The query format should be multi
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("page", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UsageResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
