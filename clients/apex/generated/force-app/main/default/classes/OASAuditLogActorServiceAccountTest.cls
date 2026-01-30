@isTest
private class OASAuditLogActorServiceAccountTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogActorServiceAccount auditLogActorServiceAccount1 = OASAuditLogActorServiceAccount.getExample();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount2 = auditLogActorServiceAccount1;
        OASAuditLogActorServiceAccount auditLogActorServiceAccount3 = new OASAuditLogActorServiceAccount();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount4 = auditLogActorServiceAccount3;

        System.assert(auditLogActorServiceAccount1.equals(auditLogActorServiceAccount2));
        System.assert(auditLogActorServiceAccount2.equals(auditLogActorServiceAccount1));
        System.assert(auditLogActorServiceAccount1.equals(auditLogActorServiceAccount1));
        System.assert(auditLogActorServiceAccount3.equals(auditLogActorServiceAccount4));
        System.assert(auditLogActorServiceAccount4.equals(auditLogActorServiceAccount3));
        System.assert(auditLogActorServiceAccount3.equals(auditLogActorServiceAccount3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogActorServiceAccount auditLogActorServiceAccount1 = OASAuditLogActorServiceAccount.getExample();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount2 = OASAuditLogActorServiceAccount.getExample();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount3 = new OASAuditLogActorServiceAccount();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount4 = new OASAuditLogActorServiceAccount();

        System.assert(auditLogActorServiceAccount1.equals(auditLogActorServiceAccount2));
        System.assert(auditLogActorServiceAccount2.equals(auditLogActorServiceAccount1));
        System.assert(auditLogActorServiceAccount3.equals(auditLogActorServiceAccount4));
        System.assert(auditLogActorServiceAccount4.equals(auditLogActorServiceAccount3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogActorServiceAccount auditLogActorServiceAccount1 = OASAuditLogActorServiceAccount.getExample();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount2 = new OASAuditLogActorServiceAccount();

        System.assertEquals(false, auditLogActorServiceAccount1.equals('foo'));
        System.assertEquals(false, auditLogActorServiceAccount2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogActorServiceAccount auditLogActorServiceAccount1 = OASAuditLogActorServiceAccount.getExample();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount2 = new OASAuditLogActorServiceAccount();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount3;

        System.assertEquals(false, auditLogActorServiceAccount1.equals(auditLogActorServiceAccount3));
        System.assertEquals(false, auditLogActorServiceAccount2.equals(auditLogActorServiceAccount3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogActorServiceAccount auditLogActorServiceAccount1 = OASAuditLogActorServiceAccount.getExample();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount2 = new OASAuditLogActorServiceAccount();

        System.assertEquals(auditLogActorServiceAccount1.hashCode(), auditLogActorServiceAccount1.hashCode());
        System.assertEquals(auditLogActorServiceAccount2.hashCode(), auditLogActorServiceAccount2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogActorServiceAccount auditLogActorServiceAccount1 = OASAuditLogActorServiceAccount.getExample();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount2 = OASAuditLogActorServiceAccount.getExample();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount3 = new OASAuditLogActorServiceAccount();
        OASAuditLogActorServiceAccount auditLogActorServiceAccount4 = new OASAuditLogActorServiceAccount();

        System.assert(auditLogActorServiceAccount1.equals(auditLogActorServiceAccount2));
        System.assert(auditLogActorServiceAccount3.equals(auditLogActorServiceAccount4));
        System.assertEquals(auditLogActorServiceAccount1.hashCode(), auditLogActorServiceAccount2.hashCode());
        System.assertEquals(auditLogActorServiceAccount3.hashCode(), auditLogActorServiceAccount4.hashCode());
    }
}
