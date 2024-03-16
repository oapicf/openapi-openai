@isTest
private class OASOpenAIApiTest {
    /**
     * Immediately cancel a fine-tune job.\n
     *
     * 
     */
    @isTest
    private static void cancelFineTuneTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fineTuneId' => ft-AF1WoRqd3aJAHsqc9NY7iL8F
        };

        OASClient client;
        OASOpenAIApi api;
        OASFineTune response;
        OASFineTune expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASFineTune.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFineTune.getExample();
        response = (OASFineTune) api.cancelFineTune(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates a model response for the given chat conversation.
     *
     * 
     */
    @isTest
    private static void createChatCompletionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateChatCompletionRequest' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASCreateChatCompletionResponse response;
        OASCreateChatCompletionResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASCreateChatCompletionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatCompletionResponse.getExample();
        response = (OASCreateChatCompletionResponse) api.createChatCompletion(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     *
     * 
     */
    @isTest
    private static void createCompletionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateCompletionRequest' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASCreateCompletionResponse response;
        OASCreateCompletionResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASCreateCompletionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateCompletionResponse.getExample();
        response = (OASCreateCompletionResponse) api.createCompletion(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     *
     * 
     */
    @isTest
    private static void createEditTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateEditRequest' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASCreateEditResponse response;
        OASCreateEditResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASCreateEditResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateEditResponse.getExample();
        response = (OASCreateEditResponse) api.createEdit(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates an embedding vector representing the input text.
     *
     * 
     */
    @isTest
    private static void createEmbeddingTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateEmbeddingRequest' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASCreateEmbeddingResponse response;
        OASCreateEmbeddingResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASCreateEmbeddingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateEmbeddingResponse.getExample();
        response = (OASCreateEmbeddingResponse) api.createEmbedding(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.\n
     *
     * 
     */
    @isTest
    private static void createFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'file' => Blob.valueOf('Sample text file\nContents'),
            'purpose' => 'null'
        };

        OASClient client;
        OASOpenAIApi api;
        OASOpenAIFile response;
        OASOpenAIFile expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASOpenAIFile.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOpenAIFile.getExample();
        response = (OASOpenAIFile) api.createFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.\n\nResponse includes details of the enqueued job including job status and the name of the fine-tuned models once complete.\n\n[Learn more about Fine-tuning](/docs/guides/fine-tuning)\n
     *
     * 
     */
    @isTest
    private static void createFineTuneTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateFineTuneRequest' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASFineTune response;
        OASFineTune expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASFineTune.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFineTune.getExample();
        response = (OASFineTune) api.createFineTune(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates an image given a prompt.
     *
     * 
     */
    @isTest
    private static void createImageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateImageRequest' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASImagesResponse response;
        OASImagesResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASImagesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASImagesResponse.getExample();
        response = (OASImagesResponse) api.createImage(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     * 
     */
    @isTest
    private static void createImageEditTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'image' => Blob.valueOf('Sample text file\nContents'),
            'prompt' => 'null',
            'mask' => Blob.valueOf('Sample text file\nContents'),
            'n' => '',
            'size' => 'null',
            'responseFormat' => 'null',
            'user' => 'null'
        };

        OASClient client;
        OASOpenAIApi api;
        OASImagesResponse response;
        OASImagesResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASImagesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASImagesResponse.getExample();
        response = (OASImagesResponse) api.createImageEdit(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates a variation of a given image.
     *
     * 
     */
    @isTest
    private static void createImageVariationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'image' => Blob.valueOf('Sample text file\nContents'),
            'n' => '',
            'size' => 'null',
            'responseFormat' => 'null',
            'user' => 'null'
        };

        OASClient client;
        OASOpenAIApi api;
        OASImagesResponse response;
        OASImagesResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASImagesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASImagesResponse.getExample();
        response = (OASImagesResponse) api.createImageVariation(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Classifies if text violates OpenAI\&#39;s Content Policy
     *
     * 
     */
    @isTest
    private static void createModerationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateModerationRequest' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASCreateModerationResponse response;
        OASCreateModerationResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASCreateModerationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateModerationResponse.getExample();
        response = (OASCreateModerationResponse) api.createModeration(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Transcribes audio into the input language.
     *
     * 
     */
    @isTest
    private static void createTranscriptionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'file' => Blob.valueOf('Sample text file\nContents'),
            'model' => '',
            'prompt' => 'null',
            'responseFormat' => 'null',
            'temperature' => '',
            'language' => 'null'
        };

        OASClient client;
        OASOpenAIApi api;
        OASCreateTranscriptionResponse response;
        OASCreateTranscriptionResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASCreateTranscriptionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateTranscriptionResponse.getExample();
        response = (OASCreateTranscriptionResponse) api.createTranscription(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Translates audio into English.
     *
     * 
     */
    @isTest
    private static void createTranslationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'file' => Blob.valueOf('Sample text file\nContents'),
            'model' => '',
            'prompt' => 'null',
            'responseFormat' => 'null',
            'temperature' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASCreateTranslationResponse response;
        OASCreateTranslationResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASCreateTranslationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateTranslationResponse.getExample();
        response = (OASCreateTranslationResponse) api.createTranslation(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete a file.
     *
     * 
     */
    @isTest
    private static void deleteFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fileId' => 'null'
        };

        OASClient client;
        OASOpenAIApi api;
        OASDeleteFileResponse response;
        OASDeleteFileResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASDeleteFileResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteFileResponse.getExample();
        response = (OASDeleteFileResponse) api.deleteFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     *
     * 
     */
    @isTest
    private static void deleteModelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'model' => curie:ft-acmeco-2021-03-03-21-44-20
        };

        OASClient client;
        OASOpenAIApi api;
        OASDeleteModelResponse response;
        OASDeleteModelResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASDeleteModelResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteModelResponse.getExample();
        response = (OASDeleteModelResponse) api.deleteModel(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns the contents of the specified file
     *
     * 
     */
    @isTest
    private static void downloadFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fileId' => 'null'
        };

        OASClient client;
        OASOpenAIApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        api.downloadFile(params);
    }

    /**
     * Returns a list of files that belong to the user\&#39;s organization.
     *
     * 
     */
    @isTest
    private static void listFilesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASOpenAIApi api;
        OASListFilesResponse response;
        OASListFilesResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASListFilesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListFilesResponse.getExample();
        response = (OASListFilesResponse) api.listFiles();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get fine-grained status updates for a fine-tune job.\n
     *
     * 
     */
    @isTest
    private static void listFineTuneEventsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fineTuneId' => ft-AF1WoRqd3aJAHsqc9NY7iL8F,
            'stream' => ''
        };

        OASClient client;
        OASOpenAIApi api;
        OASListFineTuneEventsResponse response;
        OASListFineTuneEventsResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASListFineTuneEventsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListFineTuneEventsResponse.getExample();
        response = (OASListFineTuneEventsResponse) api.listFineTuneEvents(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List your organization\&#39;s fine-tuning jobs\n
     *
     * 
     */
    @isTest
    private static void listFineTunesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASOpenAIApi api;
        OASListFineTunesResponse response;
        OASListFineTunesResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASListFineTunesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListFineTunesResponse.getExample();
        response = (OASListFineTunesResponse) api.listFineTunes();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * 
     */
    @isTest
    private static void listModelsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASOpenAIApi api;
        OASListModelsResponse response;
        OASListModelsResponse expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASListModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListModelsResponse.getExample();
        response = (OASListModelsResponse) api.listModels();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns information about a specific file.
     *
     * 
     */
    @isTest
    private static void retrieveFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fileId' => 'null'
        };

        OASClient client;
        OASOpenAIApi api;
        OASOpenAIFile response;
        OASOpenAIFile expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASOpenAIFile.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOpenAIFile.getExample();
        response = (OASOpenAIFile) api.retrieveFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Gets info about the fine-tune job.\n\n[Learn more about Fine-tuning](/docs/guides/fine-tuning)\n
     *
     * 
     */
    @isTest
    private static void retrieveFineTuneTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fineTuneId' => ft-AF1WoRqd3aJAHsqc9NY7iL8F
        };

        OASClient client;
        OASOpenAIApi api;
        OASFineTune response;
        OASFineTune expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASFineTune.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFineTune.getExample();
        response = (OASFineTune) api.retrieveFineTune(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * 
     */
    @isTest
    private static void retrieveModelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'model' => text-davinci-001
        };

        OASClient client;
        OASOpenAIApi api;
        OASModel response;
        OASModel expectedResponse;
        String js = '';

        api = new OASOpenAIApi(new OASClient());

        js = JSON.serialize(OASModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASModel.getExample();
        response = (OASModel) api.retrieveModel(params);
        System.assertEquals(expectedResponse, response);
    }
}