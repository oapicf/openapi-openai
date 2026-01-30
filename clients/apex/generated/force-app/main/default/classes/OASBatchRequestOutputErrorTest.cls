@isTest
private class OASBatchRequestOutputErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASBatchRequestOutputError batchRequestOutputError1 = OASBatchRequestOutputError.getExample();
        OASBatchRequestOutputError batchRequestOutputError2 = batchRequestOutputError1;
        OASBatchRequestOutputError batchRequestOutputError3 = new OASBatchRequestOutputError();
        OASBatchRequestOutputError batchRequestOutputError4 = batchRequestOutputError3;

        System.assert(batchRequestOutputError1.equals(batchRequestOutputError2));
        System.assert(batchRequestOutputError2.equals(batchRequestOutputError1));
        System.assert(batchRequestOutputError1.equals(batchRequestOutputError1));
        System.assert(batchRequestOutputError3.equals(batchRequestOutputError4));
        System.assert(batchRequestOutputError4.equals(batchRequestOutputError3));
        System.assert(batchRequestOutputError3.equals(batchRequestOutputError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBatchRequestOutputError batchRequestOutputError1 = OASBatchRequestOutputError.getExample();
        OASBatchRequestOutputError batchRequestOutputError2 = OASBatchRequestOutputError.getExample();
        OASBatchRequestOutputError batchRequestOutputError3 = new OASBatchRequestOutputError();
        OASBatchRequestOutputError batchRequestOutputError4 = new OASBatchRequestOutputError();

        System.assert(batchRequestOutputError1.equals(batchRequestOutputError2));
        System.assert(batchRequestOutputError2.equals(batchRequestOutputError1));
        System.assert(batchRequestOutputError3.equals(batchRequestOutputError4));
        System.assert(batchRequestOutputError4.equals(batchRequestOutputError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBatchRequestOutputError batchRequestOutputError1 = OASBatchRequestOutputError.getExample();
        OASBatchRequestOutputError batchRequestOutputError2 = new OASBatchRequestOutputError();

        System.assertEquals(false, batchRequestOutputError1.equals('foo'));
        System.assertEquals(false, batchRequestOutputError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBatchRequestOutputError batchRequestOutputError1 = OASBatchRequestOutputError.getExample();
        OASBatchRequestOutputError batchRequestOutputError2 = new OASBatchRequestOutputError();
        OASBatchRequestOutputError batchRequestOutputError3;

        System.assertEquals(false, batchRequestOutputError1.equals(batchRequestOutputError3));
        System.assertEquals(false, batchRequestOutputError2.equals(batchRequestOutputError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBatchRequestOutputError batchRequestOutputError1 = OASBatchRequestOutputError.getExample();
        OASBatchRequestOutputError batchRequestOutputError2 = new OASBatchRequestOutputError();

        System.assertEquals(batchRequestOutputError1.hashCode(), batchRequestOutputError1.hashCode());
        System.assertEquals(batchRequestOutputError2.hashCode(), batchRequestOutputError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBatchRequestOutputError batchRequestOutputError1 = OASBatchRequestOutputError.getExample();
        OASBatchRequestOutputError batchRequestOutputError2 = OASBatchRequestOutputError.getExample();
        OASBatchRequestOutputError batchRequestOutputError3 = new OASBatchRequestOutputError();
        OASBatchRequestOutputError batchRequestOutputError4 = new OASBatchRequestOutputError();

        System.assert(batchRequestOutputError1.equals(batchRequestOutputError2));
        System.assert(batchRequestOutputError3.equals(batchRequestOutputError4));
        System.assertEquals(batchRequestOutputError1.hashCode(), batchRequestOutputError2.hashCode());
        System.assertEquals(batchRequestOutputError3.hashCode(), batchRequestOutputError4.hashCode());
    }
}
