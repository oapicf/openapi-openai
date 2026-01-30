@isTest
private class OASInviteDeleteResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteDeleteResponse inviteDeleteResponse1 = OASInviteDeleteResponse.getExample();
        OASInviteDeleteResponse inviteDeleteResponse2 = inviteDeleteResponse1;
        OASInviteDeleteResponse inviteDeleteResponse3 = new OASInviteDeleteResponse();
        OASInviteDeleteResponse inviteDeleteResponse4 = inviteDeleteResponse3;

        System.assert(inviteDeleteResponse1.equals(inviteDeleteResponse2));
        System.assert(inviteDeleteResponse2.equals(inviteDeleteResponse1));
        System.assert(inviteDeleteResponse1.equals(inviteDeleteResponse1));
        System.assert(inviteDeleteResponse3.equals(inviteDeleteResponse4));
        System.assert(inviteDeleteResponse4.equals(inviteDeleteResponse3));
        System.assert(inviteDeleteResponse3.equals(inviteDeleteResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteDeleteResponse inviteDeleteResponse1 = OASInviteDeleteResponse.getExample();
        OASInviteDeleteResponse inviteDeleteResponse2 = OASInviteDeleteResponse.getExample();
        OASInviteDeleteResponse inviteDeleteResponse3 = new OASInviteDeleteResponse();
        OASInviteDeleteResponse inviteDeleteResponse4 = new OASInviteDeleteResponse();

        System.assert(inviteDeleteResponse1.equals(inviteDeleteResponse2));
        System.assert(inviteDeleteResponse2.equals(inviteDeleteResponse1));
        System.assert(inviteDeleteResponse3.equals(inviteDeleteResponse4));
        System.assert(inviteDeleteResponse4.equals(inviteDeleteResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteDeleteResponse inviteDeleteResponse1 = OASInviteDeleteResponse.getExample();
        OASInviteDeleteResponse inviteDeleteResponse2 = new OASInviteDeleteResponse();

        System.assertEquals(false, inviteDeleteResponse1.equals('foo'));
        System.assertEquals(false, inviteDeleteResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteDeleteResponse inviteDeleteResponse1 = OASInviteDeleteResponse.getExample();
        OASInviteDeleteResponse inviteDeleteResponse2 = new OASInviteDeleteResponse();
        OASInviteDeleteResponse inviteDeleteResponse3;

        System.assertEquals(false, inviteDeleteResponse1.equals(inviteDeleteResponse3));
        System.assertEquals(false, inviteDeleteResponse2.equals(inviteDeleteResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteDeleteResponse inviteDeleteResponse1 = OASInviteDeleteResponse.getExample();
        OASInviteDeleteResponse inviteDeleteResponse2 = new OASInviteDeleteResponse();

        System.assertEquals(inviteDeleteResponse1.hashCode(), inviteDeleteResponse1.hashCode());
        System.assertEquals(inviteDeleteResponse2.hashCode(), inviteDeleteResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteDeleteResponse inviteDeleteResponse1 = OASInviteDeleteResponse.getExample();
        OASInviteDeleteResponse inviteDeleteResponse2 = OASInviteDeleteResponse.getExample();
        OASInviteDeleteResponse inviteDeleteResponse3 = new OASInviteDeleteResponse();
        OASInviteDeleteResponse inviteDeleteResponse4 = new OASInviteDeleteResponse();

        System.assert(inviteDeleteResponse1.equals(inviteDeleteResponse2));
        System.assert(inviteDeleteResponse3.equals(inviteDeleteResponse4));
        System.assertEquals(inviteDeleteResponse1.hashCode(), inviteDeleteResponse2.hashCode());
        System.assertEquals(inviteDeleteResponse3.hashCode(), inviteDeleteResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInviteDeleteResponse inviteDeleteResponse = new OASInviteDeleteResponse();
        Map<String, String> x-property-mappings = inviteDeleteResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
