@isTest
private class OASAuditLogApiKeyUpdatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated1 = OASAuditLogApiKeyUpdated.getExample();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated2 = auditLogApiKeyUpdated1;
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated3 = new OASAuditLogApiKeyUpdated();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated4 = auditLogApiKeyUpdated3;

        System.assert(auditLogApiKeyUpdated1.equals(auditLogApiKeyUpdated2));
        System.assert(auditLogApiKeyUpdated2.equals(auditLogApiKeyUpdated1));
        System.assert(auditLogApiKeyUpdated1.equals(auditLogApiKeyUpdated1));
        System.assert(auditLogApiKeyUpdated3.equals(auditLogApiKeyUpdated4));
        System.assert(auditLogApiKeyUpdated4.equals(auditLogApiKeyUpdated3));
        System.assert(auditLogApiKeyUpdated3.equals(auditLogApiKeyUpdated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated1 = OASAuditLogApiKeyUpdated.getExample();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated2 = OASAuditLogApiKeyUpdated.getExample();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated3 = new OASAuditLogApiKeyUpdated();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated4 = new OASAuditLogApiKeyUpdated();

        System.assert(auditLogApiKeyUpdated1.equals(auditLogApiKeyUpdated2));
        System.assert(auditLogApiKeyUpdated2.equals(auditLogApiKeyUpdated1));
        System.assert(auditLogApiKeyUpdated3.equals(auditLogApiKeyUpdated4));
        System.assert(auditLogApiKeyUpdated4.equals(auditLogApiKeyUpdated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated1 = OASAuditLogApiKeyUpdated.getExample();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated2 = new OASAuditLogApiKeyUpdated();

        System.assertEquals(false, auditLogApiKeyUpdated1.equals('foo'));
        System.assertEquals(false, auditLogApiKeyUpdated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated1 = OASAuditLogApiKeyUpdated.getExample();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated2 = new OASAuditLogApiKeyUpdated();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated3;

        System.assertEquals(false, auditLogApiKeyUpdated1.equals(auditLogApiKeyUpdated3));
        System.assertEquals(false, auditLogApiKeyUpdated2.equals(auditLogApiKeyUpdated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated1 = OASAuditLogApiKeyUpdated.getExample();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated2 = new OASAuditLogApiKeyUpdated();

        System.assertEquals(auditLogApiKeyUpdated1.hashCode(), auditLogApiKeyUpdated1.hashCode());
        System.assertEquals(auditLogApiKeyUpdated2.hashCode(), auditLogApiKeyUpdated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated1 = OASAuditLogApiKeyUpdated.getExample();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated2 = OASAuditLogApiKeyUpdated.getExample();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated3 = new OASAuditLogApiKeyUpdated();
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated4 = new OASAuditLogApiKeyUpdated();

        System.assert(auditLogApiKeyUpdated1.equals(auditLogApiKeyUpdated2));
        System.assert(auditLogApiKeyUpdated3.equals(auditLogApiKeyUpdated4));
        System.assertEquals(auditLogApiKeyUpdated1.hashCode(), auditLogApiKeyUpdated2.hashCode());
        System.assertEquals(auditLogApiKeyUpdated3.hashCode(), auditLogApiKeyUpdated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogApiKeyUpdated auditLogApiKeyUpdated = new OASAuditLogApiKeyUpdated();
        Map<String, String> x-property-mappings = auditLogApiKeyUpdated.getx-property-mappings();
        System.assertEquals('changesRequested', x-property-mappings.get('changes_requested'));
    }
}
