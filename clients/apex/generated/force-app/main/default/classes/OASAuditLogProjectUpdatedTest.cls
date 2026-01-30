@isTest
private class OASAuditLogProjectUpdatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogProjectUpdated auditLogProjectUpdated1 = OASAuditLogProjectUpdated.getExample();
        OASAuditLogProjectUpdated auditLogProjectUpdated2 = auditLogProjectUpdated1;
        OASAuditLogProjectUpdated auditLogProjectUpdated3 = new OASAuditLogProjectUpdated();
        OASAuditLogProjectUpdated auditLogProjectUpdated4 = auditLogProjectUpdated3;

        System.assert(auditLogProjectUpdated1.equals(auditLogProjectUpdated2));
        System.assert(auditLogProjectUpdated2.equals(auditLogProjectUpdated1));
        System.assert(auditLogProjectUpdated1.equals(auditLogProjectUpdated1));
        System.assert(auditLogProjectUpdated3.equals(auditLogProjectUpdated4));
        System.assert(auditLogProjectUpdated4.equals(auditLogProjectUpdated3));
        System.assert(auditLogProjectUpdated3.equals(auditLogProjectUpdated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogProjectUpdated auditLogProjectUpdated1 = OASAuditLogProjectUpdated.getExample();
        OASAuditLogProjectUpdated auditLogProjectUpdated2 = OASAuditLogProjectUpdated.getExample();
        OASAuditLogProjectUpdated auditLogProjectUpdated3 = new OASAuditLogProjectUpdated();
        OASAuditLogProjectUpdated auditLogProjectUpdated4 = new OASAuditLogProjectUpdated();

        System.assert(auditLogProjectUpdated1.equals(auditLogProjectUpdated2));
        System.assert(auditLogProjectUpdated2.equals(auditLogProjectUpdated1));
        System.assert(auditLogProjectUpdated3.equals(auditLogProjectUpdated4));
        System.assert(auditLogProjectUpdated4.equals(auditLogProjectUpdated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogProjectUpdated auditLogProjectUpdated1 = OASAuditLogProjectUpdated.getExample();
        OASAuditLogProjectUpdated auditLogProjectUpdated2 = new OASAuditLogProjectUpdated();

        System.assertEquals(false, auditLogProjectUpdated1.equals('foo'));
        System.assertEquals(false, auditLogProjectUpdated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogProjectUpdated auditLogProjectUpdated1 = OASAuditLogProjectUpdated.getExample();
        OASAuditLogProjectUpdated auditLogProjectUpdated2 = new OASAuditLogProjectUpdated();
        OASAuditLogProjectUpdated auditLogProjectUpdated3;

        System.assertEquals(false, auditLogProjectUpdated1.equals(auditLogProjectUpdated3));
        System.assertEquals(false, auditLogProjectUpdated2.equals(auditLogProjectUpdated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogProjectUpdated auditLogProjectUpdated1 = OASAuditLogProjectUpdated.getExample();
        OASAuditLogProjectUpdated auditLogProjectUpdated2 = new OASAuditLogProjectUpdated();

        System.assertEquals(auditLogProjectUpdated1.hashCode(), auditLogProjectUpdated1.hashCode());
        System.assertEquals(auditLogProjectUpdated2.hashCode(), auditLogProjectUpdated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogProjectUpdated auditLogProjectUpdated1 = OASAuditLogProjectUpdated.getExample();
        OASAuditLogProjectUpdated auditLogProjectUpdated2 = OASAuditLogProjectUpdated.getExample();
        OASAuditLogProjectUpdated auditLogProjectUpdated3 = new OASAuditLogProjectUpdated();
        OASAuditLogProjectUpdated auditLogProjectUpdated4 = new OASAuditLogProjectUpdated();

        System.assert(auditLogProjectUpdated1.equals(auditLogProjectUpdated2));
        System.assert(auditLogProjectUpdated3.equals(auditLogProjectUpdated4));
        System.assertEquals(auditLogProjectUpdated1.hashCode(), auditLogProjectUpdated2.hashCode());
        System.assertEquals(auditLogProjectUpdated3.hashCode(), auditLogProjectUpdated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogProjectUpdated auditLogProjectUpdated = new OASAuditLogProjectUpdated();
        Map<String, String> x-property-mappings = auditLogProjectUpdated.getx-property-mappings();
        System.assertEquals('changesRequested', x-property-mappings.get('changes_requested'));
    }
}
