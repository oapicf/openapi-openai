@isTest
private class OASChatApiTest {
    /**
     * Creates a model response for the given chat conversation. Learn more in the\n[text generation](/docs/guides/text-generation), [vision](/docs/guides/vision),\nand [audio](/docs/guides/audio) guides.\n\nParameter support can differ depending on the model used to generate the\nresponse, particularly for newer reasoning models. Parameters that are only\nsupported for reasoning models are noted below. For the current state of \nunsupported parameters in reasoning models, \n[refer to the reasoning guide](/docs/guides/reasoning).\n
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