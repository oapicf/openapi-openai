@isTest
private class OASRealtimeServerEventResponseTextDeTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta1 = OASRealtimeServerEventResponseTextDe.getExample();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta2 = realtimeServerEventResponseTextDelta1;
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta3 = new OASRealtimeServerEventResponseTextDe();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta4 = realtimeServerEventResponseTextDelta3;

        System.assert(realtimeServerEventResponseTextDelta1.equals(realtimeServerEventResponseTextDelta2));
        System.assert(realtimeServerEventResponseTextDelta2.equals(realtimeServerEventResponseTextDelta1));
        System.assert(realtimeServerEventResponseTextDelta1.equals(realtimeServerEventResponseTextDelta1));
        System.assert(realtimeServerEventResponseTextDelta3.equals(realtimeServerEventResponseTextDelta4));
        System.assert(realtimeServerEventResponseTextDelta4.equals(realtimeServerEventResponseTextDelta3));
        System.assert(realtimeServerEventResponseTextDelta3.equals(realtimeServerEventResponseTextDelta3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta1 = OASRealtimeServerEventResponseTextDe.getExample();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta2 = OASRealtimeServerEventResponseTextDe.getExample();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta3 = new OASRealtimeServerEventResponseTextDe();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta4 = new OASRealtimeServerEventResponseTextDe();

        System.assert(realtimeServerEventResponseTextDelta1.equals(realtimeServerEventResponseTextDelta2));
        System.assert(realtimeServerEventResponseTextDelta2.equals(realtimeServerEventResponseTextDelta1));
        System.assert(realtimeServerEventResponseTextDelta3.equals(realtimeServerEventResponseTextDelta4));
        System.assert(realtimeServerEventResponseTextDelta4.equals(realtimeServerEventResponseTextDelta3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta1 = OASRealtimeServerEventResponseTextDe.getExample();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta2 = new OASRealtimeServerEventResponseTextDe();

        System.assertEquals(false, realtimeServerEventResponseTextDelta1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseTextDelta2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta1 = OASRealtimeServerEventResponseTextDe.getExample();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta2 = new OASRealtimeServerEventResponseTextDe();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta3;

        System.assertEquals(false, realtimeServerEventResponseTextDelta1.equals(realtimeServerEventResponseTextDelta3));
        System.assertEquals(false, realtimeServerEventResponseTextDelta2.equals(realtimeServerEventResponseTextDelta3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta1 = OASRealtimeServerEventResponseTextDe.getExample();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta2 = new OASRealtimeServerEventResponseTextDe();

        System.assertEquals(realtimeServerEventResponseTextDelta1.hashCode(), realtimeServerEventResponseTextDelta1.hashCode());
        System.assertEquals(realtimeServerEventResponseTextDelta2.hashCode(), realtimeServerEventResponseTextDelta2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta1 = OASRealtimeServerEventResponseTextDe.getExample();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta2 = OASRealtimeServerEventResponseTextDe.getExample();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta3 = new OASRealtimeServerEventResponseTextDe();
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta4 = new OASRealtimeServerEventResponseTextDe();

        System.assert(realtimeServerEventResponseTextDelta1.equals(realtimeServerEventResponseTextDelta2));
        System.assert(realtimeServerEventResponseTextDelta3.equals(realtimeServerEventResponseTextDelta4));
        System.assertEquals(realtimeServerEventResponseTextDelta1.hashCode(), realtimeServerEventResponseTextDelta2.hashCode());
        System.assertEquals(realtimeServerEventResponseTextDelta3.hashCode(), realtimeServerEventResponseTextDelta4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventResponseTextDe realtimeServerEventResponseTextDelta = new OASRealtimeServerEventResponseTextDe();
        Map<String, String> x-property-mappings = realtimeServerEventResponseTextDelta.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('responseId', x-property-mappings.get('response_id'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('outputIndex', x-property-mappings.get('output_index'));
        System.assertEquals('contentIndex', x-property-mappings.get('content_index'));
    }
}
