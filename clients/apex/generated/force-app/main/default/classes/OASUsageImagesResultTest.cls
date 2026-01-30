@isTest
private class OASUsageImagesResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageImagesResult usageImagesResult1 = OASUsageImagesResult.getExample();
        OASUsageImagesResult usageImagesResult2 = usageImagesResult1;
        OASUsageImagesResult usageImagesResult3 = new OASUsageImagesResult();
        OASUsageImagesResult usageImagesResult4 = usageImagesResult3;

        System.assert(usageImagesResult1.equals(usageImagesResult2));
        System.assert(usageImagesResult2.equals(usageImagesResult1));
        System.assert(usageImagesResult1.equals(usageImagesResult1));
        System.assert(usageImagesResult3.equals(usageImagesResult4));
        System.assert(usageImagesResult4.equals(usageImagesResult3));
        System.assert(usageImagesResult3.equals(usageImagesResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageImagesResult usageImagesResult1 = OASUsageImagesResult.getExample();
        OASUsageImagesResult usageImagesResult2 = OASUsageImagesResult.getExample();
        OASUsageImagesResult usageImagesResult3 = new OASUsageImagesResult();
        OASUsageImagesResult usageImagesResult4 = new OASUsageImagesResult();

        System.assert(usageImagesResult1.equals(usageImagesResult2));
        System.assert(usageImagesResult2.equals(usageImagesResult1));
        System.assert(usageImagesResult3.equals(usageImagesResult4));
        System.assert(usageImagesResult4.equals(usageImagesResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageImagesResult usageImagesResult1 = OASUsageImagesResult.getExample();
        OASUsageImagesResult usageImagesResult2 = new OASUsageImagesResult();

        System.assertEquals(false, usageImagesResult1.equals('foo'));
        System.assertEquals(false, usageImagesResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageImagesResult usageImagesResult1 = OASUsageImagesResult.getExample();
        OASUsageImagesResult usageImagesResult2 = new OASUsageImagesResult();
        OASUsageImagesResult usageImagesResult3;

        System.assertEquals(false, usageImagesResult1.equals(usageImagesResult3));
        System.assertEquals(false, usageImagesResult2.equals(usageImagesResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageImagesResult usageImagesResult1 = OASUsageImagesResult.getExample();
        OASUsageImagesResult usageImagesResult2 = new OASUsageImagesResult();

        System.assertEquals(usageImagesResult1.hashCode(), usageImagesResult1.hashCode());
        System.assertEquals(usageImagesResult2.hashCode(), usageImagesResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageImagesResult usageImagesResult1 = OASUsageImagesResult.getExample();
        OASUsageImagesResult usageImagesResult2 = OASUsageImagesResult.getExample();
        OASUsageImagesResult usageImagesResult3 = new OASUsageImagesResult();
        OASUsageImagesResult usageImagesResult4 = new OASUsageImagesResult();

        System.assert(usageImagesResult1.equals(usageImagesResult2));
        System.assert(usageImagesResult3.equals(usageImagesResult4));
        System.assertEquals(usageImagesResult1.hashCode(), usageImagesResult2.hashCode());
        System.assertEquals(usageImagesResult3.hashCode(), usageImagesResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageImagesResult usageImagesResult = new OASUsageImagesResult();
        Map<String, String> x-property-mappings = usageImagesResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('numModelRequests', x-property-mappings.get('num_model_requests'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('apiKeyId', x-property-mappings.get('api_key_id'));
    }
}
