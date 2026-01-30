@isTest
private class OASListAuditLogsEffectiveAtParameterTest {
    @isTest
    private static void equalsSameInstance() {
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter1 = OASListAuditLogsEffectiveAtParameter.getExample();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter2 = listAuditLogsEffectiveAtParameter1;
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter3 = new OASListAuditLogsEffectiveAtParameter();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter4 = listAuditLogsEffectiveAtParameter3;

        System.assert(listAuditLogsEffectiveAtParameter1.equals(listAuditLogsEffectiveAtParameter2));
        System.assert(listAuditLogsEffectiveAtParameter2.equals(listAuditLogsEffectiveAtParameter1));
        System.assert(listAuditLogsEffectiveAtParameter1.equals(listAuditLogsEffectiveAtParameter1));
        System.assert(listAuditLogsEffectiveAtParameter3.equals(listAuditLogsEffectiveAtParameter4));
        System.assert(listAuditLogsEffectiveAtParameter4.equals(listAuditLogsEffectiveAtParameter3));
        System.assert(listAuditLogsEffectiveAtParameter3.equals(listAuditLogsEffectiveAtParameter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter1 = OASListAuditLogsEffectiveAtParameter.getExample();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter2 = OASListAuditLogsEffectiveAtParameter.getExample();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter3 = new OASListAuditLogsEffectiveAtParameter();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter4 = new OASListAuditLogsEffectiveAtParameter();

        System.assert(listAuditLogsEffectiveAtParameter1.equals(listAuditLogsEffectiveAtParameter2));
        System.assert(listAuditLogsEffectiveAtParameter2.equals(listAuditLogsEffectiveAtParameter1));
        System.assert(listAuditLogsEffectiveAtParameter3.equals(listAuditLogsEffectiveAtParameter4));
        System.assert(listAuditLogsEffectiveAtParameter4.equals(listAuditLogsEffectiveAtParameter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter1 = OASListAuditLogsEffectiveAtParameter.getExample();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter2 = new OASListAuditLogsEffectiveAtParameter();

        System.assertEquals(false, listAuditLogsEffectiveAtParameter1.equals('foo'));
        System.assertEquals(false, listAuditLogsEffectiveAtParameter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter1 = OASListAuditLogsEffectiveAtParameter.getExample();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter2 = new OASListAuditLogsEffectiveAtParameter();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter3;

        System.assertEquals(false, listAuditLogsEffectiveAtParameter1.equals(listAuditLogsEffectiveAtParameter3));
        System.assertEquals(false, listAuditLogsEffectiveAtParameter2.equals(listAuditLogsEffectiveAtParameter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter1 = OASListAuditLogsEffectiveAtParameter.getExample();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter2 = new OASListAuditLogsEffectiveAtParameter();

        System.assertEquals(listAuditLogsEffectiveAtParameter1.hashCode(), listAuditLogsEffectiveAtParameter1.hashCode());
        System.assertEquals(listAuditLogsEffectiveAtParameter2.hashCode(), listAuditLogsEffectiveAtParameter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter1 = OASListAuditLogsEffectiveAtParameter.getExample();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter2 = OASListAuditLogsEffectiveAtParameter.getExample();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter3 = new OASListAuditLogsEffectiveAtParameter();
        OASListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter4 = new OASListAuditLogsEffectiveAtParameter();

        System.assert(listAuditLogsEffectiveAtParameter1.equals(listAuditLogsEffectiveAtParameter2));
        System.assert(listAuditLogsEffectiveAtParameter3.equals(listAuditLogsEffectiveAtParameter4));
        System.assertEquals(listAuditLogsEffectiveAtParameter1.hashCode(), listAuditLogsEffectiveAtParameter2.hashCode());
        System.assertEquals(listAuditLogsEffectiveAtParameter3.hashCode(), listAuditLogsEffectiveAtParameter4.hashCode());
    }
}
