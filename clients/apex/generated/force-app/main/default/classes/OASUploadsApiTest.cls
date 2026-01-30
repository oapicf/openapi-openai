@isTest
private class OASUploadsApiTest {
    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload. \n\nEach Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.\n\nIt is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).\n
     *
     * 
     */
    @isTest
    private static void addUploadPartTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'uploadId' => upload_abc123,
            'data' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASUploadsApi api;
        OASUploadPart response;
        OASUploadPart expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUploadsApi(client);

        js = JSON.serialize(OASUploadPart.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUploadPart.getExample();
        response = (OASUploadPart) api.addUploadPart(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled.\n
     *
     * 
     */
    @isTest
    private static void cancelUploadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'uploadId' => upload_abc123
        };

        OASClient client;
        OASUploadsApi api;
        OASUpload response;
        OASUpload expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUploadsApi(client);

        js = JSON.serialize(OASUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpload.getExample();
        response = (OASUpload) api.cancelUpload(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Completes the [Upload](/docs/api-reference/uploads/object). \n\nWithin the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.\n\nYou can specify the order of the Parts by passing in an ordered list of the Part IDs.\n\nThe number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.\n
     *
     * 
     */
    @isTest
    private static void completeUploadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'uploadId' => upload_abc123,
            'oaSCompleteUploadRequest' => ''
        };

        OASClient client;
        OASUploadsApi api;
        OASUpload response;
        OASUpload expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUploadsApi(client);

        js = JSON.serialize(OASUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpload.getExample();
        response = (OASUpload) api.completeUpload(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.\n\nOnce you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.\n\nFor certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case:\n- [Assistants](/docs/assistants/tools/file-search#supported-files)\n\nFor guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).\n
     *
     * 
     */
    @isTest
    private static void createUploadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateUploadRequest' => ''
        };

        OASClient client;
        OASUploadsApi api;
        OASUpload response;
        OASUpload expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUploadsApi(client);

        js = JSON.serialize(OASUpload.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpload.getExample();
        response = (OASUpload) api.createUpload(params);
        System.assertEquals(expectedResponse, response);
    }
}