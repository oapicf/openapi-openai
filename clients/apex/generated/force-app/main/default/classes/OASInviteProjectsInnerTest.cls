@isTest
private class OASInviteProjectsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteProjectsInner inviteProjectsInner1 = OASInviteProjectsInner.getExample();
        OASInviteProjectsInner inviteProjectsInner2 = inviteProjectsInner1;
        OASInviteProjectsInner inviteProjectsInner3 = new OASInviteProjectsInner();
        OASInviteProjectsInner inviteProjectsInner4 = inviteProjectsInner3;

        System.assert(inviteProjectsInner1.equals(inviteProjectsInner2));
        System.assert(inviteProjectsInner2.equals(inviteProjectsInner1));
        System.assert(inviteProjectsInner1.equals(inviteProjectsInner1));
        System.assert(inviteProjectsInner3.equals(inviteProjectsInner4));
        System.assert(inviteProjectsInner4.equals(inviteProjectsInner3));
        System.assert(inviteProjectsInner3.equals(inviteProjectsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteProjectsInner inviteProjectsInner1 = OASInviteProjectsInner.getExample();
        OASInviteProjectsInner inviteProjectsInner2 = OASInviteProjectsInner.getExample();
        OASInviteProjectsInner inviteProjectsInner3 = new OASInviteProjectsInner();
        OASInviteProjectsInner inviteProjectsInner4 = new OASInviteProjectsInner();

        System.assert(inviteProjectsInner1.equals(inviteProjectsInner2));
        System.assert(inviteProjectsInner2.equals(inviteProjectsInner1));
        System.assert(inviteProjectsInner3.equals(inviteProjectsInner4));
        System.assert(inviteProjectsInner4.equals(inviteProjectsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteProjectsInner inviteProjectsInner1 = OASInviteProjectsInner.getExample();
        OASInviteProjectsInner inviteProjectsInner2 = new OASInviteProjectsInner();

        System.assertEquals(false, inviteProjectsInner1.equals('foo'));
        System.assertEquals(false, inviteProjectsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteProjectsInner inviteProjectsInner1 = OASInviteProjectsInner.getExample();
        OASInviteProjectsInner inviteProjectsInner2 = new OASInviteProjectsInner();
        OASInviteProjectsInner inviteProjectsInner3;

        System.assertEquals(false, inviteProjectsInner1.equals(inviteProjectsInner3));
        System.assertEquals(false, inviteProjectsInner2.equals(inviteProjectsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteProjectsInner inviteProjectsInner1 = OASInviteProjectsInner.getExample();
        OASInviteProjectsInner inviteProjectsInner2 = new OASInviteProjectsInner();

        System.assertEquals(inviteProjectsInner1.hashCode(), inviteProjectsInner1.hashCode());
        System.assertEquals(inviteProjectsInner2.hashCode(), inviteProjectsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteProjectsInner inviteProjectsInner1 = OASInviteProjectsInner.getExample();
        OASInviteProjectsInner inviteProjectsInner2 = OASInviteProjectsInner.getExample();
        OASInviteProjectsInner inviteProjectsInner3 = new OASInviteProjectsInner();
        OASInviteProjectsInner inviteProjectsInner4 = new OASInviteProjectsInner();

        System.assert(inviteProjectsInner1.equals(inviteProjectsInner2));
        System.assert(inviteProjectsInner3.equals(inviteProjectsInner4));
        System.assertEquals(inviteProjectsInner1.hashCode(), inviteProjectsInner2.hashCode());
        System.assertEquals(inviteProjectsInner3.hashCode(), inviteProjectsInner4.hashCode());
    }
}
