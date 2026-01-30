@isTest
private class OASAuditLogInviteAcceptedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogInviteAccepted auditLogInviteAccepted1 = OASAuditLogInviteAccepted.getExample();
        OASAuditLogInviteAccepted auditLogInviteAccepted2 = auditLogInviteAccepted1;
        OASAuditLogInviteAccepted auditLogInviteAccepted3 = new OASAuditLogInviteAccepted();
        OASAuditLogInviteAccepted auditLogInviteAccepted4 = auditLogInviteAccepted3;

        System.assert(auditLogInviteAccepted1.equals(auditLogInviteAccepted2));
        System.assert(auditLogInviteAccepted2.equals(auditLogInviteAccepted1));
        System.assert(auditLogInviteAccepted1.equals(auditLogInviteAccepted1));
        System.assert(auditLogInviteAccepted3.equals(auditLogInviteAccepted4));
        System.assert(auditLogInviteAccepted4.equals(auditLogInviteAccepted3));
        System.assert(auditLogInviteAccepted3.equals(auditLogInviteAccepted3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogInviteAccepted auditLogInviteAccepted1 = OASAuditLogInviteAccepted.getExample();
        OASAuditLogInviteAccepted auditLogInviteAccepted2 = OASAuditLogInviteAccepted.getExample();
        OASAuditLogInviteAccepted auditLogInviteAccepted3 = new OASAuditLogInviteAccepted();
        OASAuditLogInviteAccepted auditLogInviteAccepted4 = new OASAuditLogInviteAccepted();

        System.assert(auditLogInviteAccepted1.equals(auditLogInviteAccepted2));
        System.assert(auditLogInviteAccepted2.equals(auditLogInviteAccepted1));
        System.assert(auditLogInviteAccepted3.equals(auditLogInviteAccepted4));
        System.assert(auditLogInviteAccepted4.equals(auditLogInviteAccepted3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogInviteAccepted auditLogInviteAccepted1 = OASAuditLogInviteAccepted.getExample();
        OASAuditLogInviteAccepted auditLogInviteAccepted2 = new OASAuditLogInviteAccepted();

        System.assertEquals(false, auditLogInviteAccepted1.equals('foo'));
        System.assertEquals(false, auditLogInviteAccepted2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogInviteAccepted auditLogInviteAccepted1 = OASAuditLogInviteAccepted.getExample();
        OASAuditLogInviteAccepted auditLogInviteAccepted2 = new OASAuditLogInviteAccepted();
        OASAuditLogInviteAccepted auditLogInviteAccepted3;

        System.assertEquals(false, auditLogInviteAccepted1.equals(auditLogInviteAccepted3));
        System.assertEquals(false, auditLogInviteAccepted2.equals(auditLogInviteAccepted3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogInviteAccepted auditLogInviteAccepted1 = OASAuditLogInviteAccepted.getExample();
        OASAuditLogInviteAccepted auditLogInviteAccepted2 = new OASAuditLogInviteAccepted();

        System.assertEquals(auditLogInviteAccepted1.hashCode(), auditLogInviteAccepted1.hashCode());
        System.assertEquals(auditLogInviteAccepted2.hashCode(), auditLogInviteAccepted2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogInviteAccepted auditLogInviteAccepted1 = OASAuditLogInviteAccepted.getExample();
        OASAuditLogInviteAccepted auditLogInviteAccepted2 = OASAuditLogInviteAccepted.getExample();
        OASAuditLogInviteAccepted auditLogInviteAccepted3 = new OASAuditLogInviteAccepted();
        OASAuditLogInviteAccepted auditLogInviteAccepted4 = new OASAuditLogInviteAccepted();

        System.assert(auditLogInviteAccepted1.equals(auditLogInviteAccepted2));
        System.assert(auditLogInviteAccepted3.equals(auditLogInviteAccepted4));
        System.assertEquals(auditLogInviteAccepted1.hashCode(), auditLogInviteAccepted2.hashCode());
        System.assertEquals(auditLogInviteAccepted3.hashCode(), auditLogInviteAccepted4.hashCode());
    }
}
