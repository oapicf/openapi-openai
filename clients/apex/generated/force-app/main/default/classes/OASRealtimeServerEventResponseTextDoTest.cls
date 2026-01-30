@isTest
private class OASRealtimeServerEventResponseTextDoTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone1 = OASRealtimeServerEventResponseTextDo.getExample();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone2 = realtimeServerEventResponseTextDone1;
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone3 = new OASRealtimeServerEventResponseTextDo();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone4 = realtimeServerEventResponseTextDone3;

        System.assert(realtimeServerEventResponseTextDone1.equals(realtimeServerEventResponseTextDone2));
        System.assert(realtimeServerEventResponseTextDone2.equals(realtimeServerEventResponseTextDone1));
        System.assert(realtimeServerEventResponseTextDone1.equals(realtimeServerEventResponseTextDone1));
        System.assert(realtimeServerEventResponseTextDone3.equals(realtimeServerEventResponseTextDone4));
        System.assert(realtimeServerEventResponseTextDone4.equals(realtimeServerEventResponseTextDone3));
        System.assert(realtimeServerEventResponseTextDone3.equals(realtimeServerEventResponseTextDone3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone1 = OASRealtimeServerEventResponseTextDo.getExample();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone2 = OASRealtimeServerEventResponseTextDo.getExample();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone3 = new OASRealtimeServerEventResponseTextDo();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone4 = new OASRealtimeServerEventResponseTextDo();

        System.assert(realtimeServerEventResponseTextDone1.equals(realtimeServerEventResponseTextDone2));
        System.assert(realtimeServerEventResponseTextDone2.equals(realtimeServerEventResponseTextDone1));
        System.assert(realtimeServerEventResponseTextDone3.equals(realtimeServerEventResponseTextDone4));
        System.assert(realtimeServerEventResponseTextDone4.equals(realtimeServerEventResponseTextDone3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone1 = OASRealtimeServerEventResponseTextDo.getExample();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone2 = new OASRealtimeServerEventResponseTextDo();

        System.assertEquals(false, realtimeServerEventResponseTextDone1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseTextDone2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone1 = OASRealtimeServerEventResponseTextDo.getExample();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone2 = new OASRealtimeServerEventResponseTextDo();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone3;

        System.assertEquals(false, realtimeServerEventResponseTextDone1.equals(realtimeServerEventResponseTextDone3));
        System.assertEquals(false, realtimeServerEventResponseTextDone2.equals(realtimeServerEventResponseTextDone3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone1 = OASRealtimeServerEventResponseTextDo.getExample();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone2 = new OASRealtimeServerEventResponseTextDo();

        System.assertEquals(realtimeServerEventResponseTextDone1.hashCode(), realtimeServerEventResponseTextDone1.hashCode());
        System.assertEquals(realtimeServerEventResponseTextDone2.hashCode(), realtimeServerEventResponseTextDone2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone1 = OASRealtimeServerEventResponseTextDo.getExample();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone2 = OASRealtimeServerEventResponseTextDo.getExample();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone3 = new OASRealtimeServerEventResponseTextDo();
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone4 = new OASRealtimeServerEventResponseTextDo();

        System.assert(realtimeServerEventResponseTextDone1.equals(realtimeServerEventResponseTextDone2));
        System.assert(realtimeServerEventResponseTextDone3.equals(realtimeServerEventResponseTextDone4));
        System.assertEquals(realtimeServerEventResponseTextDone1.hashCode(), realtimeServerEventResponseTextDone2.hashCode());
        System.assertEquals(realtimeServerEventResponseTextDone3.hashCode(), realtimeServerEventResponseTextDone4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventResponseTextDo realtimeServerEventResponseTextDone = new OASRealtimeServerEventResponseTextDo();
        Map<String, String> x-property-mappings = realtimeServerEventResponseTextDone.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('responseId', x-property-mappings.get('response_id'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('outputIndex', x-property-mappings.get('output_index'));
        System.assertEquals('contentIndex', x-property-mappings.get('content_index'));
    }
}
