@isTest
private class OASAuditLogServiceAccountUpdatedChanTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested1 = OASAuditLogServiceAccountUpdatedChan.getExample();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested2 = auditLogServiceAccountUpdatedChangesRequested1;
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested3 = new OASAuditLogServiceAccountUpdatedChan();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested4 = auditLogServiceAccountUpdatedChangesRequested3;

        System.assert(auditLogServiceAccountUpdatedChangesRequested1.equals(auditLogServiceAccountUpdatedChangesRequested2));
        System.assert(auditLogServiceAccountUpdatedChangesRequested2.equals(auditLogServiceAccountUpdatedChangesRequested1));
        System.assert(auditLogServiceAccountUpdatedChangesRequested1.equals(auditLogServiceAccountUpdatedChangesRequested1));
        System.assert(auditLogServiceAccountUpdatedChangesRequested3.equals(auditLogServiceAccountUpdatedChangesRequested4));
        System.assert(auditLogServiceAccountUpdatedChangesRequested4.equals(auditLogServiceAccountUpdatedChangesRequested3));
        System.assert(auditLogServiceAccountUpdatedChangesRequested3.equals(auditLogServiceAccountUpdatedChangesRequested3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested1 = OASAuditLogServiceAccountUpdatedChan.getExample();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested2 = OASAuditLogServiceAccountUpdatedChan.getExample();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested3 = new OASAuditLogServiceAccountUpdatedChan();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested4 = new OASAuditLogServiceAccountUpdatedChan();

        System.assert(auditLogServiceAccountUpdatedChangesRequested1.equals(auditLogServiceAccountUpdatedChangesRequested2));
        System.assert(auditLogServiceAccountUpdatedChangesRequested2.equals(auditLogServiceAccountUpdatedChangesRequested1));
        System.assert(auditLogServiceAccountUpdatedChangesRequested3.equals(auditLogServiceAccountUpdatedChangesRequested4));
        System.assert(auditLogServiceAccountUpdatedChangesRequested4.equals(auditLogServiceAccountUpdatedChangesRequested3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested1 = OASAuditLogServiceAccountUpdatedChan.getExample();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested2 = new OASAuditLogServiceAccountUpdatedChan();

        System.assertEquals(false, auditLogServiceAccountUpdatedChangesRequested1.equals('foo'));
        System.assertEquals(false, auditLogServiceAccountUpdatedChangesRequested2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested1 = OASAuditLogServiceAccountUpdatedChan.getExample();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested2 = new OASAuditLogServiceAccountUpdatedChan();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested3;

        System.assertEquals(false, auditLogServiceAccountUpdatedChangesRequested1.equals(auditLogServiceAccountUpdatedChangesRequested3));
        System.assertEquals(false, auditLogServiceAccountUpdatedChangesRequested2.equals(auditLogServiceAccountUpdatedChangesRequested3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested1 = OASAuditLogServiceAccountUpdatedChan.getExample();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested2 = new OASAuditLogServiceAccountUpdatedChan();

        System.assertEquals(auditLogServiceAccountUpdatedChangesRequested1.hashCode(), auditLogServiceAccountUpdatedChangesRequested1.hashCode());
        System.assertEquals(auditLogServiceAccountUpdatedChangesRequested2.hashCode(), auditLogServiceAccountUpdatedChangesRequested2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested1 = OASAuditLogServiceAccountUpdatedChan.getExample();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested2 = OASAuditLogServiceAccountUpdatedChan.getExample();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested3 = new OASAuditLogServiceAccountUpdatedChan();
        OASAuditLogServiceAccountUpdatedChan auditLogServiceAccountUpdatedChangesRequested4 = new OASAuditLogServiceAccountUpdatedChan();

        System.assert(auditLogServiceAccountUpdatedChangesRequested1.equals(auditLogServiceAccountUpdatedChangesRequested2));
        System.assert(auditLogServiceAccountUpdatedChangesRequested3.equals(auditLogServiceAccountUpdatedChangesRequested4));
        System.assertEquals(auditLogServiceAccountUpdatedChangesRequested1.hashCode(), auditLogServiceAccountUpdatedChangesRequested2.hashCode());
        System.assertEquals(auditLogServiceAccountUpdatedChangesRequested3.hashCode(), auditLogServiceAccountUpdatedChangesRequested4.hashCode());
    }
}
