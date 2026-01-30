@isTest
private class OASAuditLogRateLimitUpdatedChangesReTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested1 = OASAuditLogRateLimitUpdatedChangesRe.getExample();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested2 = auditLogRateLimitUpdatedChangesRequested1;
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested3 = new OASAuditLogRateLimitUpdatedChangesRe();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested4 = auditLogRateLimitUpdatedChangesRequested3;

        System.assert(auditLogRateLimitUpdatedChangesRequested1.equals(auditLogRateLimitUpdatedChangesRequested2));
        System.assert(auditLogRateLimitUpdatedChangesRequested2.equals(auditLogRateLimitUpdatedChangesRequested1));
        System.assert(auditLogRateLimitUpdatedChangesRequested1.equals(auditLogRateLimitUpdatedChangesRequested1));
        System.assert(auditLogRateLimitUpdatedChangesRequested3.equals(auditLogRateLimitUpdatedChangesRequested4));
        System.assert(auditLogRateLimitUpdatedChangesRequested4.equals(auditLogRateLimitUpdatedChangesRequested3));
        System.assert(auditLogRateLimitUpdatedChangesRequested3.equals(auditLogRateLimitUpdatedChangesRequested3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested1 = OASAuditLogRateLimitUpdatedChangesRe.getExample();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested2 = OASAuditLogRateLimitUpdatedChangesRe.getExample();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested3 = new OASAuditLogRateLimitUpdatedChangesRe();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested4 = new OASAuditLogRateLimitUpdatedChangesRe();

        System.assert(auditLogRateLimitUpdatedChangesRequested1.equals(auditLogRateLimitUpdatedChangesRequested2));
        System.assert(auditLogRateLimitUpdatedChangesRequested2.equals(auditLogRateLimitUpdatedChangesRequested1));
        System.assert(auditLogRateLimitUpdatedChangesRequested3.equals(auditLogRateLimitUpdatedChangesRequested4));
        System.assert(auditLogRateLimitUpdatedChangesRequested4.equals(auditLogRateLimitUpdatedChangesRequested3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested1 = OASAuditLogRateLimitUpdatedChangesRe.getExample();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested2 = new OASAuditLogRateLimitUpdatedChangesRe();

        System.assertEquals(false, auditLogRateLimitUpdatedChangesRequested1.equals('foo'));
        System.assertEquals(false, auditLogRateLimitUpdatedChangesRequested2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested1 = OASAuditLogRateLimitUpdatedChangesRe.getExample();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested2 = new OASAuditLogRateLimitUpdatedChangesRe();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested3;

        System.assertEquals(false, auditLogRateLimitUpdatedChangesRequested1.equals(auditLogRateLimitUpdatedChangesRequested3));
        System.assertEquals(false, auditLogRateLimitUpdatedChangesRequested2.equals(auditLogRateLimitUpdatedChangesRequested3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested1 = OASAuditLogRateLimitUpdatedChangesRe.getExample();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested2 = new OASAuditLogRateLimitUpdatedChangesRe();

        System.assertEquals(auditLogRateLimitUpdatedChangesRequested1.hashCode(), auditLogRateLimitUpdatedChangesRequested1.hashCode());
        System.assertEquals(auditLogRateLimitUpdatedChangesRequested2.hashCode(), auditLogRateLimitUpdatedChangesRequested2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested1 = OASAuditLogRateLimitUpdatedChangesRe.getExample();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested2 = OASAuditLogRateLimitUpdatedChangesRe.getExample();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested3 = new OASAuditLogRateLimitUpdatedChangesRe();
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested4 = new OASAuditLogRateLimitUpdatedChangesRe();

        System.assert(auditLogRateLimitUpdatedChangesRequested1.equals(auditLogRateLimitUpdatedChangesRequested2));
        System.assert(auditLogRateLimitUpdatedChangesRequested3.equals(auditLogRateLimitUpdatedChangesRequested4));
        System.assertEquals(auditLogRateLimitUpdatedChangesRequested1.hashCode(), auditLogRateLimitUpdatedChangesRequested2.hashCode());
        System.assertEquals(auditLogRateLimitUpdatedChangesRequested3.hashCode(), auditLogRateLimitUpdatedChangesRequested4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogRateLimitUpdatedChangesRe auditLogRateLimitUpdatedChangesRequested = new OASAuditLogRateLimitUpdatedChangesRe();
        Map<String, String> x-property-mappings = auditLogRateLimitUpdatedChangesRequested.getx-property-mappings();
        System.assertEquals('maxRequestsPer1Minute', x-property-mappings.get('max_requests_per_1_minute'));
        System.assertEquals('maxTokensPer1Minute', x-property-mappings.get('max_tokens_per_1_minute'));
        System.assertEquals('maxImagesPer1Minute', x-property-mappings.get('max_images_per_1_minute'));
        System.assertEquals('maxAudioMegabytesPer1Minute', x-property-mappings.get('max_audio_megabytes_per_1_minute'));
        System.assertEquals('maxRequestsPer1Day', x-property-mappings.get('max_requests_per_1_day'));
        System.assertEquals('batch1DayMaxInputTokens', x-property-mappings.get('batch_1_day_max_input_tokens'));
    }
}
