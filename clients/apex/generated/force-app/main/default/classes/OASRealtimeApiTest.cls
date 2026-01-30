@isTest
private class OASRealtimeApiTest {
    /**
     * Create an ephemeral API token for use in client-side applications with the\nRealtime API. Can be configured with the same session parameters as the\n&#x60;session.update&#x60; client event.\n\nIt responds with a session object, plus a &#x60;client_secret&#x60; key which contains\na usable ephemeral API token that can be used to authenticate browser clients\nfor the Realtime API.\n
     *
     * 
     */
    @isTest
    private static void createRealtimeSessionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSRealtimeSessionCreateRequest' => ''
        };

        OASClient client;
        OASRealtimeApi api;
        OASRealtimeSessionCreateResponse response;
        OASRealtimeSessionCreateResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASRealtimeApi(client);

        js = JSON.serialize(OASRealtimeSessionCreateResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRealtimeSessionCreateResponse.getExample();
        response = (OASRealtimeSessionCreateResponse) api.createRealtimeSession(params);
        System.assertEquals(expectedResponse, response);
    }
}