@isTest
private class OASAdminApiKeyTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdminApiKey adminApiKey1 = OASAdminApiKey.getExample();
        OASAdminApiKey adminApiKey2 = adminApiKey1;
        OASAdminApiKey adminApiKey3 = new OASAdminApiKey();
        OASAdminApiKey adminApiKey4 = adminApiKey3;

        System.assert(adminApiKey1.equals(adminApiKey2));
        System.assert(adminApiKey2.equals(adminApiKey1));
        System.assert(adminApiKey1.equals(adminApiKey1));
        System.assert(adminApiKey3.equals(adminApiKey4));
        System.assert(adminApiKey4.equals(adminApiKey3));
        System.assert(adminApiKey3.equals(adminApiKey3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdminApiKey adminApiKey1 = OASAdminApiKey.getExample();
        OASAdminApiKey adminApiKey2 = OASAdminApiKey.getExample();
        OASAdminApiKey adminApiKey3 = new OASAdminApiKey();
        OASAdminApiKey adminApiKey4 = new OASAdminApiKey();

        System.assert(adminApiKey1.equals(adminApiKey2));
        System.assert(adminApiKey2.equals(adminApiKey1));
        System.assert(adminApiKey3.equals(adminApiKey4));
        System.assert(adminApiKey4.equals(adminApiKey3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdminApiKey adminApiKey1 = OASAdminApiKey.getExample();
        OASAdminApiKey adminApiKey2 = new OASAdminApiKey();

        System.assertEquals(false, adminApiKey1.equals('foo'));
        System.assertEquals(false, adminApiKey2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdminApiKey adminApiKey1 = OASAdminApiKey.getExample();
        OASAdminApiKey adminApiKey2 = new OASAdminApiKey();
        OASAdminApiKey adminApiKey3;

        System.assertEquals(false, adminApiKey1.equals(adminApiKey3));
        System.assertEquals(false, adminApiKey2.equals(adminApiKey3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdminApiKey adminApiKey1 = OASAdminApiKey.getExample();
        OASAdminApiKey adminApiKey2 = new OASAdminApiKey();

        System.assertEquals(adminApiKey1.hashCode(), adminApiKey1.hashCode());
        System.assertEquals(adminApiKey2.hashCode(), adminApiKey2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdminApiKey adminApiKey1 = OASAdminApiKey.getExample();
        OASAdminApiKey adminApiKey2 = OASAdminApiKey.getExample();
        OASAdminApiKey adminApiKey3 = new OASAdminApiKey();
        OASAdminApiKey adminApiKey4 = new OASAdminApiKey();

        System.assert(adminApiKey1.equals(adminApiKey2));
        System.assert(adminApiKey3.equals(adminApiKey4));
        System.assertEquals(adminApiKey1.hashCode(), adminApiKey2.hashCode());
        System.assertEquals(adminApiKey3.hashCode(), adminApiKey4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdminApiKey adminApiKey = new OASAdminApiKey();
        Map<String, String> x-property-mappings = adminApiKey.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('redactedValue', x-property-mappings.get('redacted_value'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
    }
}
