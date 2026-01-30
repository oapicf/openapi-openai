@isTest
private class OASProjectRateLimitUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest1 = OASProjectRateLimitUpdateRequest.getExample();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest2 = projectRateLimitUpdateRequest1;
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest3 = new OASProjectRateLimitUpdateRequest();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest4 = projectRateLimitUpdateRequest3;

        System.assert(projectRateLimitUpdateRequest1.equals(projectRateLimitUpdateRequest2));
        System.assert(projectRateLimitUpdateRequest2.equals(projectRateLimitUpdateRequest1));
        System.assert(projectRateLimitUpdateRequest1.equals(projectRateLimitUpdateRequest1));
        System.assert(projectRateLimitUpdateRequest3.equals(projectRateLimitUpdateRequest4));
        System.assert(projectRateLimitUpdateRequest4.equals(projectRateLimitUpdateRequest3));
        System.assert(projectRateLimitUpdateRequest3.equals(projectRateLimitUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest1 = OASProjectRateLimitUpdateRequest.getExample();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest2 = OASProjectRateLimitUpdateRequest.getExample();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest3 = new OASProjectRateLimitUpdateRequest();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest4 = new OASProjectRateLimitUpdateRequest();

        System.assert(projectRateLimitUpdateRequest1.equals(projectRateLimitUpdateRequest2));
        System.assert(projectRateLimitUpdateRequest2.equals(projectRateLimitUpdateRequest1));
        System.assert(projectRateLimitUpdateRequest3.equals(projectRateLimitUpdateRequest4));
        System.assert(projectRateLimitUpdateRequest4.equals(projectRateLimitUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest1 = OASProjectRateLimitUpdateRequest.getExample();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest2 = new OASProjectRateLimitUpdateRequest();

        System.assertEquals(false, projectRateLimitUpdateRequest1.equals('foo'));
        System.assertEquals(false, projectRateLimitUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest1 = OASProjectRateLimitUpdateRequest.getExample();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest2 = new OASProjectRateLimitUpdateRequest();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest3;

        System.assertEquals(false, projectRateLimitUpdateRequest1.equals(projectRateLimitUpdateRequest3));
        System.assertEquals(false, projectRateLimitUpdateRequest2.equals(projectRateLimitUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest1 = OASProjectRateLimitUpdateRequest.getExample();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest2 = new OASProjectRateLimitUpdateRequest();

        System.assertEquals(projectRateLimitUpdateRequest1.hashCode(), projectRateLimitUpdateRequest1.hashCode());
        System.assertEquals(projectRateLimitUpdateRequest2.hashCode(), projectRateLimitUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest1 = OASProjectRateLimitUpdateRequest.getExample();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest2 = OASProjectRateLimitUpdateRequest.getExample();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest3 = new OASProjectRateLimitUpdateRequest();
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest4 = new OASProjectRateLimitUpdateRequest();

        System.assert(projectRateLimitUpdateRequest1.equals(projectRateLimitUpdateRequest2));
        System.assert(projectRateLimitUpdateRequest3.equals(projectRateLimitUpdateRequest4));
        System.assertEquals(projectRateLimitUpdateRequest1.hashCode(), projectRateLimitUpdateRequest2.hashCode());
        System.assertEquals(projectRateLimitUpdateRequest3.hashCode(), projectRateLimitUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectRateLimitUpdateRequest projectRateLimitUpdateRequest = new OASProjectRateLimitUpdateRequest();
        Map<String, String> x-property-mappings = projectRateLimitUpdateRequest.getx-property-mappings();
        System.assertEquals('maxRequestsPer1Minute', x-property-mappings.get('max_requests_per_1_minute'));
        System.assertEquals('maxTokensPer1Minute', x-property-mappings.get('max_tokens_per_1_minute'));
        System.assertEquals('maxImagesPer1Minute', x-property-mappings.get('max_images_per_1_minute'));
        System.assertEquals('maxAudioMegabytesPer1Minute', x-property-mappings.get('max_audio_megabytes_per_1_minute'));
        System.assertEquals('maxRequestsPer1Day', x-property-mappings.get('max_requests_per_1_day'));
        System.assertEquals('batch1DayMaxInputTokens', x-property-mappings.get('batch_1_day_max_input_tokens'));
    }
}
