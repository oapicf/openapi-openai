@isTest
private class OASUsageResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageResponse usageResponse1 = OASUsageResponse.getExample();
        OASUsageResponse usageResponse2 = usageResponse1;
        OASUsageResponse usageResponse3 = new OASUsageResponse();
        OASUsageResponse usageResponse4 = usageResponse3;

        System.assert(usageResponse1.equals(usageResponse2));
        System.assert(usageResponse2.equals(usageResponse1));
        System.assert(usageResponse1.equals(usageResponse1));
        System.assert(usageResponse3.equals(usageResponse4));
        System.assert(usageResponse4.equals(usageResponse3));
        System.assert(usageResponse3.equals(usageResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageResponse usageResponse1 = OASUsageResponse.getExample();
        OASUsageResponse usageResponse2 = OASUsageResponse.getExample();
        OASUsageResponse usageResponse3 = new OASUsageResponse();
        OASUsageResponse usageResponse4 = new OASUsageResponse();

        System.assert(usageResponse1.equals(usageResponse2));
        System.assert(usageResponse2.equals(usageResponse1));
        System.assert(usageResponse3.equals(usageResponse4));
        System.assert(usageResponse4.equals(usageResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageResponse usageResponse1 = OASUsageResponse.getExample();
        OASUsageResponse usageResponse2 = new OASUsageResponse();

        System.assertEquals(false, usageResponse1.equals('foo'));
        System.assertEquals(false, usageResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageResponse usageResponse1 = OASUsageResponse.getExample();
        OASUsageResponse usageResponse2 = new OASUsageResponse();
        OASUsageResponse usageResponse3;

        System.assertEquals(false, usageResponse1.equals(usageResponse3));
        System.assertEquals(false, usageResponse2.equals(usageResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageResponse usageResponse1 = OASUsageResponse.getExample();
        OASUsageResponse usageResponse2 = new OASUsageResponse();

        System.assertEquals(usageResponse1.hashCode(), usageResponse1.hashCode());
        System.assertEquals(usageResponse2.hashCode(), usageResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageResponse usageResponse1 = OASUsageResponse.getExample();
        OASUsageResponse usageResponse2 = OASUsageResponse.getExample();
        OASUsageResponse usageResponse3 = new OASUsageResponse();
        OASUsageResponse usageResponse4 = new OASUsageResponse();

        System.assert(usageResponse1.equals(usageResponse2));
        System.assert(usageResponse3.equals(usageResponse4));
        System.assertEquals(usageResponse1.hashCode(), usageResponse2.hashCode());
        System.assertEquals(usageResponse3.hashCode(), usageResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageResponse usageResponse = new OASUsageResponse();
        Map<String, String> x-property-mappings = usageResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
        System.assertEquals('nextPage', x-property-mappings.get('next_page'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUsageResponse usageResponse = new OASUsageResponse();
        System.assertEquals(new List<OASUsageTimeBucket>(), usageResponse.data);
        System.assertEquals(null, usageResponse.r_object);
        System.assertEquals(null, usageResponse.hasMore);
        System.assertEquals(null, usageResponse.nextPage);
    }
}
