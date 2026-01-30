@isTest
private class OASVectorStoresApiTest {
    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     *
     * 
     */
    @isTest
    private static void cancelVectorStoreFileBatchTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => 'null',
            'batchId' => 'null'
        };

        OASClient client;
        OASVectorStoresApi api;
        OASVectorStoreFileBatchObject response;
        OASVectorStoreFileBatchObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASVectorStoreFileBatchObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVectorStoreFileBatchObject.getExample();
        response = (OASVectorStoreFileBatchObject) api.cancelVectorStoreFileBatch(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a vector store.
     *
     * 
     */
    @isTest
    private static void createVectorStoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateVectorStoreRequest' => ''
        };

        OASClient client;
        OASVectorStoresApi api;
        OASVectorStoreObject response;
        OASVectorStoreObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASVectorStoreObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVectorStoreObject.getExample();
        response = (OASVectorStoreObject) api.createVectorStore(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     *
     * 
     */
    @isTest
    private static void createVectorStoreFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => vs_abc123,
            'oaSCreateVectorStoreFileRequest' => ''
        };

        OASClient client;
        OASVectorStoresApi api;
        OASVectorStoreFileObject response;
        OASVectorStoreFileObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASVectorStoreFileObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVectorStoreFileObject.getExample();
        response = (OASVectorStoreFileObject) api.createVectorStoreFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a vector store file batch.
     *
     * 
     */
    @isTest
    private static void createVectorStoreFileBatchTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => vs_abc123,
            'oaSCreateVectorStoreFileBatchRequest' => ''
        };

        OASClient client;
        OASVectorStoresApi api;
        OASVectorStoreFileBatchObject response;
        OASVectorStoreFileBatchObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASVectorStoreFileBatchObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVectorStoreFileBatchObject.getExample();
        response = (OASVectorStoreFileBatchObject) api.createVectorStoreFileBatch(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete a vector store.
     *
     * 
     */
    @isTest
    private static void deleteVectorStoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => 'null'
        };

        OASClient client;
        OASVectorStoresApi api;
        OASDeleteVectorStoreResponse response;
        OASDeleteVectorStoreResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASDeleteVectorStoreResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteVectorStoreResponse.getExample();
        response = (OASDeleteVectorStoreResponse) api.deleteVectorStore(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     *
     * 
     */
    @isTest
    private static void deleteVectorStoreFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => 'null',
            'fileId' => 'null'
        };

        OASClient client;
        OASVectorStoresApi api;
        OASDeleteVectorStoreFileResponse response;
        OASDeleteVectorStoreFileResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASDeleteVectorStoreFileResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteVectorStoreFileResponse.getExample();
        response = (OASDeleteVectorStoreFileResponse) api.deleteVectorStoreFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a vector store.
     *
     * 
     */
    @isTest
    private static void getVectorStoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => 'null'
        };

        OASClient client;
        OASVectorStoresApi api;
        OASVectorStoreObject response;
        OASVectorStoreObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASVectorStoreObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVectorStoreObject.getExample();
        response = (OASVectorStoreObject) api.getVectorStore(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a vector store file.
     *
     * 
     */
    @isTest
    private static void getVectorStoreFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => vs_abc123,
            'fileId' => file-abc123
        };

        OASClient client;
        OASVectorStoresApi api;
        OASVectorStoreFileObject response;
        OASVectorStoreFileObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASVectorStoreFileObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVectorStoreFileObject.getExample();
        response = (OASVectorStoreFileObject) api.getVectorStoreFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a vector store file batch.
     *
     * 
     */
    @isTest
    private static void getVectorStoreFileBatchTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => vs_abc123,
            'batchId' => vsfb_abc123
        };

        OASClient client;
        OASVectorStoresApi api;
        OASVectorStoreFileBatchObject response;
        OASVectorStoreFileBatchObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASVectorStoreFileBatchObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVectorStoreFileBatchObject.getExample();
        response = (OASVectorStoreFileBatchObject) api.getVectorStoreFileBatch(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of vector store files in a batch.
     *
     * 
     */
    @isTest
    private static void listFilesInVectorStoreBatchTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => 'null',
            'batchId' => 'null',
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null',
            'filter' => in_progress
        };

        OASClient client;
        OASVectorStoresApi api;
        OASListVectorStoreFilesResponse response;
        OASListVectorStoreFilesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASListVectorStoreFilesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListVectorStoreFilesResponse.getExample();
        response = (OASListVectorStoreFilesResponse) api.listFilesInVectorStoreBatch(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of vector store files.
     *
     * 
     */
    @isTest
    private static void listVectorStoreFilesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => 'null',
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null',
            'filter' => in_progress
        };

        OASClient client;
        OASVectorStoresApi api;
        OASListVectorStoreFilesResponse response;
        OASListVectorStoreFilesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASListVectorStoreFilesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListVectorStoreFilesResponse.getExample();
        response = (OASListVectorStoreFilesResponse) api.listVectorStoreFiles(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of vector stores.
     *
     * 
     */
    @isTest
    private static void listVectorStoresTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null'
        };

        OASClient client;
        OASVectorStoresApi api;
        OASListVectorStoresResponse response;
        OASListVectorStoresResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASListVectorStoresResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListVectorStoresResponse.getExample();
        response = (OASListVectorStoresResponse) api.listVectorStores(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Modifies a vector store.
     *
     * 
     */
    @isTest
    private static void modifyVectorStoreTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'vectorStoreId' => 'null',
            'oaSUpdateVectorStoreRequest' => ''
        };

        OASClient client;
        OASVectorStoresApi api;
        OASVectorStoreObject response;
        OASVectorStoreObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASVectorStoresApi(client);

        js = JSON.serialize(OASVectorStoreObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVectorStoreObject.getExample();
        response = (OASVectorStoreObject) api.modifyVectorStore(params);
        System.assertEquals(expectedResponse, response);
    }
}