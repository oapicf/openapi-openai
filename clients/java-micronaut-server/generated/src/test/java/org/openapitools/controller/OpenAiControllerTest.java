package org.openapitools.controller;

import java.math.BigDecimal;
import io.micronaut.http.multipart.CompletedFileUpload;
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
import org.openapitools.model.FineTune;
import org.openapitools.model.ImagesResponse;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
import org.openapitools.model.OpenAIFile;
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
 * API tests for OpenAiController
 */
@MicronautTest
public class OpenAiControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    OpenAiController controller;

    /**
     * This test is used to validate the implementation of cancelFineTune() method
     *
     * The method should: Immediately cancel a fine-tune job. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelFineTuneMethodTest() {
        // given
        String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";

        // when
        FineTune result = controller.cancelFineTune(fineTuneId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine-tunes/{fine_tune_id}/cancel' to the features of cancelFineTune() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelFineTuneClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine-tunes/{fine_tune_id}/cancel").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("fine_tune_id", "ft-AF1WoRqd3aJAHsqc9NY7iL8F");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FineTune.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createChatCompletion() method
     *
     * The method should: Creates a model response for the given chat conversation.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createChatCompletionMethodTest() {
        // given
        CreateChatCompletionRequest createChatCompletionRequest = new CreateChatCompletionRequest(null, Arrays.asList());

        // when
        CreateChatCompletionResponse result = controller.createChatCompletion(createChatCompletionRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/chat/completions' to the features of createChatCompletion() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createChatCompletionClientApiTest() throws IOException {
        // given
        CreateChatCompletionRequest body = new CreateChatCompletionRequest(null, Arrays.asList());
        String uri = UriTemplate.of("/chat/completions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateChatCompletionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createCompletion() method
     *
     * The method should: Creates a completion for the provided prompt and parameters.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createCompletionMethodTest() {
        // given
        CreateCompletionRequest createCompletionRequest = new CreateCompletionRequest(null, null);

        // when
        CreateCompletionResponse result = controller.createCompletion(createCompletionRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/completions' to the features of createCompletion() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createCompletionClientApiTest() throws IOException {
        // given
        CreateCompletionRequest body = new CreateCompletionRequest(null, null);
        String uri = UriTemplate.of("/completions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateCompletionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createEdit() method
     *
     * The method should: Creates a new edit for the provided input, instruction, and parameters.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createEditMethodTest() {
        // given
        CreateEditRequest createEditRequest = new CreateEditRequest(null, "Fix the spelling mistakes.");

        // when
        CreateEditResponse result = controller.createEdit(createEditRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/edits' to the features of createEdit() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createEditClientApiTest() throws IOException {
        // given
        CreateEditRequest body = new CreateEditRequest(null, "Fix the spelling mistakes.");
        String uri = UriTemplate.of("/edits").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateEditResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createEmbedding() method
     *
     * The method should: Creates an embedding vector representing the input text.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createEmbeddingMethodTest() {
        // given
        CreateEmbeddingRequest createEmbeddingRequest = new CreateEmbeddingRequest(null, null);

        // when
        CreateEmbeddingResponse result = controller.createEmbedding(createEmbeddingRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/embeddings' to the features of createEmbedding() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createEmbeddingClientApiTest() throws IOException {
        // given
        CreateEmbeddingRequest body = new CreateEmbeddingRequest(null, null);
        String uri = UriTemplate.of("/embeddings").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateEmbeddingResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createFile() method
     *
     * The method should: Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createFileMethodTest() {
        // given
        CompletedFileUpload _file = null;
        String purpose = "example";

        // when
        OpenAIFile result = controller.createFile(_file, purpose).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files' to the features of createFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createFileClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
            put("purpose", "example");
        }};
        String uri = UriTemplate.of("/files").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, OpenAIFile.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createFineTune() method
     *
     * The method should: Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createFineTuneMethodTest() {
        // given
        CreateFineTuneRequest createFineTuneRequest = new CreateFineTuneRequest("file-ajSREls59WBbvgSzJSVWxMCB");

        // when
        FineTune result = controller.createFineTune(createFineTuneRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine-tunes' to the features of createFineTune() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createFineTuneClientApiTest() throws IOException {
        // given
        CreateFineTuneRequest body = new CreateFineTuneRequest("file-ajSREls59WBbvgSzJSVWxMCB");
        String uri = UriTemplate.of("/fine-tunes").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FineTune.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createImage() method
     *
     * The method should: Creates an image given a prompt.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageMethodTest() {
        // given
        CreateImageRequest createImageRequest = new CreateImageRequest("A cute baby sea otter");

        // when
        ImagesResponse result = controller.createImage(createImageRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/images/generations' to the features of createImage() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageClientApiTest() throws IOException {
        // given
        CreateImageRequest body = new CreateImageRequest("A cute baby sea otter");
        String uri = UriTemplate.of("/images/generations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ImagesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createImageEdit() method
     *
     * The method should: Creates an edited or extended image given an original image and a prompt.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageEditMethodTest() {
        // given
        CompletedFileUpload image = null;
        String prompt = "example";
        CompletedFileUpload mask = null;
        Integer n = 1;
        String size = "1024x1024";
        String responseFormat = "url";
        String user = "example";

        // when
        ImagesResponse result = controller.createImageEdit(image, prompt, mask, n, size, responseFormat, user).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/images/edits' to the features of createImageEdit() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageEditClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("image", new FileReader(File.createTempFile("test", ".tmp")));
            put("mask", new FileReader(File.createTempFile("test", ".tmp")));
            put("prompt", "example");
            put("n", 1);
            put("size", "1024x1024");
            put("response_format", "url");
            put("user", "example");
        }};
        String uri = UriTemplate.of("/images/edits").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ImagesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createImageVariation() method
     *
     * The method should: Creates a variation of a given image.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageVariationMethodTest() {
        // given
        CompletedFileUpload image = null;
        Integer n = 1;
        String size = "1024x1024";
        String responseFormat = "url";
        String user = "example";

        // when
        ImagesResponse result = controller.createImageVariation(image, n, size, responseFormat, user).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/images/variations' to the features of createImageVariation() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createImageVariationClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("image", new FileReader(File.createTempFile("test", ".tmp")));
            put("n", 1);
            put("size", "1024x1024");
            put("response_format", "url");
            put("user", "example");
        }};
        String uri = UriTemplate.of("/images/variations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ImagesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createModeration() method
     *
     * The method should: Classifies if text violates OpenAI&#39;s Content Policy
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createModerationMethodTest() {
        // given
        CreateModerationRequest createModerationRequest = new CreateModerationRequest(null);

        // when
        CreateModerationResponse result = controller.createModeration(createModerationRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/moderations' to the features of createModeration() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createModerationClientApiTest() throws IOException {
        // given
        CreateModerationRequest body = new CreateModerationRequest(null);
        String uri = UriTemplate.of("/moderations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateModerationResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createTranscription() method
     *
     * The method should: Transcribes audio into the input language.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createTranscriptionMethodTest() {
        // given
        CompletedFileUpload _file = null;
        CreateTranscriptionRequestModel model = new CreateTranscriptionRequestModel();
        String prompt = "example";
        String responseFormat = "json";
        BigDecimal temperature = new BigDecimal(78);
        String language = "example";

        // when
        CreateTranscriptionResponse result = controller.createTranscription(_file, model, prompt, responseFormat, temperature, language).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/audio/transcriptions' to the features of createTranscription() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createTranscriptionClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
            put("model", new CreateTranscriptionRequestModel());
            put("prompt", "example");
            put("response_format", "json");
            put("temperature", new BigDecimal(78));
            put("language", "example");
        }};
        String uri = UriTemplate.of("/audio/transcriptions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateTranscriptionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createTranslation() method
     *
     * The method should: Translates audio into English.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createTranslationMethodTest() {
        // given
        CompletedFileUpload _file = null;
        CreateTranscriptionRequestModel model = new CreateTranscriptionRequestModel();
        String prompt = "example";
        String responseFormat = "json";
        BigDecimal temperature = new BigDecimal(78);

        // when
        CreateTranslationResponse result = controller.createTranslation(_file, model, prompt, responseFormat, temperature).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/audio/translations' to the features of createTranslation() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createTranslationClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
            put("model", new CreateTranscriptionRequestModel());
            put("prompt", "example");
            put("response_format", "json");
            put("temperature", new BigDecimal(78));
        }};
        String uri = UriTemplate.of("/audio/translations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateTranslationResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteFile() method
     *
     * The method should: Delete a file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteFileMethodTest() {
        // given
        String fileId = "example";

        // when
        DeleteFileResponse result = controller.deleteFile(fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files/{file_id}' to the features of deleteFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteFileResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteModel() method
     *
     * The method should: Delete a fine-tuned model. You must have the Owner role in your organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteModelMethodTest() {
        // given
        String model = "curie:ft-acmeco-2021-03-03-21-44-20";

        // when
        DeleteModelResponse result = controller.deleteModel(model).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models/{model}' to the features of deleteModel() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteModelClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models/{model}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("model", "curie:ft-acmeco-2021-03-03-21-44-20");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteModelResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of downloadFile() method
     *
     * The method should: Returns the contents of the specified file
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadFileMethodTest() {
        // given
        String fileId = "example";

        // when
        String result = controller.downloadFile(fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files/{file_id}/content' to the features of downloadFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/files/{file_id}/content").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listFiles() method
     *
     * The method should: Returns a list of files that belong to the user&#39;s organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listFilesMethodTest() {
        // given

        // when
        ListFilesResponse result = controller.listFiles().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files' to the features of listFiles() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listFilesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/files").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListFilesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listFineTuneEvents() method
     *
     * The method should: Get fine-grained status updates for a fine-tune job. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listFineTuneEventsMethodTest() {
        // given
        String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";
        Boolean stream = false;

        // when
        ListFineTuneEventsResponse result = controller.listFineTuneEvents(fineTuneId, stream).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine-tunes/{fine_tune_id}/events' to the features of listFineTuneEvents() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listFineTuneEventsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine-tunes/{fine_tune_id}/events").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("fine_tune_id", "ft-AF1WoRqd3aJAHsqc9NY7iL8F");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("stream", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListFineTuneEventsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listFineTunes() method
     *
     * The method should: List your organization&#39;s fine-tuning jobs 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listFineTunesMethodTest() {
        // given

        // when
        ListFineTunesResponse result = controller.listFineTunes().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine-tunes' to the features of listFineTunes() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listFineTunesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine-tunes").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListFineTunesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listModels() method
     *
     * The method should: Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listModelsMethodTest() {
        // given

        // when
        ListModelsResponse result = controller.listModels().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models' to the features of listModels() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listModelsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListModelsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveFile() method
     *
     * The method should: Returns information about a specific file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveFileMethodTest() {
        // given
        String fileId = "example";

        // when
        OpenAIFile result = controller.retrieveFile(fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files/{file_id}' to the features of retrieveFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, OpenAIFile.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveFineTune() method
     *
     * The method should: Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveFineTuneMethodTest() {
        // given
        String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";

        // when
        FineTune result = controller.retrieveFineTune(fineTuneId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/fine-tunes/{fine_tune_id}' to the features of retrieveFineTune() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveFineTuneClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/fine-tunes/{fine_tune_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("fine_tune_id", "ft-AF1WoRqd3aJAHsqc9NY7iL8F");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FineTune.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveModel() method
     *
     * The method should: Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveModelMethodTest() {
        // given
        String model = "text-davinci-001";

        // when
        Model result = controller.retrieveModel(model).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models/{model}' to the features of retrieveModel() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveModelClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models/{model}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("model", "text-davinci-001");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Model.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
