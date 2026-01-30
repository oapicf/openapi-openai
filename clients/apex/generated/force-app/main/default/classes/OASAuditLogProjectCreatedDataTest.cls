@isTest
private class OASAuditLogProjectCreatedDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogProjectCreatedData auditLogProjectCreatedData1 = OASAuditLogProjectCreatedData.getExample();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData2 = auditLogProjectCreatedData1;
        OASAuditLogProjectCreatedData auditLogProjectCreatedData3 = new OASAuditLogProjectCreatedData();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData4 = auditLogProjectCreatedData3;

        System.assert(auditLogProjectCreatedData1.equals(auditLogProjectCreatedData2));
        System.assert(auditLogProjectCreatedData2.equals(auditLogProjectCreatedData1));
        System.assert(auditLogProjectCreatedData1.equals(auditLogProjectCreatedData1));
        System.assert(auditLogProjectCreatedData3.equals(auditLogProjectCreatedData4));
        System.assert(auditLogProjectCreatedData4.equals(auditLogProjectCreatedData3));
        System.assert(auditLogProjectCreatedData3.equals(auditLogProjectCreatedData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogProjectCreatedData auditLogProjectCreatedData1 = OASAuditLogProjectCreatedData.getExample();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData2 = OASAuditLogProjectCreatedData.getExample();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData3 = new OASAuditLogProjectCreatedData();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData4 = new OASAuditLogProjectCreatedData();

        System.assert(auditLogProjectCreatedData1.equals(auditLogProjectCreatedData2));
        System.assert(auditLogProjectCreatedData2.equals(auditLogProjectCreatedData1));
        System.assert(auditLogProjectCreatedData3.equals(auditLogProjectCreatedData4));
        System.assert(auditLogProjectCreatedData4.equals(auditLogProjectCreatedData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogProjectCreatedData auditLogProjectCreatedData1 = OASAuditLogProjectCreatedData.getExample();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData2 = new OASAuditLogProjectCreatedData();

        System.assertEquals(false, auditLogProjectCreatedData1.equals('foo'));
        System.assertEquals(false, auditLogProjectCreatedData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogProjectCreatedData auditLogProjectCreatedData1 = OASAuditLogProjectCreatedData.getExample();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData2 = new OASAuditLogProjectCreatedData();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData3;

        System.assertEquals(false, auditLogProjectCreatedData1.equals(auditLogProjectCreatedData3));
        System.assertEquals(false, auditLogProjectCreatedData2.equals(auditLogProjectCreatedData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogProjectCreatedData auditLogProjectCreatedData1 = OASAuditLogProjectCreatedData.getExample();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData2 = new OASAuditLogProjectCreatedData();

        System.assertEquals(auditLogProjectCreatedData1.hashCode(), auditLogProjectCreatedData1.hashCode());
        System.assertEquals(auditLogProjectCreatedData2.hashCode(), auditLogProjectCreatedData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogProjectCreatedData auditLogProjectCreatedData1 = OASAuditLogProjectCreatedData.getExample();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData2 = OASAuditLogProjectCreatedData.getExample();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData3 = new OASAuditLogProjectCreatedData();
        OASAuditLogProjectCreatedData auditLogProjectCreatedData4 = new OASAuditLogProjectCreatedData();

        System.assert(auditLogProjectCreatedData1.equals(auditLogProjectCreatedData2));
        System.assert(auditLogProjectCreatedData3.equals(auditLogProjectCreatedData4));
        System.assertEquals(auditLogProjectCreatedData1.hashCode(), auditLogProjectCreatedData2.hashCode());
        System.assertEquals(auditLogProjectCreatedData3.hashCode(), auditLogProjectCreatedData4.hashCode());
    }
}
