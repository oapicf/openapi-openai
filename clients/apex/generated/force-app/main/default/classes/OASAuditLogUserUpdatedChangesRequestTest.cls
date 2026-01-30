@isTest
private class OASAuditLogUserUpdatedChangesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested1 = OASAuditLogUserUpdatedChangesRequest.getExample();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested2 = auditLogUserUpdatedChangesRequested1;
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested3 = new OASAuditLogUserUpdatedChangesRequest();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested4 = auditLogUserUpdatedChangesRequested3;

        System.assert(auditLogUserUpdatedChangesRequested1.equals(auditLogUserUpdatedChangesRequested2));
        System.assert(auditLogUserUpdatedChangesRequested2.equals(auditLogUserUpdatedChangesRequested1));
        System.assert(auditLogUserUpdatedChangesRequested1.equals(auditLogUserUpdatedChangesRequested1));
        System.assert(auditLogUserUpdatedChangesRequested3.equals(auditLogUserUpdatedChangesRequested4));
        System.assert(auditLogUserUpdatedChangesRequested4.equals(auditLogUserUpdatedChangesRequested3));
        System.assert(auditLogUserUpdatedChangesRequested3.equals(auditLogUserUpdatedChangesRequested3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested1 = OASAuditLogUserUpdatedChangesRequest.getExample();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested2 = OASAuditLogUserUpdatedChangesRequest.getExample();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested3 = new OASAuditLogUserUpdatedChangesRequest();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested4 = new OASAuditLogUserUpdatedChangesRequest();

        System.assert(auditLogUserUpdatedChangesRequested1.equals(auditLogUserUpdatedChangesRequested2));
        System.assert(auditLogUserUpdatedChangesRequested2.equals(auditLogUserUpdatedChangesRequested1));
        System.assert(auditLogUserUpdatedChangesRequested3.equals(auditLogUserUpdatedChangesRequested4));
        System.assert(auditLogUserUpdatedChangesRequested4.equals(auditLogUserUpdatedChangesRequested3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested1 = OASAuditLogUserUpdatedChangesRequest.getExample();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested2 = new OASAuditLogUserUpdatedChangesRequest();

        System.assertEquals(false, auditLogUserUpdatedChangesRequested1.equals('foo'));
        System.assertEquals(false, auditLogUserUpdatedChangesRequested2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested1 = OASAuditLogUserUpdatedChangesRequest.getExample();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested2 = new OASAuditLogUserUpdatedChangesRequest();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested3;

        System.assertEquals(false, auditLogUserUpdatedChangesRequested1.equals(auditLogUserUpdatedChangesRequested3));
        System.assertEquals(false, auditLogUserUpdatedChangesRequested2.equals(auditLogUserUpdatedChangesRequested3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested1 = OASAuditLogUserUpdatedChangesRequest.getExample();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested2 = new OASAuditLogUserUpdatedChangesRequest();

        System.assertEquals(auditLogUserUpdatedChangesRequested1.hashCode(), auditLogUserUpdatedChangesRequested1.hashCode());
        System.assertEquals(auditLogUserUpdatedChangesRequested2.hashCode(), auditLogUserUpdatedChangesRequested2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested1 = OASAuditLogUserUpdatedChangesRequest.getExample();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested2 = OASAuditLogUserUpdatedChangesRequest.getExample();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested3 = new OASAuditLogUserUpdatedChangesRequest();
        OASAuditLogUserUpdatedChangesRequest auditLogUserUpdatedChangesRequested4 = new OASAuditLogUserUpdatedChangesRequest();

        System.assert(auditLogUserUpdatedChangesRequested1.equals(auditLogUserUpdatedChangesRequested2));
        System.assert(auditLogUserUpdatedChangesRequested3.equals(auditLogUserUpdatedChangesRequested4));
        System.assertEquals(auditLogUserUpdatedChangesRequested1.hashCode(), auditLogUserUpdatedChangesRequested2.hashCode());
        System.assertEquals(auditLogUserUpdatedChangesRequested3.hashCode(), auditLogUserUpdatedChangesRequested4.hashCode());
    }
}
