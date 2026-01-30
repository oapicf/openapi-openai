@isTest
private class OASAdminApiKeysDelete200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response1 = OASAdminApiKeysDelete200Response.getExample();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response2 = adminApiKeysDelete200Response1;
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response3 = new OASAdminApiKeysDelete200Response();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response4 = adminApiKeysDelete200Response3;

        System.assert(adminApiKeysDelete200Response1.equals(adminApiKeysDelete200Response2));
        System.assert(adminApiKeysDelete200Response2.equals(adminApiKeysDelete200Response1));
        System.assert(adminApiKeysDelete200Response1.equals(adminApiKeysDelete200Response1));
        System.assert(adminApiKeysDelete200Response3.equals(adminApiKeysDelete200Response4));
        System.assert(adminApiKeysDelete200Response4.equals(adminApiKeysDelete200Response3));
        System.assert(adminApiKeysDelete200Response3.equals(adminApiKeysDelete200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response1 = OASAdminApiKeysDelete200Response.getExample();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response2 = OASAdminApiKeysDelete200Response.getExample();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response3 = new OASAdminApiKeysDelete200Response();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response4 = new OASAdminApiKeysDelete200Response();

        System.assert(adminApiKeysDelete200Response1.equals(adminApiKeysDelete200Response2));
        System.assert(adminApiKeysDelete200Response2.equals(adminApiKeysDelete200Response1));
        System.assert(adminApiKeysDelete200Response3.equals(adminApiKeysDelete200Response4));
        System.assert(adminApiKeysDelete200Response4.equals(adminApiKeysDelete200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response1 = OASAdminApiKeysDelete200Response.getExample();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response2 = new OASAdminApiKeysDelete200Response();

        System.assertEquals(false, adminApiKeysDelete200Response1.equals('foo'));
        System.assertEquals(false, adminApiKeysDelete200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response1 = OASAdminApiKeysDelete200Response.getExample();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response2 = new OASAdminApiKeysDelete200Response();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response3;

        System.assertEquals(false, adminApiKeysDelete200Response1.equals(adminApiKeysDelete200Response3));
        System.assertEquals(false, adminApiKeysDelete200Response2.equals(adminApiKeysDelete200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response1 = OASAdminApiKeysDelete200Response.getExample();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response2 = new OASAdminApiKeysDelete200Response();

        System.assertEquals(adminApiKeysDelete200Response1.hashCode(), adminApiKeysDelete200Response1.hashCode());
        System.assertEquals(adminApiKeysDelete200Response2.hashCode(), adminApiKeysDelete200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response1 = OASAdminApiKeysDelete200Response.getExample();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response2 = OASAdminApiKeysDelete200Response.getExample();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response3 = new OASAdminApiKeysDelete200Response();
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response4 = new OASAdminApiKeysDelete200Response();

        System.assert(adminApiKeysDelete200Response1.equals(adminApiKeysDelete200Response2));
        System.assert(adminApiKeysDelete200Response3.equals(adminApiKeysDelete200Response4));
        System.assertEquals(adminApiKeysDelete200Response1.hashCode(), adminApiKeysDelete200Response2.hashCode());
        System.assertEquals(adminApiKeysDelete200Response3.hashCode(), adminApiKeysDelete200Response4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdminApiKeysDelete200Response adminApiKeysDelete200Response = new OASAdminApiKeysDelete200Response();
        Map<String, String> x-property-mappings = adminApiKeysDelete200Response.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
