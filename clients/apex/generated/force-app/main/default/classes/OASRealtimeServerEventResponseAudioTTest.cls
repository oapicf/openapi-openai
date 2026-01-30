@isTest
private class OASRealtimeServerEventResponseAudioTTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone1 = OASRealtimeServerEventResponseAudioT.getExample();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone2 = realtimeServerEventResponseAudioTranscriptDone1;
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone3 = new OASRealtimeServerEventResponseAudioT();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone4 = realtimeServerEventResponseAudioTranscriptDone3;

        System.assert(realtimeServerEventResponseAudioTranscriptDone1.equals(realtimeServerEventResponseAudioTranscriptDone2));
        System.assert(realtimeServerEventResponseAudioTranscriptDone2.equals(realtimeServerEventResponseAudioTranscriptDone1));
        System.assert(realtimeServerEventResponseAudioTranscriptDone1.equals(realtimeServerEventResponseAudioTranscriptDone1));
        System.assert(realtimeServerEventResponseAudioTranscriptDone3.equals(realtimeServerEventResponseAudioTranscriptDone4));
        System.assert(realtimeServerEventResponseAudioTranscriptDone4.equals(realtimeServerEventResponseAudioTranscriptDone3));
        System.assert(realtimeServerEventResponseAudioTranscriptDone3.equals(realtimeServerEventResponseAudioTranscriptDone3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone1 = OASRealtimeServerEventResponseAudioT.getExample();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone2 = OASRealtimeServerEventResponseAudioT.getExample();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone3 = new OASRealtimeServerEventResponseAudioT();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone4 = new OASRealtimeServerEventResponseAudioT();

        System.assert(realtimeServerEventResponseAudioTranscriptDone1.equals(realtimeServerEventResponseAudioTranscriptDone2));
        System.assert(realtimeServerEventResponseAudioTranscriptDone2.equals(realtimeServerEventResponseAudioTranscriptDone1));
        System.assert(realtimeServerEventResponseAudioTranscriptDone3.equals(realtimeServerEventResponseAudioTranscriptDone4));
        System.assert(realtimeServerEventResponseAudioTranscriptDone4.equals(realtimeServerEventResponseAudioTranscriptDone3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone1 = OASRealtimeServerEventResponseAudioT.getExample();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone2 = new OASRealtimeServerEventResponseAudioT();

        System.assertEquals(false, realtimeServerEventResponseAudioTranscriptDone1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseAudioTranscriptDone2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone1 = OASRealtimeServerEventResponseAudioT.getExample();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone2 = new OASRealtimeServerEventResponseAudioT();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone3;

        System.assertEquals(false, realtimeServerEventResponseAudioTranscriptDone1.equals(realtimeServerEventResponseAudioTranscriptDone3));
        System.assertEquals(false, realtimeServerEventResponseAudioTranscriptDone2.equals(realtimeServerEventResponseAudioTranscriptDone3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone1 = OASRealtimeServerEventResponseAudioT.getExample();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone2 = new OASRealtimeServerEventResponseAudioT();

        System.assertEquals(realtimeServerEventResponseAudioTranscriptDone1.hashCode(), realtimeServerEventResponseAudioTranscriptDone1.hashCode());
        System.assertEquals(realtimeServerEventResponseAudioTranscriptDone2.hashCode(), realtimeServerEventResponseAudioTranscriptDone2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone1 = OASRealtimeServerEventResponseAudioT.getExample();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone2 = OASRealtimeServerEventResponseAudioT.getExample();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone3 = new OASRealtimeServerEventResponseAudioT();
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone4 = new OASRealtimeServerEventResponseAudioT();

        System.assert(realtimeServerEventResponseAudioTranscriptDone1.equals(realtimeServerEventResponseAudioTranscriptDone2));
        System.assert(realtimeServerEventResponseAudioTranscriptDone3.equals(realtimeServerEventResponseAudioTranscriptDone4));
        System.assertEquals(realtimeServerEventResponseAudioTranscriptDone1.hashCode(), realtimeServerEventResponseAudioTranscriptDone2.hashCode());
        System.assertEquals(realtimeServerEventResponseAudioTranscriptDone3.hashCode(), realtimeServerEventResponseAudioTranscriptDone4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventResponseAudioT realtimeServerEventResponseAudioTranscriptDone = new OASRealtimeServerEventResponseAudioT();
        Map<String, String> x-property-mappings = realtimeServerEventResponseAudioTranscriptDone.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('responseId', x-property-mappings.get('response_id'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('outputIndex', x-property-mappings.get('output_index'));
        System.assertEquals('contentIndex', x-property-mappings.get('content_index'));
    }
}
