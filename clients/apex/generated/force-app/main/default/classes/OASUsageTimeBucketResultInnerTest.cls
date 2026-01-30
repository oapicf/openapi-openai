@isTest
private class OASUsageTimeBucketResultInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageTimeBucketResultInner usageTimeBucketResultInner1 = OASUsageTimeBucketResultInner.getExample();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner2 = usageTimeBucketResultInner1;
        OASUsageTimeBucketResultInner usageTimeBucketResultInner3 = new OASUsageTimeBucketResultInner();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner4 = usageTimeBucketResultInner3;

        System.assert(usageTimeBucketResultInner1.equals(usageTimeBucketResultInner2));
        System.assert(usageTimeBucketResultInner2.equals(usageTimeBucketResultInner1));
        System.assert(usageTimeBucketResultInner1.equals(usageTimeBucketResultInner1));
        System.assert(usageTimeBucketResultInner3.equals(usageTimeBucketResultInner4));
        System.assert(usageTimeBucketResultInner4.equals(usageTimeBucketResultInner3));
        System.assert(usageTimeBucketResultInner3.equals(usageTimeBucketResultInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageTimeBucketResultInner usageTimeBucketResultInner1 = OASUsageTimeBucketResultInner.getExample();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner2 = OASUsageTimeBucketResultInner.getExample();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner3 = new OASUsageTimeBucketResultInner();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner4 = new OASUsageTimeBucketResultInner();

        System.assert(usageTimeBucketResultInner1.equals(usageTimeBucketResultInner2));
        System.assert(usageTimeBucketResultInner2.equals(usageTimeBucketResultInner1));
        System.assert(usageTimeBucketResultInner3.equals(usageTimeBucketResultInner4));
        System.assert(usageTimeBucketResultInner4.equals(usageTimeBucketResultInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageTimeBucketResultInner usageTimeBucketResultInner1 = OASUsageTimeBucketResultInner.getExample();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner2 = new OASUsageTimeBucketResultInner();

        System.assertEquals(false, usageTimeBucketResultInner1.equals('foo'));
        System.assertEquals(false, usageTimeBucketResultInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageTimeBucketResultInner usageTimeBucketResultInner1 = OASUsageTimeBucketResultInner.getExample();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner2 = new OASUsageTimeBucketResultInner();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner3;

        System.assertEquals(false, usageTimeBucketResultInner1.equals(usageTimeBucketResultInner3));
        System.assertEquals(false, usageTimeBucketResultInner2.equals(usageTimeBucketResultInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageTimeBucketResultInner usageTimeBucketResultInner1 = OASUsageTimeBucketResultInner.getExample();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner2 = new OASUsageTimeBucketResultInner();

        System.assertEquals(usageTimeBucketResultInner1.hashCode(), usageTimeBucketResultInner1.hashCode());
        System.assertEquals(usageTimeBucketResultInner2.hashCode(), usageTimeBucketResultInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageTimeBucketResultInner usageTimeBucketResultInner1 = OASUsageTimeBucketResultInner.getExample();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner2 = OASUsageTimeBucketResultInner.getExample();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner3 = new OASUsageTimeBucketResultInner();
        OASUsageTimeBucketResultInner usageTimeBucketResultInner4 = new OASUsageTimeBucketResultInner();

        System.assert(usageTimeBucketResultInner1.equals(usageTimeBucketResultInner2));
        System.assert(usageTimeBucketResultInner3.equals(usageTimeBucketResultInner4));
        System.assertEquals(usageTimeBucketResultInner1.hashCode(), usageTimeBucketResultInner2.hashCode());
        System.assertEquals(usageTimeBucketResultInner3.hashCode(), usageTimeBucketResultInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageTimeBucketResultInner usageTimeBucketResultInner = new OASUsageTimeBucketResultInner();
        Map<String, String> x-property-mappings = usageTimeBucketResultInner.getx-property-mappings();
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
        System.assertEquals('usageBytes', x-property-mappings.get('usage_bytes'));
        System.assertEquals('lineItem', x-property-mappings.get('line_item'));
    }
}
