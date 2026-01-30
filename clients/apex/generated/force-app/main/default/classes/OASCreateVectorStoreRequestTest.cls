@isTest
private class OASCreateVectorStoreRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateVectorStoreRequest createVectorStoreRequest1 = OASCreateVectorStoreRequest.getExample();
        OASCreateVectorStoreRequest createVectorStoreRequest2 = createVectorStoreRequest1;
        OASCreateVectorStoreRequest createVectorStoreRequest3 = new OASCreateVectorStoreRequest();
        OASCreateVectorStoreRequest createVectorStoreRequest4 = createVectorStoreRequest3;

        System.assert(createVectorStoreRequest1.equals(createVectorStoreRequest2));
        System.assert(createVectorStoreRequest2.equals(createVectorStoreRequest1));
        System.assert(createVectorStoreRequest1.equals(createVectorStoreRequest1));
        System.assert(createVectorStoreRequest3.equals(createVectorStoreRequest4));
        System.assert(createVectorStoreRequest4.equals(createVectorStoreRequest3));
        System.assert(createVectorStoreRequest3.equals(createVectorStoreRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateVectorStoreRequest createVectorStoreRequest1 = OASCreateVectorStoreRequest.getExample();
        OASCreateVectorStoreRequest createVectorStoreRequest2 = OASCreateVectorStoreRequest.getExample();
        OASCreateVectorStoreRequest createVectorStoreRequest3 = new OASCreateVectorStoreRequest();
        OASCreateVectorStoreRequest createVectorStoreRequest4 = new OASCreateVectorStoreRequest();

        System.assert(createVectorStoreRequest1.equals(createVectorStoreRequest2));
        System.assert(createVectorStoreRequest2.equals(createVectorStoreRequest1));
        System.assert(createVectorStoreRequest3.equals(createVectorStoreRequest4));
        System.assert(createVectorStoreRequest4.equals(createVectorStoreRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateVectorStoreRequest createVectorStoreRequest1 = OASCreateVectorStoreRequest.getExample();
        OASCreateVectorStoreRequest createVectorStoreRequest2 = new OASCreateVectorStoreRequest();

        System.assertEquals(false, createVectorStoreRequest1.equals('foo'));
        System.assertEquals(false, createVectorStoreRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateVectorStoreRequest createVectorStoreRequest1 = OASCreateVectorStoreRequest.getExample();
        OASCreateVectorStoreRequest createVectorStoreRequest2 = new OASCreateVectorStoreRequest();
        OASCreateVectorStoreRequest createVectorStoreRequest3;

        System.assertEquals(false, createVectorStoreRequest1.equals(createVectorStoreRequest3));
        System.assertEquals(false, createVectorStoreRequest2.equals(createVectorStoreRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateVectorStoreRequest createVectorStoreRequest1 = OASCreateVectorStoreRequest.getExample();
        OASCreateVectorStoreRequest createVectorStoreRequest2 = new OASCreateVectorStoreRequest();

        System.assertEquals(createVectorStoreRequest1.hashCode(), createVectorStoreRequest1.hashCode());
        System.assertEquals(createVectorStoreRequest2.hashCode(), createVectorStoreRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateVectorStoreRequest createVectorStoreRequest1 = OASCreateVectorStoreRequest.getExample();
        OASCreateVectorStoreRequest createVectorStoreRequest2 = OASCreateVectorStoreRequest.getExample();
        OASCreateVectorStoreRequest createVectorStoreRequest3 = new OASCreateVectorStoreRequest();
        OASCreateVectorStoreRequest createVectorStoreRequest4 = new OASCreateVectorStoreRequest();

        System.assert(createVectorStoreRequest1.equals(createVectorStoreRequest2));
        System.assert(createVectorStoreRequest3.equals(createVectorStoreRequest4));
        System.assertEquals(createVectorStoreRequest1.hashCode(), createVectorStoreRequest2.hashCode());
        System.assertEquals(createVectorStoreRequest3.hashCode(), createVectorStoreRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateVectorStoreRequest createVectorStoreRequest = new OASCreateVectorStoreRequest();
        Map<String, String> x-property-mappings = createVectorStoreRequest.getx-property-mappings();
        System.assertEquals('fileIds', x-property-mappings.get('file_ids'));
        System.assertEquals('expiresAfter', x-property-mappings.get('expires_after'));
        System.assertEquals('chunkingStrategy', x-property-mappings.get('chunking_strategy'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateVectorStoreRequest createVectorStoreRequest = new OASCreateVectorStoreRequest();
        System.assertEquals(new List<String>(), createVectorStoreRequest.fileIds);
        System.assertEquals(null, createVectorStoreRequest.name);
        System.assertEquals(null, createVectorStoreRequest.expiresAfter);
        System.assertEquals(null, createVectorStoreRequest.chunkingStrategy);
        System.assertEquals(null, createVectorStoreRequest.metadata);
    }
}
