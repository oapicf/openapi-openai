@isTest
private class OASDefaultApiTest {
    /**
     * Create an organization admin API key
     *
     * Create a new admin-level API key for the organization.
     */
    @isTest
    private static void adminApiKeysCreateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSAdminApiKeysCreateRequest' => ''
        };

        OASClient client;
        OASDefaultApi api;
        OASAdminApiKey response;
        OASAdminApiKey expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASDefaultApi(client);

        js = JSON.serialize(OASAdminApiKey.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdminApiKey.getExample();
        response = (OASAdminApiKey) api.adminApiKeysCreate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete an organization admin API key
     *
     * Delete the specified admin API key.
     */
    @isTest
    private static void adminApiKeysDeleteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'keyId' => 'null'
        };

        OASClient client;
        OASDefaultApi api;
        OASAdminApiKeysDelete200Response response;
        OASAdminApiKeysDelete200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASDefaultApi(client);

        js = JSON.serialize(OASAdminApiKeysDelete200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdminApiKeysDelete200Response.getExample();
        response = (OASAdminApiKeysDelete200Response) api.adminApiKeysDelete(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieve a single organization API key
     *
     * Get details for a specific organization API key by its ID.
     */
    @isTest
    private static void adminApiKeysGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'keyId' => 'null'
        };

        OASClient client;
        OASDefaultApi api;
        OASAdminApiKey response;
        OASAdminApiKey expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASDefaultApi(client);

        js = JSON.serialize(OASAdminApiKey.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAdminApiKey.getExample();
        response = (OASAdminApiKey) api.adminApiKeysGet(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List organization API keys
     *
     * Retrieve a paginated list of organization admin API keys.
     */
    @isTest
    private static void adminApiKeysListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'after' => 'null',
            'order' => asc,
            'r_limit' => ''
        };

        OASClient client;
        OASDefaultApi api;
        OASApiKeyList response;
        OASApiKeyList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASDefaultApi(client);

        js = JSON.serialize(OASApiKeyList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASApiKeyList.getExample();
        response = (OASApiKeyList) api.adminApiKeysList(params);
        System.assertEquals(expectedResponse, response);
    }
}