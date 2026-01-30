@isTest
private class OASBatchRequestCountsTest {
    @isTest
    private static void equalsSameInstance() {
        OASBatchRequestCounts batchRequestCounts1 = OASBatchRequestCounts.getExample();
        OASBatchRequestCounts batchRequestCounts2 = batchRequestCounts1;
        OASBatchRequestCounts batchRequestCounts3 = new OASBatchRequestCounts();
        OASBatchRequestCounts batchRequestCounts4 = batchRequestCounts3;

        System.assert(batchRequestCounts1.equals(batchRequestCounts2));
        System.assert(batchRequestCounts2.equals(batchRequestCounts1));
        System.assert(batchRequestCounts1.equals(batchRequestCounts1));
        System.assert(batchRequestCounts3.equals(batchRequestCounts4));
        System.assert(batchRequestCounts4.equals(batchRequestCounts3));
        System.assert(batchRequestCounts3.equals(batchRequestCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBatchRequestCounts batchRequestCounts1 = OASBatchRequestCounts.getExample();
        OASBatchRequestCounts batchRequestCounts2 = OASBatchRequestCounts.getExample();
        OASBatchRequestCounts batchRequestCounts3 = new OASBatchRequestCounts();
        OASBatchRequestCounts batchRequestCounts4 = new OASBatchRequestCounts();

        System.assert(batchRequestCounts1.equals(batchRequestCounts2));
        System.assert(batchRequestCounts2.equals(batchRequestCounts1));
        System.assert(batchRequestCounts3.equals(batchRequestCounts4));
        System.assert(batchRequestCounts4.equals(batchRequestCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBatchRequestCounts batchRequestCounts1 = OASBatchRequestCounts.getExample();
        OASBatchRequestCounts batchRequestCounts2 = new OASBatchRequestCounts();

        System.assertEquals(false, batchRequestCounts1.equals('foo'));
        System.assertEquals(false, batchRequestCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBatchRequestCounts batchRequestCounts1 = OASBatchRequestCounts.getExample();
        OASBatchRequestCounts batchRequestCounts2 = new OASBatchRequestCounts();
        OASBatchRequestCounts batchRequestCounts3;

        System.assertEquals(false, batchRequestCounts1.equals(batchRequestCounts3));
        System.assertEquals(false, batchRequestCounts2.equals(batchRequestCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBatchRequestCounts batchRequestCounts1 = OASBatchRequestCounts.getExample();
        OASBatchRequestCounts batchRequestCounts2 = new OASBatchRequestCounts();

        System.assertEquals(batchRequestCounts1.hashCode(), batchRequestCounts1.hashCode());
        System.assertEquals(batchRequestCounts2.hashCode(), batchRequestCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBatchRequestCounts batchRequestCounts1 = OASBatchRequestCounts.getExample();
        OASBatchRequestCounts batchRequestCounts2 = OASBatchRequestCounts.getExample();
        OASBatchRequestCounts batchRequestCounts3 = new OASBatchRequestCounts();
        OASBatchRequestCounts batchRequestCounts4 = new OASBatchRequestCounts();

        System.assert(batchRequestCounts1.equals(batchRequestCounts2));
        System.assert(batchRequestCounts3.equals(batchRequestCounts4));
        System.assertEquals(batchRequestCounts1.hashCode(), batchRequestCounts2.hashCode());
        System.assertEquals(batchRequestCounts3.hashCode(), batchRequestCounts4.hashCode());
    }
}
