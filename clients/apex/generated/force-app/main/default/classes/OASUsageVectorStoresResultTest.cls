@isTest
private class OASUsageVectorStoresResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageVectorStoresResult usageVectorStoresResult1 = OASUsageVectorStoresResult.getExample();
        OASUsageVectorStoresResult usageVectorStoresResult2 = usageVectorStoresResult1;
        OASUsageVectorStoresResult usageVectorStoresResult3 = new OASUsageVectorStoresResult();
        OASUsageVectorStoresResult usageVectorStoresResult4 = usageVectorStoresResult3;

        System.assert(usageVectorStoresResult1.equals(usageVectorStoresResult2));
        System.assert(usageVectorStoresResult2.equals(usageVectorStoresResult1));
        System.assert(usageVectorStoresResult1.equals(usageVectorStoresResult1));
        System.assert(usageVectorStoresResult3.equals(usageVectorStoresResult4));
        System.assert(usageVectorStoresResult4.equals(usageVectorStoresResult3));
        System.assert(usageVectorStoresResult3.equals(usageVectorStoresResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageVectorStoresResult usageVectorStoresResult1 = OASUsageVectorStoresResult.getExample();
        OASUsageVectorStoresResult usageVectorStoresResult2 = OASUsageVectorStoresResult.getExample();
        OASUsageVectorStoresResult usageVectorStoresResult3 = new OASUsageVectorStoresResult();
        OASUsageVectorStoresResult usageVectorStoresResult4 = new OASUsageVectorStoresResult();

        System.assert(usageVectorStoresResult1.equals(usageVectorStoresResult2));
        System.assert(usageVectorStoresResult2.equals(usageVectorStoresResult1));
        System.assert(usageVectorStoresResult3.equals(usageVectorStoresResult4));
        System.assert(usageVectorStoresResult4.equals(usageVectorStoresResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageVectorStoresResult usageVectorStoresResult1 = OASUsageVectorStoresResult.getExample();
        OASUsageVectorStoresResult usageVectorStoresResult2 = new OASUsageVectorStoresResult();

        System.assertEquals(false, usageVectorStoresResult1.equals('foo'));
        System.assertEquals(false, usageVectorStoresResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageVectorStoresResult usageVectorStoresResult1 = OASUsageVectorStoresResult.getExample();
        OASUsageVectorStoresResult usageVectorStoresResult2 = new OASUsageVectorStoresResult();
        OASUsageVectorStoresResult usageVectorStoresResult3;

        System.assertEquals(false, usageVectorStoresResult1.equals(usageVectorStoresResult3));
        System.assertEquals(false, usageVectorStoresResult2.equals(usageVectorStoresResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageVectorStoresResult usageVectorStoresResult1 = OASUsageVectorStoresResult.getExample();
        OASUsageVectorStoresResult usageVectorStoresResult2 = new OASUsageVectorStoresResult();

        System.assertEquals(usageVectorStoresResult1.hashCode(), usageVectorStoresResult1.hashCode());
        System.assertEquals(usageVectorStoresResult2.hashCode(), usageVectorStoresResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageVectorStoresResult usageVectorStoresResult1 = OASUsageVectorStoresResult.getExample();
        OASUsageVectorStoresResult usageVectorStoresResult2 = OASUsageVectorStoresResult.getExample();
        OASUsageVectorStoresResult usageVectorStoresResult3 = new OASUsageVectorStoresResult();
        OASUsageVectorStoresResult usageVectorStoresResult4 = new OASUsageVectorStoresResult();

        System.assert(usageVectorStoresResult1.equals(usageVectorStoresResult2));
        System.assert(usageVectorStoresResult3.equals(usageVectorStoresResult4));
        System.assertEquals(usageVectorStoresResult1.hashCode(), usageVectorStoresResult2.hashCode());
        System.assertEquals(usageVectorStoresResult3.hashCode(), usageVectorStoresResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageVectorStoresResult usageVectorStoresResult = new OASUsageVectorStoresResult();
        Map<String, String> x-property-mappings = usageVectorStoresResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('usageBytes', x-property-mappings.get('usage_bytes'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
    }
}
