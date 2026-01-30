@isTest
private class OASAuditLogInviteSentTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogInviteSent auditLogInviteSent1 = OASAuditLogInviteSent.getExample();
        OASAuditLogInviteSent auditLogInviteSent2 = auditLogInviteSent1;
        OASAuditLogInviteSent auditLogInviteSent3 = new OASAuditLogInviteSent();
        OASAuditLogInviteSent auditLogInviteSent4 = auditLogInviteSent3;

        System.assert(auditLogInviteSent1.equals(auditLogInviteSent2));
        System.assert(auditLogInviteSent2.equals(auditLogInviteSent1));
        System.assert(auditLogInviteSent1.equals(auditLogInviteSent1));
        System.assert(auditLogInviteSent3.equals(auditLogInviteSent4));
        System.assert(auditLogInviteSent4.equals(auditLogInviteSent3));
        System.assert(auditLogInviteSent3.equals(auditLogInviteSent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogInviteSent auditLogInviteSent1 = OASAuditLogInviteSent.getExample();
        OASAuditLogInviteSent auditLogInviteSent2 = OASAuditLogInviteSent.getExample();
        OASAuditLogInviteSent auditLogInviteSent3 = new OASAuditLogInviteSent();
        OASAuditLogInviteSent auditLogInviteSent4 = new OASAuditLogInviteSent();

        System.assert(auditLogInviteSent1.equals(auditLogInviteSent2));
        System.assert(auditLogInviteSent2.equals(auditLogInviteSent1));
        System.assert(auditLogInviteSent3.equals(auditLogInviteSent4));
        System.assert(auditLogInviteSent4.equals(auditLogInviteSent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogInviteSent auditLogInviteSent1 = OASAuditLogInviteSent.getExample();
        OASAuditLogInviteSent auditLogInviteSent2 = new OASAuditLogInviteSent();

        System.assertEquals(false, auditLogInviteSent1.equals('foo'));
        System.assertEquals(false, auditLogInviteSent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogInviteSent auditLogInviteSent1 = OASAuditLogInviteSent.getExample();
        OASAuditLogInviteSent auditLogInviteSent2 = new OASAuditLogInviteSent();
        OASAuditLogInviteSent auditLogInviteSent3;

        System.assertEquals(false, auditLogInviteSent1.equals(auditLogInviteSent3));
        System.assertEquals(false, auditLogInviteSent2.equals(auditLogInviteSent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogInviteSent auditLogInviteSent1 = OASAuditLogInviteSent.getExample();
        OASAuditLogInviteSent auditLogInviteSent2 = new OASAuditLogInviteSent();

        System.assertEquals(auditLogInviteSent1.hashCode(), auditLogInviteSent1.hashCode());
        System.assertEquals(auditLogInviteSent2.hashCode(), auditLogInviteSent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogInviteSent auditLogInviteSent1 = OASAuditLogInviteSent.getExample();
        OASAuditLogInviteSent auditLogInviteSent2 = OASAuditLogInviteSent.getExample();
        OASAuditLogInviteSent auditLogInviteSent3 = new OASAuditLogInviteSent();
        OASAuditLogInviteSent auditLogInviteSent4 = new OASAuditLogInviteSent();

        System.assert(auditLogInviteSent1.equals(auditLogInviteSent2));
        System.assert(auditLogInviteSent3.equals(auditLogInviteSent4));
        System.assertEquals(auditLogInviteSent1.hashCode(), auditLogInviteSent2.hashCode());
        System.assertEquals(auditLogInviteSent3.hashCode(), auditLogInviteSent4.hashCode());
    }
}
