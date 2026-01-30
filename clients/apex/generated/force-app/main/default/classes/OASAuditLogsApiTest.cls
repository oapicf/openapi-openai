@isTest
private class OASAuditLogsApiTest {
    /**
     * List user actions and configuration changes within this organization.
     *
     * 
     */
    @isTest
    private static void listAuditLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'effectiveAt' => '',
            'projectIds' => new List<String>{''},
            'eventTypes' => new List<OASAuditLogEventType>{OASAuditLogEventType.getExample()},
            'actorIds' => new List<String>{''},
            'actorEmails' => new List<String>{''},
            'resourceIds' => new List<String>{''},
            'r_limit' => '',
            'after' => 'null',
            'before' => 'null'
        };

        OASClient client;
        OASAuditLogsApi api;
        OASListAuditLogsResponse response;
        OASListAuditLogsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAuditLogsApi(client);

        js = JSON.serialize(OASListAuditLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListAuditLogsResponse.getExample();
        response = (OASListAuditLogsResponse) api.listAuditLogs(params);
        System.assertEquals(expectedResponse, response);
    }
}