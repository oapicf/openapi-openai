@isTest
private class OASAuditLogOrganizationUpdatedChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested1 = OASAuditLogOrganizationUpdatedChange.getExample();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested2 = auditLogOrganizationUpdatedChangesRequested1;
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested3 = new OASAuditLogOrganizationUpdatedChange();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested4 = auditLogOrganizationUpdatedChangesRequested3;

        System.assert(auditLogOrganizationUpdatedChangesRequested1.equals(auditLogOrganizationUpdatedChangesRequested2));
        System.assert(auditLogOrganizationUpdatedChangesRequested2.equals(auditLogOrganizationUpdatedChangesRequested1));
        System.assert(auditLogOrganizationUpdatedChangesRequested1.equals(auditLogOrganizationUpdatedChangesRequested1));
        System.assert(auditLogOrganizationUpdatedChangesRequested3.equals(auditLogOrganizationUpdatedChangesRequested4));
        System.assert(auditLogOrganizationUpdatedChangesRequested4.equals(auditLogOrganizationUpdatedChangesRequested3));
        System.assert(auditLogOrganizationUpdatedChangesRequested3.equals(auditLogOrganizationUpdatedChangesRequested3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested1 = OASAuditLogOrganizationUpdatedChange.getExample();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested2 = OASAuditLogOrganizationUpdatedChange.getExample();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested3 = new OASAuditLogOrganizationUpdatedChange();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested4 = new OASAuditLogOrganizationUpdatedChange();

        System.assert(auditLogOrganizationUpdatedChangesRequested1.equals(auditLogOrganizationUpdatedChangesRequested2));
        System.assert(auditLogOrganizationUpdatedChangesRequested2.equals(auditLogOrganizationUpdatedChangesRequested1));
        System.assert(auditLogOrganizationUpdatedChangesRequested3.equals(auditLogOrganizationUpdatedChangesRequested4));
        System.assert(auditLogOrganizationUpdatedChangesRequested4.equals(auditLogOrganizationUpdatedChangesRequested3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested1 = OASAuditLogOrganizationUpdatedChange.getExample();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested2 = new OASAuditLogOrganizationUpdatedChange();

        System.assertEquals(false, auditLogOrganizationUpdatedChangesRequested1.equals('foo'));
        System.assertEquals(false, auditLogOrganizationUpdatedChangesRequested2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested1 = OASAuditLogOrganizationUpdatedChange.getExample();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested2 = new OASAuditLogOrganizationUpdatedChange();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested3;

        System.assertEquals(false, auditLogOrganizationUpdatedChangesRequested1.equals(auditLogOrganizationUpdatedChangesRequested3));
        System.assertEquals(false, auditLogOrganizationUpdatedChangesRequested2.equals(auditLogOrganizationUpdatedChangesRequested3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested1 = OASAuditLogOrganizationUpdatedChange.getExample();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested2 = new OASAuditLogOrganizationUpdatedChange();

        System.assertEquals(auditLogOrganizationUpdatedChangesRequested1.hashCode(), auditLogOrganizationUpdatedChangesRequested1.hashCode());
        System.assertEquals(auditLogOrganizationUpdatedChangesRequested2.hashCode(), auditLogOrganizationUpdatedChangesRequested2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested1 = OASAuditLogOrganizationUpdatedChange.getExample();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested2 = OASAuditLogOrganizationUpdatedChange.getExample();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested3 = new OASAuditLogOrganizationUpdatedChange();
        OASAuditLogOrganizationUpdatedChange auditLogOrganizationUpdatedChangesRequested4 = new OASAuditLogOrganizationUpdatedChange();

        System.assert(auditLogOrganizationUpdatedChangesRequested1.equals(auditLogOrganizationUpdatedChangesRequested2));
        System.assert(auditLogOrganizationUpdatedChangesRequested3.equals(auditLogOrganizationUpdatedChangesRequested4));
        System.assertEquals(auditLogOrganizationUpdatedChangesRequested1.hashCode(), auditLogOrganizationUpdatedChangesRequested2.hashCode());
        System.assertEquals(auditLogOrganizationUpdatedChangesRequested3.hashCode(), auditLogOrganizationUpdatedChangesRequested4.hashCode());
    }
}
