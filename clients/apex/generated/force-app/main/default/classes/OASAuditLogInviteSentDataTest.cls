@isTest
private class OASAuditLogInviteSentDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogInviteSentData auditLogInviteSentData1 = OASAuditLogInviteSentData.getExample();
        OASAuditLogInviteSentData auditLogInviteSentData2 = auditLogInviteSentData1;
        OASAuditLogInviteSentData auditLogInviteSentData3 = new OASAuditLogInviteSentData();
        OASAuditLogInviteSentData auditLogInviteSentData4 = auditLogInviteSentData3;

        System.assert(auditLogInviteSentData1.equals(auditLogInviteSentData2));
        System.assert(auditLogInviteSentData2.equals(auditLogInviteSentData1));
        System.assert(auditLogInviteSentData1.equals(auditLogInviteSentData1));
        System.assert(auditLogInviteSentData3.equals(auditLogInviteSentData4));
        System.assert(auditLogInviteSentData4.equals(auditLogInviteSentData3));
        System.assert(auditLogInviteSentData3.equals(auditLogInviteSentData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogInviteSentData auditLogInviteSentData1 = OASAuditLogInviteSentData.getExample();
        OASAuditLogInviteSentData auditLogInviteSentData2 = OASAuditLogInviteSentData.getExample();
        OASAuditLogInviteSentData auditLogInviteSentData3 = new OASAuditLogInviteSentData();
        OASAuditLogInviteSentData auditLogInviteSentData4 = new OASAuditLogInviteSentData();

        System.assert(auditLogInviteSentData1.equals(auditLogInviteSentData2));
        System.assert(auditLogInviteSentData2.equals(auditLogInviteSentData1));
        System.assert(auditLogInviteSentData3.equals(auditLogInviteSentData4));
        System.assert(auditLogInviteSentData4.equals(auditLogInviteSentData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogInviteSentData auditLogInviteSentData1 = OASAuditLogInviteSentData.getExample();
        OASAuditLogInviteSentData auditLogInviteSentData2 = new OASAuditLogInviteSentData();

        System.assertEquals(false, auditLogInviteSentData1.equals('foo'));
        System.assertEquals(false, auditLogInviteSentData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogInviteSentData auditLogInviteSentData1 = OASAuditLogInviteSentData.getExample();
        OASAuditLogInviteSentData auditLogInviteSentData2 = new OASAuditLogInviteSentData();
        OASAuditLogInviteSentData auditLogInviteSentData3;

        System.assertEquals(false, auditLogInviteSentData1.equals(auditLogInviteSentData3));
        System.assertEquals(false, auditLogInviteSentData2.equals(auditLogInviteSentData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogInviteSentData auditLogInviteSentData1 = OASAuditLogInviteSentData.getExample();
        OASAuditLogInviteSentData auditLogInviteSentData2 = new OASAuditLogInviteSentData();

        System.assertEquals(auditLogInviteSentData1.hashCode(), auditLogInviteSentData1.hashCode());
        System.assertEquals(auditLogInviteSentData2.hashCode(), auditLogInviteSentData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogInviteSentData auditLogInviteSentData1 = OASAuditLogInviteSentData.getExample();
        OASAuditLogInviteSentData auditLogInviteSentData2 = OASAuditLogInviteSentData.getExample();
        OASAuditLogInviteSentData auditLogInviteSentData3 = new OASAuditLogInviteSentData();
        OASAuditLogInviteSentData auditLogInviteSentData4 = new OASAuditLogInviteSentData();

        System.assert(auditLogInviteSentData1.equals(auditLogInviteSentData2));
        System.assert(auditLogInviteSentData3.equals(auditLogInviteSentData4));
        System.assertEquals(auditLogInviteSentData1.hashCode(), auditLogInviteSentData2.hashCode());
        System.assertEquals(auditLogInviteSentData3.hashCode(), auditLogInviteSentData4.hashCode());
    }
}
