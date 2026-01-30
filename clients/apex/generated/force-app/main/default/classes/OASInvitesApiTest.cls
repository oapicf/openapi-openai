@isTest
private class OASInvitesApiTest {
    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     *
     * 
     */
    @isTest
    private static void deleteInviteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'inviteId' => 'null'
        };

        OASClient client;
        OASInvitesApi api;
        OASInviteDeleteResponse response;
        OASInviteDeleteResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASInvitesApi(client);

        js = JSON.serialize(OASInviteDeleteResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInviteDeleteResponse.getExample();
        response = (OASInviteDeleteResponse) api.deleteInvite(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     *
     * 
     */
    @isTest
    private static void inviteUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSInviteRequest' => ''
        };

        OASClient client;
        OASInvitesApi api;
        OASInvite response;
        OASInvite expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASInvitesApi(client);

        js = JSON.serialize(OASInvite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInvite.getExample();
        response = (OASInvite) api.inviteUser(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of invites in the organization.
     *
     * 
     */
    @isTest
    private static void listInvitesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'after' => 'null'
        };

        OASClient client;
        OASInvitesApi api;
        OASInviteListResponse response;
        OASInviteListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASInvitesApi(client);

        js = JSON.serialize(OASInviteListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInviteListResponse.getExample();
        response = (OASInviteListResponse) api.listInvites(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves an invite.
     *
     * 
     */
    @isTest
    private static void retrieveInviteTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'inviteId' => 'null'
        };

        OASClient client;
        OASInvitesApi api;
        OASInvite response;
        OASInvite expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASInvitesApi(client);

        js = JSON.serialize(OASInvite.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASInvite.getExample();
        response = (OASInvite) api.retrieveInvite(params);
        System.assertEquals(expectedResponse, response);
    }
}