@isTest
private class OASAuditLogRateLimitUpdatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated1 = OASAuditLogRateLimitUpdated.getExample();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated2 = auditLogRateLimitUpdated1;
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated3 = new OASAuditLogRateLimitUpdated();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated4 = auditLogRateLimitUpdated3;

        System.assert(auditLogRateLimitUpdated1.equals(auditLogRateLimitUpdated2));
        System.assert(auditLogRateLimitUpdated2.equals(auditLogRateLimitUpdated1));
        System.assert(auditLogRateLimitUpdated1.equals(auditLogRateLimitUpdated1));
        System.assert(auditLogRateLimitUpdated3.equals(auditLogRateLimitUpdated4));
        System.assert(auditLogRateLimitUpdated4.equals(auditLogRateLimitUpdated3));
        System.assert(auditLogRateLimitUpdated3.equals(auditLogRateLimitUpdated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated1 = OASAuditLogRateLimitUpdated.getExample();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated2 = OASAuditLogRateLimitUpdated.getExample();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated3 = new OASAuditLogRateLimitUpdated();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated4 = new OASAuditLogRateLimitUpdated();

        System.assert(auditLogRateLimitUpdated1.equals(auditLogRateLimitUpdated2));
        System.assert(auditLogRateLimitUpdated2.equals(auditLogRateLimitUpdated1));
        System.assert(auditLogRateLimitUpdated3.equals(auditLogRateLimitUpdated4));
        System.assert(auditLogRateLimitUpdated4.equals(auditLogRateLimitUpdated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated1 = OASAuditLogRateLimitUpdated.getExample();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated2 = new OASAuditLogRateLimitUpdated();

        System.assertEquals(false, auditLogRateLimitUpdated1.equals('foo'));
        System.assertEquals(false, auditLogRateLimitUpdated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated1 = OASAuditLogRateLimitUpdated.getExample();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated2 = new OASAuditLogRateLimitUpdated();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated3;

        System.assertEquals(false, auditLogRateLimitUpdated1.equals(auditLogRateLimitUpdated3));
        System.assertEquals(false, auditLogRateLimitUpdated2.equals(auditLogRateLimitUpdated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated1 = OASAuditLogRateLimitUpdated.getExample();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated2 = new OASAuditLogRateLimitUpdated();

        System.assertEquals(auditLogRateLimitUpdated1.hashCode(), auditLogRateLimitUpdated1.hashCode());
        System.assertEquals(auditLogRateLimitUpdated2.hashCode(), auditLogRateLimitUpdated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated1 = OASAuditLogRateLimitUpdated.getExample();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated2 = OASAuditLogRateLimitUpdated.getExample();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated3 = new OASAuditLogRateLimitUpdated();
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated4 = new OASAuditLogRateLimitUpdated();

        System.assert(auditLogRateLimitUpdated1.equals(auditLogRateLimitUpdated2));
        System.assert(auditLogRateLimitUpdated3.equals(auditLogRateLimitUpdated4));
        System.assertEquals(auditLogRateLimitUpdated1.hashCode(), auditLogRateLimitUpdated2.hashCode());
        System.assertEquals(auditLogRateLimitUpdated3.hashCode(), auditLogRateLimitUpdated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogRateLimitUpdated auditLogRateLimitUpdated = new OASAuditLogRateLimitUpdated();
        Map<String, String> x-property-mappings = auditLogRateLimitUpdated.getx-property-mappings();
        System.assertEquals('changesRequested', x-property-mappings.get('changes_requested'));
    }
}
