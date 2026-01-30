@isTest
private class OASUsageEmbeddingsResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageEmbeddingsResult usageEmbeddingsResult1 = OASUsageEmbeddingsResult.getExample();
        OASUsageEmbeddingsResult usageEmbeddingsResult2 = usageEmbeddingsResult1;
        OASUsageEmbeddingsResult usageEmbeddingsResult3 = new OASUsageEmbeddingsResult();
        OASUsageEmbeddingsResult usageEmbeddingsResult4 = usageEmbeddingsResult3;

        System.assert(usageEmbeddingsResult1.equals(usageEmbeddingsResult2));
        System.assert(usageEmbeddingsResult2.equals(usageEmbeddingsResult1));
        System.assert(usageEmbeddingsResult1.equals(usageEmbeddingsResult1));
        System.assert(usageEmbeddingsResult3.equals(usageEmbeddingsResult4));
        System.assert(usageEmbeddingsResult4.equals(usageEmbeddingsResult3));
        System.assert(usageEmbeddingsResult3.equals(usageEmbeddingsResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageEmbeddingsResult usageEmbeddingsResult1 = OASUsageEmbeddingsResult.getExample();
        OASUsageEmbeddingsResult usageEmbeddingsResult2 = OASUsageEmbeddingsResult.getExample();
        OASUsageEmbeddingsResult usageEmbeddingsResult3 = new OASUsageEmbeddingsResult();
        OASUsageEmbeddingsResult usageEmbeddingsResult4 = new OASUsageEmbeddingsResult();

        System.assert(usageEmbeddingsResult1.equals(usageEmbeddingsResult2));
        System.assert(usageEmbeddingsResult2.equals(usageEmbeddingsResult1));
        System.assert(usageEmbeddingsResult3.equals(usageEmbeddingsResult4));
        System.assert(usageEmbeddingsResult4.equals(usageEmbeddingsResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageEmbeddingsResult usageEmbeddingsResult1 = OASUsageEmbeddingsResult.getExample();
        OASUsageEmbeddingsResult usageEmbeddingsResult2 = new OASUsageEmbeddingsResult();

        System.assertEquals(false, usageEmbeddingsResult1.equals('foo'));
        System.assertEquals(false, usageEmbeddingsResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageEmbeddingsResult usageEmbeddingsResult1 = OASUsageEmbeddingsResult.getExample();
        OASUsageEmbeddingsResult usageEmbeddingsResult2 = new OASUsageEmbeddingsResult();
        OASUsageEmbeddingsResult usageEmbeddingsResult3;

        System.assertEquals(false, usageEmbeddingsResult1.equals(usageEmbeddingsResult3));
        System.assertEquals(false, usageEmbeddingsResult2.equals(usageEmbeddingsResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageEmbeddingsResult usageEmbeddingsResult1 = OASUsageEmbeddingsResult.getExample();
        OASUsageEmbeddingsResult usageEmbeddingsResult2 = new OASUsageEmbeddingsResult();

        System.assertEquals(usageEmbeddingsResult1.hashCode(), usageEmbeddingsResult1.hashCode());
        System.assertEquals(usageEmbeddingsResult2.hashCode(), usageEmbeddingsResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageEmbeddingsResult usageEmbeddingsResult1 = OASUsageEmbeddingsResult.getExample();
        OASUsageEmbeddingsResult usageEmbeddingsResult2 = OASUsageEmbeddingsResult.getExample();
        OASUsageEmbeddingsResult usageEmbeddingsResult3 = new OASUsageEmbeddingsResult();
        OASUsageEmbeddingsResult usageEmbeddingsResult4 = new OASUsageEmbeddingsResult();

        System.assert(usageEmbeddingsResult1.equals(usageEmbeddingsResult2));
        System.assert(usageEmbeddingsResult3.equals(usageEmbeddingsResult4));
        System.assertEquals(usageEmbeddingsResult1.hashCode(), usageEmbeddingsResult2.hashCode());
        System.assertEquals(usageEmbeddingsResult3.hashCode(), usageEmbeddingsResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageEmbeddingsResult usageEmbeddingsResult = new OASUsageEmbeddingsResult();
        Map<String, String> x-property-mappings = usageEmbeddingsResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('inputTokens', x-property-mappings.get('input_tokens'));
        System.assertEquals('numModelRequests', x-property-mappings.get('num_model_requests'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('apiKeyId', x-property-mappings.get('api_key_id'));
    }
}
