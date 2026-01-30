@isTest
private class OASBatchErrorsDataInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASBatchErrorsDataInner batchErrorsDataInner1 = OASBatchErrorsDataInner.getExample();
        OASBatchErrorsDataInner batchErrorsDataInner2 = batchErrorsDataInner1;
        OASBatchErrorsDataInner batchErrorsDataInner3 = new OASBatchErrorsDataInner();
        OASBatchErrorsDataInner batchErrorsDataInner4 = batchErrorsDataInner3;

        System.assert(batchErrorsDataInner1.equals(batchErrorsDataInner2));
        System.assert(batchErrorsDataInner2.equals(batchErrorsDataInner1));
        System.assert(batchErrorsDataInner1.equals(batchErrorsDataInner1));
        System.assert(batchErrorsDataInner3.equals(batchErrorsDataInner4));
        System.assert(batchErrorsDataInner4.equals(batchErrorsDataInner3));
        System.assert(batchErrorsDataInner3.equals(batchErrorsDataInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBatchErrorsDataInner batchErrorsDataInner1 = OASBatchErrorsDataInner.getExample();
        OASBatchErrorsDataInner batchErrorsDataInner2 = OASBatchErrorsDataInner.getExample();
        OASBatchErrorsDataInner batchErrorsDataInner3 = new OASBatchErrorsDataInner();
        OASBatchErrorsDataInner batchErrorsDataInner4 = new OASBatchErrorsDataInner();

        System.assert(batchErrorsDataInner1.equals(batchErrorsDataInner2));
        System.assert(batchErrorsDataInner2.equals(batchErrorsDataInner1));
        System.assert(batchErrorsDataInner3.equals(batchErrorsDataInner4));
        System.assert(batchErrorsDataInner4.equals(batchErrorsDataInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBatchErrorsDataInner batchErrorsDataInner1 = OASBatchErrorsDataInner.getExample();
        OASBatchErrorsDataInner batchErrorsDataInner2 = new OASBatchErrorsDataInner();

        System.assertEquals(false, batchErrorsDataInner1.equals('foo'));
        System.assertEquals(false, batchErrorsDataInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBatchErrorsDataInner batchErrorsDataInner1 = OASBatchErrorsDataInner.getExample();
        OASBatchErrorsDataInner batchErrorsDataInner2 = new OASBatchErrorsDataInner();
        OASBatchErrorsDataInner batchErrorsDataInner3;

        System.assertEquals(false, batchErrorsDataInner1.equals(batchErrorsDataInner3));
        System.assertEquals(false, batchErrorsDataInner2.equals(batchErrorsDataInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBatchErrorsDataInner batchErrorsDataInner1 = OASBatchErrorsDataInner.getExample();
        OASBatchErrorsDataInner batchErrorsDataInner2 = new OASBatchErrorsDataInner();

        System.assertEquals(batchErrorsDataInner1.hashCode(), batchErrorsDataInner1.hashCode());
        System.assertEquals(batchErrorsDataInner2.hashCode(), batchErrorsDataInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBatchErrorsDataInner batchErrorsDataInner1 = OASBatchErrorsDataInner.getExample();
        OASBatchErrorsDataInner batchErrorsDataInner2 = OASBatchErrorsDataInner.getExample();
        OASBatchErrorsDataInner batchErrorsDataInner3 = new OASBatchErrorsDataInner();
        OASBatchErrorsDataInner batchErrorsDataInner4 = new OASBatchErrorsDataInner();

        System.assert(batchErrorsDataInner1.equals(batchErrorsDataInner2));
        System.assert(batchErrorsDataInner3.equals(batchErrorsDataInner4));
        System.assertEquals(batchErrorsDataInner1.hashCode(), batchErrorsDataInner2.hashCode());
        System.assertEquals(batchErrorsDataInner3.hashCode(), batchErrorsDataInner4.hashCode());
    }
}
