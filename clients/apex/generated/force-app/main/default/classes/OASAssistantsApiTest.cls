@isTest
private class OASAssistantsApiTest {
    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     *
     * 
     */
    @isTest
    private static void cancelRunTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'runId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASRunObject response;
        OASRunObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASRunObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRunObject.getExample();
        response = (OASRunObject) api.cancelRun(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create an assistant with a model and instructions.
     *
     * 
     */
    @isTest
    private static void createAssistantTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateAssistantRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASAssistantObject response;
        OASAssistantObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASAssistantObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssistantObject.getExample();
        response = (OASAssistantObject) api.createAssistant(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     *
     * 
     */
    @isTest
    private static void createAssistantFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'assistantId' => file-abc123,
            'oaSCreateAssistantFileRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASAssistantFileObject response;
        OASAssistantFileObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASAssistantFileObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssistantFileObject.getExample();
        response = (OASAssistantFileObject) api.createAssistantFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a message.
     *
     * 
     */
    @isTest
    private static void createMessageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'oaSCreateMessageRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASMessageObject response;
        OASMessageObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASMessageObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMessageObject.getExample();
        response = (OASMessageObject) api.createMessage(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a run.
     *
     * 
     */
    @isTest
    private static void createRunTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'oaSCreateRunRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASRunObject response;
        OASRunObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASRunObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRunObject.getExample();
        response = (OASRunObject) api.createRun(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a thread.
     *
     * 
     */
    @isTest
    private static void createThreadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateThreadRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASThreadObject response;
        OASThreadObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASThreadObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASThreadObject.getExample();
        response = (OASThreadObject) api.createThread(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Create a thread and run it in one request.
     *
     * 
     */
    @isTest
    private static void createThreadAndRunTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateThreadAndRunRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASRunObject response;
        OASRunObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASRunObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRunObject.getExample();
        response = (OASRunObject) api.createThreadAndRun(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete an assistant.
     *
     * 
     */
    @isTest
    private static void deleteAssistantTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'assistantId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASDeleteAssistantResponse response;
        OASDeleteAssistantResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASDeleteAssistantResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteAssistantResponse.getExample();
        response = (OASDeleteAssistantResponse) api.deleteAssistant(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete an assistant file.
     *
     * 
     */
    @isTest
    private static void deleteAssistantFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'assistantId' => 'null',
            'fileId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASDeleteAssistantFileResponse response;
        OASDeleteAssistantFileResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASDeleteAssistantFileResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteAssistantFileResponse.getExample();
        response = (OASDeleteAssistantFileResponse) api.deleteAssistantFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Delete a thread.
     *
     * 
     */
    @isTest
    private static void deleteThreadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASDeleteThreadResponse response;
        OASDeleteThreadResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASDeleteThreadResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteThreadResponse.getExample();
        response = (OASDeleteThreadResponse) api.deleteThread(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves an assistant.
     *
     * 
     */
    @isTest
    private static void getAssistantTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'assistantId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASAssistantObject response;
        OASAssistantObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASAssistantObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssistantObject.getExample();
        response = (OASAssistantObject) api.getAssistant(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves an AssistantFile.
     *
     * 
     */
    @isTest
    private static void getAssistantFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'assistantId' => 'null',
            'fileId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASAssistantFileObject response;
        OASAssistantFileObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASAssistantFileObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssistantFileObject.getExample();
        response = (OASAssistantFileObject) api.getAssistantFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieve a message.
     *
     * 
     */
    @isTest
    private static void getMessageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'messageId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASMessageObject response;
        OASMessageObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASMessageObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMessageObject.getExample();
        response = (OASMessageObject) api.getMessage(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a message file.
     *
     * 
     */
    @isTest
    private static void getMessageFileTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => thread_abc123,
            'messageId' => msg_abc123,
            'fileId' => file-abc123
        };

        OASClient client;
        OASAssistantsApi api;
        OASMessageFileObject response;
        OASMessageFileObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASMessageFileObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMessageFileObject.getExample();
        response = (OASMessageFileObject) api.getMessageFile(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a run.
     *
     * 
     */
    @isTest
    private static void getRunTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'runId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASRunObject response;
        OASRunObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASRunObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRunObject.getExample();
        response = (OASRunObject) api.getRun(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a run step.
     *
     * 
     */
    @isTest
    private static void getRunStepTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'runId' => 'null',
            'stepId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASRunStepObject response;
        OASRunStepObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASRunStepObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRunStepObject.getExample();
        response = (OASRunStepObject) api.getRunStep(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a thread.
     *
     * 
     */
    @isTest
    private static void getThreadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASThreadObject response;
        OASThreadObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASThreadObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASThreadObject.getExample();
        response = (OASThreadObject) api.getThread(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of assistant files.
     *
     * 
     */
    @isTest
    private static void listAssistantFilesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'assistantId' => 'null',
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASListAssistantFilesResponse response;
        OASListAssistantFilesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASListAssistantFilesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListAssistantFilesResponse.getExample();
        response = (OASListAssistantFilesResponse) api.listAssistantFiles(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of assistants.
     *
     * 
     */
    @isTest
    private static void listAssistantsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASListAssistantsResponse response;
        OASListAssistantsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASListAssistantsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListAssistantsResponse.getExample();
        response = (OASListAssistantsResponse) api.listAssistants(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of message files.
     *
     * 
     */
    @isTest
    private static void listMessageFilesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'messageId' => 'null',
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASListMessageFilesResponse response;
        OASListMessageFilesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASListMessageFilesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListMessageFilesResponse.getExample();
        response = (OASListMessageFilesResponse) api.listMessageFiles(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of messages for a given thread.
     *
     * 
     */
    @isTest
    private static void listMessagesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null',
            'runId' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASListMessagesResponse response;
        OASListMessagesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASListMessagesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListMessagesResponse.getExample();
        response = (OASListMessagesResponse) api.listMessages(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of run steps belonging to a run.
     *
     * 
     */
    @isTest
    private static void listRunStepsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'runId' => 'null',
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASListRunStepsResponse response;
        OASListRunStepsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASListRunStepsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListRunStepsResponse.getExample();
        response = (OASListRunStepsResponse) api.listRunSteps(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Returns a list of runs belonging to a thread.
     *
     * 
     */
    @isTest
    private static void listRunsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'r_limit' => '',
            'order' => asc,
            'after' => 'null',
            'before' => 'null'
        };

        OASClient client;
        OASAssistantsApi api;
        OASListRunsResponse response;
        OASListRunsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASListRunsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListRunsResponse.getExample();
        response = (OASListRunsResponse) api.listRuns(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Modifies an assistant.
     *
     * 
     */
    @isTest
    private static void modifyAssistantTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'assistantId' => 'null',
            'oaSModifyAssistantRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASAssistantObject response;
        OASAssistantObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASAssistantObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAssistantObject.getExample();
        response = (OASAssistantObject) api.modifyAssistant(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Modifies a message.
     *
     * 
     */
    @isTest
    private static void modifyMessageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'messageId' => 'null',
            'oaSModifyMessageRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASMessageObject response;
        OASMessageObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASMessageObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMessageObject.getExample();
        response = (OASMessageObject) api.modifyMessage(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Modifies a run.
     *
     * 
     */
    @isTest
    private static void modifyRunTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'runId' => 'null',
            'oaSModifyRunRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASRunObject response;
        OASRunObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASRunObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRunObject.getExample();
        response = (OASRunObject) api.modifyRun(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Modifies a thread.
     *
     * 
     */
    @isTest
    private static void modifyThreadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'oaSModifyThreadRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASThreadObject response;
        OASThreadObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASThreadObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASThreadObject.getExample();
        response = (OASThreadObject) api.modifyThread(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * When a run has the &#x60;status: &quot;requires_action&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they\&#39;re all completed. All outputs must be submitted in a single request.\n
     *
     * 
     */
    @isTest
    private static void submitToolOuputsToRunTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'threadId' => 'null',
            'runId' => 'null',
            'oaSSubmitToolOutputsRunRequest' => ''
        };

        OASClient client;
        OASAssistantsApi api;
        OASRunObject response;
        OASRunObject expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAssistantsApi(client);

        js = JSON.serialize(OASRunObject.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRunObject.getExample();
        response = (OASRunObject) api.submitToolOuputsToRun(params);
        System.assertEquals(expectedResponse, response);
    }
}