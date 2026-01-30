@isTest
private class OASBatchErrorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASBatchErrors batchErrors1 = OASBatchErrors.getExample();
        OASBatchErrors batchErrors2 = batchErrors1;
        OASBatchErrors batchErrors3 = new OASBatchErrors();
        OASBatchErrors batchErrors4 = batchErrors3;

        System.assert(batchErrors1.equals(batchErrors2));
        System.assert(batchErrors2.equals(batchErrors1));
        System.assert(batchErrors1.equals(batchErrors1));
        System.assert(batchErrors3.equals(batchErrors4));
        System.assert(batchErrors4.equals(batchErrors3));
        System.assert(batchErrors3.equals(batchErrors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBatchErrors batchErrors1 = OASBatchErrors.getExample();
        OASBatchErrors batchErrors2 = OASBatchErrors.getExample();
        OASBatchErrors batchErrors3 = new OASBatchErrors();
        OASBatchErrors batchErrors4 = new OASBatchErrors();

        System.assert(batchErrors1.equals(batchErrors2));
        System.assert(batchErrors2.equals(batchErrors1));
        System.assert(batchErrors3.equals(batchErrors4));
        System.assert(batchErrors4.equals(batchErrors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBatchErrors batchErrors1 = OASBatchErrors.getExample();
        OASBatchErrors batchErrors2 = new OASBatchErrors();

        System.assertEquals(false, batchErrors1.equals('foo'));
        System.assertEquals(false, batchErrors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBatchErrors batchErrors1 = OASBatchErrors.getExample();
        OASBatchErrors batchErrors2 = new OASBatchErrors();
        OASBatchErrors batchErrors3;

        System.assertEquals(false, batchErrors1.equals(batchErrors3));
        System.assertEquals(false, batchErrors2.equals(batchErrors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBatchErrors batchErrors1 = OASBatchErrors.getExample();
        OASBatchErrors batchErrors2 = new OASBatchErrors();

        System.assertEquals(batchErrors1.hashCode(), batchErrors1.hashCode());
        System.assertEquals(batchErrors2.hashCode(), batchErrors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBatchErrors batchErrors1 = OASBatchErrors.getExample();
        OASBatchErrors batchErrors2 = OASBatchErrors.getExample();
        OASBatchErrors batchErrors3 = new OASBatchErrors();
        OASBatchErrors batchErrors4 = new OASBatchErrors();

        System.assert(batchErrors1.equals(batchErrors2));
        System.assert(batchErrors3.equals(batchErrors4));
        System.assertEquals(batchErrors1.hashCode(), batchErrors2.hashCode());
        System.assertEquals(batchErrors3.hashCode(), batchErrors4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBatchErrors batchErrors = new OASBatchErrors();
        Map<String, String> x-property-mappings = batchErrors.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBatchErrors batchErrors = new OASBatchErrors();
        System.assertEquals(new List<OASBatchErrorsDataInner>(), batchErrors.data);
        System.assertEquals(null, batchErrors.r_object);
    }
}
