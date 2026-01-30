@isTest
private class OASAuditLogActorApiKeyTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogActorApiKey auditLogActorApiKey1 = OASAuditLogActorApiKey.getExample();
        OASAuditLogActorApiKey auditLogActorApiKey2 = auditLogActorApiKey1;
        OASAuditLogActorApiKey auditLogActorApiKey3 = new OASAuditLogActorApiKey();
        OASAuditLogActorApiKey auditLogActorApiKey4 = auditLogActorApiKey3;

        System.assert(auditLogActorApiKey1.equals(auditLogActorApiKey2));
        System.assert(auditLogActorApiKey2.equals(auditLogActorApiKey1));
        System.assert(auditLogActorApiKey1.equals(auditLogActorApiKey1));
        System.assert(auditLogActorApiKey3.equals(auditLogActorApiKey4));
        System.assert(auditLogActorApiKey4.equals(auditLogActorApiKey3));
        System.assert(auditLogActorApiKey3.equals(auditLogActorApiKey3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogActorApiKey auditLogActorApiKey1 = OASAuditLogActorApiKey.getExample();
        OASAuditLogActorApiKey auditLogActorApiKey2 = OASAuditLogActorApiKey.getExample();
        OASAuditLogActorApiKey auditLogActorApiKey3 = new OASAuditLogActorApiKey();
        OASAuditLogActorApiKey auditLogActorApiKey4 = new OASAuditLogActorApiKey();

        System.assert(auditLogActorApiKey1.equals(auditLogActorApiKey2));
        System.assert(auditLogActorApiKey2.equals(auditLogActorApiKey1));
        System.assert(auditLogActorApiKey3.equals(auditLogActorApiKey4));
        System.assert(auditLogActorApiKey4.equals(auditLogActorApiKey3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogActorApiKey auditLogActorApiKey1 = OASAuditLogActorApiKey.getExample();
        OASAuditLogActorApiKey auditLogActorApiKey2 = new OASAuditLogActorApiKey();

        System.assertEquals(false, auditLogActorApiKey1.equals('foo'));
        System.assertEquals(false, auditLogActorApiKey2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogActorApiKey auditLogActorApiKey1 = OASAuditLogActorApiKey.getExample();
        OASAuditLogActorApiKey auditLogActorApiKey2 = new OASAuditLogActorApiKey();
        OASAuditLogActorApiKey auditLogActorApiKey3;

        System.assertEquals(false, auditLogActorApiKey1.equals(auditLogActorApiKey3));
        System.assertEquals(false, auditLogActorApiKey2.equals(auditLogActorApiKey3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogActorApiKey auditLogActorApiKey1 = OASAuditLogActorApiKey.getExample();
        OASAuditLogActorApiKey auditLogActorApiKey2 = new OASAuditLogActorApiKey();

        System.assertEquals(auditLogActorApiKey1.hashCode(), auditLogActorApiKey1.hashCode());
        System.assertEquals(auditLogActorApiKey2.hashCode(), auditLogActorApiKey2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogActorApiKey auditLogActorApiKey1 = OASAuditLogActorApiKey.getExample();
        OASAuditLogActorApiKey auditLogActorApiKey2 = OASAuditLogActorApiKey.getExample();
        OASAuditLogActorApiKey auditLogActorApiKey3 = new OASAuditLogActorApiKey();
        OASAuditLogActorApiKey auditLogActorApiKey4 = new OASAuditLogActorApiKey();

        System.assert(auditLogActorApiKey1.equals(auditLogActorApiKey2));
        System.assert(auditLogActorApiKey3.equals(auditLogActorApiKey4));
        System.assertEquals(auditLogActorApiKey1.hashCode(), auditLogActorApiKey2.hashCode());
        System.assertEquals(auditLogActorApiKey3.hashCode(), auditLogActorApiKey4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogActorApiKey auditLogActorApiKey = new OASAuditLogActorApiKey();
        Map<String, String> x-property-mappings = auditLogActorApiKey.getx-property-mappings();
        System.assertEquals('serviceAccount', x-property-mappings.get('service_account'));
    }
}
