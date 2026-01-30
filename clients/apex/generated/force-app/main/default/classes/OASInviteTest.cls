@isTest
private class OASInviteTest {
    @isTest
    private static void equalsSameInstance() {
        OASInvite invite1 = OASInvite.getExample();
        OASInvite invite2 = invite1;
        OASInvite invite3 = new OASInvite();
        OASInvite invite4 = invite3;

        System.assert(invite1.equals(invite2));
        System.assert(invite2.equals(invite1));
        System.assert(invite1.equals(invite1));
        System.assert(invite3.equals(invite4));
        System.assert(invite4.equals(invite3));
        System.assert(invite3.equals(invite3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInvite invite1 = OASInvite.getExample();
        OASInvite invite2 = OASInvite.getExample();
        OASInvite invite3 = new OASInvite();
        OASInvite invite4 = new OASInvite();

        System.assert(invite1.equals(invite2));
        System.assert(invite2.equals(invite1));
        System.assert(invite3.equals(invite4));
        System.assert(invite4.equals(invite3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInvite invite1 = OASInvite.getExample();
        OASInvite invite2 = new OASInvite();

        System.assertEquals(false, invite1.equals('foo'));
        System.assertEquals(false, invite2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInvite invite1 = OASInvite.getExample();
        OASInvite invite2 = new OASInvite();
        OASInvite invite3;

        System.assertEquals(false, invite1.equals(invite3));
        System.assertEquals(false, invite2.equals(invite3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInvite invite1 = OASInvite.getExample();
        OASInvite invite2 = new OASInvite();

        System.assertEquals(invite1.hashCode(), invite1.hashCode());
        System.assertEquals(invite2.hashCode(), invite2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInvite invite1 = OASInvite.getExample();
        OASInvite invite2 = OASInvite.getExample();
        OASInvite invite3 = new OASInvite();
        OASInvite invite4 = new OASInvite();

        System.assert(invite1.equals(invite2));
        System.assert(invite3.equals(invite4));
        System.assertEquals(invite1.hashCode(), invite2.hashCode());
        System.assertEquals(invite3.hashCode(), invite4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInvite invite = new OASInvite();
        Map<String, String> x-property-mappings = invite.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('invitedAt', x-property-mappings.get('invited_at'));
        System.assertEquals('expiresAt', x-property-mappings.get('expires_at'));
        System.assertEquals('acceptedAt', x-property-mappings.get('accepted_at'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInvite invite = new OASInvite();
        System.assertEquals(new List<OASInviteProjectsInner>(), invite.projects);
        System.assertEquals(null, invite.r_object);
        System.assertEquals(null, invite.id);
        System.assertEquals(null, invite.email);
        System.assertEquals(null, invite.role);
        System.assertEquals(null, invite.status);
        System.assertEquals(null, invite.invitedAt);
        System.assertEquals(null, invite.expiresAt);
        System.assertEquals(null, invite.acceptedAt);
    }
}
