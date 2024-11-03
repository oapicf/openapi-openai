@isTest
private class OASCompletionsApiTest {
    /**
     * Creates a completion for the provided prompt and parameters.
     *
     * 
     */
    @isTest
    private static void createCompletionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateCompletionRequest' => ''
        };

        OASClient client;
        OASCompletionsApi api;
        OASCreateCompletionResponse response;
        OASCreateCompletionResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCompletionsApi(client);

        js = JSON.serialize(OASCreateCompletionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateCompletionResponse.getExample();
        response = (OASCreateCompletionResponse) api.createCompletion(params);
        System.assertEquals(expectedResponse, response);
    }
}