@isTest
private class OASAuditLogUserAddedDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogUserAddedData auditLogUserAddedData1 = OASAuditLogUserAddedData.getExample();
        OASAuditLogUserAddedData auditLogUserAddedData2 = auditLogUserAddedData1;
        OASAuditLogUserAddedData auditLogUserAddedData3 = new OASAuditLogUserAddedData();
        OASAuditLogUserAddedData auditLogUserAddedData4 = auditLogUserAddedData3;

        System.assert(auditLogUserAddedData1.equals(auditLogUserAddedData2));
        System.assert(auditLogUserAddedData2.equals(auditLogUserAddedData1));
        System.assert(auditLogUserAddedData1.equals(auditLogUserAddedData1));
        System.assert(auditLogUserAddedData3.equals(auditLogUserAddedData4));
        System.assert(auditLogUserAddedData4.equals(auditLogUserAddedData3));
        System.assert(auditLogUserAddedData3.equals(auditLogUserAddedData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogUserAddedData auditLogUserAddedData1 = OASAuditLogUserAddedData.getExample();
        OASAuditLogUserAddedData auditLogUserAddedData2 = OASAuditLogUserAddedData.getExample();
        OASAuditLogUserAddedData auditLogUserAddedData3 = new OASAuditLogUserAddedData();
        OASAuditLogUserAddedData auditLogUserAddedData4 = new OASAuditLogUserAddedData();

        System.assert(auditLogUserAddedData1.equals(auditLogUserAddedData2));
        System.assert(auditLogUserAddedData2.equals(auditLogUserAddedData1));
        System.assert(auditLogUserAddedData3.equals(auditLogUserAddedData4));
        System.assert(auditLogUserAddedData4.equals(auditLogUserAddedData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogUserAddedData auditLogUserAddedData1 = OASAuditLogUserAddedData.getExample();
        OASAuditLogUserAddedData auditLogUserAddedData2 = new OASAuditLogUserAddedData();

        System.assertEquals(false, auditLogUserAddedData1.equals('foo'));
        System.assertEquals(false, auditLogUserAddedData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogUserAddedData auditLogUserAddedData1 = OASAuditLogUserAddedData.getExample();
        OASAuditLogUserAddedData auditLogUserAddedData2 = new OASAuditLogUserAddedData();
        OASAuditLogUserAddedData auditLogUserAddedData3;

        System.assertEquals(false, auditLogUserAddedData1.equals(auditLogUserAddedData3));
        System.assertEquals(false, auditLogUserAddedData2.equals(auditLogUserAddedData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogUserAddedData auditLogUserAddedData1 = OASAuditLogUserAddedData.getExample();
        OASAuditLogUserAddedData auditLogUserAddedData2 = new OASAuditLogUserAddedData();

        System.assertEquals(auditLogUserAddedData1.hashCode(), auditLogUserAddedData1.hashCode());
        System.assertEquals(auditLogUserAddedData2.hashCode(), auditLogUserAddedData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogUserAddedData auditLogUserAddedData1 = OASAuditLogUserAddedData.getExample();
        OASAuditLogUserAddedData auditLogUserAddedData2 = OASAuditLogUserAddedData.getExample();
        OASAuditLogUserAddedData auditLogUserAddedData3 = new OASAuditLogUserAddedData();
        OASAuditLogUserAddedData auditLogUserAddedData4 = new OASAuditLogUserAddedData();

        System.assert(auditLogUserAddedData1.equals(auditLogUserAddedData2));
        System.assert(auditLogUserAddedData3.equals(auditLogUserAddedData4));
        System.assertEquals(auditLogUserAddedData1.hashCode(), auditLogUserAddedData2.hashCode());
        System.assertEquals(auditLogUserAddedData3.hashCode(), auditLogUserAddedData4.hashCode());
    }
}
