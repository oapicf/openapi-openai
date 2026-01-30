@isTest
private class OASInviteRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteRequest inviteRequest1 = OASInviteRequest.getExample();
        OASInviteRequest inviteRequest2 = inviteRequest1;
        OASInviteRequest inviteRequest3 = new OASInviteRequest();
        OASInviteRequest inviteRequest4 = inviteRequest3;

        System.assert(inviteRequest1.equals(inviteRequest2));
        System.assert(inviteRequest2.equals(inviteRequest1));
        System.assert(inviteRequest1.equals(inviteRequest1));
        System.assert(inviteRequest3.equals(inviteRequest4));
        System.assert(inviteRequest4.equals(inviteRequest3));
        System.assert(inviteRequest3.equals(inviteRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteRequest inviteRequest1 = OASInviteRequest.getExample();
        OASInviteRequest inviteRequest2 = OASInviteRequest.getExample();
        OASInviteRequest inviteRequest3 = new OASInviteRequest();
        OASInviteRequest inviteRequest4 = new OASInviteRequest();

        System.assert(inviteRequest1.equals(inviteRequest2));
        System.assert(inviteRequest2.equals(inviteRequest1));
        System.assert(inviteRequest3.equals(inviteRequest4));
        System.assert(inviteRequest4.equals(inviteRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteRequest inviteRequest1 = OASInviteRequest.getExample();
        OASInviteRequest inviteRequest2 = new OASInviteRequest();

        System.assertEquals(false, inviteRequest1.equals('foo'));
        System.assertEquals(false, inviteRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteRequest inviteRequest1 = OASInviteRequest.getExample();
        OASInviteRequest inviteRequest2 = new OASInviteRequest();
        OASInviteRequest inviteRequest3;

        System.assertEquals(false, inviteRequest1.equals(inviteRequest3));
        System.assertEquals(false, inviteRequest2.equals(inviteRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteRequest inviteRequest1 = OASInviteRequest.getExample();
        OASInviteRequest inviteRequest2 = new OASInviteRequest();

        System.assertEquals(inviteRequest1.hashCode(), inviteRequest1.hashCode());
        System.assertEquals(inviteRequest2.hashCode(), inviteRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteRequest inviteRequest1 = OASInviteRequest.getExample();
        OASInviteRequest inviteRequest2 = OASInviteRequest.getExample();
        OASInviteRequest inviteRequest3 = new OASInviteRequest();
        OASInviteRequest inviteRequest4 = new OASInviteRequest();

        System.assert(inviteRequest1.equals(inviteRequest2));
        System.assert(inviteRequest3.equals(inviteRequest4));
        System.assertEquals(inviteRequest1.hashCode(), inviteRequest2.hashCode());
        System.assertEquals(inviteRequest3.hashCode(), inviteRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInviteRequest inviteRequest = new OASInviteRequest();
        System.assertEquals(new List<OASInviteRequestProjectsInner>(), inviteRequest.projects);
        System.assertEquals(null, inviteRequest.email);
        System.assertEquals(null, inviteRequest.role);
    }
}
