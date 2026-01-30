@isTest
private class OASAuditLogServiceAccountUpdatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated1 = OASAuditLogServiceAccountUpdated.getExample();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated2 = auditLogServiceAccountUpdated1;
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated3 = new OASAuditLogServiceAccountUpdated();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated4 = auditLogServiceAccountUpdated3;

        System.assert(auditLogServiceAccountUpdated1.equals(auditLogServiceAccountUpdated2));
        System.assert(auditLogServiceAccountUpdated2.equals(auditLogServiceAccountUpdated1));
        System.assert(auditLogServiceAccountUpdated1.equals(auditLogServiceAccountUpdated1));
        System.assert(auditLogServiceAccountUpdated3.equals(auditLogServiceAccountUpdated4));
        System.assert(auditLogServiceAccountUpdated4.equals(auditLogServiceAccountUpdated3));
        System.assert(auditLogServiceAccountUpdated3.equals(auditLogServiceAccountUpdated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated1 = OASAuditLogServiceAccountUpdated.getExample();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated2 = OASAuditLogServiceAccountUpdated.getExample();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated3 = new OASAuditLogServiceAccountUpdated();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated4 = new OASAuditLogServiceAccountUpdated();

        System.assert(auditLogServiceAccountUpdated1.equals(auditLogServiceAccountUpdated2));
        System.assert(auditLogServiceAccountUpdated2.equals(auditLogServiceAccountUpdated1));
        System.assert(auditLogServiceAccountUpdated3.equals(auditLogServiceAccountUpdated4));
        System.assert(auditLogServiceAccountUpdated4.equals(auditLogServiceAccountUpdated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated1 = OASAuditLogServiceAccountUpdated.getExample();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated2 = new OASAuditLogServiceAccountUpdated();

        System.assertEquals(false, auditLogServiceAccountUpdated1.equals('foo'));
        System.assertEquals(false, auditLogServiceAccountUpdated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated1 = OASAuditLogServiceAccountUpdated.getExample();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated2 = new OASAuditLogServiceAccountUpdated();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated3;

        System.assertEquals(false, auditLogServiceAccountUpdated1.equals(auditLogServiceAccountUpdated3));
        System.assertEquals(false, auditLogServiceAccountUpdated2.equals(auditLogServiceAccountUpdated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated1 = OASAuditLogServiceAccountUpdated.getExample();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated2 = new OASAuditLogServiceAccountUpdated();

        System.assertEquals(auditLogServiceAccountUpdated1.hashCode(), auditLogServiceAccountUpdated1.hashCode());
        System.assertEquals(auditLogServiceAccountUpdated2.hashCode(), auditLogServiceAccountUpdated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated1 = OASAuditLogServiceAccountUpdated.getExample();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated2 = OASAuditLogServiceAccountUpdated.getExample();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated3 = new OASAuditLogServiceAccountUpdated();
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated4 = new OASAuditLogServiceAccountUpdated();

        System.assert(auditLogServiceAccountUpdated1.equals(auditLogServiceAccountUpdated2));
        System.assert(auditLogServiceAccountUpdated3.equals(auditLogServiceAccountUpdated4));
        System.assertEquals(auditLogServiceAccountUpdated1.hashCode(), auditLogServiceAccountUpdated2.hashCode());
        System.assertEquals(auditLogServiceAccountUpdated3.hashCode(), auditLogServiceAccountUpdated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogServiceAccountUpdated auditLogServiceAccountUpdated = new OASAuditLogServiceAccountUpdated();
        Map<String, String> x-property-mappings = auditLogServiceAccountUpdated.getx-property-mappings();
        System.assertEquals('changesRequested', x-property-mappings.get('changes_requested'));
    }
}
