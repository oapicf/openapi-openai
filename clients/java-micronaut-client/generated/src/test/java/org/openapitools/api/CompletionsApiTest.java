package org.openapitools.api;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;
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
 * API tests for CompletionsApi
 */
@MicronautTest
public class CompletionsApiTest {

    @Inject
    CompletionsApi api;

    
    /**
     * Creates a completion for the provided prompt and parameters.
     */
    @Test
    @Disabled("Not Implemented")
    public void createCompletionTest() {
        // given
        CreateCompletionRequest createCompletionRequest = new CreateCompletionRequest(null, null);

        // when
        CreateCompletionResponse body = api.createCompletion(createCompletionRequest).block();

        // then
        // TODO implement the createCompletionTest()
    }

    
}
