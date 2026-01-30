@isTest
private class OASAuditLogServiceAccountDeletedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted1 = OASAuditLogServiceAccountDeleted.getExample();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted2 = auditLogServiceAccountDeleted1;
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted3 = new OASAuditLogServiceAccountDeleted();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted4 = auditLogServiceAccountDeleted3;

        System.assert(auditLogServiceAccountDeleted1.equals(auditLogServiceAccountDeleted2));
        System.assert(auditLogServiceAccountDeleted2.equals(auditLogServiceAccountDeleted1));
        System.assert(auditLogServiceAccountDeleted1.equals(auditLogServiceAccountDeleted1));
        System.assert(auditLogServiceAccountDeleted3.equals(auditLogServiceAccountDeleted4));
        System.assert(auditLogServiceAccountDeleted4.equals(auditLogServiceAccountDeleted3));
        System.assert(auditLogServiceAccountDeleted3.equals(auditLogServiceAccountDeleted3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted1 = OASAuditLogServiceAccountDeleted.getExample();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted2 = OASAuditLogServiceAccountDeleted.getExample();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted3 = new OASAuditLogServiceAccountDeleted();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted4 = new OASAuditLogServiceAccountDeleted();

        System.assert(auditLogServiceAccountDeleted1.equals(auditLogServiceAccountDeleted2));
        System.assert(auditLogServiceAccountDeleted2.equals(auditLogServiceAccountDeleted1));
        System.assert(auditLogServiceAccountDeleted3.equals(auditLogServiceAccountDeleted4));
        System.assert(auditLogServiceAccountDeleted4.equals(auditLogServiceAccountDeleted3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted1 = OASAuditLogServiceAccountDeleted.getExample();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted2 = new OASAuditLogServiceAccountDeleted();

        System.assertEquals(false, auditLogServiceAccountDeleted1.equals('foo'));
        System.assertEquals(false, auditLogServiceAccountDeleted2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted1 = OASAuditLogServiceAccountDeleted.getExample();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted2 = new OASAuditLogServiceAccountDeleted();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted3;

        System.assertEquals(false, auditLogServiceAccountDeleted1.equals(auditLogServiceAccountDeleted3));
        System.assertEquals(false, auditLogServiceAccountDeleted2.equals(auditLogServiceAccountDeleted3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted1 = OASAuditLogServiceAccountDeleted.getExample();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted2 = new OASAuditLogServiceAccountDeleted();

        System.assertEquals(auditLogServiceAccountDeleted1.hashCode(), auditLogServiceAccountDeleted1.hashCode());
        System.assertEquals(auditLogServiceAccountDeleted2.hashCode(), auditLogServiceAccountDeleted2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted1 = OASAuditLogServiceAccountDeleted.getExample();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted2 = OASAuditLogServiceAccountDeleted.getExample();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted3 = new OASAuditLogServiceAccountDeleted();
        OASAuditLogServiceAccountDeleted auditLogServiceAccountDeleted4 = new OASAuditLogServiceAccountDeleted();

        System.assert(auditLogServiceAccountDeleted1.equals(auditLogServiceAccountDeleted2));
        System.assert(auditLogServiceAccountDeleted3.equals(auditLogServiceAccountDeleted4));
        System.assertEquals(auditLogServiceAccountDeleted1.hashCode(), auditLogServiceAccountDeleted2.hashCode());
        System.assertEquals(auditLogServiceAccountDeleted3.hashCode(), auditLogServiceAccountDeleted4.hashCode());
    }
}
