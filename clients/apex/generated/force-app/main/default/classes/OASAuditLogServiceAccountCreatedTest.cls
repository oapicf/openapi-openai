@isTest
private class OASAuditLogServiceAccountCreatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated1 = OASAuditLogServiceAccountCreated.getExample();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated2 = auditLogServiceAccountCreated1;
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated3 = new OASAuditLogServiceAccountCreated();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated4 = auditLogServiceAccountCreated3;

        System.assert(auditLogServiceAccountCreated1.equals(auditLogServiceAccountCreated2));
        System.assert(auditLogServiceAccountCreated2.equals(auditLogServiceAccountCreated1));
        System.assert(auditLogServiceAccountCreated1.equals(auditLogServiceAccountCreated1));
        System.assert(auditLogServiceAccountCreated3.equals(auditLogServiceAccountCreated4));
        System.assert(auditLogServiceAccountCreated4.equals(auditLogServiceAccountCreated3));
        System.assert(auditLogServiceAccountCreated3.equals(auditLogServiceAccountCreated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated1 = OASAuditLogServiceAccountCreated.getExample();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated2 = OASAuditLogServiceAccountCreated.getExample();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated3 = new OASAuditLogServiceAccountCreated();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated4 = new OASAuditLogServiceAccountCreated();

        System.assert(auditLogServiceAccountCreated1.equals(auditLogServiceAccountCreated2));
        System.assert(auditLogServiceAccountCreated2.equals(auditLogServiceAccountCreated1));
        System.assert(auditLogServiceAccountCreated3.equals(auditLogServiceAccountCreated4));
        System.assert(auditLogServiceAccountCreated4.equals(auditLogServiceAccountCreated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated1 = OASAuditLogServiceAccountCreated.getExample();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated2 = new OASAuditLogServiceAccountCreated();

        System.assertEquals(false, auditLogServiceAccountCreated1.equals('foo'));
        System.assertEquals(false, auditLogServiceAccountCreated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated1 = OASAuditLogServiceAccountCreated.getExample();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated2 = new OASAuditLogServiceAccountCreated();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated3;

        System.assertEquals(false, auditLogServiceAccountCreated1.equals(auditLogServiceAccountCreated3));
        System.assertEquals(false, auditLogServiceAccountCreated2.equals(auditLogServiceAccountCreated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated1 = OASAuditLogServiceAccountCreated.getExample();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated2 = new OASAuditLogServiceAccountCreated();

        System.assertEquals(auditLogServiceAccountCreated1.hashCode(), auditLogServiceAccountCreated1.hashCode());
        System.assertEquals(auditLogServiceAccountCreated2.hashCode(), auditLogServiceAccountCreated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated1 = OASAuditLogServiceAccountCreated.getExample();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated2 = OASAuditLogServiceAccountCreated.getExample();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated3 = new OASAuditLogServiceAccountCreated();
        OASAuditLogServiceAccountCreated auditLogServiceAccountCreated4 = new OASAuditLogServiceAccountCreated();

        System.assert(auditLogServiceAccountCreated1.equals(auditLogServiceAccountCreated2));
        System.assert(auditLogServiceAccountCreated3.equals(auditLogServiceAccountCreated4));
        System.assertEquals(auditLogServiceAccountCreated1.hashCode(), auditLogServiceAccountCreated2.hashCode());
        System.assertEquals(auditLogServiceAccountCreated3.hashCode(), auditLogServiceAccountCreated4.hashCode());
    }
}
