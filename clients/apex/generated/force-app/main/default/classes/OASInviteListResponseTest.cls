@isTest
private class OASInviteListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteListResponse inviteListResponse1 = OASInviteListResponse.getExample();
        OASInviteListResponse inviteListResponse2 = inviteListResponse1;
        OASInviteListResponse inviteListResponse3 = new OASInviteListResponse();
        OASInviteListResponse inviteListResponse4 = inviteListResponse3;

        System.assert(inviteListResponse1.equals(inviteListResponse2));
        System.assert(inviteListResponse2.equals(inviteListResponse1));
        System.assert(inviteListResponse1.equals(inviteListResponse1));
        System.assert(inviteListResponse3.equals(inviteListResponse4));
        System.assert(inviteListResponse4.equals(inviteListResponse3));
        System.assert(inviteListResponse3.equals(inviteListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteListResponse inviteListResponse1 = OASInviteListResponse.getExample();
        OASInviteListResponse inviteListResponse2 = OASInviteListResponse.getExample();
        OASInviteListResponse inviteListResponse3 = new OASInviteListResponse();
        OASInviteListResponse inviteListResponse4 = new OASInviteListResponse();

        System.assert(inviteListResponse1.equals(inviteListResponse2));
        System.assert(inviteListResponse2.equals(inviteListResponse1));
        System.assert(inviteListResponse3.equals(inviteListResponse4));
        System.assert(inviteListResponse4.equals(inviteListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteListResponse inviteListResponse1 = OASInviteListResponse.getExample();
        OASInviteListResponse inviteListResponse2 = new OASInviteListResponse();

        System.assertEquals(false, inviteListResponse1.equals('foo'));
        System.assertEquals(false, inviteListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteListResponse inviteListResponse1 = OASInviteListResponse.getExample();
        OASInviteListResponse inviteListResponse2 = new OASInviteListResponse();
        OASInviteListResponse inviteListResponse3;

        System.assertEquals(false, inviteListResponse1.equals(inviteListResponse3));
        System.assertEquals(false, inviteListResponse2.equals(inviteListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteListResponse inviteListResponse1 = OASInviteListResponse.getExample();
        OASInviteListResponse inviteListResponse2 = new OASInviteListResponse();

        System.assertEquals(inviteListResponse1.hashCode(), inviteListResponse1.hashCode());
        System.assertEquals(inviteListResponse2.hashCode(), inviteListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteListResponse inviteListResponse1 = OASInviteListResponse.getExample();
        OASInviteListResponse inviteListResponse2 = OASInviteListResponse.getExample();
        OASInviteListResponse inviteListResponse3 = new OASInviteListResponse();
        OASInviteListResponse inviteListResponse4 = new OASInviteListResponse();

        System.assert(inviteListResponse1.equals(inviteListResponse2));
        System.assert(inviteListResponse3.equals(inviteListResponse4));
        System.assertEquals(inviteListResponse1.hashCode(), inviteListResponse2.hashCode());
        System.assertEquals(inviteListResponse3.hashCode(), inviteListResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInviteListResponse inviteListResponse = new OASInviteListResponse();
        Map<String, String> x-property-mappings = inviteListResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInviteListResponse inviteListResponse = new OASInviteListResponse();
        System.assertEquals(new List<OASInvite>(), inviteListResponse.data);
        System.assertEquals(null, inviteListResponse.r_object);
        System.assertEquals(null, inviteListResponse.firstId);
        System.assertEquals(null, inviteListResponse.lastId);
        System.assertEquals(null, inviteListResponse.hasMore);
    }
}
