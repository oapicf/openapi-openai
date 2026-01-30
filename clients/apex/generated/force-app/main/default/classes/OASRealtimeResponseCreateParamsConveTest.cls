@isTest
private class OASRealtimeResponseCreateParamsConveTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation1 = OASRealtimeResponseCreateParamsConve.getExample();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation2 = realtimeResponseCreateParamsConversation1;
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation3 = new OASRealtimeResponseCreateParamsConve();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation4 = realtimeResponseCreateParamsConversation3;

        System.assert(realtimeResponseCreateParamsConversation1.equals(realtimeResponseCreateParamsConversation2));
        System.assert(realtimeResponseCreateParamsConversation2.equals(realtimeResponseCreateParamsConversation1));
        System.assert(realtimeResponseCreateParamsConversation1.equals(realtimeResponseCreateParamsConversation1));
        System.assert(realtimeResponseCreateParamsConversation3.equals(realtimeResponseCreateParamsConversation4));
        System.assert(realtimeResponseCreateParamsConversation4.equals(realtimeResponseCreateParamsConversation3));
        System.assert(realtimeResponseCreateParamsConversation3.equals(realtimeResponseCreateParamsConversation3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation1 = OASRealtimeResponseCreateParamsConve.getExample();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation2 = OASRealtimeResponseCreateParamsConve.getExample();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation3 = new OASRealtimeResponseCreateParamsConve();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation4 = new OASRealtimeResponseCreateParamsConve();

        System.assert(realtimeResponseCreateParamsConversation1.equals(realtimeResponseCreateParamsConversation2));
        System.assert(realtimeResponseCreateParamsConversation2.equals(realtimeResponseCreateParamsConversation1));
        System.assert(realtimeResponseCreateParamsConversation3.equals(realtimeResponseCreateParamsConversation4));
        System.assert(realtimeResponseCreateParamsConversation4.equals(realtimeResponseCreateParamsConversation3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation1 = OASRealtimeResponseCreateParamsConve.getExample();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation2 = new OASRealtimeResponseCreateParamsConve();

        System.assertEquals(false, realtimeResponseCreateParamsConversation1.equals('foo'));
        System.assertEquals(false, realtimeResponseCreateParamsConversation2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation1 = OASRealtimeResponseCreateParamsConve.getExample();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation2 = new OASRealtimeResponseCreateParamsConve();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation3;

        System.assertEquals(false, realtimeResponseCreateParamsConversation1.equals(realtimeResponseCreateParamsConversation3));
        System.assertEquals(false, realtimeResponseCreateParamsConversation2.equals(realtimeResponseCreateParamsConversation3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation1 = OASRealtimeResponseCreateParamsConve.getExample();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation2 = new OASRealtimeResponseCreateParamsConve();

        System.assertEquals(realtimeResponseCreateParamsConversation1.hashCode(), realtimeResponseCreateParamsConversation1.hashCode());
        System.assertEquals(realtimeResponseCreateParamsConversation2.hashCode(), realtimeResponseCreateParamsConversation2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation1 = OASRealtimeResponseCreateParamsConve.getExample();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation2 = OASRealtimeResponseCreateParamsConve.getExample();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation3 = new OASRealtimeResponseCreateParamsConve();
        OASRealtimeResponseCreateParamsConve realtimeResponseCreateParamsConversation4 = new OASRealtimeResponseCreateParamsConve();

        System.assert(realtimeResponseCreateParamsConversation1.equals(realtimeResponseCreateParamsConversation2));
        System.assert(realtimeResponseCreateParamsConversation3.equals(realtimeResponseCreateParamsConversation4));
        System.assertEquals(realtimeResponseCreateParamsConversation1.hashCode(), realtimeResponseCreateParamsConversation2.hashCode());
        System.assertEquals(realtimeResponseCreateParamsConversation3.hashCode(), realtimeResponseCreateParamsConversation4.hashCode());
    }
}
