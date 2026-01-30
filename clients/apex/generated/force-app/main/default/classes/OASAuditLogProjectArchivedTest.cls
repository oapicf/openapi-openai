@isTest
private class OASAuditLogProjectArchivedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogProjectArchived auditLogProjectArchived1 = OASAuditLogProjectArchived.getExample();
        OASAuditLogProjectArchived auditLogProjectArchived2 = auditLogProjectArchived1;
        OASAuditLogProjectArchived auditLogProjectArchived3 = new OASAuditLogProjectArchived();
        OASAuditLogProjectArchived auditLogProjectArchived4 = auditLogProjectArchived3;

        System.assert(auditLogProjectArchived1.equals(auditLogProjectArchived2));
        System.assert(auditLogProjectArchived2.equals(auditLogProjectArchived1));
        System.assert(auditLogProjectArchived1.equals(auditLogProjectArchived1));
        System.assert(auditLogProjectArchived3.equals(auditLogProjectArchived4));
        System.assert(auditLogProjectArchived4.equals(auditLogProjectArchived3));
        System.assert(auditLogProjectArchived3.equals(auditLogProjectArchived3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogProjectArchived auditLogProjectArchived1 = OASAuditLogProjectArchived.getExample();
        OASAuditLogProjectArchived auditLogProjectArchived2 = OASAuditLogProjectArchived.getExample();
        OASAuditLogProjectArchived auditLogProjectArchived3 = new OASAuditLogProjectArchived();
        OASAuditLogProjectArchived auditLogProjectArchived4 = new OASAuditLogProjectArchived();

        System.assert(auditLogProjectArchived1.equals(auditLogProjectArchived2));
        System.assert(auditLogProjectArchived2.equals(auditLogProjectArchived1));
        System.assert(auditLogProjectArchived3.equals(auditLogProjectArchived4));
        System.assert(auditLogProjectArchived4.equals(auditLogProjectArchived3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogProjectArchived auditLogProjectArchived1 = OASAuditLogProjectArchived.getExample();
        OASAuditLogProjectArchived auditLogProjectArchived2 = new OASAuditLogProjectArchived();

        System.assertEquals(false, auditLogProjectArchived1.equals('foo'));
        System.assertEquals(false, auditLogProjectArchived2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogProjectArchived auditLogProjectArchived1 = OASAuditLogProjectArchived.getExample();
        OASAuditLogProjectArchived auditLogProjectArchived2 = new OASAuditLogProjectArchived();
        OASAuditLogProjectArchived auditLogProjectArchived3;

        System.assertEquals(false, auditLogProjectArchived1.equals(auditLogProjectArchived3));
        System.assertEquals(false, auditLogProjectArchived2.equals(auditLogProjectArchived3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogProjectArchived auditLogProjectArchived1 = OASAuditLogProjectArchived.getExample();
        OASAuditLogProjectArchived auditLogProjectArchived2 = new OASAuditLogProjectArchived();

        System.assertEquals(auditLogProjectArchived1.hashCode(), auditLogProjectArchived1.hashCode());
        System.assertEquals(auditLogProjectArchived2.hashCode(), auditLogProjectArchived2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogProjectArchived auditLogProjectArchived1 = OASAuditLogProjectArchived.getExample();
        OASAuditLogProjectArchived auditLogProjectArchived2 = OASAuditLogProjectArchived.getExample();
        OASAuditLogProjectArchived auditLogProjectArchived3 = new OASAuditLogProjectArchived();
        OASAuditLogProjectArchived auditLogProjectArchived4 = new OASAuditLogProjectArchived();

        System.assert(auditLogProjectArchived1.equals(auditLogProjectArchived2));
        System.assert(auditLogProjectArchived3.equals(auditLogProjectArchived4));
        System.assertEquals(auditLogProjectArchived1.hashCode(), auditLogProjectArchived2.hashCode());
        System.assertEquals(auditLogProjectArchived3.hashCode(), auditLogProjectArchived4.hashCode());
    }
}
