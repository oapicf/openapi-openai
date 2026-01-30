@isTest
private class OASProjectsApiTest {
    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     *
     * 
     */
    @isTest
    private static void archiveProjectTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProject response;
        OASProject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProject.getExample();
        response = (OASProject) api.archiveProject(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     *
     * 
     */
    @isTest
    private static void createProjectTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSProjectCreateRequest' => ''
        };

        OASClient client;
        OASProjectsApi api;
        OASProject response;
        OASProject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProject.getExample();
        response = (OASProject) api.createProject(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     *
     * 
     */
    @isTest
    private static void createProjectServiceAccountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'oaSProjectServiceAccountCreateReques' => ''
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectServiceAccountCreateRespon response;
        OASProjectServiceAccountCreateRespon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectServiceAccountCreateRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectServiceAccountCreateRespon.getExample();
        response = (OASProjectServiceAccountCreateRespon) api.createProjectServiceAccount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProjectServiceAccountCreateRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectServiceAccountCreateRespon.getExample();
        response = (OASProjectServiceAccountCreateRespon) api.createProjectServiceAccount(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     *
     * 
     */
    @isTest
    private static void createProjectUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'oaSProjectUserCreateRequest' => ''
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectUser response;
        OASProjectUser expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUser.getExample();
        response = (OASProjectUser) api.createProjectUser(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProjectUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUser.getExample();
        response = (OASProjectUser) api.createProjectUser(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Deletes an API key from the project.
     *
     * 
     */
    @isTest
    private static void deleteProjectApiKeyTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'keyId' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectApiKeyDeleteResponse response;
        OASProjectApiKeyDeleteResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectApiKeyDeleteResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectApiKeyDeleteResponse.getExample();
        response = (OASProjectApiKeyDeleteResponse) api.deleteProjectApiKey(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProjectApiKeyDeleteResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectApiKeyDeleteResponse.getExample();
        response = (OASProjectApiKeyDeleteResponse) api.deleteProjectApiKey(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Deletes a service account from the project.
     *
     * 
     */
    @isTest
    private static void deleteProjectServiceAccountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'serviceAccountId' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectServiceAccountDeleteRespon response;
        OASProjectServiceAccountDeleteRespon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectServiceAccountDeleteRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectServiceAccountDeleteRespon.getExample();
        response = (OASProjectServiceAccountDeleteRespon) api.deleteProjectServiceAccount(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Deletes a user from the project.
     *
     * 
     */
    @isTest
    private static void deleteProjectUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'userId' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectUserDeleteResponse response;
        OASProjectUserDeleteResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectUserDeleteResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUserDeleteResponse.getExample();
        response = (OASProjectUserDeleteResponse) api.deleteProjectUser(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProjectUserDeleteResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUserDeleteResponse.getExample();
        response = (OASProjectUserDeleteResponse) api.deleteProjectUser(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of API keys in the project.
     *
     * 
     */
    @isTest
    private static void listProjectApiKeysTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'r_limit' => '',
            'after' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectApiKeyListResponse response;
        OASProjectApiKeyListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectApiKeyListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectApiKeyListResponse.getExample();
        response = (OASProjectApiKeyListResponse) api.listProjectApiKeys(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns the rate limits per model for a project.
     *
     * 
     */
    @isTest
    private static void listProjectRateLimitsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'r_limit' => '',
            'after' => 'null',
            'before' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectRateLimitListResponse response;
        OASProjectRateLimitListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectRateLimitListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectRateLimitListResponse.getExample();
        response = (OASProjectRateLimitListResponse) api.listProjectRateLimits(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of service accounts in the project.
     *
     * 
     */
    @isTest
    private static void listProjectServiceAccountsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'r_limit' => '',
            'after' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectServiceAccountListResponse response;
        OASProjectServiceAccountListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectServiceAccountListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectServiceAccountListResponse.getExample();
        response = (OASProjectServiceAccountListResponse) api.listProjectServiceAccounts(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProjectServiceAccountListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectServiceAccountListResponse.getExample();
        response = (OASProjectServiceAccountListResponse) api.listProjectServiceAccounts(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of users in the project.
     *
     * 
     */
    @isTest
    private static void listProjectUsersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'r_limit' => '',
            'after' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectUserListResponse response;
        OASProjectUserListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectUserListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUserListResponse.getExample();
        response = (OASProjectUserListResponse) api.listProjectUsers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProjectUserListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUserListResponse.getExample();
        response = (OASProjectUserListResponse) api.listProjectUsers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of projects.
     *
     * 
     */
    @isTest
    private static void listProjectsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'after' => 'null',
            'includeArchived' => ''
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectListResponse response;
        OASProjectListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectListResponse.getExample();
        response = (OASProjectListResponse) api.listProjects(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Modifies a project in the organization.
     *
     * 
     */
    @isTest
    private static void modifyProjectTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'oaSProjectUpdateRequest' => ''
        };

        OASClient client;
        OASProjectsApi api;
        OASProject response;
        OASProject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProject.getExample();
        response = (OASProject) api.modifyProject(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProject.getExample();
        response = (OASProject) api.modifyProject(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Modifies a user\&#39;s role in the project.
     *
     * 
     */
    @isTest
    private static void modifyProjectUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'userId' => 'null',
            'oaSProjectUserUpdateRequest' => ''
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectUser response;
        OASProjectUser expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUser.getExample();
        response = (OASProjectUser) api.modifyProjectUser(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProjectUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUser.getExample();
        response = (OASProjectUser) api.modifyProjectUser(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a project.
     *
     * 
     */
    @isTest
    private static void retrieveProjectTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProject response;
        OASProject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProject.getExample();
        response = (OASProject) api.retrieveProject(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves an API key in the project.
     *
     * 
     */
    @isTest
    private static void retrieveProjectApiKeyTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'keyId' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectApiKey response;
        OASProjectApiKey expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectApiKey.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectApiKey.getExample();
        response = (OASProjectApiKey) api.retrieveProjectApiKey(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a service account in the project.
     *
     * 
     */
    @isTest
    private static void retrieveProjectServiceAccountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'serviceAccountId' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectServiceAccount response;
        OASProjectServiceAccount expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectServiceAccount.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectServiceAccount.getExample();
        response = (OASProjectServiceAccount) api.retrieveProjectServiceAccount(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a user in the project.
     *
     * 
     */
    @isTest
    private static void retrieveProjectUserTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'userId' => 'null'
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectUser response;
        OASProjectUser expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectUser.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectUser.getExample();
        response = (OASProjectUser) api.retrieveProjectUser(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Updates a project rate limit.
     *
     * 
     */
    @isTest
    private static void updateProjectRateLimitsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'projectId' => 'null',
            'rateLimitId' => 'null',
            'oaSProjectRateLimitUpdateRequest' => ''
        };

        OASClient client;
        OASProjectsApi api;
        OASProjectRateLimit response;
        OASProjectRateLimit expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASProjectsApi(client);

        js = JSON.serialize(OASProjectRateLimit.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectRateLimit.getExample();
        response = (OASProjectRateLimit) api.updateProjectRateLimits(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProjectRateLimit.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProjectRateLimit.getExample();
        response = (OASProjectRateLimit) api.updateProjectRateLimits(params);
        System.assertEquals(expectedResponse, response);
    }
}