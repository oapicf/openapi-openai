@isTest
private class OASAuditLogActorSessionTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogActorSession auditLogActorSession1 = OASAuditLogActorSession.getExample();
        OASAuditLogActorSession auditLogActorSession2 = auditLogActorSession1;
        OASAuditLogActorSession auditLogActorSession3 = new OASAuditLogActorSession();
        OASAuditLogActorSession auditLogActorSession4 = auditLogActorSession3;

        System.assert(auditLogActorSession1.equals(auditLogActorSession2));
        System.assert(auditLogActorSession2.equals(auditLogActorSession1));
        System.assert(auditLogActorSession1.equals(auditLogActorSession1));
        System.assert(auditLogActorSession3.equals(auditLogActorSession4));
        System.assert(auditLogActorSession4.equals(auditLogActorSession3));
        System.assert(auditLogActorSession3.equals(auditLogActorSession3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogActorSession auditLogActorSession1 = OASAuditLogActorSession.getExample();
        OASAuditLogActorSession auditLogActorSession2 = OASAuditLogActorSession.getExample();
        OASAuditLogActorSession auditLogActorSession3 = new OASAuditLogActorSession();
        OASAuditLogActorSession auditLogActorSession4 = new OASAuditLogActorSession();

        System.assert(auditLogActorSession1.equals(auditLogActorSession2));
        System.assert(auditLogActorSession2.equals(auditLogActorSession1));
        System.assert(auditLogActorSession3.equals(auditLogActorSession4));
        System.assert(auditLogActorSession4.equals(auditLogActorSession3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogActorSession auditLogActorSession1 = OASAuditLogActorSession.getExample();
        OASAuditLogActorSession auditLogActorSession2 = new OASAuditLogActorSession();

        System.assertEquals(false, auditLogActorSession1.equals('foo'));
        System.assertEquals(false, auditLogActorSession2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogActorSession auditLogActorSession1 = OASAuditLogActorSession.getExample();
        OASAuditLogActorSession auditLogActorSession2 = new OASAuditLogActorSession();
        OASAuditLogActorSession auditLogActorSession3;

        System.assertEquals(false, auditLogActorSession1.equals(auditLogActorSession3));
        System.assertEquals(false, auditLogActorSession2.equals(auditLogActorSession3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogActorSession auditLogActorSession1 = OASAuditLogActorSession.getExample();
        OASAuditLogActorSession auditLogActorSession2 = new OASAuditLogActorSession();

        System.assertEquals(auditLogActorSession1.hashCode(), auditLogActorSession1.hashCode());
        System.assertEquals(auditLogActorSession2.hashCode(), auditLogActorSession2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogActorSession auditLogActorSession1 = OASAuditLogActorSession.getExample();
        OASAuditLogActorSession auditLogActorSession2 = OASAuditLogActorSession.getExample();
        OASAuditLogActorSession auditLogActorSession3 = new OASAuditLogActorSession();
        OASAuditLogActorSession auditLogActorSession4 = new OASAuditLogActorSession();

        System.assert(auditLogActorSession1.equals(auditLogActorSession2));
        System.assert(auditLogActorSession3.equals(auditLogActorSession4));
        System.assertEquals(auditLogActorSession1.hashCode(), auditLogActorSession2.hashCode());
        System.assertEquals(auditLogActorSession3.hashCode(), auditLogActorSession4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogActorSession auditLogActorSession = new OASAuditLogActorSession();
        Map<String, String> x-property-mappings = auditLogActorSession.getx-property-mappings();
        System.assertEquals('ipAddress', x-property-mappings.get('ip_address'));
    }
}
