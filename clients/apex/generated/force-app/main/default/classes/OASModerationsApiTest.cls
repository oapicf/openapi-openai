@isTest
private class OASModerationsApiTest {
    /**
     * Classifies if text and/or image inputs are potentially harmful. Learn\nmore in the [moderation guide](/docs/guides/moderation).\n
     *
     * 
     */
    @isTest
    private static void createModerationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateModerationRequest' => ''
        };

        OASClient client;
        OASModerationsApi api;
        OASCreateModerationResponse response;
        OASCreateModerationResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModerationsApi(client);

        js = JSON.serialize(OASCreateModerationResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateModerationResponse.getExample();
        response = (OASCreateModerationResponse) api.createModeration(params);
        System.assertEquals(expectedResponse, response);
    }
}