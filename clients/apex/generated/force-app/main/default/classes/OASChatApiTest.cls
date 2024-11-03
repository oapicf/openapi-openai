@isTest
private class OASChatApiTest {
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
        OASChatApi api;
        OASCreateChatCompletionResponse response;
        OASCreateChatCompletionResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASChatApi(client);

        js = JSON.serialize(OASCreateChatCompletionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatCompletionResponse.getExample();
        response = (OASCreateChatCompletionResponse) api.createChatCompletion(params);
        System.assertEquals(expectedResponse, response);
    }
}