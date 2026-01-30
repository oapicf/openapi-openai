package org.openapitools.api;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;
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
 * API tests for ModerationsApi
 */
@MicronautTest
public class ModerationsApiTest {

    @Inject
    ModerationsApi api;

    
    /**
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
     */
    @Test
    @Disabled("Not Implemented")
    public void createModerationTest() {
        // given
        CreateModerationRequest createModerationRequest = new CreateModerationRequest(null);

        // when
        CreateModerationResponse body = api.createModeration(createModerationRequest).block();

        // then
        // TODO implement the createModerationTest()
    }

    
}
