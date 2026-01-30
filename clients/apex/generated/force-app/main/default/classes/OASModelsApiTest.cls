@isTest
private class OASModelsApiTest {
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     *
     * 
     */
    @isTest
    private static void deleteModelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'model' => ft:gpt-4o-mini:acemeco:suffix:abc123
        };

        OASClient client;
        OASModelsApi api;
        OASDeleteModelResponse response;
        OASDeleteModelResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModelsApi(client);

        js = JSON.serialize(OASDeleteModelResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteModelResponse.getExample();
        response = (OASDeleteModelResponse) api.deleteModel(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * 
     */
    @isTest
    private static void listModelsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASModelsApi api;
        OASListModelsResponse response;
        OASListModelsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModelsApi(client);

        js = JSON.serialize(OASListModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASListModelsResponse.getExample();
        response = (OASListModelsResponse) api.listModels();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * 
     */
    @isTest
    private static void retrieveModelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'model' => gpt-4o-mini
        };

        OASClient client;
        OASModelsApi api;
        OASModel response;
        OASModel expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModelsApi(client);

        js = JSON.serialize(OASModel.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASModel.getExample();
        response = (OASModel) api.retrieveModel(params);
        System.assertEquals(expectedResponse, response);
    }
}