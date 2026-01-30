@isTest
private class OASCreateVectorStoreFileRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest1 = OASCreateVectorStoreFileRequest.getExample();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest2 = createVectorStoreFileRequest1;
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest3 = new OASCreateVectorStoreFileRequest();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest4 = createVectorStoreFileRequest3;

        System.assert(createVectorStoreFileRequest1.equals(createVectorStoreFileRequest2));
        System.assert(createVectorStoreFileRequest2.equals(createVectorStoreFileRequest1));
        System.assert(createVectorStoreFileRequest1.equals(createVectorStoreFileRequest1));
        System.assert(createVectorStoreFileRequest3.equals(createVectorStoreFileRequest4));
        System.assert(createVectorStoreFileRequest4.equals(createVectorStoreFileRequest3));
        System.assert(createVectorStoreFileRequest3.equals(createVectorStoreFileRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest1 = OASCreateVectorStoreFileRequest.getExample();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest2 = OASCreateVectorStoreFileRequest.getExample();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest3 = new OASCreateVectorStoreFileRequest();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest4 = new OASCreateVectorStoreFileRequest();

        System.assert(createVectorStoreFileRequest1.equals(createVectorStoreFileRequest2));
        System.assert(createVectorStoreFileRequest2.equals(createVectorStoreFileRequest1));
        System.assert(createVectorStoreFileRequest3.equals(createVectorStoreFileRequest4));
        System.assert(createVectorStoreFileRequest4.equals(createVectorStoreFileRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest1 = OASCreateVectorStoreFileRequest.getExample();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest2 = new OASCreateVectorStoreFileRequest();

        System.assertEquals(false, createVectorStoreFileRequest1.equals('foo'));
        System.assertEquals(false, createVectorStoreFileRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest1 = OASCreateVectorStoreFileRequest.getExample();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest2 = new OASCreateVectorStoreFileRequest();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest3;

        System.assertEquals(false, createVectorStoreFileRequest1.equals(createVectorStoreFileRequest3));
        System.assertEquals(false, createVectorStoreFileRequest2.equals(createVectorStoreFileRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest1 = OASCreateVectorStoreFileRequest.getExample();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest2 = new OASCreateVectorStoreFileRequest();

        System.assertEquals(createVectorStoreFileRequest1.hashCode(), createVectorStoreFileRequest1.hashCode());
        System.assertEquals(createVectorStoreFileRequest2.hashCode(), createVectorStoreFileRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest1 = OASCreateVectorStoreFileRequest.getExample();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest2 = OASCreateVectorStoreFileRequest.getExample();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest3 = new OASCreateVectorStoreFileRequest();
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest4 = new OASCreateVectorStoreFileRequest();

        System.assert(createVectorStoreFileRequest1.equals(createVectorStoreFileRequest2));
        System.assert(createVectorStoreFileRequest3.equals(createVectorStoreFileRequest4));
        System.assertEquals(createVectorStoreFileRequest1.hashCode(), createVectorStoreFileRequest2.hashCode());
        System.assertEquals(createVectorStoreFileRequest3.hashCode(), createVectorStoreFileRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateVectorStoreFileRequest createVectorStoreFileRequest = new OASCreateVectorStoreFileRequest();
        Map<String, String> x-property-mappings = createVectorStoreFileRequest.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
        System.assertEquals('chunkingStrategy', x-property-mappings.get('chunking_strategy'));
    }
}
