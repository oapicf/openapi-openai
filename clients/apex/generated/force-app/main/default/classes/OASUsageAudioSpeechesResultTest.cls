@isTest
private class OASUsageAudioSpeechesResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageAudioSpeechesResult usageAudioSpeechesResult1 = OASUsageAudioSpeechesResult.getExample();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult2 = usageAudioSpeechesResult1;
        OASUsageAudioSpeechesResult usageAudioSpeechesResult3 = new OASUsageAudioSpeechesResult();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult4 = usageAudioSpeechesResult3;

        System.assert(usageAudioSpeechesResult1.equals(usageAudioSpeechesResult2));
        System.assert(usageAudioSpeechesResult2.equals(usageAudioSpeechesResult1));
        System.assert(usageAudioSpeechesResult1.equals(usageAudioSpeechesResult1));
        System.assert(usageAudioSpeechesResult3.equals(usageAudioSpeechesResult4));
        System.assert(usageAudioSpeechesResult4.equals(usageAudioSpeechesResult3));
        System.assert(usageAudioSpeechesResult3.equals(usageAudioSpeechesResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageAudioSpeechesResult usageAudioSpeechesResult1 = OASUsageAudioSpeechesResult.getExample();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult2 = OASUsageAudioSpeechesResult.getExample();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult3 = new OASUsageAudioSpeechesResult();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult4 = new OASUsageAudioSpeechesResult();

        System.assert(usageAudioSpeechesResult1.equals(usageAudioSpeechesResult2));
        System.assert(usageAudioSpeechesResult2.equals(usageAudioSpeechesResult1));
        System.assert(usageAudioSpeechesResult3.equals(usageAudioSpeechesResult4));
        System.assert(usageAudioSpeechesResult4.equals(usageAudioSpeechesResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageAudioSpeechesResult usageAudioSpeechesResult1 = OASUsageAudioSpeechesResult.getExample();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult2 = new OASUsageAudioSpeechesResult();

        System.assertEquals(false, usageAudioSpeechesResult1.equals('foo'));
        System.assertEquals(false, usageAudioSpeechesResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageAudioSpeechesResult usageAudioSpeechesResult1 = OASUsageAudioSpeechesResult.getExample();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult2 = new OASUsageAudioSpeechesResult();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult3;

        System.assertEquals(false, usageAudioSpeechesResult1.equals(usageAudioSpeechesResult3));
        System.assertEquals(false, usageAudioSpeechesResult2.equals(usageAudioSpeechesResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageAudioSpeechesResult usageAudioSpeechesResult1 = OASUsageAudioSpeechesResult.getExample();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult2 = new OASUsageAudioSpeechesResult();

        System.assertEquals(usageAudioSpeechesResult1.hashCode(), usageAudioSpeechesResult1.hashCode());
        System.assertEquals(usageAudioSpeechesResult2.hashCode(), usageAudioSpeechesResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageAudioSpeechesResult usageAudioSpeechesResult1 = OASUsageAudioSpeechesResult.getExample();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult2 = OASUsageAudioSpeechesResult.getExample();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult3 = new OASUsageAudioSpeechesResult();
        OASUsageAudioSpeechesResult usageAudioSpeechesResult4 = new OASUsageAudioSpeechesResult();

        System.assert(usageAudioSpeechesResult1.equals(usageAudioSpeechesResult2));
        System.assert(usageAudioSpeechesResult3.equals(usageAudioSpeechesResult4));
        System.assertEquals(usageAudioSpeechesResult1.hashCode(), usageAudioSpeechesResult2.hashCode());
        System.assertEquals(usageAudioSpeechesResult3.hashCode(), usageAudioSpeechesResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageAudioSpeechesResult usageAudioSpeechesResult = new OASUsageAudioSpeechesResult();
        Map<String, String> x-property-mappings = usageAudioSpeechesResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('numModelRequests', x-property-mappings.get('num_model_requests'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('apiKeyId', x-property-mappings.get('api_key_id'));
    }
}
