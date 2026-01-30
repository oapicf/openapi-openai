@isTest
private class OASRealtimeServerEventConversationCrTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation1 = OASRealtimeServerEventConversationCr.getExample();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation2 = realtimeServerEventConversationCreatedConversation1;
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation3 = new OASRealtimeServerEventConversationCr();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation4 = realtimeServerEventConversationCreatedConversation3;

        System.assert(realtimeServerEventConversationCreatedConversation1.equals(realtimeServerEventConversationCreatedConversation2));
        System.assert(realtimeServerEventConversationCreatedConversation2.equals(realtimeServerEventConversationCreatedConversation1));
        System.assert(realtimeServerEventConversationCreatedConversation1.equals(realtimeServerEventConversationCreatedConversation1));
        System.assert(realtimeServerEventConversationCreatedConversation3.equals(realtimeServerEventConversationCreatedConversation4));
        System.assert(realtimeServerEventConversationCreatedConversation4.equals(realtimeServerEventConversationCreatedConversation3));
        System.assert(realtimeServerEventConversationCreatedConversation3.equals(realtimeServerEventConversationCreatedConversation3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation1 = OASRealtimeServerEventConversationCr.getExample();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation2 = OASRealtimeServerEventConversationCr.getExample();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation3 = new OASRealtimeServerEventConversationCr();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation4 = new OASRealtimeServerEventConversationCr();

        System.assert(realtimeServerEventConversationCreatedConversation1.equals(realtimeServerEventConversationCreatedConversation2));
        System.assert(realtimeServerEventConversationCreatedConversation2.equals(realtimeServerEventConversationCreatedConversation1));
        System.assert(realtimeServerEventConversationCreatedConversation3.equals(realtimeServerEventConversationCreatedConversation4));
        System.assert(realtimeServerEventConversationCreatedConversation4.equals(realtimeServerEventConversationCreatedConversation3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation1 = OASRealtimeServerEventConversationCr.getExample();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation2 = new OASRealtimeServerEventConversationCr();

        System.assertEquals(false, realtimeServerEventConversationCreatedConversation1.equals('foo'));
        System.assertEquals(false, realtimeServerEventConversationCreatedConversation2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation1 = OASRealtimeServerEventConversationCr.getExample();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation2 = new OASRealtimeServerEventConversationCr();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation3;

        System.assertEquals(false, realtimeServerEventConversationCreatedConversation1.equals(realtimeServerEventConversationCreatedConversation3));
        System.assertEquals(false, realtimeServerEventConversationCreatedConversation2.equals(realtimeServerEventConversationCreatedConversation3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation1 = OASRealtimeServerEventConversationCr.getExample();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation2 = new OASRealtimeServerEventConversationCr();

        System.assertEquals(realtimeServerEventConversationCreatedConversation1.hashCode(), realtimeServerEventConversationCreatedConversation1.hashCode());
        System.assertEquals(realtimeServerEventConversationCreatedConversation2.hashCode(), realtimeServerEventConversationCreatedConversation2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation1 = OASRealtimeServerEventConversationCr.getExample();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation2 = OASRealtimeServerEventConversationCr.getExample();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation3 = new OASRealtimeServerEventConversationCr();
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation4 = new OASRealtimeServerEventConversationCr();

        System.assert(realtimeServerEventConversationCreatedConversation1.equals(realtimeServerEventConversationCreatedConversation2));
        System.assert(realtimeServerEventConversationCreatedConversation3.equals(realtimeServerEventConversationCreatedConversation4));
        System.assertEquals(realtimeServerEventConversationCreatedConversation1.hashCode(), realtimeServerEventConversationCreatedConversation2.hashCode());
        System.assertEquals(realtimeServerEventConversationCreatedConversation3.hashCode(), realtimeServerEventConversationCreatedConversation4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventConversationCr realtimeServerEventConversationCreatedConversation = new OASRealtimeServerEventConversationCr();
        Map<String, String> x-property-mappings = realtimeServerEventConversationCreatedConversation.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
