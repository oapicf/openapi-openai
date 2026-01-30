@isTest
private class OASRealtimeConversationItemContentInTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner1 = OASRealtimeConversationItemContentIn.getExample();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner2 = realtimeConversationItemContentInner1;
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner3 = new OASRealtimeConversationItemContentIn();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner4 = realtimeConversationItemContentInner3;

        System.assert(realtimeConversationItemContentInner1.equals(realtimeConversationItemContentInner2));
        System.assert(realtimeConversationItemContentInner2.equals(realtimeConversationItemContentInner1));
        System.assert(realtimeConversationItemContentInner1.equals(realtimeConversationItemContentInner1));
        System.assert(realtimeConversationItemContentInner3.equals(realtimeConversationItemContentInner4));
        System.assert(realtimeConversationItemContentInner4.equals(realtimeConversationItemContentInner3));
        System.assert(realtimeConversationItemContentInner3.equals(realtimeConversationItemContentInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner1 = OASRealtimeConversationItemContentIn.getExample();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner2 = OASRealtimeConversationItemContentIn.getExample();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner3 = new OASRealtimeConversationItemContentIn();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner4 = new OASRealtimeConversationItemContentIn();

        System.assert(realtimeConversationItemContentInner1.equals(realtimeConversationItemContentInner2));
        System.assert(realtimeConversationItemContentInner2.equals(realtimeConversationItemContentInner1));
        System.assert(realtimeConversationItemContentInner3.equals(realtimeConversationItemContentInner4));
        System.assert(realtimeConversationItemContentInner4.equals(realtimeConversationItemContentInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner1 = OASRealtimeConversationItemContentIn.getExample();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner2 = new OASRealtimeConversationItemContentIn();

        System.assertEquals(false, realtimeConversationItemContentInner1.equals('foo'));
        System.assertEquals(false, realtimeConversationItemContentInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner1 = OASRealtimeConversationItemContentIn.getExample();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner2 = new OASRealtimeConversationItemContentIn();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner3;

        System.assertEquals(false, realtimeConversationItemContentInner1.equals(realtimeConversationItemContentInner3));
        System.assertEquals(false, realtimeConversationItemContentInner2.equals(realtimeConversationItemContentInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner1 = OASRealtimeConversationItemContentIn.getExample();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner2 = new OASRealtimeConversationItemContentIn();

        System.assertEquals(realtimeConversationItemContentInner1.hashCode(), realtimeConversationItemContentInner1.hashCode());
        System.assertEquals(realtimeConversationItemContentInner2.hashCode(), realtimeConversationItemContentInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner1 = OASRealtimeConversationItemContentIn.getExample();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner2 = OASRealtimeConversationItemContentIn.getExample();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner3 = new OASRealtimeConversationItemContentIn();
        OASRealtimeConversationItemContentIn realtimeConversationItemContentInner4 = new OASRealtimeConversationItemContentIn();

        System.assert(realtimeConversationItemContentInner1.equals(realtimeConversationItemContentInner2));
        System.assert(realtimeConversationItemContentInner3.equals(realtimeConversationItemContentInner4));
        System.assertEquals(realtimeConversationItemContentInner1.hashCode(), realtimeConversationItemContentInner2.hashCode());
        System.assertEquals(realtimeConversationItemContentInner3.hashCode(), realtimeConversationItemContentInner4.hashCode());
    }
}
