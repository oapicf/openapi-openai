@isTest
private class OASUsersApiTest {
    /**
     * Deletes a user from the organization.
     *
     * 
     */
    @isTest
    private static void deleteUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 'null'
        };

        OASClient client;
        OASUsersApi api;
        OASUserDeleteResponse response;
        OASUserDeleteResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsersApi(client);

        js = JSON.serialize(OASUserDeleteResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserDeleteResponse.getExample();
        response = (OASUserDeleteResponse) api.deleteUser(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Lists all of the users in the organization.
     *
     * 
     */
    @isTest
    private static void listUsersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'after' => 'null'
        };

        OASClient client;
        OASUsersApi api;
        OASUserListResponse response;
        OASUserListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsersApi(client);

        js = JSON.serialize(OASUserListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUserListResponse.getExample();
        response = (OASUserListResponse) api.listUsers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Modifies a user\&#39;s role in the organization.
     *
     * 
     */
    @isTest
    private static void modifyUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 'null',
            'oaSUserRoleUpdateRequest' => ''
        };

        OASClient client;
        OASUsersApi api;
        OASUser response;
        OASUser expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsersApi(client);

        js = JSON.serialize(OASUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUser.getExample();
        response = (OASUser) api.modifyUser(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a user by their identifier.
     *
     * 
     */
    @isTest
    private static void retrieveUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'userId' => 'null'
        };

        OASClient client;
        OASUsersApi api;
        OASUser response;
        OASUser expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsersApi(client);

        js = JSON.serialize(OASUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUser.getExample();
        response = (OASUser) api.retrieveUser(params);
        System.assertEquals(expectedResponse, response);
    }
}