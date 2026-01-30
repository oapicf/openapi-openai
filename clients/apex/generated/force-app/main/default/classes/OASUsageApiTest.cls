@isTest
private class OASUsageApiTest {
    /**
     * Get audio speeches usage details for the organization.
     *
     * 
     */
    @isTest
    private static void usageAudioSpeechesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1m,
            'projectIds' => new List<String>{''},
            'userIds' => new List<String>{''},
            'apiKeyIds' => new List<String>{''},
            'models' => new List<String>{''},
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageAudioSpeeches(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get audio transcriptions usage details for the organization.
     *
     * 
     */
    @isTest
    private static void usageAudioTranscriptionsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1m,
            'projectIds' => new List<String>{''},
            'userIds' => new List<String>{''},
            'apiKeyIds' => new List<String>{''},
            'models' => new List<String>{''},
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageAudioTranscriptions(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get code interpreter sessions usage details for the organization.
     *
     * 
     */
    @isTest
    private static void usageCodeInterpreterSessionsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1m,
            'projectIds' => new List<String>{''},
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageCodeInterpreterSessions(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get completions usage details for the organization.
     *
     * 
     */
    @isTest
    private static void usageCompletionsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1m,
            'projectIds' => new List<String>{''},
            'userIds' => new List<String>{''},
            'apiKeyIds' => new List<String>{''},
            'models' => new List<String>{''},
            'batch' => '',
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageCompletions(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get costs details for the organization.
     *
     * 
     */
    @isTest
    private static void usageCostsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1d,
            'projectIds' => new List<String>{''},
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageCosts(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get embeddings usage details for the organization.
     *
     * 
     */
    @isTest
    private static void usageEmbeddingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1m,
            'projectIds' => new List<String>{''},
            'userIds' => new List<String>{''},
            'apiKeyIds' => new List<String>{''},
            'models' => new List<String>{''},
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageEmbeddings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get images usage details for the organization.
     *
     * 
     */
    @isTest
    private static void usageImagesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1m,
            'sources' => new List<String>{'image.generation'},
            'sizes' => new List<String>{'256x256'},
            'projectIds' => new List<String>{''},
            'userIds' => new List<String>{''},
            'apiKeyIds' => new List<String>{''},
            'models' => new List<String>{''},
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageImages(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get moderations usage details for the organization.
     *
     * 
     */
    @isTest
    private static void usageModerationsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1m,
            'projectIds' => new List<String>{''},
            'userIds' => new List<String>{''},
            'apiKeyIds' => new List<String>{''},
            'models' => new List<String>{''},
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageModerations(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get vector stores usage details for the organization.
     *
     * 
     */
    @isTest
    private static void usageVectorStoresTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'startTime' => '',
            'endTime' => '',
            'bucketWidth' => 1m,
            'projectIds' => new List<String>{''},
            'groupBy' => new List<String>{'project_id'},
            'r_limit' => '',
            'page' => 'null'
        };

        OASClient client;
        OASUsageApi api;
        OASUsageResponse response;
        OASUsageResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUsageApi(client);

        js = JSON.serialize(OASUsageResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUsageResponse.getExample();
        response = (OASUsageResponse) api.usageVectorStores(params);
        System.assertEquals(expectedResponse, response);
    }
}