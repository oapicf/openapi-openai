package org.openapitools.api;

import org.openapitools.model.CreateChatCompletionRequest;
import org.openapitools.model.CreateChatCompletionResponse;
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
 * API tests for ChatApi
 */
@MicronautTest
public class ChatApiTest {

    @Inject
    ChatApi api;

    
    /**
     * Creates a model response for the given chat conversation.
     */
    @Test
    @Disabled("Not Implemented")
    public void createChatCompletionTest() {
        // given
        CreateChatCompletionRequest createChatCompletionRequest = new CreateChatCompletionRequest(Arrays.asList(), null);

        // when
        CreateChatCompletionResponse body = api.createChatCompletion(createChatCompletionRequest).block();

        // then
        // TODO implement the createChatCompletionTest()
    }

    
}
