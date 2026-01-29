@isTest
private class OASFineTuningApiTest {
    /**
     * Immediately cancel a fine-tune job.\n
     *
     * 
     */
    @isTest
    private static void cancelFineTuningJobTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fineTuningJobId' => ft-AF1WoRqd3aJAHsqc9NY7iL8F
        };

        OASClient client;
        OASFineTuningApi api;
        OASFineTuningJob response;
        OASFineTuningJob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFineTuningApi(client);

        js = JSON.serialize(OASFineTuningJob.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFineTuningJob.getExample();
        response = (OASFineTuningJob) api.cancelFineTuningJob(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.\n\nResponse includes details of the enqueued job including job status and the name of the fine-tuned models once complete.\n\n[Learn more about fine-tuning](/docs/guides/fine-tuning)\n
     *
     * 
     */
    @isTest
    private static void createFineTuningJobTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateFineTuningJobRequest' => ''
        };

        OASClient client;
        OASFineTuningApi api;
        OASFineTuningJob response;
        OASFineTuningJob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFineTuningApi(client);

        js = JSON.serialize(OASFineTuningJob.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFineTuningJob.getExample();
        response = (OASFineTuningJob) api.createFineTuningJob(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get status updates for a fine-tuning job.\n
     *
     * 
     */
    @isTest
    private static void listFineTuningEventsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fineTuningJobId' => ft-AF1WoRqd3aJAHsqc9NY7iL8F,
            'after' => 'null',
            'r_limit' => ''
        };

        OASClient client;
        OASFineTuningApi api;
        OASListFineTuningJobEventsResponse response;
        OASListFineTuningJobEventsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFineTuningApi(client);

        js = JSON.serialize(OASListFineTuningJobEventsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListFineTuningJobEventsResponse.getExample();
        response = (OASListFineTuningJobEventsResponse) api.listFineTuningEvents(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List checkpoints for a fine-tuning job.\n
     *
     * 
     */
    @isTest
    private static void listFineTuningJobCheckpointsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fineTuningJobId' => ft-AF1WoRqd3aJAHsqc9NY7iL8F,
            'after' => 'null',
            'r_limit' => ''
        };

        OASClient client;
        OASFineTuningApi api;
        OASListFineTuningJobCheckpointsRespo response;
        OASListFineTuningJobCheckpointsRespo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFineTuningApi(client);

        js = JSON.serialize(OASListFineTuningJobCheckpointsRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListFineTuningJobCheckpointsRespo.getExample();
        response = (OASListFineTuningJobCheckpointsRespo) api.listFineTuningJobCheckpoints(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List your organization\&#39;s fine-tuning jobs\n
     *
     * 
     */
    @isTest
    private static void listPaginatedFineTuningJobsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'after' => 'null',
            'r_limit' => ''
        };

        OASClient client;
        OASFineTuningApi api;
        OASListPaginatedFineTuningJobsRespon response;
        OASListPaginatedFineTuningJobsRespon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFineTuningApi(client);

        js = JSON.serialize(OASListPaginatedFineTuningJobsRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListPaginatedFineTuningJobsRespon.getExample();
        response = (OASListPaginatedFineTuningJobsRespon) api.listPaginatedFineTuningJobs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get info about a fine-tuning job.\n\n[Learn more about fine-tuning](/docs/guides/fine-tuning)\n
     *
     * 
     */
    @isTest
    private static void retrieveFineTuningJobTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'fineTuningJobId' => ft-AF1WoRqd3aJAHsqc9NY7iL8F
        };

        OASClient client;
        OASFineTuningApi api;
        OASFineTuningJob response;
        OASFineTuningJob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFineTuningApi(client);

        js = JSON.serialize(OASFineTuningJob.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASFineTuningJob.getExample();
        response = (OASFineTuningJob) api.retrieveFineTuningJob(params);
        System.assertEquals(expectedResponse, response);
    }
}