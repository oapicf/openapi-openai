@isTest
private class OASAuditLogOrganizationUpdatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated1 = OASAuditLogOrganizationUpdated.getExample();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated2 = auditLogOrganizationUpdated1;
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated3 = new OASAuditLogOrganizationUpdated();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated4 = auditLogOrganizationUpdated3;

        System.assert(auditLogOrganizationUpdated1.equals(auditLogOrganizationUpdated2));
        System.assert(auditLogOrganizationUpdated2.equals(auditLogOrganizationUpdated1));
        System.assert(auditLogOrganizationUpdated1.equals(auditLogOrganizationUpdated1));
        System.assert(auditLogOrganizationUpdated3.equals(auditLogOrganizationUpdated4));
        System.assert(auditLogOrganizationUpdated4.equals(auditLogOrganizationUpdated3));
        System.assert(auditLogOrganizationUpdated3.equals(auditLogOrganizationUpdated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated1 = OASAuditLogOrganizationUpdated.getExample();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated2 = OASAuditLogOrganizationUpdated.getExample();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated3 = new OASAuditLogOrganizationUpdated();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated4 = new OASAuditLogOrganizationUpdated();

        System.assert(auditLogOrganizationUpdated1.equals(auditLogOrganizationUpdated2));
        System.assert(auditLogOrganizationUpdated2.equals(auditLogOrganizationUpdated1));
        System.assert(auditLogOrganizationUpdated3.equals(auditLogOrganizationUpdated4));
        System.assert(auditLogOrganizationUpdated4.equals(auditLogOrganizationUpdated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated1 = OASAuditLogOrganizationUpdated.getExample();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated2 = new OASAuditLogOrganizationUpdated();

        System.assertEquals(false, auditLogOrganizationUpdated1.equals('foo'));
        System.assertEquals(false, auditLogOrganizationUpdated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated1 = OASAuditLogOrganizationUpdated.getExample();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated2 = new OASAuditLogOrganizationUpdated();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated3;

        System.assertEquals(false, auditLogOrganizationUpdated1.equals(auditLogOrganizationUpdated3));
        System.assertEquals(false, auditLogOrganizationUpdated2.equals(auditLogOrganizationUpdated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated1 = OASAuditLogOrganizationUpdated.getExample();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated2 = new OASAuditLogOrganizationUpdated();

        System.assertEquals(auditLogOrganizationUpdated1.hashCode(), auditLogOrganizationUpdated1.hashCode());
        System.assertEquals(auditLogOrganizationUpdated2.hashCode(), auditLogOrganizationUpdated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated1 = OASAuditLogOrganizationUpdated.getExample();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated2 = OASAuditLogOrganizationUpdated.getExample();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated3 = new OASAuditLogOrganizationUpdated();
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated4 = new OASAuditLogOrganizationUpdated();

        System.assert(auditLogOrganizationUpdated1.equals(auditLogOrganizationUpdated2));
        System.assert(auditLogOrganizationUpdated3.equals(auditLogOrganizationUpdated4));
        System.assertEquals(auditLogOrganizationUpdated1.hashCode(), auditLogOrganizationUpdated2.hashCode());
        System.assertEquals(auditLogOrganizationUpdated3.hashCode(), auditLogOrganizationUpdated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogOrganizationUpdated auditLogOrganizationUpdated = new OASAuditLogOrganizationUpdated();
        Map<String, String> x-property-mappings = auditLogOrganizationUpdated.getx-property-mappings();
        System.assertEquals('changesRequested', x-property-mappings.get('changes_requested'));
    }
}
