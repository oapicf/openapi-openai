@isTest
private class OASRealtimeSessionInputAudioTranscriTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription1 = OASRealtimeSessionInputAudioTranscri.getExample();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription2 = realtimeSessionInputAudioTranscription1;
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription3 = new OASRealtimeSessionInputAudioTranscri();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription4 = realtimeSessionInputAudioTranscription3;

        System.assert(realtimeSessionInputAudioTranscription1.equals(realtimeSessionInputAudioTranscription2));
        System.assert(realtimeSessionInputAudioTranscription2.equals(realtimeSessionInputAudioTranscription1));
        System.assert(realtimeSessionInputAudioTranscription1.equals(realtimeSessionInputAudioTranscription1));
        System.assert(realtimeSessionInputAudioTranscription3.equals(realtimeSessionInputAudioTranscription4));
        System.assert(realtimeSessionInputAudioTranscription4.equals(realtimeSessionInputAudioTranscription3));
        System.assert(realtimeSessionInputAudioTranscription3.equals(realtimeSessionInputAudioTranscription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription1 = OASRealtimeSessionInputAudioTranscri.getExample();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription2 = OASRealtimeSessionInputAudioTranscri.getExample();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription3 = new OASRealtimeSessionInputAudioTranscri();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription4 = new OASRealtimeSessionInputAudioTranscri();

        System.assert(realtimeSessionInputAudioTranscription1.equals(realtimeSessionInputAudioTranscription2));
        System.assert(realtimeSessionInputAudioTranscription2.equals(realtimeSessionInputAudioTranscription1));
        System.assert(realtimeSessionInputAudioTranscription3.equals(realtimeSessionInputAudioTranscription4));
        System.assert(realtimeSessionInputAudioTranscription4.equals(realtimeSessionInputAudioTranscription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription1 = OASRealtimeSessionInputAudioTranscri.getExample();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription2 = new OASRealtimeSessionInputAudioTranscri();

        System.assertEquals(false, realtimeSessionInputAudioTranscription1.equals('foo'));
        System.assertEquals(false, realtimeSessionInputAudioTranscription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription1 = OASRealtimeSessionInputAudioTranscri.getExample();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription2 = new OASRealtimeSessionInputAudioTranscri();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription3;

        System.assertEquals(false, realtimeSessionInputAudioTranscription1.equals(realtimeSessionInputAudioTranscription3));
        System.assertEquals(false, realtimeSessionInputAudioTranscription2.equals(realtimeSessionInputAudioTranscription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription1 = OASRealtimeSessionInputAudioTranscri.getExample();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription2 = new OASRealtimeSessionInputAudioTranscri();

        System.assertEquals(realtimeSessionInputAudioTranscription1.hashCode(), realtimeSessionInputAudioTranscription1.hashCode());
        System.assertEquals(realtimeSessionInputAudioTranscription2.hashCode(), realtimeSessionInputAudioTranscription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription1 = OASRealtimeSessionInputAudioTranscri.getExample();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription2 = OASRealtimeSessionInputAudioTranscri.getExample();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription3 = new OASRealtimeSessionInputAudioTranscri();
        OASRealtimeSessionInputAudioTranscri realtimeSessionInputAudioTranscription4 = new OASRealtimeSessionInputAudioTranscri();

        System.assert(realtimeSessionInputAudioTranscription1.equals(realtimeSessionInputAudioTranscription2));
        System.assert(realtimeSessionInputAudioTranscription3.equals(realtimeSessionInputAudioTranscription4));
        System.assertEquals(realtimeSessionInputAudioTranscription1.hashCode(), realtimeSessionInputAudioTranscription2.hashCode());
        System.assertEquals(realtimeSessionInputAudioTranscription3.hashCode(), realtimeSessionInputAudioTranscription4.hashCode());
    }
}
