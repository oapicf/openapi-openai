@isTest
private class OASEmbeddingsApiTest {
    /**
     * Creates an embedding vector representing the input text.
     *
     * 
     */
    @isTest
    private static void createEmbeddingTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateEmbeddingRequest' => ''
        };

        OASClient client;
        OASEmbeddingsApi api;
        OASCreateEmbeddingResponse response;
        OASCreateEmbeddingResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEmbeddingsApi(client);

        js = JSON.serialize(OASCreateEmbeddingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateEmbeddingResponse.getExample();
        response = (OASCreateEmbeddingResponse) api.createEmbedding(params);
        System.assertEquals(expectedResponse, response);
    }
}