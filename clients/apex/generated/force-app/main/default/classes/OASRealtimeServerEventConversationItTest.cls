@isTest
private class OASRealtimeServerEventConversationItTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError1 = OASRealtimeServerEventConversationIt.getExample();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError2 = realtimeServerEventConversationItemInputAudioTranscriptionFailedError1;
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError3 = new OASRealtimeServerEventConversationIt();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError4 = realtimeServerEventConversationItemInputAudioTranscriptionFailedError3;

        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError2));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError2.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError4));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError4.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError1 = OASRealtimeServerEventConversationIt.getExample();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError2 = OASRealtimeServerEventConversationIt.getExample();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError3 = new OASRealtimeServerEventConversationIt();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError4 = new OASRealtimeServerEventConversationIt();

        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError2));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError2.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError4));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError4.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError1 = OASRealtimeServerEventConversationIt.getExample();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError2 = new OASRealtimeServerEventConversationIt();

        System.assertEquals(false, realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.equals('foo'));
        System.assertEquals(false, realtimeServerEventConversationItemInputAudioTranscriptionFailedError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError1 = OASRealtimeServerEventConversationIt.getExample();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError2 = new OASRealtimeServerEventConversationIt();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError3;

        System.assertEquals(false, realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3));
        System.assertEquals(false, realtimeServerEventConversationItemInputAudioTranscriptionFailedError2.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError1 = OASRealtimeServerEventConversationIt.getExample();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError2 = new OASRealtimeServerEventConversationIt();

        System.assertEquals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.hashCode(), realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.hashCode());
        System.assertEquals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError2.hashCode(), realtimeServerEventConversationItemInputAudioTranscriptionFailedError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError1 = OASRealtimeServerEventConversationIt.getExample();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError2 = OASRealtimeServerEventConversationIt.getExample();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError3 = new OASRealtimeServerEventConversationIt();
        OASRealtimeServerEventConversationIt realtimeServerEventConversationItemInputAudioTranscriptionFailedError4 = new OASRealtimeServerEventConversationIt();

        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError2));
        System.assert(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3.equals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError4));
        System.assertEquals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError1.hashCode(), realtimeServerEventConversationItemInputAudioTranscriptionFailedError2.hashCode());
        System.assertEquals(realtimeServerEventConversationItemInputAudioTranscriptionFailedError3.hashCode(), realtimeServerEventConversationItemInputAudioTranscriptionFailedError4.hashCode());
    }
}
