@isTest
private class OASAuditLogApiKeyDeletedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted1 = OASAuditLogApiKeyDeleted.getExample();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted2 = auditLogApiKeyDeleted1;
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted3 = new OASAuditLogApiKeyDeleted();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted4 = auditLogApiKeyDeleted3;

        System.assert(auditLogApiKeyDeleted1.equals(auditLogApiKeyDeleted2));
        System.assert(auditLogApiKeyDeleted2.equals(auditLogApiKeyDeleted1));
        System.assert(auditLogApiKeyDeleted1.equals(auditLogApiKeyDeleted1));
        System.assert(auditLogApiKeyDeleted3.equals(auditLogApiKeyDeleted4));
        System.assert(auditLogApiKeyDeleted4.equals(auditLogApiKeyDeleted3));
        System.assert(auditLogApiKeyDeleted3.equals(auditLogApiKeyDeleted3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted1 = OASAuditLogApiKeyDeleted.getExample();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted2 = OASAuditLogApiKeyDeleted.getExample();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted3 = new OASAuditLogApiKeyDeleted();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted4 = new OASAuditLogApiKeyDeleted();

        System.assert(auditLogApiKeyDeleted1.equals(auditLogApiKeyDeleted2));
        System.assert(auditLogApiKeyDeleted2.equals(auditLogApiKeyDeleted1));
        System.assert(auditLogApiKeyDeleted3.equals(auditLogApiKeyDeleted4));
        System.assert(auditLogApiKeyDeleted4.equals(auditLogApiKeyDeleted3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted1 = OASAuditLogApiKeyDeleted.getExample();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted2 = new OASAuditLogApiKeyDeleted();

        System.assertEquals(false, auditLogApiKeyDeleted1.equals('foo'));
        System.assertEquals(false, auditLogApiKeyDeleted2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted1 = OASAuditLogApiKeyDeleted.getExample();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted2 = new OASAuditLogApiKeyDeleted();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted3;

        System.assertEquals(false, auditLogApiKeyDeleted1.equals(auditLogApiKeyDeleted3));
        System.assertEquals(false, auditLogApiKeyDeleted2.equals(auditLogApiKeyDeleted3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted1 = OASAuditLogApiKeyDeleted.getExample();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted2 = new OASAuditLogApiKeyDeleted();

        System.assertEquals(auditLogApiKeyDeleted1.hashCode(), auditLogApiKeyDeleted1.hashCode());
        System.assertEquals(auditLogApiKeyDeleted2.hashCode(), auditLogApiKeyDeleted2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted1 = OASAuditLogApiKeyDeleted.getExample();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted2 = OASAuditLogApiKeyDeleted.getExample();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted3 = new OASAuditLogApiKeyDeleted();
        OASAuditLogApiKeyDeleted auditLogApiKeyDeleted4 = new OASAuditLogApiKeyDeleted();

        System.assert(auditLogApiKeyDeleted1.equals(auditLogApiKeyDeleted2));
        System.assert(auditLogApiKeyDeleted3.equals(auditLogApiKeyDeleted4));
        System.assertEquals(auditLogApiKeyDeleted1.hashCode(), auditLogApiKeyDeleted2.hashCode());
        System.assertEquals(auditLogApiKeyDeleted3.hashCode(), auditLogApiKeyDeleted4.hashCode());
    }
}
