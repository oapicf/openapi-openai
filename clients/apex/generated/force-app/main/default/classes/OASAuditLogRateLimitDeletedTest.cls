@isTest
private class OASAuditLogRateLimitDeletedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted1 = OASAuditLogRateLimitDeleted.getExample();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted2 = auditLogRateLimitDeleted1;
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted3 = new OASAuditLogRateLimitDeleted();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted4 = auditLogRateLimitDeleted3;

        System.assert(auditLogRateLimitDeleted1.equals(auditLogRateLimitDeleted2));
        System.assert(auditLogRateLimitDeleted2.equals(auditLogRateLimitDeleted1));
        System.assert(auditLogRateLimitDeleted1.equals(auditLogRateLimitDeleted1));
        System.assert(auditLogRateLimitDeleted3.equals(auditLogRateLimitDeleted4));
        System.assert(auditLogRateLimitDeleted4.equals(auditLogRateLimitDeleted3));
        System.assert(auditLogRateLimitDeleted3.equals(auditLogRateLimitDeleted3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted1 = OASAuditLogRateLimitDeleted.getExample();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted2 = OASAuditLogRateLimitDeleted.getExample();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted3 = new OASAuditLogRateLimitDeleted();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted4 = new OASAuditLogRateLimitDeleted();

        System.assert(auditLogRateLimitDeleted1.equals(auditLogRateLimitDeleted2));
        System.assert(auditLogRateLimitDeleted2.equals(auditLogRateLimitDeleted1));
        System.assert(auditLogRateLimitDeleted3.equals(auditLogRateLimitDeleted4));
        System.assert(auditLogRateLimitDeleted4.equals(auditLogRateLimitDeleted3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted1 = OASAuditLogRateLimitDeleted.getExample();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted2 = new OASAuditLogRateLimitDeleted();

        System.assertEquals(false, auditLogRateLimitDeleted1.equals('foo'));
        System.assertEquals(false, auditLogRateLimitDeleted2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted1 = OASAuditLogRateLimitDeleted.getExample();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted2 = new OASAuditLogRateLimitDeleted();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted3;

        System.assertEquals(false, auditLogRateLimitDeleted1.equals(auditLogRateLimitDeleted3));
        System.assertEquals(false, auditLogRateLimitDeleted2.equals(auditLogRateLimitDeleted3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted1 = OASAuditLogRateLimitDeleted.getExample();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted2 = new OASAuditLogRateLimitDeleted();

        System.assertEquals(auditLogRateLimitDeleted1.hashCode(), auditLogRateLimitDeleted1.hashCode());
        System.assertEquals(auditLogRateLimitDeleted2.hashCode(), auditLogRateLimitDeleted2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted1 = OASAuditLogRateLimitDeleted.getExample();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted2 = OASAuditLogRateLimitDeleted.getExample();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted3 = new OASAuditLogRateLimitDeleted();
        OASAuditLogRateLimitDeleted auditLogRateLimitDeleted4 = new OASAuditLogRateLimitDeleted();

        System.assert(auditLogRateLimitDeleted1.equals(auditLogRateLimitDeleted2));
        System.assert(auditLogRateLimitDeleted3.equals(auditLogRateLimitDeleted4));
        System.assertEquals(auditLogRateLimitDeleted1.hashCode(), auditLogRateLimitDeleted2.hashCode());
        System.assertEquals(auditLogRateLimitDeleted3.hashCode(), auditLogRateLimitDeleted4.hashCode());
    }
}
