@isTest
private class OASAuditLogActorUserTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogActorUser auditLogActorUser1 = OASAuditLogActorUser.getExample();
        OASAuditLogActorUser auditLogActorUser2 = auditLogActorUser1;
        OASAuditLogActorUser auditLogActorUser3 = new OASAuditLogActorUser();
        OASAuditLogActorUser auditLogActorUser4 = auditLogActorUser3;

        System.assert(auditLogActorUser1.equals(auditLogActorUser2));
        System.assert(auditLogActorUser2.equals(auditLogActorUser1));
        System.assert(auditLogActorUser1.equals(auditLogActorUser1));
        System.assert(auditLogActorUser3.equals(auditLogActorUser4));
        System.assert(auditLogActorUser4.equals(auditLogActorUser3));
        System.assert(auditLogActorUser3.equals(auditLogActorUser3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogActorUser auditLogActorUser1 = OASAuditLogActorUser.getExample();
        OASAuditLogActorUser auditLogActorUser2 = OASAuditLogActorUser.getExample();
        OASAuditLogActorUser auditLogActorUser3 = new OASAuditLogActorUser();
        OASAuditLogActorUser auditLogActorUser4 = new OASAuditLogActorUser();

        System.assert(auditLogActorUser1.equals(auditLogActorUser2));
        System.assert(auditLogActorUser2.equals(auditLogActorUser1));
        System.assert(auditLogActorUser3.equals(auditLogActorUser4));
        System.assert(auditLogActorUser4.equals(auditLogActorUser3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogActorUser auditLogActorUser1 = OASAuditLogActorUser.getExample();
        OASAuditLogActorUser auditLogActorUser2 = new OASAuditLogActorUser();

        System.assertEquals(false, auditLogActorUser1.equals('foo'));
        System.assertEquals(false, auditLogActorUser2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogActorUser auditLogActorUser1 = OASAuditLogActorUser.getExample();
        OASAuditLogActorUser auditLogActorUser2 = new OASAuditLogActorUser();
        OASAuditLogActorUser auditLogActorUser3;

        System.assertEquals(false, auditLogActorUser1.equals(auditLogActorUser3));
        System.assertEquals(false, auditLogActorUser2.equals(auditLogActorUser3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogActorUser auditLogActorUser1 = OASAuditLogActorUser.getExample();
        OASAuditLogActorUser auditLogActorUser2 = new OASAuditLogActorUser();

        System.assertEquals(auditLogActorUser1.hashCode(), auditLogActorUser1.hashCode());
        System.assertEquals(auditLogActorUser2.hashCode(), auditLogActorUser2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogActorUser auditLogActorUser1 = OASAuditLogActorUser.getExample();
        OASAuditLogActorUser auditLogActorUser2 = OASAuditLogActorUser.getExample();
        OASAuditLogActorUser auditLogActorUser3 = new OASAuditLogActorUser();
        OASAuditLogActorUser auditLogActorUser4 = new OASAuditLogActorUser();

        System.assert(auditLogActorUser1.equals(auditLogActorUser2));
        System.assert(auditLogActorUser3.equals(auditLogActorUser4));
        System.assertEquals(auditLogActorUser1.hashCode(), auditLogActorUser2.hashCode());
        System.assertEquals(auditLogActorUser3.hashCode(), auditLogActorUser4.hashCode());
    }
}
