@isTest
private class OASAudioApiTest {
    /**
     * Generates audio from the input text.
     *
     * 
     */
    @isTest
    private static void createSpeechTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateSpeechRequest' => ''
        };

        OASClient client;
        OASAudioApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudioApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode([B@ba27ce6));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode([B@ba27ce6);
        response = (Blob) api.createSpeech(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Transcribes audio into the input language.
     *
     * 
     */
    @isTest
    private static void createTranscriptionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'file' => Blob.valueOf('Sample text file\nContents'),
            'model' => '',
            'language' => 'null',
            'prompt' => 'null',
            'responseFormat' => 'null',
            'temperature' => '',
            'timestampGranularities' => new List<String>{'word'}
        };

        OASClient client;
        OASAudioApi api;
        OASCreateTranscription200Response response;
        OASCreateTranscription200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudioApi(client);

        js = JSON.serialize(OASCreateTranscription200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateTranscription200Response.getExample();
        response = (OASCreateTranscription200Response) api.createTranscription(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Translates audio into English.
     *
     * 
     */
    @isTest
    private static void createTranslationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'file' => Blob.valueOf('Sample text file\nContents'),
            'model' => '',
            'prompt' => 'null',
            'responseFormat' => 'null',
            'temperature' => ''
        };

        OASClient client;
        OASAudioApi api;
        OASCreateTranslation200Response response;
        OASCreateTranslation200Response expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASAudioApi(client);

        js = JSON.serialize(OASCreateTranslation200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateTranslation200Response.getExample();
        response = (OASCreateTranslation200Response) api.createTranslation(params);
        System.assertEquals(expectedResponse, response);
    }
}