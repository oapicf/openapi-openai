@isTest
private class OASRealtimeClientEventInputAudioBuffTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit1 = OASRealtimeClientEventInputAudioBuff.getExample();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit2 = realtimeClientEventInputAudioBufferCommit1;
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit3 = new OASRealtimeClientEventInputAudioBuff();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit4 = realtimeClientEventInputAudioBufferCommit3;

        System.assert(realtimeClientEventInputAudioBufferCommit1.equals(realtimeClientEventInputAudioBufferCommit2));
        System.assert(realtimeClientEventInputAudioBufferCommit2.equals(realtimeClientEventInputAudioBufferCommit1));
        System.assert(realtimeClientEventInputAudioBufferCommit1.equals(realtimeClientEventInputAudioBufferCommit1));
        System.assert(realtimeClientEventInputAudioBufferCommit3.equals(realtimeClientEventInputAudioBufferCommit4));
        System.assert(realtimeClientEventInputAudioBufferCommit4.equals(realtimeClientEventInputAudioBufferCommit3));
        System.assert(realtimeClientEventInputAudioBufferCommit3.equals(realtimeClientEventInputAudioBufferCommit3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit1 = OASRealtimeClientEventInputAudioBuff.getExample();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit2 = OASRealtimeClientEventInputAudioBuff.getExample();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit3 = new OASRealtimeClientEventInputAudioBuff();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit4 = new OASRealtimeClientEventInputAudioBuff();

        System.assert(realtimeClientEventInputAudioBufferCommit1.equals(realtimeClientEventInputAudioBufferCommit2));
        System.assert(realtimeClientEventInputAudioBufferCommit2.equals(realtimeClientEventInputAudioBufferCommit1));
        System.assert(realtimeClientEventInputAudioBufferCommit3.equals(realtimeClientEventInputAudioBufferCommit4));
        System.assert(realtimeClientEventInputAudioBufferCommit4.equals(realtimeClientEventInputAudioBufferCommit3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit1 = OASRealtimeClientEventInputAudioBuff.getExample();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit2 = new OASRealtimeClientEventInputAudioBuff();

        System.assertEquals(false, realtimeClientEventInputAudioBufferCommit1.equals('foo'));
        System.assertEquals(false, realtimeClientEventInputAudioBufferCommit2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit1 = OASRealtimeClientEventInputAudioBuff.getExample();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit2 = new OASRealtimeClientEventInputAudioBuff();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit3;

        System.assertEquals(false, realtimeClientEventInputAudioBufferCommit1.equals(realtimeClientEventInputAudioBufferCommit3));
        System.assertEquals(false, realtimeClientEventInputAudioBufferCommit2.equals(realtimeClientEventInputAudioBufferCommit3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit1 = OASRealtimeClientEventInputAudioBuff.getExample();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit2 = new OASRealtimeClientEventInputAudioBuff();

        System.assertEquals(realtimeClientEventInputAudioBufferCommit1.hashCode(), realtimeClientEventInputAudioBufferCommit1.hashCode());
        System.assertEquals(realtimeClientEventInputAudioBufferCommit2.hashCode(), realtimeClientEventInputAudioBufferCommit2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit1 = OASRealtimeClientEventInputAudioBuff.getExample();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit2 = OASRealtimeClientEventInputAudioBuff.getExample();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit3 = new OASRealtimeClientEventInputAudioBuff();
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit4 = new OASRealtimeClientEventInputAudioBuff();

        System.assert(realtimeClientEventInputAudioBufferCommit1.equals(realtimeClientEventInputAudioBufferCommit2));
        System.assert(realtimeClientEventInputAudioBufferCommit3.equals(realtimeClientEventInputAudioBufferCommit4));
        System.assertEquals(realtimeClientEventInputAudioBufferCommit1.hashCode(), realtimeClientEventInputAudioBufferCommit2.hashCode());
        System.assertEquals(realtimeClientEventInputAudioBufferCommit3.hashCode(), realtimeClientEventInputAudioBufferCommit4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeClientEventInputAudioBuff realtimeClientEventInputAudioBufferCommit = new OASRealtimeClientEventInputAudioBuff();
        Map<String, String> x-property-mappings = realtimeClientEventInputAudioBufferCommit.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
