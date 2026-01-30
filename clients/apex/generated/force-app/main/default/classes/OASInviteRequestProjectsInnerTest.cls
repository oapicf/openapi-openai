@isTest
private class OASInviteRequestProjectsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteRequestProjectsInner inviteRequestProjectsInner1 = OASInviteRequestProjectsInner.getExample();
        OASInviteRequestProjectsInner inviteRequestProjectsInner2 = inviteRequestProjectsInner1;
        OASInviteRequestProjectsInner inviteRequestProjectsInner3 = new OASInviteRequestProjectsInner();
        OASInviteRequestProjectsInner inviteRequestProjectsInner4 = inviteRequestProjectsInner3;

        System.assert(inviteRequestProjectsInner1.equals(inviteRequestProjectsInner2));
        System.assert(inviteRequestProjectsInner2.equals(inviteRequestProjectsInner1));
        System.assert(inviteRequestProjectsInner1.equals(inviteRequestProjectsInner1));
        System.assert(inviteRequestProjectsInner3.equals(inviteRequestProjectsInner4));
        System.assert(inviteRequestProjectsInner4.equals(inviteRequestProjectsInner3));
        System.assert(inviteRequestProjectsInner3.equals(inviteRequestProjectsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteRequestProjectsInner inviteRequestProjectsInner1 = OASInviteRequestProjectsInner.getExample();
        OASInviteRequestProjectsInner inviteRequestProjectsInner2 = OASInviteRequestProjectsInner.getExample();
        OASInviteRequestProjectsInner inviteRequestProjectsInner3 = new OASInviteRequestProjectsInner();
        OASInviteRequestProjectsInner inviteRequestProjectsInner4 = new OASInviteRequestProjectsInner();

        System.assert(inviteRequestProjectsInner1.equals(inviteRequestProjectsInner2));
        System.assert(inviteRequestProjectsInner2.equals(inviteRequestProjectsInner1));
        System.assert(inviteRequestProjectsInner3.equals(inviteRequestProjectsInner4));
        System.assert(inviteRequestProjectsInner4.equals(inviteRequestProjectsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteRequestProjectsInner inviteRequestProjectsInner1 = OASInviteRequestProjectsInner.getExample();
        OASInviteRequestProjectsInner inviteRequestProjectsInner2 = new OASInviteRequestProjectsInner();

        System.assertEquals(false, inviteRequestProjectsInner1.equals('foo'));
        System.assertEquals(false, inviteRequestProjectsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteRequestProjectsInner inviteRequestProjectsInner1 = OASInviteRequestProjectsInner.getExample();
        OASInviteRequestProjectsInner inviteRequestProjectsInner2 = new OASInviteRequestProjectsInner();
        OASInviteRequestProjectsInner inviteRequestProjectsInner3;

        System.assertEquals(false, inviteRequestProjectsInner1.equals(inviteRequestProjectsInner3));
        System.assertEquals(false, inviteRequestProjectsInner2.equals(inviteRequestProjectsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteRequestProjectsInner inviteRequestProjectsInner1 = OASInviteRequestProjectsInner.getExample();
        OASInviteRequestProjectsInner inviteRequestProjectsInner2 = new OASInviteRequestProjectsInner();

        System.assertEquals(inviteRequestProjectsInner1.hashCode(), inviteRequestProjectsInner1.hashCode());
        System.assertEquals(inviteRequestProjectsInner2.hashCode(), inviteRequestProjectsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteRequestProjectsInner inviteRequestProjectsInner1 = OASInviteRequestProjectsInner.getExample();
        OASInviteRequestProjectsInner inviteRequestProjectsInner2 = OASInviteRequestProjectsInner.getExample();
        OASInviteRequestProjectsInner inviteRequestProjectsInner3 = new OASInviteRequestProjectsInner();
        OASInviteRequestProjectsInner inviteRequestProjectsInner4 = new OASInviteRequestProjectsInner();

        System.assert(inviteRequestProjectsInner1.equals(inviteRequestProjectsInner2));
        System.assert(inviteRequestProjectsInner3.equals(inviteRequestProjectsInner4));
        System.assertEquals(inviteRequestProjectsInner1.hashCode(), inviteRequestProjectsInner2.hashCode());
        System.assertEquals(inviteRequestProjectsInner3.hashCode(), inviteRequestProjectsInner4.hashCode());
    }
}
