@isTest
private class OASAuditLogApiKeyCreatedDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData1 = OASAuditLogApiKeyCreatedData.getExample();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData2 = auditLogApiKeyCreatedData1;
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData3 = new OASAuditLogApiKeyCreatedData();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData4 = auditLogApiKeyCreatedData3;

        System.assert(auditLogApiKeyCreatedData1.equals(auditLogApiKeyCreatedData2));
        System.assert(auditLogApiKeyCreatedData2.equals(auditLogApiKeyCreatedData1));
        System.assert(auditLogApiKeyCreatedData1.equals(auditLogApiKeyCreatedData1));
        System.assert(auditLogApiKeyCreatedData3.equals(auditLogApiKeyCreatedData4));
        System.assert(auditLogApiKeyCreatedData4.equals(auditLogApiKeyCreatedData3));
        System.assert(auditLogApiKeyCreatedData3.equals(auditLogApiKeyCreatedData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData1 = OASAuditLogApiKeyCreatedData.getExample();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData2 = OASAuditLogApiKeyCreatedData.getExample();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData3 = new OASAuditLogApiKeyCreatedData();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData4 = new OASAuditLogApiKeyCreatedData();

        System.assert(auditLogApiKeyCreatedData1.equals(auditLogApiKeyCreatedData2));
        System.assert(auditLogApiKeyCreatedData2.equals(auditLogApiKeyCreatedData1));
        System.assert(auditLogApiKeyCreatedData3.equals(auditLogApiKeyCreatedData4));
        System.assert(auditLogApiKeyCreatedData4.equals(auditLogApiKeyCreatedData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData1 = OASAuditLogApiKeyCreatedData.getExample();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData2 = new OASAuditLogApiKeyCreatedData();

        System.assertEquals(false, auditLogApiKeyCreatedData1.equals('foo'));
        System.assertEquals(false, auditLogApiKeyCreatedData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData1 = OASAuditLogApiKeyCreatedData.getExample();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData2 = new OASAuditLogApiKeyCreatedData();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData3;

        System.assertEquals(false, auditLogApiKeyCreatedData1.equals(auditLogApiKeyCreatedData3));
        System.assertEquals(false, auditLogApiKeyCreatedData2.equals(auditLogApiKeyCreatedData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData1 = OASAuditLogApiKeyCreatedData.getExample();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData2 = new OASAuditLogApiKeyCreatedData();

        System.assertEquals(auditLogApiKeyCreatedData1.hashCode(), auditLogApiKeyCreatedData1.hashCode());
        System.assertEquals(auditLogApiKeyCreatedData2.hashCode(), auditLogApiKeyCreatedData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData1 = OASAuditLogApiKeyCreatedData.getExample();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData2 = OASAuditLogApiKeyCreatedData.getExample();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData3 = new OASAuditLogApiKeyCreatedData();
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData4 = new OASAuditLogApiKeyCreatedData();

        System.assert(auditLogApiKeyCreatedData1.equals(auditLogApiKeyCreatedData2));
        System.assert(auditLogApiKeyCreatedData3.equals(auditLogApiKeyCreatedData4));
        System.assertEquals(auditLogApiKeyCreatedData1.hashCode(), auditLogApiKeyCreatedData2.hashCode());
        System.assertEquals(auditLogApiKeyCreatedData3.hashCode(), auditLogApiKeyCreatedData4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAuditLogApiKeyCreatedData auditLogApiKeyCreatedData = new OASAuditLogApiKeyCreatedData();
        System.assertEquals(new List<String>(), auditLogApiKeyCreatedData.scopes);
    }
}
