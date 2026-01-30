@isTest
private class OASUsageModerationsResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageModerationsResult usageModerationsResult1 = OASUsageModerationsResult.getExample();
        OASUsageModerationsResult usageModerationsResult2 = usageModerationsResult1;
        OASUsageModerationsResult usageModerationsResult3 = new OASUsageModerationsResult();
        OASUsageModerationsResult usageModerationsResult4 = usageModerationsResult3;

        System.assert(usageModerationsResult1.equals(usageModerationsResult2));
        System.assert(usageModerationsResult2.equals(usageModerationsResult1));
        System.assert(usageModerationsResult1.equals(usageModerationsResult1));
        System.assert(usageModerationsResult3.equals(usageModerationsResult4));
        System.assert(usageModerationsResult4.equals(usageModerationsResult3));
        System.assert(usageModerationsResult3.equals(usageModerationsResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageModerationsResult usageModerationsResult1 = OASUsageModerationsResult.getExample();
        OASUsageModerationsResult usageModerationsResult2 = OASUsageModerationsResult.getExample();
        OASUsageModerationsResult usageModerationsResult3 = new OASUsageModerationsResult();
        OASUsageModerationsResult usageModerationsResult4 = new OASUsageModerationsResult();

        System.assert(usageModerationsResult1.equals(usageModerationsResult2));
        System.assert(usageModerationsResult2.equals(usageModerationsResult1));
        System.assert(usageModerationsResult3.equals(usageModerationsResult4));
        System.assert(usageModerationsResult4.equals(usageModerationsResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageModerationsResult usageModerationsResult1 = OASUsageModerationsResult.getExample();
        OASUsageModerationsResult usageModerationsResult2 = new OASUsageModerationsResult();

        System.assertEquals(false, usageModerationsResult1.equals('foo'));
        System.assertEquals(false, usageModerationsResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageModerationsResult usageModerationsResult1 = OASUsageModerationsResult.getExample();
        OASUsageModerationsResult usageModerationsResult2 = new OASUsageModerationsResult();
        OASUsageModerationsResult usageModerationsResult3;

        System.assertEquals(false, usageModerationsResult1.equals(usageModerationsResult3));
        System.assertEquals(false, usageModerationsResult2.equals(usageModerationsResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageModerationsResult usageModerationsResult1 = OASUsageModerationsResult.getExample();
        OASUsageModerationsResult usageModerationsResult2 = new OASUsageModerationsResult();

        System.assertEquals(usageModerationsResult1.hashCode(), usageModerationsResult1.hashCode());
        System.assertEquals(usageModerationsResult2.hashCode(), usageModerationsResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageModerationsResult usageModerationsResult1 = OASUsageModerationsResult.getExample();
        OASUsageModerationsResult usageModerationsResult2 = OASUsageModerationsResult.getExample();
        OASUsageModerationsResult usageModerationsResult3 = new OASUsageModerationsResult();
        OASUsageModerationsResult usageModerationsResult4 = new OASUsageModerationsResult();

        System.assert(usageModerationsResult1.equals(usageModerationsResult2));
        System.assert(usageModerationsResult3.equals(usageModerationsResult4));
        System.assertEquals(usageModerationsResult1.hashCode(), usageModerationsResult2.hashCode());
        System.assertEquals(usageModerationsResult3.hashCode(), usageModerationsResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageModerationsResult usageModerationsResult = new OASUsageModerationsResult();
        Map<String, String> x-property-mappings = usageModerationsResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('inputTokens', x-property-mappings.get('input_tokens'));
        System.assertEquals('numModelRequests', x-property-mappings.get('num_model_requests'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('apiKeyId', x-property-mappings.get('api_key_id'));
    }
}
