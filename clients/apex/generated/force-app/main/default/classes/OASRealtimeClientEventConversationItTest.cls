@isTest
private class OASRealtimeClientEventConversationItTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate1 = OASRealtimeClientEventConversationIt.getExample();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate2 = realtimeClientEventConversationItemTruncate1;
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate3 = new OASRealtimeClientEventConversationIt();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate4 = realtimeClientEventConversationItemTruncate3;

        System.assert(realtimeClientEventConversationItemTruncate1.equals(realtimeClientEventConversationItemTruncate2));
        System.assert(realtimeClientEventConversationItemTruncate2.equals(realtimeClientEventConversationItemTruncate1));
        System.assert(realtimeClientEventConversationItemTruncate1.equals(realtimeClientEventConversationItemTruncate1));
        System.assert(realtimeClientEventConversationItemTruncate3.equals(realtimeClientEventConversationItemTruncate4));
        System.assert(realtimeClientEventConversationItemTruncate4.equals(realtimeClientEventConversationItemTruncate3));
        System.assert(realtimeClientEventConversationItemTruncate3.equals(realtimeClientEventConversationItemTruncate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate1 = OASRealtimeClientEventConversationIt.getExample();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate2 = OASRealtimeClientEventConversationIt.getExample();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate3 = new OASRealtimeClientEventConversationIt();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate4 = new OASRealtimeClientEventConversationIt();

        System.assert(realtimeClientEventConversationItemTruncate1.equals(realtimeClientEventConversationItemTruncate2));
        System.assert(realtimeClientEventConversationItemTruncate2.equals(realtimeClientEventConversationItemTruncate1));
        System.assert(realtimeClientEventConversationItemTruncate3.equals(realtimeClientEventConversationItemTruncate4));
        System.assert(realtimeClientEventConversationItemTruncate4.equals(realtimeClientEventConversationItemTruncate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate1 = OASRealtimeClientEventConversationIt.getExample();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate2 = new OASRealtimeClientEventConversationIt();

        System.assertEquals(false, realtimeClientEventConversationItemTruncate1.equals('foo'));
        System.assertEquals(false, realtimeClientEventConversationItemTruncate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate1 = OASRealtimeClientEventConversationIt.getExample();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate2 = new OASRealtimeClientEventConversationIt();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate3;

        System.assertEquals(false, realtimeClientEventConversationItemTruncate1.equals(realtimeClientEventConversationItemTruncate3));
        System.assertEquals(false, realtimeClientEventConversationItemTruncate2.equals(realtimeClientEventConversationItemTruncate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate1 = OASRealtimeClientEventConversationIt.getExample();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate2 = new OASRealtimeClientEventConversationIt();

        System.assertEquals(realtimeClientEventConversationItemTruncate1.hashCode(), realtimeClientEventConversationItemTruncate1.hashCode());
        System.assertEquals(realtimeClientEventConversationItemTruncate2.hashCode(), realtimeClientEventConversationItemTruncate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate1 = OASRealtimeClientEventConversationIt.getExample();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate2 = OASRealtimeClientEventConversationIt.getExample();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate3 = new OASRealtimeClientEventConversationIt();
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate4 = new OASRealtimeClientEventConversationIt();

        System.assert(realtimeClientEventConversationItemTruncate1.equals(realtimeClientEventConversationItemTruncate2));
        System.assert(realtimeClientEventConversationItemTruncate3.equals(realtimeClientEventConversationItemTruncate4));
        System.assertEquals(realtimeClientEventConversationItemTruncate1.hashCode(), realtimeClientEventConversationItemTruncate2.hashCode());
        System.assertEquals(realtimeClientEventConversationItemTruncate3.hashCode(), realtimeClientEventConversationItemTruncate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeClientEventConversationIt realtimeClientEventConversationItemTruncate = new OASRealtimeClientEventConversationIt();
        Map<String, String> x-property-mappings = realtimeClientEventConversationItemTruncate.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('contentIndex', x-property-mappings.get('content_index'));
        System.assertEquals('audioEndMs', x-property-mappings.get('audio_end_ms'));
    }
}
