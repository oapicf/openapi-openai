@isTest
private class OASAuditLogLoginFailedTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLogLoginFailed auditLogLoginFailed1 = OASAuditLogLoginFailed.getExample();
        OASAuditLogLoginFailed auditLogLoginFailed2 = auditLogLoginFailed1;
        OASAuditLogLoginFailed auditLogLoginFailed3 = new OASAuditLogLoginFailed();
        OASAuditLogLoginFailed auditLogLoginFailed4 = auditLogLoginFailed3;

        System.assert(auditLogLoginFailed1.equals(auditLogLoginFailed2));
        System.assert(auditLogLoginFailed2.equals(auditLogLoginFailed1));
        System.assert(auditLogLoginFailed1.equals(auditLogLoginFailed1));
        System.assert(auditLogLoginFailed3.equals(auditLogLoginFailed4));
        System.assert(auditLogLoginFailed4.equals(auditLogLoginFailed3));
        System.assert(auditLogLoginFailed3.equals(auditLogLoginFailed3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLogLoginFailed auditLogLoginFailed1 = OASAuditLogLoginFailed.getExample();
        OASAuditLogLoginFailed auditLogLoginFailed2 = OASAuditLogLoginFailed.getExample();
        OASAuditLogLoginFailed auditLogLoginFailed3 = new OASAuditLogLoginFailed();
        OASAuditLogLoginFailed auditLogLoginFailed4 = new OASAuditLogLoginFailed();

        System.assert(auditLogLoginFailed1.equals(auditLogLoginFailed2));
        System.assert(auditLogLoginFailed2.equals(auditLogLoginFailed1));
        System.assert(auditLogLoginFailed3.equals(auditLogLoginFailed4));
        System.assert(auditLogLoginFailed4.equals(auditLogLoginFailed3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLogLoginFailed auditLogLoginFailed1 = OASAuditLogLoginFailed.getExample();
        OASAuditLogLoginFailed auditLogLoginFailed2 = new OASAuditLogLoginFailed();

        System.assertEquals(false, auditLogLoginFailed1.equals('foo'));
        System.assertEquals(false, auditLogLoginFailed2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLogLoginFailed auditLogLoginFailed1 = OASAuditLogLoginFailed.getExample();
        OASAuditLogLoginFailed auditLogLoginFailed2 = new OASAuditLogLoginFailed();
        OASAuditLogLoginFailed auditLogLoginFailed3;

        System.assertEquals(false, auditLogLoginFailed1.equals(auditLogLoginFailed3));
        System.assertEquals(false, auditLogLoginFailed2.equals(auditLogLoginFailed3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLogLoginFailed auditLogLoginFailed1 = OASAuditLogLoginFailed.getExample();
        OASAuditLogLoginFailed auditLogLoginFailed2 = new OASAuditLogLoginFailed();

        System.assertEquals(auditLogLoginFailed1.hashCode(), auditLogLoginFailed1.hashCode());
        System.assertEquals(auditLogLoginFailed2.hashCode(), auditLogLoginFailed2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLogLoginFailed auditLogLoginFailed1 = OASAuditLogLoginFailed.getExample();
        OASAuditLogLoginFailed auditLogLoginFailed2 = OASAuditLogLoginFailed.getExample();
        OASAuditLogLoginFailed auditLogLoginFailed3 = new OASAuditLogLoginFailed();
        OASAuditLogLoginFailed auditLogLoginFailed4 = new OASAuditLogLoginFailed();

        System.assert(auditLogLoginFailed1.equals(auditLogLoginFailed2));
        System.assert(auditLogLoginFailed3.equals(auditLogLoginFailed4));
        System.assertEquals(auditLogLoginFailed1.hashCode(), auditLogLoginFailed2.hashCode());
        System.assertEquals(auditLogLoginFailed3.hashCode(), auditLogLoginFailed4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLogLoginFailed auditLogLoginFailed = new OASAuditLogLoginFailed();
        Map<String, String> x-property-mappings = auditLogLoginFailed.getx-property-mappings();
        System.assertEquals('errorCode', x-property-mappings.get('error_code'));
        System.assertEquals('errorMessage', x-property-mappings.get('error_message'));
    }
}
