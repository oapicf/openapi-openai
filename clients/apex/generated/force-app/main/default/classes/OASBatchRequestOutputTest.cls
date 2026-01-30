@isTest
private class OASBatchRequestOutputTest {
    @isTest
    private static void equalsSameInstance() {
        OASBatchRequestOutput batchRequestOutput1 = OASBatchRequestOutput.getExample();
        OASBatchRequestOutput batchRequestOutput2 = batchRequestOutput1;
        OASBatchRequestOutput batchRequestOutput3 = new OASBatchRequestOutput();
        OASBatchRequestOutput batchRequestOutput4 = batchRequestOutput3;

        System.assert(batchRequestOutput1.equals(batchRequestOutput2));
        System.assert(batchRequestOutput2.equals(batchRequestOutput1));
        System.assert(batchRequestOutput1.equals(batchRequestOutput1));
        System.assert(batchRequestOutput3.equals(batchRequestOutput4));
        System.assert(batchRequestOutput4.equals(batchRequestOutput3));
        System.assert(batchRequestOutput3.equals(batchRequestOutput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBatchRequestOutput batchRequestOutput1 = OASBatchRequestOutput.getExample();
        OASBatchRequestOutput batchRequestOutput2 = OASBatchRequestOutput.getExample();
        OASBatchRequestOutput batchRequestOutput3 = new OASBatchRequestOutput();
        OASBatchRequestOutput batchRequestOutput4 = new OASBatchRequestOutput();

        System.assert(batchRequestOutput1.equals(batchRequestOutput2));
        System.assert(batchRequestOutput2.equals(batchRequestOutput1));
        System.assert(batchRequestOutput3.equals(batchRequestOutput4));
        System.assert(batchRequestOutput4.equals(batchRequestOutput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBatchRequestOutput batchRequestOutput1 = OASBatchRequestOutput.getExample();
        OASBatchRequestOutput batchRequestOutput2 = new OASBatchRequestOutput();

        System.assertEquals(false, batchRequestOutput1.equals('foo'));
        System.assertEquals(false, batchRequestOutput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBatchRequestOutput batchRequestOutput1 = OASBatchRequestOutput.getExample();
        OASBatchRequestOutput batchRequestOutput2 = new OASBatchRequestOutput();
        OASBatchRequestOutput batchRequestOutput3;

        System.assertEquals(false, batchRequestOutput1.equals(batchRequestOutput3));
        System.assertEquals(false, batchRequestOutput2.equals(batchRequestOutput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBatchRequestOutput batchRequestOutput1 = OASBatchRequestOutput.getExample();
        OASBatchRequestOutput batchRequestOutput2 = new OASBatchRequestOutput();

        System.assertEquals(batchRequestOutput1.hashCode(), batchRequestOutput1.hashCode());
        System.assertEquals(batchRequestOutput2.hashCode(), batchRequestOutput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBatchRequestOutput batchRequestOutput1 = OASBatchRequestOutput.getExample();
        OASBatchRequestOutput batchRequestOutput2 = OASBatchRequestOutput.getExample();
        OASBatchRequestOutput batchRequestOutput3 = new OASBatchRequestOutput();
        OASBatchRequestOutput batchRequestOutput4 = new OASBatchRequestOutput();

        System.assert(batchRequestOutput1.equals(batchRequestOutput2));
        System.assert(batchRequestOutput3.equals(batchRequestOutput4));
        System.assertEquals(batchRequestOutput1.hashCode(), batchRequestOutput2.hashCode());
        System.assertEquals(batchRequestOutput3.hashCode(), batchRequestOutput4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBatchRequestOutput batchRequestOutput = new OASBatchRequestOutput();
        Map<String, String> x-property-mappings = batchRequestOutput.getx-property-mappings();
        System.assertEquals('customId', x-property-mappings.get('custom_id'));
    }
}
