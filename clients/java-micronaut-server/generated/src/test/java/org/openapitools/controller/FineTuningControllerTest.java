package org.openapitools.controller;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;
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
 * API tests for FineTuningController
 */
@MicronautTest
public class FineTuningControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    FineTuningController controller;

    /**
     * This test is used to validate the implementation of cancelFineTuningJob() method
     *
     * The method should: Immediately cancel a fine-tune job. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelFineTuningJobMethodTest() {
        // given
        String fineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";

        // when
        FineTuningJob result = controller.cancelFineTuningJob(fineTuningJobId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine_tuning/jobs/{fine_tuning_job_id}/cancel' to the features of cancelFineTuningJob() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelFineTuningJobClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine_tuning/jobs/{fine_tuning_job_id}/cancel").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("fine_tuning_job_id", "ft-AF1WoRqd3aJAHsqc9NY7iL8F");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@5c6e4d6b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FineTuningJob.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createFineTuningJob() method
     *
     * The method should: Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createFineTuningJobMethodTest() {
        // given
        CreateFineTuningJobRequest createFineTuningJobRequest = new CreateFineTuningJobRequest(null, "file-abc123");

        // when
        FineTuningJob result = controller.createFineTuningJob(createFineTuningJobRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine_tuning/jobs' to the features of createFineTuningJob() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createFineTuningJobClientApiTest() throws IOException {
        // given
        CreateFineTuningJobRequest body = new CreateFineTuningJobRequest(null, "file-abc123");
        String uri = UriTemplate.of("/fine_tuning/jobs").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@a25c653");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FineTuningJob.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listFineTuningEvents() method
     *
     * The method should: Get status updates for a fine-tuning job. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listFineTuningEventsMethodTest() {
        // given
        String fineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";
        String after = "example";
        Integer limit = 20;

        // when
        ListFineTuningJobEventsResponse result = controller.listFineTuningEvents(fineTuningJobId, after, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine_tuning/jobs/{fine_tuning_job_id}/events' to the features of listFineTuningEvents() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listFineTuningEventsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine_tuning/jobs/{fine_tuning_job_id}/events").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("fine_tuning_job_id", "ft-AF1WoRqd3aJAHsqc9NY7iL8F");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@54c9320c");
        request.getParameters()
            .add("after", "example") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListFineTuningJobEventsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listFineTuningJobCheckpoints() method
     *
     * The method should: List checkpoints for a fine-tuning job. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listFineTuningJobCheckpointsMethodTest() {
        // given
        String fineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";
        String after = "example";
        Integer limit = 10;

        // when
        ListFineTuningJobCheckpointsResponse result = controller.listFineTuningJobCheckpoints(fineTuningJobId, after, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints' to the features of listFineTuningJobCheckpoints() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listFineTuningJobCheckpointsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("fine_tuning_job_id", "ft-AF1WoRqd3aJAHsqc9NY7iL8F");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4df03572");
        request.getParameters()
            .add("after", "example") // The query parameter format should be 
            .add("limit", String.valueOf(10)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListFineTuningJobCheckpointsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listPaginatedFineTuningJobs() method
     *
     * The method should: List your organization&#39;s fine-tuning jobs 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listPaginatedFineTuningJobsMethodTest() {
        // given
        String after = "example";
        Integer limit = 20;

        // when
        ListPaginatedFineTuningJobsResponse result = controller.listPaginatedFineTuningJobs(after, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine_tuning/jobs' to the features of listPaginatedFineTuningJobs() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listPaginatedFineTuningJobsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine_tuning/jobs").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@63db2cb2");
        request.getParameters()
            .add("after", "example") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListPaginatedFineTuningJobsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveFineTuningJob() method
     *
     * The method should: Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveFineTuningJobMethodTest() {
        // given
        String fineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";

        // when
        FineTuningJob result = controller.retrieveFineTuningJob(fineTuningJobId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine_tuning/jobs/{fine_tuning_job_id}' to the features of retrieveFineTuningJob() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveFineTuningJobClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine_tuning/jobs/{fine_tuning_job_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("fine_tuning_job_id", "ft-AF1WoRqd3aJAHsqc9NY7iL8F");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@47e869c4");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FineTuningJob.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
