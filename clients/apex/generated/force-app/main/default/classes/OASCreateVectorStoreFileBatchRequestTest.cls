@isTest
private class OASCreateVectorStoreFileBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest1 = OASCreateVectorStoreFileBatchRequest.getExample();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest2 = createVectorStoreFileBatchRequest1;
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest3 = new OASCreateVectorStoreFileBatchRequest();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest4 = createVectorStoreFileBatchRequest3;

        System.assert(createVectorStoreFileBatchRequest1.equals(createVectorStoreFileBatchRequest2));
        System.assert(createVectorStoreFileBatchRequest2.equals(createVectorStoreFileBatchRequest1));
        System.assert(createVectorStoreFileBatchRequest1.equals(createVectorStoreFileBatchRequest1));
        System.assert(createVectorStoreFileBatchRequest3.equals(createVectorStoreFileBatchRequest4));
        System.assert(createVectorStoreFileBatchRequest4.equals(createVectorStoreFileBatchRequest3));
        System.assert(createVectorStoreFileBatchRequest3.equals(createVectorStoreFileBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest1 = OASCreateVectorStoreFileBatchRequest.getExample();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest2 = OASCreateVectorStoreFileBatchRequest.getExample();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest3 = new OASCreateVectorStoreFileBatchRequest();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest4 = new OASCreateVectorStoreFileBatchRequest();

        System.assert(createVectorStoreFileBatchRequest1.equals(createVectorStoreFileBatchRequest2));
        System.assert(createVectorStoreFileBatchRequest2.equals(createVectorStoreFileBatchRequest1));
        System.assert(createVectorStoreFileBatchRequest3.equals(createVectorStoreFileBatchRequest4));
        System.assert(createVectorStoreFileBatchRequest4.equals(createVectorStoreFileBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest1 = OASCreateVectorStoreFileBatchRequest.getExample();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest2 = new OASCreateVectorStoreFileBatchRequest();

        System.assertEquals(false, createVectorStoreFileBatchRequest1.equals('foo'));
        System.assertEquals(false, createVectorStoreFileBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest1 = OASCreateVectorStoreFileBatchRequest.getExample();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest2 = new OASCreateVectorStoreFileBatchRequest();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest3;

        System.assertEquals(false, createVectorStoreFileBatchRequest1.equals(createVectorStoreFileBatchRequest3));
        System.assertEquals(false, createVectorStoreFileBatchRequest2.equals(createVectorStoreFileBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest1 = OASCreateVectorStoreFileBatchRequest.getExample();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest2 = new OASCreateVectorStoreFileBatchRequest();

        System.assertEquals(createVectorStoreFileBatchRequest1.hashCode(), createVectorStoreFileBatchRequest1.hashCode());
        System.assertEquals(createVectorStoreFileBatchRequest2.hashCode(), createVectorStoreFileBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest1 = OASCreateVectorStoreFileBatchRequest.getExample();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest2 = OASCreateVectorStoreFileBatchRequest.getExample();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest3 = new OASCreateVectorStoreFileBatchRequest();
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest4 = new OASCreateVectorStoreFileBatchRequest();

        System.assert(createVectorStoreFileBatchRequest1.equals(createVectorStoreFileBatchRequest2));
        System.assert(createVectorStoreFileBatchRequest3.equals(createVectorStoreFileBatchRequest4));
        System.assertEquals(createVectorStoreFileBatchRequest1.hashCode(), createVectorStoreFileBatchRequest2.hashCode());
        System.assertEquals(createVectorStoreFileBatchRequest3.hashCode(), createVectorStoreFileBatchRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest = new OASCreateVectorStoreFileBatchRequest();
        Map<String, String> x-property-mappings = createVectorStoreFileBatchRequest.getx-property-mappings();
        System.assertEquals('fileIds', x-property-mappings.get('file_ids'));
        System.assertEquals('chunkingStrategy', x-property-mappings.get('chunking_strategy'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest = new OASCreateVectorStoreFileBatchRequest();
        System.assertEquals(new List<String>(), createVectorStoreFileBatchRequest.fileIds);
        System.assertEquals(null, createVectorStoreFileBatchRequest.chunkingStrategy);
    }
}
