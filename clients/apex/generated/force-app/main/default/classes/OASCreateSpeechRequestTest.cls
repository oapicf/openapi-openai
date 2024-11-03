@isTest
private class OASCreateSpeechRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateSpeechRequest createSpeechRequest1 = OASCreateSpeechRequest.getExample();
        OASCreateSpeechRequest createSpeechRequest2 = createSpeechRequest1;
        OASCreateSpeechRequest createSpeechRequest3 = new OASCreateSpeechRequest();
        OASCreateSpeechRequest createSpeechRequest4 = createSpeechRequest3;

        System.assert(createSpeechRequest1.equals(createSpeechRequest2));
        System.assert(createSpeechRequest2.equals(createSpeechRequest1));
        System.assert(createSpeechRequest1.equals(createSpeechRequest1));
        System.assert(createSpeechRequest3.equals(createSpeechRequest4));
        System.assert(createSpeechRequest4.equals(createSpeechRequest3));
        System.assert(createSpeechRequest3.equals(createSpeechRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateSpeechRequest createSpeechRequest1 = OASCreateSpeechRequest.getExample();
        OASCreateSpeechRequest createSpeechRequest2 = OASCreateSpeechRequest.getExample();
        OASCreateSpeechRequest createSpeechRequest3 = new OASCreateSpeechRequest();
        OASCreateSpeechRequest createSpeechRequest4 = new OASCreateSpeechRequest();

        System.assert(createSpeechRequest1.equals(createSpeechRequest2));
        System.assert(createSpeechRequest2.equals(createSpeechRequest1));
        System.assert(createSpeechRequest3.equals(createSpeechRequest4));
        System.assert(createSpeechRequest4.equals(createSpeechRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateSpeechRequest createSpeechRequest1 = OASCreateSpeechRequest.getExample();
        OASCreateSpeechRequest createSpeechRequest2 = new OASCreateSpeechRequest();

        System.assertEquals(false, createSpeechRequest1.equals('foo'));
        System.assertEquals(false, createSpeechRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateSpeechRequest createSpeechRequest1 = OASCreateSpeechRequest.getExample();
        OASCreateSpeechRequest createSpeechRequest2 = new OASCreateSpeechRequest();
        OASCreateSpeechRequest createSpeechRequest3;

        System.assertEquals(false, createSpeechRequest1.equals(createSpeechRequest3));
        System.assertEquals(false, createSpeechRequest2.equals(createSpeechRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateSpeechRequest createSpeechRequest1 = OASCreateSpeechRequest.getExample();
        OASCreateSpeechRequest createSpeechRequest2 = new OASCreateSpeechRequest();

        System.assertEquals(createSpeechRequest1.hashCode(), createSpeechRequest1.hashCode());
        System.assertEquals(createSpeechRequest2.hashCode(), createSpeechRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateSpeechRequest createSpeechRequest1 = OASCreateSpeechRequest.getExample();
        OASCreateSpeechRequest createSpeechRequest2 = OASCreateSpeechRequest.getExample();
        OASCreateSpeechRequest createSpeechRequest3 = new OASCreateSpeechRequest();
        OASCreateSpeechRequest createSpeechRequest4 = new OASCreateSpeechRequest();

        System.assert(createSpeechRequest1.equals(createSpeechRequest2));
        System.assert(createSpeechRequest3.equals(createSpeechRequest4));
        System.assertEquals(createSpeechRequest1.hashCode(), createSpeechRequest2.hashCode());
        System.assertEquals(createSpeechRequest3.hashCode(), createSpeechRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateSpeechRequest createSpeechRequest = new OASCreateSpeechRequest();
        Map<String, String> x-property-mappings = createSpeechRequest.getx-property-mappings();
        System.assertEquals('responseFormat', x-property-mappings.get('response_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateSpeechRequest createSpeechRequest = new OASCreateSpeechRequest();
        System.assertEquals(ResponseFormatEnum.MP3, createSpeechRequest.responseFormat);
        System.assertEquals(1.0, createSpeechRequest.speed);
        System.assertEquals(null, createSpeechRequest.model);
        System.assertEquals(null, createSpeechRequest.input);
        System.assertEquals(null, createSpeechRequest.voice);
    }
}
