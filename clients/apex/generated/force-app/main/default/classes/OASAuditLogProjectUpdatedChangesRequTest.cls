@isTest
private class OASAuditLogProjectUpdatedChangesRequTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested1 = OASAuditLogProjectUpdatedChangesRequ.getExample();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested2 = auditLogProjectUpdatedChangesRequested1;
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested3 = new OASAuditLogProjectUpdatedChangesRequ();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested4 = auditLogProjectUpdatedChangesRequested3;

        System.assert(auditLogProjectUpdatedChangesRequested1.equals(auditLogProjectUpdatedChangesRequested2));
        System.assert(auditLogProjectUpdatedChangesRequested2.equals(auditLogProjectUpdatedChangesRequested1));
        System.assert(auditLogProjectUpdatedChangesRequested1.equals(auditLogProjectUpdatedChangesRequested1));
        System.assert(auditLogProjectUpdatedChangesRequested3.equals(auditLogProjectUpdatedChangesRequested4));
        System.assert(auditLogProjectUpdatedChangesRequested4.equals(auditLogProjectUpdatedChangesRequested3));
        System.assert(auditLogProjectUpdatedChangesRequested3.equals(auditLogProjectUpdatedChangesRequested3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested1 = OASAuditLogProjectUpdatedChangesRequ.getExample();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested2 = OASAuditLogProjectUpdatedChangesRequ.getExample();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested3 = new OASAuditLogProjectUpdatedChangesRequ();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested4 = new OASAuditLogProjectUpdatedChangesRequ();

        System.assert(auditLogProjectUpdatedChangesRequested1.equals(auditLogProjectUpdatedChangesRequested2));
        System.assert(auditLogProjectUpdatedChangesRequested2.equals(auditLogProjectUpdatedChangesRequested1));
        System.assert(auditLogProjectUpdatedChangesRequested3.equals(auditLogProjectUpdatedChangesRequested4));
        System.assert(auditLogProjectUpdatedChangesRequested4.equals(auditLogProjectUpdatedChangesRequested3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested1 = OASAuditLogProjectUpdatedChangesRequ.getExample();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested2 = new OASAuditLogProjectUpdatedChangesRequ();

        System.assertEquals(false, auditLogProjectUpdatedChangesRequested1.equals('foo'));
        System.assertEquals(false, auditLogProjectUpdatedChangesRequested2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested1 = OASAuditLogProjectUpdatedChangesRequ.getExample();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested2 = new OASAuditLogProjectUpdatedChangesRequ();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested3;

        System.assertEquals(false, auditLogProjectUpdatedChangesRequested1.equals(auditLogProjectUpdatedChangesRequested3));
        System.assertEquals(false, auditLogProjectUpdatedChangesRequested2.equals(auditLogProjectUpdatedChangesRequested3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested1 = OASAuditLogProjectUpdatedChangesRequ.getExample();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested2 = new OASAuditLogProjectUpdatedChangesRequ();

        System.assertEquals(auditLogProjectUpdatedChangesRequested1.hashCode(), auditLogProjectUpdatedChangesRequested1.hashCode());
        System.assertEquals(auditLogProjectUpdatedChangesRequested2.hashCode(), auditLogProjectUpdatedChangesRequested2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested1 = OASAuditLogProjectUpdatedChangesRequ.getExample();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested2 = OASAuditLogProjectUpdatedChangesRequ.getExample();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested3 = new OASAuditLogProjectUpdatedChangesRequ();
        OASAuditLogProjectUpdatedChangesRequ auditLogProjectUpdatedChangesRequested4 = new OASAuditLogProjectUpdatedChangesRequ();

        System.assert(auditLogProjectUpdatedChangesRequested1.equals(auditLogProjectUpdatedChangesRequested2));
        System.assert(auditLogProjectUpdatedChangesRequested3.equals(auditLogProjectUpdatedChangesRequested4));
        System.assertEquals(auditLogProjectUpdatedChangesRequested1.hashCode(), auditLogProjectUpdatedChangesRequested2.hashCode());
        System.assertEquals(auditLogProjectUpdatedChangesRequested3.hashCode(), auditLogProjectUpdatedChangesRequested4.hashCode());
    }
}
