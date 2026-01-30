@isTest
private class OASProjectRateLimitTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectRateLimit projectRateLimit1 = OASProjectRateLimit.getExample();
        OASProjectRateLimit projectRateLimit2 = projectRateLimit1;
        OASProjectRateLimit projectRateLimit3 = new OASProjectRateLimit();
        OASProjectRateLimit projectRateLimit4 = projectRateLimit3;

        System.assert(projectRateLimit1.equals(projectRateLimit2));
        System.assert(projectRateLimit2.equals(projectRateLimit1));
        System.assert(projectRateLimit1.equals(projectRateLimit1));
        System.assert(projectRateLimit3.equals(projectRateLimit4));
        System.assert(projectRateLimit4.equals(projectRateLimit3));
        System.assert(projectRateLimit3.equals(projectRateLimit3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectRateLimit projectRateLimit1 = OASProjectRateLimit.getExample();
        OASProjectRateLimit projectRateLimit2 = OASProjectRateLimit.getExample();
        OASProjectRateLimit projectRateLimit3 = new OASProjectRateLimit();
        OASProjectRateLimit projectRateLimit4 = new OASProjectRateLimit();

        System.assert(projectRateLimit1.equals(projectRateLimit2));
        System.assert(projectRateLimit2.equals(projectRateLimit1));
        System.assert(projectRateLimit3.equals(projectRateLimit4));
        System.assert(projectRateLimit4.equals(projectRateLimit3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectRateLimit projectRateLimit1 = OASProjectRateLimit.getExample();
        OASProjectRateLimit projectRateLimit2 = new OASProjectRateLimit();

        System.assertEquals(false, projectRateLimit1.equals('foo'));
        System.assertEquals(false, projectRateLimit2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectRateLimit projectRateLimit1 = OASProjectRateLimit.getExample();
        OASProjectRateLimit projectRateLimit2 = new OASProjectRateLimit();
        OASProjectRateLimit projectRateLimit3;

        System.assertEquals(false, projectRateLimit1.equals(projectRateLimit3));
        System.assertEquals(false, projectRateLimit2.equals(projectRateLimit3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectRateLimit projectRateLimit1 = OASProjectRateLimit.getExample();
        OASProjectRateLimit projectRateLimit2 = new OASProjectRateLimit();

        System.assertEquals(projectRateLimit1.hashCode(), projectRateLimit1.hashCode());
        System.assertEquals(projectRateLimit2.hashCode(), projectRateLimit2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectRateLimit projectRateLimit1 = OASProjectRateLimit.getExample();
        OASProjectRateLimit projectRateLimit2 = OASProjectRateLimit.getExample();
        OASProjectRateLimit projectRateLimit3 = new OASProjectRateLimit();
        OASProjectRateLimit projectRateLimit4 = new OASProjectRateLimit();

        System.assert(projectRateLimit1.equals(projectRateLimit2));
        System.assert(projectRateLimit3.equals(projectRateLimit4));
        System.assertEquals(projectRateLimit1.hashCode(), projectRateLimit2.hashCode());
        System.assertEquals(projectRateLimit3.hashCode(), projectRateLimit4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectRateLimit projectRateLimit = new OASProjectRateLimit();
        Map<String, String> x-property-mappings = projectRateLimit.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('maxRequestsPer1Minute', x-property-mappings.get('max_requests_per_1_minute'));
        System.assertEquals('maxTokensPer1Minute', x-property-mappings.get('max_tokens_per_1_minute'));
        System.assertEquals('maxImagesPer1Minute', x-property-mappings.get('max_images_per_1_minute'));
        System.assertEquals('maxAudioMegabytesPer1Minute', x-property-mappings.get('max_audio_megabytes_per_1_minute'));
        System.assertEquals('maxRequestsPer1Day', x-property-mappings.get('max_requests_per_1_day'));
        System.assertEquals('batch1DayMaxInputTokens', x-property-mappings.get('batch_1_day_max_input_tokens'));
    }
}
