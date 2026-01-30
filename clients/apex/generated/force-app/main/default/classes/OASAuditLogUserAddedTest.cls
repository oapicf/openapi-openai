@isTest
private class OASAuditLogUserAddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogUserAdded auditLogUserAdded1 = OASAuditLogUserAdded.getExample();
        OASAuditLogUserAdded auditLogUserAdded2 = auditLogUserAdded1;
        OASAuditLogUserAdded auditLogUserAdded3 = new OASAuditLogUserAdded();
        OASAuditLogUserAdded auditLogUserAdded4 = auditLogUserAdded3;

        System.assert(auditLogUserAdded1.equals(auditLogUserAdded2));
        System.assert(auditLogUserAdded2.equals(auditLogUserAdded1));
        System.assert(auditLogUserAdded1.equals(auditLogUserAdded1));
        System.assert(auditLogUserAdded3.equals(auditLogUserAdded4));
        System.assert(auditLogUserAdded4.equals(auditLogUserAdded3));
        System.assert(auditLogUserAdded3.equals(auditLogUserAdded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogUserAdded auditLogUserAdded1 = OASAuditLogUserAdded.getExample();
        OASAuditLogUserAdded auditLogUserAdded2 = OASAuditLogUserAdded.getExample();
        OASAuditLogUserAdded auditLogUserAdded3 = new OASAuditLogUserAdded();
        OASAuditLogUserAdded auditLogUserAdded4 = new OASAuditLogUserAdded();

        System.assert(auditLogUserAdded1.equals(auditLogUserAdded2));
        System.assert(auditLogUserAdded2.equals(auditLogUserAdded1));
        System.assert(auditLogUserAdded3.equals(auditLogUserAdded4));
        System.assert(auditLogUserAdded4.equals(auditLogUserAdded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogUserAdded auditLogUserAdded1 = OASAuditLogUserAdded.getExample();
        OASAuditLogUserAdded auditLogUserAdded2 = new OASAuditLogUserAdded();

        System.assertEquals(false, auditLogUserAdded1.equals('foo'));
        System.assertEquals(false, auditLogUserAdded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogUserAdded auditLogUserAdded1 = OASAuditLogUserAdded.getExample();
        OASAuditLogUserAdded auditLogUserAdded2 = new OASAuditLogUserAdded();
        OASAuditLogUserAdded auditLogUserAdded3;

        System.assertEquals(false, auditLogUserAdded1.equals(auditLogUserAdded3));
        System.assertEquals(false, auditLogUserAdded2.equals(auditLogUserAdded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogUserAdded auditLogUserAdded1 = OASAuditLogUserAdded.getExample();
        OASAuditLogUserAdded auditLogUserAdded2 = new OASAuditLogUserAdded();

        System.assertEquals(auditLogUserAdded1.hashCode(), auditLogUserAdded1.hashCode());
        System.assertEquals(auditLogUserAdded2.hashCode(), auditLogUserAdded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogUserAdded auditLogUserAdded1 = OASAuditLogUserAdded.getExample();
        OASAuditLogUserAdded auditLogUserAdded2 = OASAuditLogUserAdded.getExample();
        OASAuditLogUserAdded auditLogUserAdded3 = new OASAuditLogUserAdded();
        OASAuditLogUserAdded auditLogUserAdded4 = new OASAuditLogUserAdded();

        System.assert(auditLogUserAdded1.equals(auditLogUserAdded2));
        System.assert(auditLogUserAdded3.equals(auditLogUserAdded4));
        System.assertEquals(auditLogUserAdded1.hashCode(), auditLogUserAdded2.hashCode());
        System.assertEquals(auditLogUserAdded3.hashCode(), auditLogUserAdded4.hashCode());
    }
}
