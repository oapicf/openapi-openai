@isTest
private class OASAuditLogActorTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogActor auditLogActor1 = OASAuditLogActor.getExample();
        OASAuditLogActor auditLogActor2 = auditLogActor1;
        OASAuditLogActor auditLogActor3 = new OASAuditLogActor();
        OASAuditLogActor auditLogActor4 = auditLogActor3;

        System.assert(auditLogActor1.equals(auditLogActor2));
        System.assert(auditLogActor2.equals(auditLogActor1));
        System.assert(auditLogActor1.equals(auditLogActor1));
        System.assert(auditLogActor3.equals(auditLogActor4));
        System.assert(auditLogActor4.equals(auditLogActor3));
        System.assert(auditLogActor3.equals(auditLogActor3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogActor auditLogActor1 = OASAuditLogActor.getExample();
        OASAuditLogActor auditLogActor2 = OASAuditLogActor.getExample();
        OASAuditLogActor auditLogActor3 = new OASAuditLogActor();
        OASAuditLogActor auditLogActor4 = new OASAuditLogActor();

        System.assert(auditLogActor1.equals(auditLogActor2));
        System.assert(auditLogActor2.equals(auditLogActor1));
        System.assert(auditLogActor3.equals(auditLogActor4));
        System.assert(auditLogActor4.equals(auditLogActor3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogActor auditLogActor1 = OASAuditLogActor.getExample();
        OASAuditLogActor auditLogActor2 = new OASAuditLogActor();

        System.assertEquals(false, auditLogActor1.equals('foo'));
        System.assertEquals(false, auditLogActor2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogActor auditLogActor1 = OASAuditLogActor.getExample();
        OASAuditLogActor auditLogActor2 = new OASAuditLogActor();
        OASAuditLogActor auditLogActor3;

        System.assertEquals(false, auditLogActor1.equals(auditLogActor3));
        System.assertEquals(false, auditLogActor2.equals(auditLogActor3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogActor auditLogActor1 = OASAuditLogActor.getExample();
        OASAuditLogActor auditLogActor2 = new OASAuditLogActor();

        System.assertEquals(auditLogActor1.hashCode(), auditLogActor1.hashCode());
        System.assertEquals(auditLogActor2.hashCode(), auditLogActor2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogActor auditLogActor1 = OASAuditLogActor.getExample();
        OASAuditLogActor auditLogActor2 = OASAuditLogActor.getExample();
        OASAuditLogActor auditLogActor3 = new OASAuditLogActor();
        OASAuditLogActor auditLogActor4 = new OASAuditLogActor();

        System.assert(auditLogActor1.equals(auditLogActor2));
        System.assert(auditLogActor3.equals(auditLogActor4));
        System.assertEquals(auditLogActor1.hashCode(), auditLogActor2.hashCode());
        System.assertEquals(auditLogActor3.hashCode(), auditLogActor4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogActor auditLogActor = new OASAuditLogActor();
        Map<String, String> x-property-mappings = auditLogActor.getx-property-mappings();
        System.assertEquals('apiKey', x-property-mappings.get('api_key'));
    }
}
