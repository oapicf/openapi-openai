@isTest
private class OASAuditLogApiKeyCreatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogApiKeyCreated auditLogApiKeyCreated1 = OASAuditLogApiKeyCreated.getExample();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated2 = auditLogApiKeyCreated1;
        OASAuditLogApiKeyCreated auditLogApiKeyCreated3 = new OASAuditLogApiKeyCreated();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated4 = auditLogApiKeyCreated3;

        System.assert(auditLogApiKeyCreated1.equals(auditLogApiKeyCreated2));
        System.assert(auditLogApiKeyCreated2.equals(auditLogApiKeyCreated1));
        System.assert(auditLogApiKeyCreated1.equals(auditLogApiKeyCreated1));
        System.assert(auditLogApiKeyCreated3.equals(auditLogApiKeyCreated4));
        System.assert(auditLogApiKeyCreated4.equals(auditLogApiKeyCreated3));
        System.assert(auditLogApiKeyCreated3.equals(auditLogApiKeyCreated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogApiKeyCreated auditLogApiKeyCreated1 = OASAuditLogApiKeyCreated.getExample();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated2 = OASAuditLogApiKeyCreated.getExample();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated3 = new OASAuditLogApiKeyCreated();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated4 = new OASAuditLogApiKeyCreated();

        System.assert(auditLogApiKeyCreated1.equals(auditLogApiKeyCreated2));
        System.assert(auditLogApiKeyCreated2.equals(auditLogApiKeyCreated1));
        System.assert(auditLogApiKeyCreated3.equals(auditLogApiKeyCreated4));
        System.assert(auditLogApiKeyCreated4.equals(auditLogApiKeyCreated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogApiKeyCreated auditLogApiKeyCreated1 = OASAuditLogApiKeyCreated.getExample();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated2 = new OASAuditLogApiKeyCreated();

        System.assertEquals(false, auditLogApiKeyCreated1.equals('foo'));
        System.assertEquals(false, auditLogApiKeyCreated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogApiKeyCreated auditLogApiKeyCreated1 = OASAuditLogApiKeyCreated.getExample();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated2 = new OASAuditLogApiKeyCreated();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated3;

        System.assertEquals(false, auditLogApiKeyCreated1.equals(auditLogApiKeyCreated3));
        System.assertEquals(false, auditLogApiKeyCreated2.equals(auditLogApiKeyCreated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogApiKeyCreated auditLogApiKeyCreated1 = OASAuditLogApiKeyCreated.getExample();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated2 = new OASAuditLogApiKeyCreated();

        System.assertEquals(auditLogApiKeyCreated1.hashCode(), auditLogApiKeyCreated1.hashCode());
        System.assertEquals(auditLogApiKeyCreated2.hashCode(), auditLogApiKeyCreated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogApiKeyCreated auditLogApiKeyCreated1 = OASAuditLogApiKeyCreated.getExample();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated2 = OASAuditLogApiKeyCreated.getExample();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated3 = new OASAuditLogApiKeyCreated();
        OASAuditLogApiKeyCreated auditLogApiKeyCreated4 = new OASAuditLogApiKeyCreated();

        System.assert(auditLogApiKeyCreated1.equals(auditLogApiKeyCreated2));
        System.assert(auditLogApiKeyCreated3.equals(auditLogApiKeyCreated4));
        System.assertEquals(auditLogApiKeyCreated1.hashCode(), auditLogApiKeyCreated2.hashCode());
        System.assertEquals(auditLogApiKeyCreated3.hashCode(), auditLogApiKeyCreated4.hashCode());
    }
}
