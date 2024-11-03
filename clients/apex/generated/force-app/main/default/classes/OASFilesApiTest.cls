@isTest
private class OASFilesApiTest {
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.\n\nThe size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.\n\nPlease [contact us](https://help.openai.com/) if you need to increase these storage limits.\n
     *
     * 
     */
    @isTest
    private static void createFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'file' => Blob.valueOf('Sample text file\nContents'),
            'purpose' => 'null'
        };

        OASClient client;
        OASFilesApi api;
        OASOpenAIFile response;
        OASOpenAIFile expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFilesApi(client);

        js = JSON.serialize(OASOpenAIFile.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOpenAIFile.getExample();
        response = (OASOpenAIFile) api.createFile(params);
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
        OASFilesApi api;
        OASDeleteFileResponse response;
        OASDeleteFileResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFilesApi(client);

        js = JSON.serialize(OASDeleteFileResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteFileResponse.getExample();
        response = (OASDeleteFileResponse) api.deleteFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns the contents of the specified file.
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
        OASFilesApi api;
        String response;
        String expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFilesApi(client);
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

        Map<String, Object> params = new Map<String, Object>{
            'purpose' => 'null'
        };

        OASClient client;
        OASFilesApi api;
        OASListFilesResponse response;
        OASListFilesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFilesApi(client);

        js = JSON.serialize(OASListFilesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListFilesResponse.getExample();
        response = (OASListFilesResponse) api.listFiles(params);
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
        OASFilesApi api;
        OASOpenAIFile response;
        OASOpenAIFile expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFilesApi(client);

        js = JSON.serialize(OASOpenAIFile.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASOpenAIFile.getExample();
        response = (OASOpenAIFile) api.retrieveFile(params);
        System.assertEquals(expectedResponse, response);
    }
}