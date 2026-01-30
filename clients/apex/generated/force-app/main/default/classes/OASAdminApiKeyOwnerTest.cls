@isTest
private class OASAdminApiKeyOwnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdminApiKeyOwner adminApiKeyOwner1 = OASAdminApiKeyOwner.getExample();
        OASAdminApiKeyOwner adminApiKeyOwner2 = adminApiKeyOwner1;
        OASAdminApiKeyOwner adminApiKeyOwner3 = new OASAdminApiKeyOwner();
        OASAdminApiKeyOwner adminApiKeyOwner4 = adminApiKeyOwner3;

        System.assert(adminApiKeyOwner1.equals(adminApiKeyOwner2));
        System.assert(adminApiKeyOwner2.equals(adminApiKeyOwner1));
        System.assert(adminApiKeyOwner1.equals(adminApiKeyOwner1));
        System.assert(adminApiKeyOwner3.equals(adminApiKeyOwner4));
        System.assert(adminApiKeyOwner4.equals(adminApiKeyOwner3));
        System.assert(adminApiKeyOwner3.equals(adminApiKeyOwner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdminApiKeyOwner adminApiKeyOwner1 = OASAdminApiKeyOwner.getExample();
        OASAdminApiKeyOwner adminApiKeyOwner2 = OASAdminApiKeyOwner.getExample();
        OASAdminApiKeyOwner adminApiKeyOwner3 = new OASAdminApiKeyOwner();
        OASAdminApiKeyOwner adminApiKeyOwner4 = new OASAdminApiKeyOwner();

        System.assert(adminApiKeyOwner1.equals(adminApiKeyOwner2));
        System.assert(adminApiKeyOwner2.equals(adminApiKeyOwner1));
        System.assert(adminApiKeyOwner3.equals(adminApiKeyOwner4));
        System.assert(adminApiKeyOwner4.equals(adminApiKeyOwner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdminApiKeyOwner adminApiKeyOwner1 = OASAdminApiKeyOwner.getExample();
        OASAdminApiKeyOwner adminApiKeyOwner2 = new OASAdminApiKeyOwner();

        System.assertEquals(false, adminApiKeyOwner1.equals('foo'));
        System.assertEquals(false, adminApiKeyOwner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdminApiKeyOwner adminApiKeyOwner1 = OASAdminApiKeyOwner.getExample();
        OASAdminApiKeyOwner adminApiKeyOwner2 = new OASAdminApiKeyOwner();
        OASAdminApiKeyOwner adminApiKeyOwner3;

        System.assertEquals(false, adminApiKeyOwner1.equals(adminApiKeyOwner3));
        System.assertEquals(false, adminApiKeyOwner2.equals(adminApiKeyOwner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdminApiKeyOwner adminApiKeyOwner1 = OASAdminApiKeyOwner.getExample();
        OASAdminApiKeyOwner adminApiKeyOwner2 = new OASAdminApiKeyOwner();

        System.assertEquals(adminApiKeyOwner1.hashCode(), adminApiKeyOwner1.hashCode());
        System.assertEquals(adminApiKeyOwner2.hashCode(), adminApiKeyOwner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdminApiKeyOwner adminApiKeyOwner1 = OASAdminApiKeyOwner.getExample();
        OASAdminApiKeyOwner adminApiKeyOwner2 = OASAdminApiKeyOwner.getExample();
        OASAdminApiKeyOwner adminApiKeyOwner3 = new OASAdminApiKeyOwner();
        OASAdminApiKeyOwner adminApiKeyOwner4 = new OASAdminApiKeyOwner();

        System.assert(adminApiKeyOwner1.equals(adminApiKeyOwner2));
        System.assert(adminApiKeyOwner3.equals(adminApiKeyOwner4));
        System.assertEquals(adminApiKeyOwner1.hashCode(), adminApiKeyOwner2.hashCode());
        System.assertEquals(adminApiKeyOwner3.hashCode(), adminApiKeyOwner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdminApiKeyOwner adminApiKeyOwner = new OASAdminApiKeyOwner();
        Map<String, String> x-property-mappings = adminApiKeyOwner.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
    }
}
