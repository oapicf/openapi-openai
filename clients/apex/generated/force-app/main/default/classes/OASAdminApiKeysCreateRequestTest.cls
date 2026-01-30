@isTest
private class OASAdminApiKeysCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest1 = OASAdminApiKeysCreateRequest.getExample();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest2 = adminApiKeysCreateRequest1;
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest3 = new OASAdminApiKeysCreateRequest();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest4 = adminApiKeysCreateRequest3;

        System.assert(adminApiKeysCreateRequest1.equals(adminApiKeysCreateRequest2));
        System.assert(adminApiKeysCreateRequest2.equals(adminApiKeysCreateRequest1));
        System.assert(adminApiKeysCreateRequest1.equals(adminApiKeysCreateRequest1));
        System.assert(adminApiKeysCreateRequest3.equals(adminApiKeysCreateRequest4));
        System.assert(adminApiKeysCreateRequest4.equals(adminApiKeysCreateRequest3));
        System.assert(adminApiKeysCreateRequest3.equals(adminApiKeysCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest1 = OASAdminApiKeysCreateRequest.getExample();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest2 = OASAdminApiKeysCreateRequest.getExample();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest3 = new OASAdminApiKeysCreateRequest();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest4 = new OASAdminApiKeysCreateRequest();

        System.assert(adminApiKeysCreateRequest1.equals(adminApiKeysCreateRequest2));
        System.assert(adminApiKeysCreateRequest2.equals(adminApiKeysCreateRequest1));
        System.assert(adminApiKeysCreateRequest3.equals(adminApiKeysCreateRequest4));
        System.assert(adminApiKeysCreateRequest4.equals(adminApiKeysCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest1 = OASAdminApiKeysCreateRequest.getExample();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest2 = new OASAdminApiKeysCreateRequest();

        System.assertEquals(false, adminApiKeysCreateRequest1.equals('foo'));
        System.assertEquals(false, adminApiKeysCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest1 = OASAdminApiKeysCreateRequest.getExample();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest2 = new OASAdminApiKeysCreateRequest();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest3;

        System.assertEquals(false, adminApiKeysCreateRequest1.equals(adminApiKeysCreateRequest3));
        System.assertEquals(false, adminApiKeysCreateRequest2.equals(adminApiKeysCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest1 = OASAdminApiKeysCreateRequest.getExample();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest2 = new OASAdminApiKeysCreateRequest();

        System.assertEquals(adminApiKeysCreateRequest1.hashCode(), adminApiKeysCreateRequest1.hashCode());
        System.assertEquals(adminApiKeysCreateRequest2.hashCode(), adminApiKeysCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest1 = OASAdminApiKeysCreateRequest.getExample();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest2 = OASAdminApiKeysCreateRequest.getExample();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest3 = new OASAdminApiKeysCreateRequest();
        OASAdminApiKeysCreateRequest adminApiKeysCreateRequest4 = new OASAdminApiKeysCreateRequest();

        System.assert(adminApiKeysCreateRequest1.equals(adminApiKeysCreateRequest2));
        System.assert(adminApiKeysCreateRequest3.equals(adminApiKeysCreateRequest4));
        System.assertEquals(adminApiKeysCreateRequest1.hashCode(), adminApiKeysCreateRequest2.hashCode());
        System.assertEquals(adminApiKeysCreateRequest3.hashCode(), adminApiKeysCreateRequest4.hashCode());
    }
}
