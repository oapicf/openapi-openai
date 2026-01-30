@isTest
private class OASRealtimeServerEventResponseAudioDTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone1 = OASRealtimeServerEventResponseAudioD.getExample();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone2 = realtimeServerEventResponseAudioDone1;
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone3 = new OASRealtimeServerEventResponseAudioD();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone4 = realtimeServerEventResponseAudioDone3;

        System.assert(realtimeServerEventResponseAudioDone1.equals(realtimeServerEventResponseAudioDone2));
        System.assert(realtimeServerEventResponseAudioDone2.equals(realtimeServerEventResponseAudioDone1));
        System.assert(realtimeServerEventResponseAudioDone1.equals(realtimeServerEventResponseAudioDone1));
        System.assert(realtimeServerEventResponseAudioDone3.equals(realtimeServerEventResponseAudioDone4));
        System.assert(realtimeServerEventResponseAudioDone4.equals(realtimeServerEventResponseAudioDone3));
        System.assert(realtimeServerEventResponseAudioDone3.equals(realtimeServerEventResponseAudioDone3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone1 = OASRealtimeServerEventResponseAudioD.getExample();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone2 = OASRealtimeServerEventResponseAudioD.getExample();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone3 = new OASRealtimeServerEventResponseAudioD();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone4 = new OASRealtimeServerEventResponseAudioD();

        System.assert(realtimeServerEventResponseAudioDone1.equals(realtimeServerEventResponseAudioDone2));
        System.assert(realtimeServerEventResponseAudioDone2.equals(realtimeServerEventResponseAudioDone1));
        System.assert(realtimeServerEventResponseAudioDone3.equals(realtimeServerEventResponseAudioDone4));
        System.assert(realtimeServerEventResponseAudioDone4.equals(realtimeServerEventResponseAudioDone3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone1 = OASRealtimeServerEventResponseAudioD.getExample();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone2 = new OASRealtimeServerEventResponseAudioD();

        System.assertEquals(false, realtimeServerEventResponseAudioDone1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseAudioDone2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone1 = OASRealtimeServerEventResponseAudioD.getExample();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone2 = new OASRealtimeServerEventResponseAudioD();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone3;

        System.assertEquals(false, realtimeServerEventResponseAudioDone1.equals(realtimeServerEventResponseAudioDone3));
        System.assertEquals(false, realtimeServerEventResponseAudioDone2.equals(realtimeServerEventResponseAudioDone3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone1 = OASRealtimeServerEventResponseAudioD.getExample();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone2 = new OASRealtimeServerEventResponseAudioD();

        System.assertEquals(realtimeServerEventResponseAudioDone1.hashCode(), realtimeServerEventResponseAudioDone1.hashCode());
        System.assertEquals(realtimeServerEventResponseAudioDone2.hashCode(), realtimeServerEventResponseAudioDone2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone1 = OASRealtimeServerEventResponseAudioD.getExample();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone2 = OASRealtimeServerEventResponseAudioD.getExample();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone3 = new OASRealtimeServerEventResponseAudioD();
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone4 = new OASRealtimeServerEventResponseAudioD();

        System.assert(realtimeServerEventResponseAudioDone1.equals(realtimeServerEventResponseAudioDone2));
        System.assert(realtimeServerEventResponseAudioDone3.equals(realtimeServerEventResponseAudioDone4));
        System.assertEquals(realtimeServerEventResponseAudioDone1.hashCode(), realtimeServerEventResponseAudioDone2.hashCode());
        System.assertEquals(realtimeServerEventResponseAudioDone3.hashCode(), realtimeServerEventResponseAudioDone4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventResponseAudioD realtimeServerEventResponseAudioDone = new OASRealtimeServerEventResponseAudioD();
        Map<String, String> x-property-mappings = realtimeServerEventResponseAudioDone.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('responseId', x-property-mappings.get('response_id'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('outputIndex', x-property-mappings.get('output_index'));
        System.assertEquals('contentIndex', x-property-mappings.get('content_index'));
    }
}
