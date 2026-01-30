@isTest
private class OASAuditLogUserUpdatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogUserUpdated auditLogUserUpdated1 = OASAuditLogUserUpdated.getExample();
        OASAuditLogUserUpdated auditLogUserUpdated2 = auditLogUserUpdated1;
        OASAuditLogUserUpdated auditLogUserUpdated3 = new OASAuditLogUserUpdated();
        OASAuditLogUserUpdated auditLogUserUpdated4 = auditLogUserUpdated3;

        System.assert(auditLogUserUpdated1.equals(auditLogUserUpdated2));
        System.assert(auditLogUserUpdated2.equals(auditLogUserUpdated1));
        System.assert(auditLogUserUpdated1.equals(auditLogUserUpdated1));
        System.assert(auditLogUserUpdated3.equals(auditLogUserUpdated4));
        System.assert(auditLogUserUpdated4.equals(auditLogUserUpdated3));
        System.assert(auditLogUserUpdated3.equals(auditLogUserUpdated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogUserUpdated auditLogUserUpdated1 = OASAuditLogUserUpdated.getExample();
        OASAuditLogUserUpdated auditLogUserUpdated2 = OASAuditLogUserUpdated.getExample();
        OASAuditLogUserUpdated auditLogUserUpdated3 = new OASAuditLogUserUpdated();
        OASAuditLogUserUpdated auditLogUserUpdated4 = new OASAuditLogUserUpdated();

        System.assert(auditLogUserUpdated1.equals(auditLogUserUpdated2));
        System.assert(auditLogUserUpdated2.equals(auditLogUserUpdated1));
        System.assert(auditLogUserUpdated3.equals(auditLogUserUpdated4));
        System.assert(auditLogUserUpdated4.equals(auditLogUserUpdated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogUserUpdated auditLogUserUpdated1 = OASAuditLogUserUpdated.getExample();
        OASAuditLogUserUpdated auditLogUserUpdated2 = new OASAuditLogUserUpdated();

        System.assertEquals(false, auditLogUserUpdated1.equals('foo'));
        System.assertEquals(false, auditLogUserUpdated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogUserUpdated auditLogUserUpdated1 = OASAuditLogUserUpdated.getExample();
        OASAuditLogUserUpdated auditLogUserUpdated2 = new OASAuditLogUserUpdated();
        OASAuditLogUserUpdated auditLogUserUpdated3;

        System.assertEquals(false, auditLogUserUpdated1.equals(auditLogUserUpdated3));
        System.assertEquals(false, auditLogUserUpdated2.equals(auditLogUserUpdated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogUserUpdated auditLogUserUpdated1 = OASAuditLogUserUpdated.getExample();
        OASAuditLogUserUpdated auditLogUserUpdated2 = new OASAuditLogUserUpdated();

        System.assertEquals(auditLogUserUpdated1.hashCode(), auditLogUserUpdated1.hashCode());
        System.assertEquals(auditLogUserUpdated2.hashCode(), auditLogUserUpdated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogUserUpdated auditLogUserUpdated1 = OASAuditLogUserUpdated.getExample();
        OASAuditLogUserUpdated auditLogUserUpdated2 = OASAuditLogUserUpdated.getExample();
        OASAuditLogUserUpdated auditLogUserUpdated3 = new OASAuditLogUserUpdated();
        OASAuditLogUserUpdated auditLogUserUpdated4 = new OASAuditLogUserUpdated();

        System.assert(auditLogUserUpdated1.equals(auditLogUserUpdated2));
        System.assert(auditLogUserUpdated3.equals(auditLogUserUpdated4));
        System.assertEquals(auditLogUserUpdated1.hashCode(), auditLogUserUpdated2.hashCode());
        System.assertEquals(auditLogUserUpdated3.hashCode(), auditLogUserUpdated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogUserUpdated auditLogUserUpdated = new OASAuditLogUserUpdated();
        Map<String, String> x-property-mappings = auditLogUserUpdated.getx-property-mappings();
        System.assertEquals('changesRequested', x-property-mappings.get('changes_requested'));
    }
}
