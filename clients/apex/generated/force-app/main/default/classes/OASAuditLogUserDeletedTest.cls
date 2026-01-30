@isTest
private class OASAuditLogUserDeletedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogUserDeleted auditLogUserDeleted1 = OASAuditLogUserDeleted.getExample();
        OASAuditLogUserDeleted auditLogUserDeleted2 = auditLogUserDeleted1;
        OASAuditLogUserDeleted auditLogUserDeleted3 = new OASAuditLogUserDeleted();
        OASAuditLogUserDeleted auditLogUserDeleted4 = auditLogUserDeleted3;

        System.assert(auditLogUserDeleted1.equals(auditLogUserDeleted2));
        System.assert(auditLogUserDeleted2.equals(auditLogUserDeleted1));
        System.assert(auditLogUserDeleted1.equals(auditLogUserDeleted1));
        System.assert(auditLogUserDeleted3.equals(auditLogUserDeleted4));
        System.assert(auditLogUserDeleted4.equals(auditLogUserDeleted3));
        System.assert(auditLogUserDeleted3.equals(auditLogUserDeleted3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogUserDeleted auditLogUserDeleted1 = OASAuditLogUserDeleted.getExample();
        OASAuditLogUserDeleted auditLogUserDeleted2 = OASAuditLogUserDeleted.getExample();
        OASAuditLogUserDeleted auditLogUserDeleted3 = new OASAuditLogUserDeleted();
        OASAuditLogUserDeleted auditLogUserDeleted4 = new OASAuditLogUserDeleted();

        System.assert(auditLogUserDeleted1.equals(auditLogUserDeleted2));
        System.assert(auditLogUserDeleted2.equals(auditLogUserDeleted1));
        System.assert(auditLogUserDeleted3.equals(auditLogUserDeleted4));
        System.assert(auditLogUserDeleted4.equals(auditLogUserDeleted3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogUserDeleted auditLogUserDeleted1 = OASAuditLogUserDeleted.getExample();
        OASAuditLogUserDeleted auditLogUserDeleted2 = new OASAuditLogUserDeleted();

        System.assertEquals(false, auditLogUserDeleted1.equals('foo'));
        System.assertEquals(false, auditLogUserDeleted2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogUserDeleted auditLogUserDeleted1 = OASAuditLogUserDeleted.getExample();
        OASAuditLogUserDeleted auditLogUserDeleted2 = new OASAuditLogUserDeleted();
        OASAuditLogUserDeleted auditLogUserDeleted3;

        System.assertEquals(false, auditLogUserDeleted1.equals(auditLogUserDeleted3));
        System.assertEquals(false, auditLogUserDeleted2.equals(auditLogUserDeleted3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogUserDeleted auditLogUserDeleted1 = OASAuditLogUserDeleted.getExample();
        OASAuditLogUserDeleted auditLogUserDeleted2 = new OASAuditLogUserDeleted();

        System.assertEquals(auditLogUserDeleted1.hashCode(), auditLogUserDeleted1.hashCode());
        System.assertEquals(auditLogUserDeleted2.hashCode(), auditLogUserDeleted2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogUserDeleted auditLogUserDeleted1 = OASAuditLogUserDeleted.getExample();
        OASAuditLogUserDeleted auditLogUserDeleted2 = OASAuditLogUserDeleted.getExample();
        OASAuditLogUserDeleted auditLogUserDeleted3 = new OASAuditLogUserDeleted();
        OASAuditLogUserDeleted auditLogUserDeleted4 = new OASAuditLogUserDeleted();

        System.assert(auditLogUserDeleted1.equals(auditLogUserDeleted2));
        System.assert(auditLogUserDeleted3.equals(auditLogUserDeleted4));
        System.assertEquals(auditLogUserDeleted1.hashCode(), auditLogUserDeleted2.hashCode());
        System.assertEquals(auditLogUserDeleted3.hashCode(), auditLogUserDeleted4.hashCode());
    }
}
