@isTest
private class OASUserDeleteResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserDeleteResponse userDeleteResponse1 = OASUserDeleteResponse.getExample();
        OASUserDeleteResponse userDeleteResponse2 = userDeleteResponse1;
        OASUserDeleteResponse userDeleteResponse3 = new OASUserDeleteResponse();
        OASUserDeleteResponse userDeleteResponse4 = userDeleteResponse3;

        System.assert(userDeleteResponse1.equals(userDeleteResponse2));
        System.assert(userDeleteResponse2.equals(userDeleteResponse1));
        System.assert(userDeleteResponse1.equals(userDeleteResponse1));
        System.assert(userDeleteResponse3.equals(userDeleteResponse4));
        System.assert(userDeleteResponse4.equals(userDeleteResponse3));
        System.assert(userDeleteResponse3.equals(userDeleteResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserDeleteResponse userDeleteResponse1 = OASUserDeleteResponse.getExample();
        OASUserDeleteResponse userDeleteResponse2 = OASUserDeleteResponse.getExample();
        OASUserDeleteResponse userDeleteResponse3 = new OASUserDeleteResponse();
        OASUserDeleteResponse userDeleteResponse4 = new OASUserDeleteResponse();

        System.assert(userDeleteResponse1.equals(userDeleteResponse2));
        System.assert(userDeleteResponse2.equals(userDeleteResponse1));
        System.assert(userDeleteResponse3.equals(userDeleteResponse4));
        System.assert(userDeleteResponse4.equals(userDeleteResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserDeleteResponse userDeleteResponse1 = OASUserDeleteResponse.getExample();
        OASUserDeleteResponse userDeleteResponse2 = new OASUserDeleteResponse();

        System.assertEquals(false, userDeleteResponse1.equals('foo'));
        System.assertEquals(false, userDeleteResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserDeleteResponse userDeleteResponse1 = OASUserDeleteResponse.getExample();
        OASUserDeleteResponse userDeleteResponse2 = new OASUserDeleteResponse();
        OASUserDeleteResponse userDeleteResponse3;

        System.assertEquals(false, userDeleteResponse1.equals(userDeleteResponse3));
        System.assertEquals(false, userDeleteResponse2.equals(userDeleteResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserDeleteResponse userDeleteResponse1 = OASUserDeleteResponse.getExample();
        OASUserDeleteResponse userDeleteResponse2 = new OASUserDeleteResponse();

        System.assertEquals(userDeleteResponse1.hashCode(), userDeleteResponse1.hashCode());
        System.assertEquals(userDeleteResponse2.hashCode(), userDeleteResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserDeleteResponse userDeleteResponse1 = OASUserDeleteResponse.getExample();
        OASUserDeleteResponse userDeleteResponse2 = OASUserDeleteResponse.getExample();
        OASUserDeleteResponse userDeleteResponse3 = new OASUserDeleteResponse();
        OASUserDeleteResponse userDeleteResponse4 = new OASUserDeleteResponse();

        System.assert(userDeleteResponse1.equals(userDeleteResponse2));
        System.assert(userDeleteResponse3.equals(userDeleteResponse4));
        System.assertEquals(userDeleteResponse1.hashCode(), userDeleteResponse2.hashCode());
        System.assertEquals(userDeleteResponse3.hashCode(), userDeleteResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUserDeleteResponse userDeleteResponse = new OASUserDeleteResponse();
        Map<String, String> x-property-mappings = userDeleteResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
