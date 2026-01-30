@isTest
private class OASBatchApiTest {
    /**
     * Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
     *
     * 
     */
    @isTest
    private static void cancelBatchTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'batchId' => 'null'
        };

        OASClient client;
        OASBatchApi api;
        OASBatch response;
        OASBatch expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBatchApi(client);

        js = JSON.serialize(OASBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBatch.getExample();
        response = (OASBatch) api.cancelBatch(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     *
     * 
     */
    @isTest
    private static void createBatchTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateBatchRequest' => ''
        };

        OASClient client;
        OASBatchApi api;
        OASBatch response;
        OASBatch expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBatchApi(client);

        js = JSON.serialize(OASBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBatch.getExample();
        response = (OASBatch) api.createBatch(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List your organization\&#39;s batches.
     *
     * 
     */
    @isTest
    private static void listBatchesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'after' => 'null',
            'r_limit' => ''
        };

        OASClient client;
        OASBatchApi api;
        OASListBatchesResponse response;
        OASListBatchesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBatchApi(client);

        js = JSON.serialize(OASListBatchesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListBatchesResponse.getExample();
        response = (OASListBatchesResponse) api.listBatches(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a batch.
     *
     * 
     */
    @isTest
    private static void retrieveBatchTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'batchId' => 'null'
        };

        OASClient client;
        OASBatchApi api;
        OASBatch response;
        OASBatch expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBatchApi(client);

        js = JSON.serialize(OASBatch.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBatch.getExample();
        response = (OASBatch) api.retrieveBatch(params);
        System.assertEquals(expectedResponse, response);
    }
}