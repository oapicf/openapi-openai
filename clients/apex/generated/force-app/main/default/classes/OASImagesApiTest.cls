@isTest
private class OASImagesApiTest {
    /**
     * Creates an image given a prompt.
     *
     * 
     */
    @isTest
    private static void createImageTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCreateImageRequest' => ''
        };

        OASClient client;
        OASImagesApi api;
        OASImagesResponse response;
        OASImagesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASImagesApi(client);

        js = JSON.serialize(OASImagesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASImagesResponse.getExample();
        response = (OASImagesResponse) api.createImage(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     * 
     */
    @isTest
    private static void createImageEditTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'image' => Blob.valueOf('Sample text file\nContents'),
            'prompt' => 'null',
            'mask' => Blob.valueOf('Sample text file\nContents'),
            'model' => '',
            'n' => '',
            'size' => 'null',
            'responseFormat' => 'null',
            'user' => 'null'
        };

        OASClient client;
        OASImagesApi api;
        OASImagesResponse response;
        OASImagesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASImagesApi(client);

        js = JSON.serialize(OASImagesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASImagesResponse.getExample();
        response = (OASImagesResponse) api.createImageEdit(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Creates a variation of a given image.
     *
     * 
     */
    @isTest
    private static void createImageVariationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'image' => Blob.valueOf('Sample text file\nContents'),
            'model' => '',
            'n' => '',
            'responseFormat' => 'null',
            'size' => 'null',
            'user' => 'null'
        };

        OASClient client;
        OASImagesApi api;
        OASImagesResponse response;
        OASImagesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASImagesApi(client);

        js = JSON.serialize(OASImagesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASImagesResponse.getExample();
        response = (OASImagesResponse) api.createImageVariation(params);
        System.assertEquals(expectedResponse, response);
    }
}