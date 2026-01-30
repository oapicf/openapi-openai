@isTest
private class OASUserListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserListResponse userListResponse1 = OASUserListResponse.getExample();
        OASUserListResponse userListResponse2 = userListResponse1;
        OASUserListResponse userListResponse3 = new OASUserListResponse();
        OASUserListResponse userListResponse4 = userListResponse3;

        System.assert(userListResponse1.equals(userListResponse2));
        System.assert(userListResponse2.equals(userListResponse1));
        System.assert(userListResponse1.equals(userListResponse1));
        System.assert(userListResponse3.equals(userListResponse4));
        System.assert(userListResponse4.equals(userListResponse3));
        System.assert(userListResponse3.equals(userListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserListResponse userListResponse1 = OASUserListResponse.getExample();
        OASUserListResponse userListResponse2 = OASUserListResponse.getExample();
        OASUserListResponse userListResponse3 = new OASUserListResponse();
        OASUserListResponse userListResponse4 = new OASUserListResponse();

        System.assert(userListResponse1.equals(userListResponse2));
        System.assert(userListResponse2.equals(userListResponse1));
        System.assert(userListResponse3.equals(userListResponse4));
        System.assert(userListResponse4.equals(userListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserListResponse userListResponse1 = OASUserListResponse.getExample();
        OASUserListResponse userListResponse2 = new OASUserListResponse();

        System.assertEquals(false, userListResponse1.equals('foo'));
        System.assertEquals(false, userListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserListResponse userListResponse1 = OASUserListResponse.getExample();
        OASUserListResponse userListResponse2 = new OASUserListResponse();
        OASUserListResponse userListResponse3;

        System.assertEquals(false, userListResponse1.equals(userListResponse3));
        System.assertEquals(false, userListResponse2.equals(userListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserListResponse userListResponse1 = OASUserListResponse.getExample();
        OASUserListResponse userListResponse2 = new OASUserListResponse();

        System.assertEquals(userListResponse1.hashCode(), userListResponse1.hashCode());
        System.assertEquals(userListResponse2.hashCode(), userListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserListResponse userListResponse1 = OASUserListResponse.getExample();
        OASUserListResponse userListResponse2 = OASUserListResponse.getExample();
        OASUserListResponse userListResponse3 = new OASUserListResponse();
        OASUserListResponse userListResponse4 = new OASUserListResponse();

        System.assert(userListResponse1.equals(userListResponse2));
        System.assert(userListResponse3.equals(userListResponse4));
        System.assertEquals(userListResponse1.hashCode(), userListResponse2.hashCode());
        System.assertEquals(userListResponse3.hashCode(), userListResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUserListResponse userListResponse = new OASUserListResponse();
        Map<String, String> x-property-mappings = userListResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUserListResponse userListResponse = new OASUserListResponse();
        System.assertEquals(new List<OASUser>(), userListResponse.data);
        System.assertEquals(null, userListResponse.r_object);
        System.assertEquals(null, userListResponse.firstId);
        System.assertEquals(null, userListResponse.lastId);
        System.assertEquals(null, userListResponse.hasMore);
    }
}
