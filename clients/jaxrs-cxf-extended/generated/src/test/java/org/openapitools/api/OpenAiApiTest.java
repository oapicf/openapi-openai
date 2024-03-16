/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * OpenAI API
 *
 * <p>APIs for sampling from and fine-tuning language models
 *
 * API tests for OpenAiApi.
 */
public class OpenAiApiTest {

    private OpenAiApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://api.openai.com/v1", OpenAiApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Immediately cancel a fine-tune job. 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void cancelFineTuneTest() throws Exception {
        // TODO: assign appropriate parameter values
        String fineTuneId = null;

        // TODO: delete this line and uncomment the next
        // FineTune response = api.cancelFineTune(fineTuneId);
        // TODO: complete test assertions
    }
    
    /**
     * Creates a model response for the given chat conversation.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createChatCompletionTest() throws Exception {
        // TODO: assign appropriate parameter values
        CreateChatCompletionRequest createChatCompletionRequest = null;

        // TODO: delete this line and uncomment the next
        // CreateChatCompletionResponse response = api.createChatCompletion(createChatCompletionRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Creates a completion for the provided prompt and parameters.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createCompletionTest() throws Exception {
        // TODO: assign appropriate parameter values
        CreateCompletionRequest createCompletionRequest = null;

        // TODO: delete this line and uncomment the next
        // CreateCompletionResponse response = api.createCompletion(createCompletionRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createEditTest() throws Exception {
        // TODO: assign appropriate parameter values
        CreateEditRequest createEditRequest = null;

        // TODO: delete this line and uncomment the next
        // CreateEditResponse response = api.createEdit(createEditRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Creates an embedding vector representing the input text.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createEmbeddingTest() throws Exception {
        // TODO: assign appropriate parameter values
        CreateEmbeddingRequest createEmbeddingRequest = null;

        // TODO: delete this line and uncomment the next
        // CreateEmbeddingResponse response = api.createEmbedding(createEmbeddingRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createFileTest() throws Exception {
        // TODO: assign appropriate parameter values
        Attachment _file = new Attachment("_file", MediaType.TEXT_PLAIN, "Dummy attachment content");
        String purpose = null;

        // TODO: delete this line and uncomment the next
        // OpenAIFile response = api.createFile(_file, purpose);
        // TODO: complete test assertions
    }
    
    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createFineTuneTest() throws Exception {
        // TODO: assign appropriate parameter values
        CreateFineTuneRequest createFineTuneRequest = null;

        // TODO: delete this line and uncomment the next
        // FineTune response = api.createFineTune(createFineTuneRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Creates an image given a prompt.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createImageTest() throws Exception {
        // TODO: assign appropriate parameter values
        CreateImageRequest createImageRequest = null;

        // TODO: delete this line and uncomment the next
        // ImagesResponse response = api.createImage(createImageRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createImageEditTest() throws Exception {
        // TODO: assign appropriate parameter values
        Attachment image = new Attachment("image", MediaType.TEXT_PLAIN, "Dummy attachment content");
        String prompt = null;
        Attachment mask = new Attachment("mask", MediaType.TEXT_PLAIN, "Dummy attachment content");
        Integer n = null;
        String size = null;
        String responseFormat = null;
        String user = null;

        // TODO: delete this line and uncomment the next
        // ImagesResponse response = api.createImageEdit(image, prompt, mask, n, size, responseFormat, user);
        // TODO: complete test assertions
    }
    
    /**
     * Creates a variation of a given image.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createImageVariationTest() throws Exception {
        // TODO: assign appropriate parameter values
        Attachment image = new Attachment("image", MediaType.TEXT_PLAIN, "Dummy attachment content");
        Integer n = null;
        String size = null;
        String responseFormat = null;
        String user = null;

        // TODO: delete this line and uncomment the next
        // ImagesResponse response = api.createImageVariation(image, n, size, responseFormat, user);
        // TODO: complete test assertions
    }
    
    /**
     * Classifies if text violates OpenAI&#39;s Content Policy
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createModerationTest() throws Exception {
        // TODO: assign appropriate parameter values
        CreateModerationRequest createModerationRequest = null;

        // TODO: delete this line and uncomment the next
        // CreateModerationResponse response = api.createModeration(createModerationRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Transcribes audio into the input language.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createTranscriptionTest() throws Exception {
        // TODO: assign appropriate parameter values
        Attachment _file = new Attachment("_file", MediaType.TEXT_PLAIN, "Dummy attachment content");
        CreateTranscriptionRequestModel model = null;
        String prompt = null;
        String responseFormat = null;
        BigDecimal temperature = null;
        String language = null;

        // TODO: delete this line and uncomment the next
        // CreateTranscriptionResponse response = api.createTranscription(_file, model, prompt, responseFormat, temperature, language);
        // TODO: complete test assertions
    }
    
    /**
     * Translates audio into English.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createTranslationTest() throws Exception {
        // TODO: assign appropriate parameter values
        Attachment _file = new Attachment("_file", MediaType.TEXT_PLAIN, "Dummy attachment content");
        CreateTranscriptionRequestModel model = null;
        String prompt = null;
        String responseFormat = null;
        BigDecimal temperature = null;

        // TODO: delete this line and uncomment the next
        // CreateTranslationResponse response = api.createTranslation(_file, model, prompt, responseFormat, temperature);
        // TODO: complete test assertions
    }
    
    /**
     * Delete a file.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void deleteFileTest() throws Exception {
        // TODO: assign appropriate parameter values
        String fileId = null;

        // TODO: delete this line and uncomment the next
        // DeleteFileResponse response = api.deleteFile(fileId);
        // TODO: complete test assertions
    }
    
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void deleteModelTest() throws Exception {
        // TODO: assign appropriate parameter values
        String model = null;

        // TODO: delete this line and uncomment the next
        // DeleteModelResponse response = api.deleteModel(model);
        // TODO: complete test assertions
    }
    
    /**
     * Returns the contents of the specified file
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void downloadFileTest() throws Exception {
        // TODO: assign appropriate parameter values
        String fileId = null;

        // TODO: delete this line and uncomment the next
        // String response = api.downloadFile(fileId);
        // TODO: complete test assertions
    }
    
    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void listFilesTest() throws Exception {

        // TODO: delete this line and uncomment the next
        // ListFilesResponse response = api.listFiles();
        // TODO: complete test assertions
    }
    
    /**
     * Get fine-grained status updates for a fine-tune job. 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void listFineTuneEventsTest() throws Exception {
        // TODO: assign appropriate parameter values
        String fineTuneId = null;
        Boolean stream = null;

        // TODO: delete this line and uncomment the next
        // ListFineTuneEventsResponse response = api.listFineTuneEvents(fineTuneId, stream);
        // TODO: complete test assertions
    }
    
    /**
     * List your organization&#39;s fine-tuning jobs 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void listFineTunesTest() throws Exception {

        // TODO: delete this line and uncomment the next
        // ListFineTunesResponse response = api.listFineTunes();
        // TODO: complete test assertions
    }
    
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void listModelsTest() throws Exception {

        // TODO: delete this line and uncomment the next
        // ListModelsResponse response = api.listModels();
        // TODO: complete test assertions
    }
    
    /**
     * Returns information about a specific file.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void retrieveFileTest() throws Exception {
        // TODO: assign appropriate parameter values
        String fileId = null;

        // TODO: delete this line and uncomment the next
        // OpenAIFile response = api.retrieveFile(fileId);
        // TODO: complete test assertions
    }
    
    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void retrieveFineTuneTest() throws Exception {
        // TODO: assign appropriate parameter values
        String fineTuneId = null;

        // TODO: delete this line and uncomment the next
        // FineTune response = api.retrieveFineTune(fineTuneId);
        // TODO: complete test assertions
    }
    
    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void retrieveModelTest() throws Exception {
        // TODO: assign appropriate parameter values
        String model = null;

        // TODO: delete this line and uncomment the next
        // Model response = api.retrieveModel(model);
        // TODO: complete test assertions
    }
    
}