@isTest
private class OASBatchRequestInputTest {
    @isTest
    private static void equalsSameInstance() {
        OASBatchRequestInput batchRequestInput1 = OASBatchRequestInput.getExample();
        OASBatchRequestInput batchRequestInput2 = batchRequestInput1;
        OASBatchRequestInput batchRequestInput3 = new OASBatchRequestInput();
        OASBatchRequestInput batchRequestInput4 = batchRequestInput3;

        System.assert(batchRequestInput1.equals(batchRequestInput2));
        System.assert(batchRequestInput2.equals(batchRequestInput1));
        System.assert(batchRequestInput1.equals(batchRequestInput1));
        System.assert(batchRequestInput3.equals(batchRequestInput4));
        System.assert(batchRequestInput4.equals(batchRequestInput3));
        System.assert(batchRequestInput3.equals(batchRequestInput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBatchRequestInput batchRequestInput1 = OASBatchRequestInput.getExample();
        OASBatchRequestInput batchRequestInput2 = OASBatchRequestInput.getExample();
        OASBatchRequestInput batchRequestInput3 = new OASBatchRequestInput();
        OASBatchRequestInput batchRequestInput4 = new OASBatchRequestInput();

        System.assert(batchRequestInput1.equals(batchRequestInput2));
        System.assert(batchRequestInput2.equals(batchRequestInput1));
        System.assert(batchRequestInput3.equals(batchRequestInput4));
        System.assert(batchRequestInput4.equals(batchRequestInput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBatchRequestInput batchRequestInput1 = OASBatchRequestInput.getExample();
        OASBatchRequestInput batchRequestInput2 = new OASBatchRequestInput();

        System.assertEquals(false, batchRequestInput1.equals('foo'));
        System.assertEquals(false, batchRequestInput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBatchRequestInput batchRequestInput1 = OASBatchRequestInput.getExample();
        OASBatchRequestInput batchRequestInput2 = new OASBatchRequestInput();
        OASBatchRequestInput batchRequestInput3;

        System.assertEquals(false, batchRequestInput1.equals(batchRequestInput3));
        System.assertEquals(false, batchRequestInput2.equals(batchRequestInput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBatchRequestInput batchRequestInput1 = OASBatchRequestInput.getExample();
        OASBatchRequestInput batchRequestInput2 = new OASBatchRequestInput();

        System.assertEquals(batchRequestInput1.hashCode(), batchRequestInput1.hashCode());
        System.assertEquals(batchRequestInput2.hashCode(), batchRequestInput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBatchRequestInput batchRequestInput1 = OASBatchRequestInput.getExample();
        OASBatchRequestInput batchRequestInput2 = OASBatchRequestInput.getExample();
        OASBatchRequestInput batchRequestInput3 = new OASBatchRequestInput();
        OASBatchRequestInput batchRequestInput4 = new OASBatchRequestInput();

        System.assert(batchRequestInput1.equals(batchRequestInput2));
        System.assert(batchRequestInput3.equals(batchRequestInput4));
        System.assertEquals(batchRequestInput1.hashCode(), batchRequestInput2.hashCode());
        System.assertEquals(batchRequestInput3.hashCode(), batchRequestInput4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBatchRequestInput batchRequestInput = new OASBatchRequestInput();
        Map<String, String> x-property-mappings = batchRequestInput.getx-property-mappings();
        System.assertEquals('customId', x-property-mappings.get('custom_id'));
    }
}
