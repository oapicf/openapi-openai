@isTest
private class OASAuditLogProjectCreatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogProjectCreated auditLogProjectCreated1 = OASAuditLogProjectCreated.getExample();
        OASAuditLogProjectCreated auditLogProjectCreated2 = auditLogProjectCreated1;
        OASAuditLogProjectCreated auditLogProjectCreated3 = new OASAuditLogProjectCreated();
        OASAuditLogProjectCreated auditLogProjectCreated4 = auditLogProjectCreated3;

        System.assert(auditLogProjectCreated1.equals(auditLogProjectCreated2));
        System.assert(auditLogProjectCreated2.equals(auditLogProjectCreated1));
        System.assert(auditLogProjectCreated1.equals(auditLogProjectCreated1));
        System.assert(auditLogProjectCreated3.equals(auditLogProjectCreated4));
        System.assert(auditLogProjectCreated4.equals(auditLogProjectCreated3));
        System.assert(auditLogProjectCreated3.equals(auditLogProjectCreated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogProjectCreated auditLogProjectCreated1 = OASAuditLogProjectCreated.getExample();
        OASAuditLogProjectCreated auditLogProjectCreated2 = OASAuditLogProjectCreated.getExample();
        OASAuditLogProjectCreated auditLogProjectCreated3 = new OASAuditLogProjectCreated();
        OASAuditLogProjectCreated auditLogProjectCreated4 = new OASAuditLogProjectCreated();

        System.assert(auditLogProjectCreated1.equals(auditLogProjectCreated2));
        System.assert(auditLogProjectCreated2.equals(auditLogProjectCreated1));
        System.assert(auditLogProjectCreated3.equals(auditLogProjectCreated4));
        System.assert(auditLogProjectCreated4.equals(auditLogProjectCreated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogProjectCreated auditLogProjectCreated1 = OASAuditLogProjectCreated.getExample();
        OASAuditLogProjectCreated auditLogProjectCreated2 = new OASAuditLogProjectCreated();

        System.assertEquals(false, auditLogProjectCreated1.equals('foo'));
        System.assertEquals(false, auditLogProjectCreated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogProjectCreated auditLogProjectCreated1 = OASAuditLogProjectCreated.getExample();
        OASAuditLogProjectCreated auditLogProjectCreated2 = new OASAuditLogProjectCreated();
        OASAuditLogProjectCreated auditLogProjectCreated3;

        System.assertEquals(false, auditLogProjectCreated1.equals(auditLogProjectCreated3));
        System.assertEquals(false, auditLogProjectCreated2.equals(auditLogProjectCreated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogProjectCreated auditLogProjectCreated1 = OASAuditLogProjectCreated.getExample();
        OASAuditLogProjectCreated auditLogProjectCreated2 = new OASAuditLogProjectCreated();

        System.assertEquals(auditLogProjectCreated1.hashCode(), auditLogProjectCreated1.hashCode());
        System.assertEquals(auditLogProjectCreated2.hashCode(), auditLogProjectCreated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogProjectCreated auditLogProjectCreated1 = OASAuditLogProjectCreated.getExample();
        OASAuditLogProjectCreated auditLogProjectCreated2 = OASAuditLogProjectCreated.getExample();
        OASAuditLogProjectCreated auditLogProjectCreated3 = new OASAuditLogProjectCreated();
        OASAuditLogProjectCreated auditLogProjectCreated4 = new OASAuditLogProjectCreated();

        System.assert(auditLogProjectCreated1.equals(auditLogProjectCreated2));
        System.assert(auditLogProjectCreated3.equals(auditLogProjectCreated4));
        System.assertEquals(auditLogProjectCreated1.hashCode(), auditLogProjectCreated2.hashCode());
        System.assertEquals(auditLogProjectCreated3.hashCode(), auditLogProjectCreated4.hashCode());
    }
}
