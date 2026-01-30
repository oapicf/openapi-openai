@isTest
private class OASRealtimeServerEventInputAudioBuffTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped1 = OASRealtimeServerEventInputAudioBuff.getExample();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped2 = realtimeServerEventInputAudioBufferSpeechStopped1;
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped3 = new OASRealtimeServerEventInputAudioBuff();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped4 = realtimeServerEventInputAudioBufferSpeechStopped3;

        System.assert(realtimeServerEventInputAudioBufferSpeechStopped1.equals(realtimeServerEventInputAudioBufferSpeechStopped2));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped2.equals(realtimeServerEventInputAudioBufferSpeechStopped1));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped1.equals(realtimeServerEventInputAudioBufferSpeechStopped1));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped3.equals(realtimeServerEventInputAudioBufferSpeechStopped4));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped4.equals(realtimeServerEventInputAudioBufferSpeechStopped3));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped3.equals(realtimeServerEventInputAudioBufferSpeechStopped3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped1 = OASRealtimeServerEventInputAudioBuff.getExample();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped2 = OASRealtimeServerEventInputAudioBuff.getExample();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped3 = new OASRealtimeServerEventInputAudioBuff();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped4 = new OASRealtimeServerEventInputAudioBuff();

        System.assert(realtimeServerEventInputAudioBufferSpeechStopped1.equals(realtimeServerEventInputAudioBufferSpeechStopped2));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped2.equals(realtimeServerEventInputAudioBufferSpeechStopped1));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped3.equals(realtimeServerEventInputAudioBufferSpeechStopped4));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped4.equals(realtimeServerEventInputAudioBufferSpeechStopped3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped1 = OASRealtimeServerEventInputAudioBuff.getExample();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped2 = new OASRealtimeServerEventInputAudioBuff();

        System.assertEquals(false, realtimeServerEventInputAudioBufferSpeechStopped1.equals('foo'));
        System.assertEquals(false, realtimeServerEventInputAudioBufferSpeechStopped2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped1 = OASRealtimeServerEventInputAudioBuff.getExample();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped2 = new OASRealtimeServerEventInputAudioBuff();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped3;

        System.assertEquals(false, realtimeServerEventInputAudioBufferSpeechStopped1.equals(realtimeServerEventInputAudioBufferSpeechStopped3));
        System.assertEquals(false, realtimeServerEventInputAudioBufferSpeechStopped2.equals(realtimeServerEventInputAudioBufferSpeechStopped3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped1 = OASRealtimeServerEventInputAudioBuff.getExample();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped2 = new OASRealtimeServerEventInputAudioBuff();

        System.assertEquals(realtimeServerEventInputAudioBufferSpeechStopped1.hashCode(), realtimeServerEventInputAudioBufferSpeechStopped1.hashCode());
        System.assertEquals(realtimeServerEventInputAudioBufferSpeechStopped2.hashCode(), realtimeServerEventInputAudioBufferSpeechStopped2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped1 = OASRealtimeServerEventInputAudioBuff.getExample();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped2 = OASRealtimeServerEventInputAudioBuff.getExample();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped3 = new OASRealtimeServerEventInputAudioBuff();
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped4 = new OASRealtimeServerEventInputAudioBuff();

        System.assert(realtimeServerEventInputAudioBufferSpeechStopped1.equals(realtimeServerEventInputAudioBufferSpeechStopped2));
        System.assert(realtimeServerEventInputAudioBufferSpeechStopped3.equals(realtimeServerEventInputAudioBufferSpeechStopped4));
        System.assertEquals(realtimeServerEventInputAudioBufferSpeechStopped1.hashCode(), realtimeServerEventInputAudioBufferSpeechStopped2.hashCode());
        System.assertEquals(realtimeServerEventInputAudioBufferSpeechStopped3.hashCode(), realtimeServerEventInputAudioBufferSpeechStopped4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventInputAudioBuff realtimeServerEventInputAudioBufferSpeechStopped = new OASRealtimeServerEventInputAudioBuff();
        Map<String, String> x-property-mappings = realtimeServerEventInputAudioBufferSpeechStopped.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('audioEndMs', x-property-mappings.get('audio_end_ms'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
