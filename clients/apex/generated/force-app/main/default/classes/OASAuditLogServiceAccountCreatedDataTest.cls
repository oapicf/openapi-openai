@isTest
private class OASAuditLogServiceAccountCreatedDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData1 = OASAuditLogServiceAccountCreatedData.getExample();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData2 = auditLogServiceAccountCreatedData1;
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData3 = new OASAuditLogServiceAccountCreatedData();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData4 = auditLogServiceAccountCreatedData3;

        System.assert(auditLogServiceAccountCreatedData1.equals(auditLogServiceAccountCreatedData2));
        System.assert(auditLogServiceAccountCreatedData2.equals(auditLogServiceAccountCreatedData1));
        System.assert(auditLogServiceAccountCreatedData1.equals(auditLogServiceAccountCreatedData1));
        System.assert(auditLogServiceAccountCreatedData3.equals(auditLogServiceAccountCreatedData4));
        System.assert(auditLogServiceAccountCreatedData4.equals(auditLogServiceAccountCreatedData3));
        System.assert(auditLogServiceAccountCreatedData3.equals(auditLogServiceAccountCreatedData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData1 = OASAuditLogServiceAccountCreatedData.getExample();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData2 = OASAuditLogServiceAccountCreatedData.getExample();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData3 = new OASAuditLogServiceAccountCreatedData();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData4 = new OASAuditLogServiceAccountCreatedData();

        System.assert(auditLogServiceAccountCreatedData1.equals(auditLogServiceAccountCreatedData2));
        System.assert(auditLogServiceAccountCreatedData2.equals(auditLogServiceAccountCreatedData1));
        System.assert(auditLogServiceAccountCreatedData3.equals(auditLogServiceAccountCreatedData4));
        System.assert(auditLogServiceAccountCreatedData4.equals(auditLogServiceAccountCreatedData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData1 = OASAuditLogServiceAccountCreatedData.getExample();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData2 = new OASAuditLogServiceAccountCreatedData();

        System.assertEquals(false, auditLogServiceAccountCreatedData1.equals('foo'));
        System.assertEquals(false, auditLogServiceAccountCreatedData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData1 = OASAuditLogServiceAccountCreatedData.getExample();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData2 = new OASAuditLogServiceAccountCreatedData();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData3;

        System.assertEquals(false, auditLogServiceAccountCreatedData1.equals(auditLogServiceAccountCreatedData3));
        System.assertEquals(false, auditLogServiceAccountCreatedData2.equals(auditLogServiceAccountCreatedData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData1 = OASAuditLogServiceAccountCreatedData.getExample();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData2 = new OASAuditLogServiceAccountCreatedData();

        System.assertEquals(auditLogServiceAccountCreatedData1.hashCode(), auditLogServiceAccountCreatedData1.hashCode());
        System.assertEquals(auditLogServiceAccountCreatedData2.hashCode(), auditLogServiceAccountCreatedData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData1 = OASAuditLogServiceAccountCreatedData.getExample();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData2 = OASAuditLogServiceAccountCreatedData.getExample();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData3 = new OASAuditLogServiceAccountCreatedData();
        OASAuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData4 = new OASAuditLogServiceAccountCreatedData();

        System.assert(auditLogServiceAccountCreatedData1.equals(auditLogServiceAccountCreatedData2));
        System.assert(auditLogServiceAccountCreatedData3.equals(auditLogServiceAccountCreatedData4));
        System.assertEquals(auditLogServiceAccountCreatedData1.hashCode(), auditLogServiceAccountCreatedData2.hashCode());
        System.assertEquals(auditLogServiceAccountCreatedData3.hashCode(), auditLogServiceAccountCreatedData4.hashCode());
    }
}
