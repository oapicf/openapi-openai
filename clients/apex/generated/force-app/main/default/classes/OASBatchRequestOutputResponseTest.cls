@isTest
private class OASBatchRequestOutputResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBatchRequestOutputResponse batchRequestOutputResponse1 = OASBatchRequestOutputResponse.getExample();
        OASBatchRequestOutputResponse batchRequestOutputResponse2 = batchRequestOutputResponse1;
        OASBatchRequestOutputResponse batchRequestOutputResponse3 = new OASBatchRequestOutputResponse();
        OASBatchRequestOutputResponse batchRequestOutputResponse4 = batchRequestOutputResponse3;

        System.assert(batchRequestOutputResponse1.equals(batchRequestOutputResponse2));
        System.assert(batchRequestOutputResponse2.equals(batchRequestOutputResponse1));
        System.assert(batchRequestOutputResponse1.equals(batchRequestOutputResponse1));
        System.assert(batchRequestOutputResponse3.equals(batchRequestOutputResponse4));
        System.assert(batchRequestOutputResponse4.equals(batchRequestOutputResponse3));
        System.assert(batchRequestOutputResponse3.equals(batchRequestOutputResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBatchRequestOutputResponse batchRequestOutputResponse1 = OASBatchRequestOutputResponse.getExample();
        OASBatchRequestOutputResponse batchRequestOutputResponse2 = OASBatchRequestOutputResponse.getExample();
        OASBatchRequestOutputResponse batchRequestOutputResponse3 = new OASBatchRequestOutputResponse();
        OASBatchRequestOutputResponse batchRequestOutputResponse4 = new OASBatchRequestOutputResponse();

        System.assert(batchRequestOutputResponse1.equals(batchRequestOutputResponse2));
        System.assert(batchRequestOutputResponse2.equals(batchRequestOutputResponse1));
        System.assert(batchRequestOutputResponse3.equals(batchRequestOutputResponse4));
        System.assert(batchRequestOutputResponse4.equals(batchRequestOutputResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBatchRequestOutputResponse batchRequestOutputResponse1 = OASBatchRequestOutputResponse.getExample();
        OASBatchRequestOutputResponse batchRequestOutputResponse2 = new OASBatchRequestOutputResponse();

        System.assertEquals(false, batchRequestOutputResponse1.equals('foo'));
        System.assertEquals(false, batchRequestOutputResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBatchRequestOutputResponse batchRequestOutputResponse1 = OASBatchRequestOutputResponse.getExample();
        OASBatchRequestOutputResponse batchRequestOutputResponse2 = new OASBatchRequestOutputResponse();
        OASBatchRequestOutputResponse batchRequestOutputResponse3;

        System.assertEquals(false, batchRequestOutputResponse1.equals(batchRequestOutputResponse3));
        System.assertEquals(false, batchRequestOutputResponse2.equals(batchRequestOutputResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBatchRequestOutputResponse batchRequestOutputResponse1 = OASBatchRequestOutputResponse.getExample();
        OASBatchRequestOutputResponse batchRequestOutputResponse2 = new OASBatchRequestOutputResponse();

        System.assertEquals(batchRequestOutputResponse1.hashCode(), batchRequestOutputResponse1.hashCode());
        System.assertEquals(batchRequestOutputResponse2.hashCode(), batchRequestOutputResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBatchRequestOutputResponse batchRequestOutputResponse1 = OASBatchRequestOutputResponse.getExample();
        OASBatchRequestOutputResponse batchRequestOutputResponse2 = OASBatchRequestOutputResponse.getExample();
        OASBatchRequestOutputResponse batchRequestOutputResponse3 = new OASBatchRequestOutputResponse();
        OASBatchRequestOutputResponse batchRequestOutputResponse4 = new OASBatchRequestOutputResponse();

        System.assert(batchRequestOutputResponse1.equals(batchRequestOutputResponse2));
        System.assert(batchRequestOutputResponse3.equals(batchRequestOutputResponse4));
        System.assertEquals(batchRequestOutputResponse1.hashCode(), batchRequestOutputResponse2.hashCode());
        System.assertEquals(batchRequestOutputResponse3.hashCode(), batchRequestOutputResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBatchRequestOutputResponse batchRequestOutputResponse = new OASBatchRequestOutputResponse();
        Map<String, String> x-property-mappings = batchRequestOutputResponse.getx-property-mappings();
        System.assertEquals('statusCode', x-property-mappings.get('status_code'));
        System.assertEquals('requestId', x-property-mappings.get('request_id'));
    }
}
