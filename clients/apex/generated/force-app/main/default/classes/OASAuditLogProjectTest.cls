@isTest
private class OASAuditLogProjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogProject auditLogProject1 = OASAuditLogProject.getExample();
        OASAuditLogProject auditLogProject2 = auditLogProject1;
        OASAuditLogProject auditLogProject3 = new OASAuditLogProject();
        OASAuditLogProject auditLogProject4 = auditLogProject3;

        System.assert(auditLogProject1.equals(auditLogProject2));
        System.assert(auditLogProject2.equals(auditLogProject1));
        System.assert(auditLogProject1.equals(auditLogProject1));
        System.assert(auditLogProject3.equals(auditLogProject4));
        System.assert(auditLogProject4.equals(auditLogProject3));
        System.assert(auditLogProject3.equals(auditLogProject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogProject auditLogProject1 = OASAuditLogProject.getExample();
        OASAuditLogProject auditLogProject2 = OASAuditLogProject.getExample();
        OASAuditLogProject auditLogProject3 = new OASAuditLogProject();
        OASAuditLogProject auditLogProject4 = new OASAuditLogProject();

        System.assert(auditLogProject1.equals(auditLogProject2));
        System.assert(auditLogProject2.equals(auditLogProject1));
        System.assert(auditLogProject3.equals(auditLogProject4));
        System.assert(auditLogProject4.equals(auditLogProject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogProject auditLogProject1 = OASAuditLogProject.getExample();
        OASAuditLogProject auditLogProject2 = new OASAuditLogProject();

        System.assertEquals(false, auditLogProject1.equals('foo'));
        System.assertEquals(false, auditLogProject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogProject auditLogProject1 = OASAuditLogProject.getExample();
        OASAuditLogProject auditLogProject2 = new OASAuditLogProject();
        OASAuditLogProject auditLogProject3;

        System.assertEquals(false, auditLogProject1.equals(auditLogProject3));
        System.assertEquals(false, auditLogProject2.equals(auditLogProject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogProject auditLogProject1 = OASAuditLogProject.getExample();
        OASAuditLogProject auditLogProject2 = new OASAuditLogProject();

        System.assertEquals(auditLogProject1.hashCode(), auditLogProject1.hashCode());
        System.assertEquals(auditLogProject2.hashCode(), auditLogProject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogProject auditLogProject1 = OASAuditLogProject.getExample();
        OASAuditLogProject auditLogProject2 = OASAuditLogProject.getExample();
        OASAuditLogProject auditLogProject3 = new OASAuditLogProject();
        OASAuditLogProject auditLogProject4 = new OASAuditLogProject();

        System.assert(auditLogProject1.equals(auditLogProject2));
        System.assert(auditLogProject3.equals(auditLogProject4));
        System.assertEquals(auditLogProject1.hashCode(), auditLogProject2.hashCode());
        System.assertEquals(auditLogProject3.hashCode(), auditLogProject4.hashCode());
    }
}
