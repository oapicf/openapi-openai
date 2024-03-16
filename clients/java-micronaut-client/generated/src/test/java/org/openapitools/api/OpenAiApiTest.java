package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CreateChatCompletionRequest;
import org.openapitools.model.CreateChatCompletionResponse;
import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;
import org.openapitools.model.CreateEditRequest;
import org.openapitools.model.CreateEditResponse;
import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;
import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranscriptionResponse;
import org.openapitools.model.CreateTranslationResponse;
import org.openapitools.model.DeleteFileResponse;
import org.openapitools.model.DeleteModelResponse;
import java.io.File;
import org.openapitools.model.FineTune;
import org.openapitools.model.ImagesResponse;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
import org.openapitools.model.OpenAIFile;
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
 * API tests for OpenAiApi
 */
@MicronautTest
public class OpenAiApiTest {

    @Inject
    OpenAiApi api;

    
    /**
     * Immediately cancel a fine-tune job. 
     */
    @Test
    @Disabled("Not Implemented")
    public void cancelFineTuneTest() {
        // given
        String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";

        // when
        FineTune body = api.cancelFineTune(fineTuneId).block();

        // then
        // TODO implement the cancelFineTuneTest()
    }

    
    /**
     * Creates a model response for the given chat conversation.
     */
    @Test
    @Disabled("Not Implemented")
    public void createChatCompletionTest() {
        // given
        CreateChatCompletionRequest createChatCompletionRequest = new CreateChatCompletionRequest(null, Arrays.asList());

        // when
        CreateChatCompletionResponse body = api.createChatCompletion(createChatCompletionRequest).block();

        // then
        // TODO implement the createChatCompletionTest()
    }

    
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

    
    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     */
    @Test
    @Disabled("Not Implemented")
    public void createEditTest() {
        // given
        CreateEditRequest createEditRequest = new CreateEditRequest(null, "Fix the spelling mistakes.");

        // when
        CreateEditResponse body = api.createEdit(createEditRequest).block();

        // then
        // TODO implement the createEditTest()
    }

    
    /**
     * Creates an embedding vector representing the input text.
     */
    @Test
    @Disabled("Not Implemented")
    public void createEmbeddingTest() {
        // given
        CreateEmbeddingRequest createEmbeddingRequest = new CreateEmbeddingRequest(null, null);

        // when
        CreateEmbeddingResponse body = api.createEmbedding(createEmbeddingRequest).block();

        // then
        // TODO implement the createEmbeddingTest()
    }

    
    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     */
    @Test
    @Disabled("Not Implemented")
    public void createFileTest() {
        // given
        File _file = null;
        String purpose = "example";

        // when
        OpenAIFile body = api.createFile(_file, purpose).block();

        // then
        // TODO implement the createFileTest()
    }

    
    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     */
    @Test
    @Disabled("Not Implemented")
    public void createFineTuneTest() {
        // given
        CreateFineTuneRequest createFineTuneRequest = new CreateFineTuneRequest("file-ajSREls59WBbvgSzJSVWxMCB");

        // when
        FineTune body = api.createFineTune(createFineTuneRequest).block();

        // then
        // TODO implement the createFineTuneTest()
    }

    
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
        Integer n = 1;
        String size = "1024x1024";
        String responseFormat = "url";
        String user = "example";

        // when
        ImagesResponse body = api.createImageEdit(image, prompt, mask, n, size, responseFormat, user).block();

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
        Integer n = 1;
        String size = "1024x1024";
        String responseFormat = "url";
        String user = "example";

        // when
        ImagesResponse body = api.createImageVariation(image, n, size, responseFormat, user).block();

        // then
        // TODO implement the createImageVariationTest()
    }

    
    /**
     * Classifies if text violates OpenAI&#39;s Content Policy
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

    
    /**
     * Transcribes audio into the input language.
     */
    @Test
    @Disabled("Not Implemented")
    public void createTranscriptionTest() {
        // given
        File _file = null;
        CreateTranscriptionRequestModel model = new CreateTranscriptionRequestModel();
        String prompt = "example";
        String responseFormat = "json";
        BigDecimal temperature = new BigDecimal(78);
        String language = "example";

        // when
        CreateTranscriptionResponse body = api.createTranscription(_file, model, prompt, responseFormat, temperature, language).block();

        // then
        // TODO implement the createTranscriptionTest()
    }

    
    /**
     * Translates audio into English.
     */
    @Test
    @Disabled("Not Implemented")
    public void createTranslationTest() {
        // given
        File _file = null;
        CreateTranscriptionRequestModel model = new CreateTranscriptionRequestModel();
        String prompt = "example";
        String responseFormat = "json";
        BigDecimal temperature = new BigDecimal(78);

        // when
        CreateTranslationResponse body = api.createTranslation(_file, model, prompt, responseFormat, temperature).block();

        // then
        // TODO implement the createTranslationTest()
    }

    
    /**
     * Delete a file.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteFileTest() {
        // given
        String fileId = "example";

        // when
        DeleteFileResponse body = api.deleteFile(fileId).block();

        // then
        // TODO implement the deleteFileTest()
    }

    
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteModelTest() {
        // given
        String model = "curie:ft-acmeco-2021-03-03-21-44-20";

        // when
        DeleteModelResponse body = api.deleteModel(model).block();

        // then
        // TODO implement the deleteModelTest()
    }

    
    /**
     * Returns the contents of the specified file
     */
    @Test
    @Disabled("Not Implemented")
    public void downloadFileTest() {
        // given
        String fileId = "example";

        // when
        String body = api.downloadFile(fileId).block();

        // then
        // TODO implement the downloadFileTest()
    }

    
    /**
     * Returns a list of files that belong to the user&#39;s organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void listFilesTest() {
        // given

        // when
        ListFilesResponse body = api.listFiles().block();

        // then
        // TODO implement the listFilesTest()
    }

    
    /**
     * Get fine-grained status updates for a fine-tune job. 
     */
    @Test
    @Disabled("Not Implemented")
    public void listFineTuneEventsTest() {
        // given
        String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";
        Boolean stream = false;

        // when
        ListFineTuneEventsResponse body = api.listFineTuneEvents(fineTuneId, stream).block();

        // then
        // TODO implement the listFineTuneEventsTest()
    }

    
    /**
     * List your organization&#39;s fine-tuning jobs 
     */
    @Test
    @Disabled("Not Implemented")
    public void listFineTunesTest() {
        // given

        // when
        ListFineTunesResponse body = api.listFineTunes().block();

        // then
        // TODO implement the listFineTunesTest()
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
     * Returns information about a specific file.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveFileTest() {
        // given
        String fileId = "example";

        // when
        OpenAIFile body = api.retrieveFile(fileId).block();

        // then
        // TODO implement the retrieveFileTest()
    }

    
    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveFineTuneTest() {
        // given
        String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";

        // when
        FineTune body = api.retrieveFineTune(fineTuneId).block();

        // then
        // TODO implement the retrieveFineTuneTest()
    }

    
    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveModelTest() {
        // given
        String model = "text-davinci-001";

        // when
        Model body = api.retrieveModel(model).block();

        // then
        // TODO implement the retrieveModelTest()
    }

    
}
