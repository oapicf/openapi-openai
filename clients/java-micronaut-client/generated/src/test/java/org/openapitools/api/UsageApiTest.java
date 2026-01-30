package org.openapitools.api;

import org.openapitools.model.UsageResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for UsageApi
 */
@MicronautTest
public class UsageApiTest {

    @Inject
    UsageApi api;

    
    /**
     * Get audio speeches usage details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageAudioSpeechesTest() {
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
        UsageResponse body = api.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        // TODO implement the usageAudioSpeechesTest()
    }

    
    /**
     * Get audio transcriptions usage details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageAudioTranscriptionsTest() {
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
        UsageResponse body = api.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        // TODO implement the usageAudioTranscriptionsTest()
    }

    
    /**
     * Get code interpreter sessions usage details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageCodeInterpreterSessionsTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse body = api.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page).block();

        // then
        // TODO implement the usageCodeInterpreterSessionsTest()
    }

    
    /**
     * Get completions usage details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageCompletionsTest() {
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
        UsageResponse body = api.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page).block();

        // then
        // TODO implement the usageCompletionsTest()
    }

    
    /**
     * Get costs details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageCostsTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 7;
        String page = "example";

        // when
        UsageResponse body = api.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page).block();

        // then
        // TODO implement the usageCostsTest()
    }

    
    /**
     * Get embeddings usage details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageEmbeddingsTest() {
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
        UsageResponse body = api.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        // TODO implement the usageEmbeddingsTest()
    }

    
    /**
     * Get images usage details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageImagesTest() {
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
        UsageResponse body = api.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        // TODO implement the usageImagesTest()
    }

    
    /**
     * Get moderations usage details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageModerationsTest() {
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
        UsageResponse body = api.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page).block();

        // then
        // TODO implement the usageModerationsTest()
    }

    
    /**
     * Get vector stores usage details for the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void usageVectorStoresTest() {
        // given
        Integer startTime = 56;
        Integer endTime = 56;
        String bucketWidth = "1d";
        List<String> projectIds = Arrays.asList("example");
        List<String> groupBy = Arrays.asList("example");
        Integer limit = 56;
        String page = "example";

        // when
        UsageResponse body = api.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page).block();

        // then
        // TODO implement the usageVectorStoresTest()
    }

    
}
