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
     * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
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
