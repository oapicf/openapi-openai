@isTest
private class OASUsageCompletionsResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageCompletionsResult usageCompletionsResult1 = OASUsageCompletionsResult.getExample();
        OASUsageCompletionsResult usageCompletionsResult2 = usageCompletionsResult1;
        OASUsageCompletionsResult usageCompletionsResult3 = new OASUsageCompletionsResult();
        OASUsageCompletionsResult usageCompletionsResult4 = usageCompletionsResult3;

        System.assert(usageCompletionsResult1.equals(usageCompletionsResult2));
        System.assert(usageCompletionsResult2.equals(usageCompletionsResult1));
        System.assert(usageCompletionsResult1.equals(usageCompletionsResult1));
        System.assert(usageCompletionsResult3.equals(usageCompletionsResult4));
        System.assert(usageCompletionsResult4.equals(usageCompletionsResult3));
        System.assert(usageCompletionsResult3.equals(usageCompletionsResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageCompletionsResult usageCompletionsResult1 = OASUsageCompletionsResult.getExample();
        OASUsageCompletionsResult usageCompletionsResult2 = OASUsageCompletionsResult.getExample();
        OASUsageCompletionsResult usageCompletionsResult3 = new OASUsageCompletionsResult();
        OASUsageCompletionsResult usageCompletionsResult4 = new OASUsageCompletionsResult();

        System.assert(usageCompletionsResult1.equals(usageCompletionsResult2));
        System.assert(usageCompletionsResult2.equals(usageCompletionsResult1));
        System.assert(usageCompletionsResult3.equals(usageCompletionsResult4));
        System.assert(usageCompletionsResult4.equals(usageCompletionsResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageCompletionsResult usageCompletionsResult1 = OASUsageCompletionsResult.getExample();
        OASUsageCompletionsResult usageCompletionsResult2 = new OASUsageCompletionsResult();

        System.assertEquals(false, usageCompletionsResult1.equals('foo'));
        System.assertEquals(false, usageCompletionsResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageCompletionsResult usageCompletionsResult1 = OASUsageCompletionsResult.getExample();
        OASUsageCompletionsResult usageCompletionsResult2 = new OASUsageCompletionsResult();
        OASUsageCompletionsResult usageCompletionsResult3;

        System.assertEquals(false, usageCompletionsResult1.equals(usageCompletionsResult3));
        System.assertEquals(false, usageCompletionsResult2.equals(usageCompletionsResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageCompletionsResult usageCompletionsResult1 = OASUsageCompletionsResult.getExample();
        OASUsageCompletionsResult usageCompletionsResult2 = new OASUsageCompletionsResult();

        System.assertEquals(usageCompletionsResult1.hashCode(), usageCompletionsResult1.hashCode());
        System.assertEquals(usageCompletionsResult2.hashCode(), usageCompletionsResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageCompletionsResult usageCompletionsResult1 = OASUsageCompletionsResult.getExample();
        OASUsageCompletionsResult usageCompletionsResult2 = OASUsageCompletionsResult.getExample();
        OASUsageCompletionsResult usageCompletionsResult3 = new OASUsageCompletionsResult();
        OASUsageCompletionsResult usageCompletionsResult4 = new OASUsageCompletionsResult();

        System.assert(usageCompletionsResult1.equals(usageCompletionsResult2));
        System.assert(usageCompletionsResult3.equals(usageCompletionsResult4));
        System.assertEquals(usageCompletionsResult1.hashCode(), usageCompletionsResult2.hashCode());
        System.assertEquals(usageCompletionsResult3.hashCode(), usageCompletionsResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageCompletionsResult usageCompletionsResult = new OASUsageCompletionsResult();
        Map<String, String> x-property-mappings = usageCompletionsResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('inputTokens', x-property-mappings.get('input_tokens'));
        System.assertEquals('inputCachedTokens', x-property-mappings.get('input_cached_tokens'));
        System.assertEquals('outputTokens', x-property-mappings.get('output_tokens'));
        System.assertEquals('inputAudioTokens', x-property-mappings.get('input_audio_tokens'));
        System.assertEquals('outputAudioTokens', x-property-mappings.get('output_audio_tokens'));
        System.assertEquals('numModelRequests', x-property-mappings.get('num_model_requests'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('apiKeyId', x-property-mappings.get('api_key_id'));
    }
}
