@isTest
private class OASCreateImageRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateImageRequest createImageRequest1 = OASCreateImageRequest.getExample();
        OASCreateImageRequest createImageRequest2 = createImageRequest1;
        OASCreateImageRequest createImageRequest3 = new OASCreateImageRequest();
        OASCreateImageRequest createImageRequest4 = createImageRequest3;

        System.assert(createImageRequest1.equals(createImageRequest2));
        System.assert(createImageRequest2.equals(createImageRequest1));
        System.assert(createImageRequest1.equals(createImageRequest1));
        System.assert(createImageRequest3.equals(createImageRequest4));
        System.assert(createImageRequest4.equals(createImageRequest3));
        System.assert(createImageRequest3.equals(createImageRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateImageRequest createImageRequest1 = OASCreateImageRequest.getExample();
        OASCreateImageRequest createImageRequest2 = OASCreateImageRequest.getExample();
        OASCreateImageRequest createImageRequest3 = new OASCreateImageRequest();
        OASCreateImageRequest createImageRequest4 = new OASCreateImageRequest();

        System.assert(createImageRequest1.equals(createImageRequest2));
        System.assert(createImageRequest2.equals(createImageRequest1));
        System.assert(createImageRequest3.equals(createImageRequest4));
        System.assert(createImageRequest4.equals(createImageRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateImageRequest createImageRequest1 = OASCreateImageRequest.getExample();
        OASCreateImageRequest createImageRequest2 = new OASCreateImageRequest();

        System.assertEquals(false, createImageRequest1.equals('foo'));
        System.assertEquals(false, createImageRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateImageRequest createImageRequest1 = OASCreateImageRequest.getExample();
        OASCreateImageRequest createImageRequest2 = new OASCreateImageRequest();
        OASCreateImageRequest createImageRequest3;

        System.assertEquals(false, createImageRequest1.equals(createImageRequest3));
        System.assertEquals(false, createImageRequest2.equals(createImageRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateImageRequest createImageRequest1 = OASCreateImageRequest.getExample();
        OASCreateImageRequest createImageRequest2 = new OASCreateImageRequest();

        System.assertEquals(createImageRequest1.hashCode(), createImageRequest1.hashCode());
        System.assertEquals(createImageRequest2.hashCode(), createImageRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateImageRequest createImageRequest1 = OASCreateImageRequest.getExample();
        OASCreateImageRequest createImageRequest2 = OASCreateImageRequest.getExample();
        OASCreateImageRequest createImageRequest3 = new OASCreateImageRequest();
        OASCreateImageRequest createImageRequest4 = new OASCreateImageRequest();

        System.assert(createImageRequest1.equals(createImageRequest2));
        System.assert(createImageRequest3.equals(createImageRequest4));
        System.assertEquals(createImageRequest1.hashCode(), createImageRequest2.hashCode());
        System.assertEquals(createImageRequest3.hashCode(), createImageRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateImageRequest createImageRequest = new OASCreateImageRequest();
        Map<String, String> x-property-mappings = createImageRequest.getx-property-mappings();
        System.assertEquals('responseFormat', x-property-mappings.get('response_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateImageRequest createImageRequest = new OASCreateImageRequest();
        System.assertEquals(1, createImageRequest.n);
        System.assertEquals(SizeEnum._1024X1024, createImageRequest.size);
        System.assertEquals(ResponseFormatEnum.URL, createImageRequest.responseFormat);
        System.assertEquals(null, createImageRequest.prompt);
        System.assertEquals(null, createImageRequest.user);
    }
}
