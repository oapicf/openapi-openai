@isTest
private class OASCreateUploadRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateUploadRequest createUploadRequest1 = OASCreateUploadRequest.getExample();
        OASCreateUploadRequest createUploadRequest2 = createUploadRequest1;
        OASCreateUploadRequest createUploadRequest3 = new OASCreateUploadRequest();
        OASCreateUploadRequest createUploadRequest4 = createUploadRequest3;

        System.assert(createUploadRequest1.equals(createUploadRequest2));
        System.assert(createUploadRequest2.equals(createUploadRequest1));
        System.assert(createUploadRequest1.equals(createUploadRequest1));
        System.assert(createUploadRequest3.equals(createUploadRequest4));
        System.assert(createUploadRequest4.equals(createUploadRequest3));
        System.assert(createUploadRequest3.equals(createUploadRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateUploadRequest createUploadRequest1 = OASCreateUploadRequest.getExample();
        OASCreateUploadRequest createUploadRequest2 = OASCreateUploadRequest.getExample();
        OASCreateUploadRequest createUploadRequest3 = new OASCreateUploadRequest();
        OASCreateUploadRequest createUploadRequest4 = new OASCreateUploadRequest();

        System.assert(createUploadRequest1.equals(createUploadRequest2));
        System.assert(createUploadRequest2.equals(createUploadRequest1));
        System.assert(createUploadRequest3.equals(createUploadRequest4));
        System.assert(createUploadRequest4.equals(createUploadRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateUploadRequest createUploadRequest1 = OASCreateUploadRequest.getExample();
        OASCreateUploadRequest createUploadRequest2 = new OASCreateUploadRequest();

        System.assertEquals(false, createUploadRequest1.equals('foo'));
        System.assertEquals(false, createUploadRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateUploadRequest createUploadRequest1 = OASCreateUploadRequest.getExample();
        OASCreateUploadRequest createUploadRequest2 = new OASCreateUploadRequest();
        OASCreateUploadRequest createUploadRequest3;

        System.assertEquals(false, createUploadRequest1.equals(createUploadRequest3));
        System.assertEquals(false, createUploadRequest2.equals(createUploadRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateUploadRequest createUploadRequest1 = OASCreateUploadRequest.getExample();
        OASCreateUploadRequest createUploadRequest2 = new OASCreateUploadRequest();

        System.assertEquals(createUploadRequest1.hashCode(), createUploadRequest1.hashCode());
        System.assertEquals(createUploadRequest2.hashCode(), createUploadRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateUploadRequest createUploadRequest1 = OASCreateUploadRequest.getExample();
        OASCreateUploadRequest createUploadRequest2 = OASCreateUploadRequest.getExample();
        OASCreateUploadRequest createUploadRequest3 = new OASCreateUploadRequest();
        OASCreateUploadRequest createUploadRequest4 = new OASCreateUploadRequest();

        System.assert(createUploadRequest1.equals(createUploadRequest2));
        System.assert(createUploadRequest3.equals(createUploadRequest4));
        System.assertEquals(createUploadRequest1.hashCode(), createUploadRequest2.hashCode());
        System.assertEquals(createUploadRequest3.hashCode(), createUploadRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateUploadRequest createUploadRequest = new OASCreateUploadRequest();
        Map<String, String> x-property-mappings = createUploadRequest.getx-property-mappings();
        System.assertEquals('mimeType', x-property-mappings.get('mime_type'));
    }
}
