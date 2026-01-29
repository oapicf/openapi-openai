package org.openapitools.api;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;
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
 * API tests for ImagesApi
 */
@MicronautTest
public class ImagesApiTest {

    @Inject
    ImagesApi api;

    
    /**
     * Creates an image given a prompt.
     */
    @Test
    @Disabled("Not Implemented")
    public void createImageTest() {
        // given
        CreateImageRequest createImageRequest = new CreateImageRequest("A cute baby sea otter");

        // when
        ImagesResponse body = api.createImage(createImageRequest).block();

        // then
        // TODO implement the createImageTest()
    }

    
    /**
     * Creates an edited or extended image given an original image and a prompt.
     */
    @Test
    @Disabled("Not Implemented")
    public void createImageEditTest() {
        // given
        File image = null;
        String prompt = "example";
        File mask = null;
        CreateImageEditRequestModel model = new CreateImageEditRequestModel();
        Integer n = 1;
        String size = "1024x1024";
        String responseFormat = "url";
        String user = "example";

        // when
        ImagesResponse body = api.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user).block();

        // then
        // TODO implement the createImageEditTest()
    }

    
    /**
     * Creates a variation of a given image.
     */
    @Test
    @Disabled("Not Implemented")
    public void createImageVariationTest() {
        // given
        File image = null;
        CreateImageEditRequestModel model = new CreateImageEditRequestModel();
        Integer n = 1;
        String responseFormat = "url";
        String size = "1024x1024";
        String user = "example";

        // when
        ImagesResponse body = api.createImageVariation(image, model, n, responseFormat, size, user).block();

        // then
        // TODO implement the createImageVariationTest()
    }

    
}
