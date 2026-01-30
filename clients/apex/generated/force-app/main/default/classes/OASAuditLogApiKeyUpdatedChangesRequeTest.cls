@isTest
private class OASAuditLogApiKeyUpdatedChangesRequeTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested1 = OASAuditLogApiKeyUpdatedChangesReque.getExample();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested2 = auditLogApiKeyUpdatedChangesRequested1;
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested3 = new OASAuditLogApiKeyUpdatedChangesReque();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested4 = auditLogApiKeyUpdatedChangesRequested3;

        System.assert(auditLogApiKeyUpdatedChangesRequested1.equals(auditLogApiKeyUpdatedChangesRequested2));
        System.assert(auditLogApiKeyUpdatedChangesRequested2.equals(auditLogApiKeyUpdatedChangesRequested1));
        System.assert(auditLogApiKeyUpdatedChangesRequested1.equals(auditLogApiKeyUpdatedChangesRequested1));
        System.assert(auditLogApiKeyUpdatedChangesRequested3.equals(auditLogApiKeyUpdatedChangesRequested4));
        System.assert(auditLogApiKeyUpdatedChangesRequested4.equals(auditLogApiKeyUpdatedChangesRequested3));
        System.assert(auditLogApiKeyUpdatedChangesRequested3.equals(auditLogApiKeyUpdatedChangesRequested3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested1 = OASAuditLogApiKeyUpdatedChangesReque.getExample();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested2 = OASAuditLogApiKeyUpdatedChangesReque.getExample();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested3 = new OASAuditLogApiKeyUpdatedChangesReque();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested4 = new OASAuditLogApiKeyUpdatedChangesReque();

        System.assert(auditLogApiKeyUpdatedChangesRequested1.equals(auditLogApiKeyUpdatedChangesRequested2));
        System.assert(auditLogApiKeyUpdatedChangesRequested2.equals(auditLogApiKeyUpdatedChangesRequested1));
        System.assert(auditLogApiKeyUpdatedChangesRequested3.equals(auditLogApiKeyUpdatedChangesRequested4));
        System.assert(auditLogApiKeyUpdatedChangesRequested4.equals(auditLogApiKeyUpdatedChangesRequested3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested1 = OASAuditLogApiKeyUpdatedChangesReque.getExample();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested2 = new OASAuditLogApiKeyUpdatedChangesReque();

        System.assertEquals(false, auditLogApiKeyUpdatedChangesRequested1.equals('foo'));
        System.assertEquals(false, auditLogApiKeyUpdatedChangesRequested2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested1 = OASAuditLogApiKeyUpdatedChangesReque.getExample();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested2 = new OASAuditLogApiKeyUpdatedChangesReque();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested3;

        System.assertEquals(false, auditLogApiKeyUpdatedChangesRequested1.equals(auditLogApiKeyUpdatedChangesRequested3));
        System.assertEquals(false, auditLogApiKeyUpdatedChangesRequested2.equals(auditLogApiKeyUpdatedChangesRequested3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested1 = OASAuditLogApiKeyUpdatedChangesReque.getExample();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested2 = new OASAuditLogApiKeyUpdatedChangesReque();

        System.assertEquals(auditLogApiKeyUpdatedChangesRequested1.hashCode(), auditLogApiKeyUpdatedChangesRequested1.hashCode());
        System.assertEquals(auditLogApiKeyUpdatedChangesRequested2.hashCode(), auditLogApiKeyUpdatedChangesRequested2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested1 = OASAuditLogApiKeyUpdatedChangesReque.getExample();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested2 = OASAuditLogApiKeyUpdatedChangesReque.getExample();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested3 = new OASAuditLogApiKeyUpdatedChangesReque();
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested4 = new OASAuditLogApiKeyUpdatedChangesReque();

        System.assert(auditLogApiKeyUpdatedChangesRequested1.equals(auditLogApiKeyUpdatedChangesRequested2));
        System.assert(auditLogApiKeyUpdatedChangesRequested3.equals(auditLogApiKeyUpdatedChangesRequested4));
        System.assertEquals(auditLogApiKeyUpdatedChangesRequested1.hashCode(), auditLogApiKeyUpdatedChangesRequested2.hashCode());
        System.assertEquals(auditLogApiKeyUpdatedChangesRequested3.hashCode(), auditLogApiKeyUpdatedChangesRequested4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAuditLogApiKeyUpdatedChangesReque auditLogApiKeyUpdatedChangesRequested = new OASAuditLogApiKeyUpdatedChangesReque();
        System.assertEquals(new List<String>(), auditLogApiKeyUpdatedChangesRequested.scopes);
    }
}
