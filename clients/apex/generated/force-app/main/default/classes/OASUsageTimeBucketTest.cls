@isTest
private class OASUsageTimeBucketTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageTimeBucket usageTimeBucket1 = OASUsageTimeBucket.getExample();
        OASUsageTimeBucket usageTimeBucket2 = usageTimeBucket1;
        OASUsageTimeBucket usageTimeBucket3 = new OASUsageTimeBucket();
        OASUsageTimeBucket usageTimeBucket4 = usageTimeBucket3;

        System.assert(usageTimeBucket1.equals(usageTimeBucket2));
        System.assert(usageTimeBucket2.equals(usageTimeBucket1));
        System.assert(usageTimeBucket1.equals(usageTimeBucket1));
        System.assert(usageTimeBucket3.equals(usageTimeBucket4));
        System.assert(usageTimeBucket4.equals(usageTimeBucket3));
        System.assert(usageTimeBucket3.equals(usageTimeBucket3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageTimeBucket usageTimeBucket1 = OASUsageTimeBucket.getExample();
        OASUsageTimeBucket usageTimeBucket2 = OASUsageTimeBucket.getExample();
        OASUsageTimeBucket usageTimeBucket3 = new OASUsageTimeBucket();
        OASUsageTimeBucket usageTimeBucket4 = new OASUsageTimeBucket();

        System.assert(usageTimeBucket1.equals(usageTimeBucket2));
        System.assert(usageTimeBucket2.equals(usageTimeBucket1));
        System.assert(usageTimeBucket3.equals(usageTimeBucket4));
        System.assert(usageTimeBucket4.equals(usageTimeBucket3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageTimeBucket usageTimeBucket1 = OASUsageTimeBucket.getExample();
        OASUsageTimeBucket usageTimeBucket2 = new OASUsageTimeBucket();

        System.assertEquals(false, usageTimeBucket1.equals('foo'));
        System.assertEquals(false, usageTimeBucket2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageTimeBucket usageTimeBucket1 = OASUsageTimeBucket.getExample();
        OASUsageTimeBucket usageTimeBucket2 = new OASUsageTimeBucket();
        OASUsageTimeBucket usageTimeBucket3;

        System.assertEquals(false, usageTimeBucket1.equals(usageTimeBucket3));
        System.assertEquals(false, usageTimeBucket2.equals(usageTimeBucket3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageTimeBucket usageTimeBucket1 = OASUsageTimeBucket.getExample();
        OASUsageTimeBucket usageTimeBucket2 = new OASUsageTimeBucket();

        System.assertEquals(usageTimeBucket1.hashCode(), usageTimeBucket1.hashCode());
        System.assertEquals(usageTimeBucket2.hashCode(), usageTimeBucket2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageTimeBucket usageTimeBucket1 = OASUsageTimeBucket.getExample();
        OASUsageTimeBucket usageTimeBucket2 = OASUsageTimeBucket.getExample();
        OASUsageTimeBucket usageTimeBucket3 = new OASUsageTimeBucket();
        OASUsageTimeBucket usageTimeBucket4 = new OASUsageTimeBucket();

        System.assert(usageTimeBucket1.equals(usageTimeBucket2));
        System.assert(usageTimeBucket3.equals(usageTimeBucket4));
        System.assertEquals(usageTimeBucket1.hashCode(), usageTimeBucket2.hashCode());
        System.assertEquals(usageTimeBucket3.hashCode(), usageTimeBucket4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageTimeBucket usageTimeBucket = new OASUsageTimeBucket();
        Map<String, String> x-property-mappings = usageTimeBucket.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUsageTimeBucket usageTimeBucket = new OASUsageTimeBucket();
        System.assertEquals(new List<OASUsageTimeBucketResultInner>(), usageTimeBucket.result);
        System.assertEquals(null, usageTimeBucket.r_object);
        System.assertEquals(null, usageTimeBucket.startTime);
        System.assertEquals(null, usageTimeBucket.endTime);
    }
}
