@isTest
private class OASUsageAudioTranscriptionsResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult1 = OASUsageAudioTranscriptionsResult.getExample();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult2 = usageAudioTranscriptionsResult1;
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult3 = new OASUsageAudioTranscriptionsResult();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult4 = usageAudioTranscriptionsResult3;

        System.assert(usageAudioTranscriptionsResult1.equals(usageAudioTranscriptionsResult2));
        System.assert(usageAudioTranscriptionsResult2.equals(usageAudioTranscriptionsResult1));
        System.assert(usageAudioTranscriptionsResult1.equals(usageAudioTranscriptionsResult1));
        System.assert(usageAudioTranscriptionsResult3.equals(usageAudioTranscriptionsResult4));
        System.assert(usageAudioTranscriptionsResult4.equals(usageAudioTranscriptionsResult3));
        System.assert(usageAudioTranscriptionsResult3.equals(usageAudioTranscriptionsResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult1 = OASUsageAudioTranscriptionsResult.getExample();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult2 = OASUsageAudioTranscriptionsResult.getExample();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult3 = new OASUsageAudioTranscriptionsResult();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult4 = new OASUsageAudioTranscriptionsResult();

        System.assert(usageAudioTranscriptionsResult1.equals(usageAudioTranscriptionsResult2));
        System.assert(usageAudioTranscriptionsResult2.equals(usageAudioTranscriptionsResult1));
        System.assert(usageAudioTranscriptionsResult3.equals(usageAudioTranscriptionsResult4));
        System.assert(usageAudioTranscriptionsResult4.equals(usageAudioTranscriptionsResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult1 = OASUsageAudioTranscriptionsResult.getExample();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult2 = new OASUsageAudioTranscriptionsResult();

        System.assertEquals(false, usageAudioTranscriptionsResult1.equals('foo'));
        System.assertEquals(false, usageAudioTranscriptionsResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult1 = OASUsageAudioTranscriptionsResult.getExample();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult2 = new OASUsageAudioTranscriptionsResult();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult3;

        System.assertEquals(false, usageAudioTranscriptionsResult1.equals(usageAudioTranscriptionsResult3));
        System.assertEquals(false, usageAudioTranscriptionsResult2.equals(usageAudioTranscriptionsResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult1 = OASUsageAudioTranscriptionsResult.getExample();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult2 = new OASUsageAudioTranscriptionsResult();

        System.assertEquals(usageAudioTranscriptionsResult1.hashCode(), usageAudioTranscriptionsResult1.hashCode());
        System.assertEquals(usageAudioTranscriptionsResult2.hashCode(), usageAudioTranscriptionsResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult1 = OASUsageAudioTranscriptionsResult.getExample();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult2 = OASUsageAudioTranscriptionsResult.getExample();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult3 = new OASUsageAudioTranscriptionsResult();
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult4 = new OASUsageAudioTranscriptionsResult();

        System.assert(usageAudioTranscriptionsResult1.equals(usageAudioTranscriptionsResult2));
        System.assert(usageAudioTranscriptionsResult3.equals(usageAudioTranscriptionsResult4));
        System.assertEquals(usageAudioTranscriptionsResult1.hashCode(), usageAudioTranscriptionsResult2.hashCode());
        System.assertEquals(usageAudioTranscriptionsResult3.hashCode(), usageAudioTranscriptionsResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageAudioTranscriptionsResult usageAudioTranscriptionsResult = new OASUsageAudioTranscriptionsResult();
        Map<String, String> x-property-mappings = usageAudioTranscriptionsResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('numModelRequests', x-property-mappings.get('num_model_requests'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('apiKeyId', x-property-mappings.get('api_key_id'));
    }
}
