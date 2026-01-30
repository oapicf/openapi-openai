package org.openapitools.api;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
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
 * API tests for ModelsApi
 */
@MicronautTest
public class ModelsApiTest {

    @Inject
    ModelsApi api;

    
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteModelTest() {
        // given
        String model = "ft:gpt-4o-mini:acemeco:suffix:abc123";

        // when
        DeleteModelResponse body = api.deleteModel(model).block();

        // then
        // TODO implement the deleteModelTest()
    }

    
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    @Test
    @Disabled("Not Implemented")
    public void listModelsTest() {
        // given

        // when
        ListModelsResponse body = api.listModels().block();

        // then
        // TODO implement the listModelsTest()
    }

    
    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveModelTest() {
        // given
        String model = "gpt-4o-mini";

        // when
        Model body = api.retrieveModel(model).block();

        // then
        // TODO implement the retrieveModelTest()
    }

    
}
