@isTest
private class OASCreateBatchRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateBatchRequest createBatchRequest1 = OASCreateBatchRequest.getExample();
        OASCreateBatchRequest createBatchRequest2 = createBatchRequest1;
        OASCreateBatchRequest createBatchRequest3 = new OASCreateBatchRequest();
        OASCreateBatchRequest createBatchRequest4 = createBatchRequest3;

        System.assert(createBatchRequest1.equals(createBatchRequest2));
        System.assert(createBatchRequest2.equals(createBatchRequest1));
        System.assert(createBatchRequest1.equals(createBatchRequest1));
        System.assert(createBatchRequest3.equals(createBatchRequest4));
        System.assert(createBatchRequest4.equals(createBatchRequest3));
        System.assert(createBatchRequest3.equals(createBatchRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateBatchRequest createBatchRequest1 = OASCreateBatchRequest.getExample();
        OASCreateBatchRequest createBatchRequest2 = OASCreateBatchRequest.getExample();
        OASCreateBatchRequest createBatchRequest3 = new OASCreateBatchRequest();
        OASCreateBatchRequest createBatchRequest4 = new OASCreateBatchRequest();

        System.assert(createBatchRequest1.equals(createBatchRequest2));
        System.assert(createBatchRequest2.equals(createBatchRequest1));
        System.assert(createBatchRequest3.equals(createBatchRequest4));
        System.assert(createBatchRequest4.equals(createBatchRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateBatchRequest createBatchRequest1 = OASCreateBatchRequest.getExample();
        OASCreateBatchRequest createBatchRequest2 = new OASCreateBatchRequest();

        System.assertEquals(false, createBatchRequest1.equals('foo'));
        System.assertEquals(false, createBatchRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateBatchRequest createBatchRequest1 = OASCreateBatchRequest.getExample();
        OASCreateBatchRequest createBatchRequest2 = new OASCreateBatchRequest();
        OASCreateBatchRequest createBatchRequest3;

        System.assertEquals(false, createBatchRequest1.equals(createBatchRequest3));
        System.assertEquals(false, createBatchRequest2.equals(createBatchRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateBatchRequest createBatchRequest1 = OASCreateBatchRequest.getExample();
        OASCreateBatchRequest createBatchRequest2 = new OASCreateBatchRequest();

        System.assertEquals(createBatchRequest1.hashCode(), createBatchRequest1.hashCode());
        System.assertEquals(createBatchRequest2.hashCode(), createBatchRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateBatchRequest createBatchRequest1 = OASCreateBatchRequest.getExample();
        OASCreateBatchRequest createBatchRequest2 = OASCreateBatchRequest.getExample();
        OASCreateBatchRequest createBatchRequest3 = new OASCreateBatchRequest();
        OASCreateBatchRequest createBatchRequest4 = new OASCreateBatchRequest();

        System.assert(createBatchRequest1.equals(createBatchRequest2));
        System.assert(createBatchRequest3.equals(createBatchRequest4));
        System.assertEquals(createBatchRequest1.hashCode(), createBatchRequest2.hashCode());
        System.assertEquals(createBatchRequest3.hashCode(), createBatchRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateBatchRequest createBatchRequest = new OASCreateBatchRequest();
        Map<String, String> x-property-mappings = createBatchRequest.getx-property-mappings();
        System.assertEquals('inputFileId', x-property-mappings.get('input_file_id'));
        System.assertEquals('completionWindow', x-property-mappings.get('completion_window'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateBatchRequest createBatchRequest = new OASCreateBatchRequest();
        System.assertEquals(new Map<String, String>(), createBatchRequest.metadata);
        System.assertEquals(null, createBatchRequest.inputFileId);
        System.assertEquals(null, createBatchRequest.endpoint);
        System.assertEquals(null, createBatchRequest.completionWindow);
    }
}
