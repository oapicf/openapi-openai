@isTest
private class OASRealtimeSessionTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSession realtimeSession1 = OASRealtimeSession.getExample();
        OASRealtimeSession realtimeSession2 = realtimeSession1;
        OASRealtimeSession realtimeSession3 = new OASRealtimeSession();
        OASRealtimeSession realtimeSession4 = realtimeSession3;

        System.assert(realtimeSession1.equals(realtimeSession2));
        System.assert(realtimeSession2.equals(realtimeSession1));
        System.assert(realtimeSession1.equals(realtimeSession1));
        System.assert(realtimeSession3.equals(realtimeSession4));
        System.assert(realtimeSession4.equals(realtimeSession3));
        System.assert(realtimeSession3.equals(realtimeSession3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSession realtimeSession1 = OASRealtimeSession.getExample();
        OASRealtimeSession realtimeSession2 = OASRealtimeSession.getExample();
        OASRealtimeSession realtimeSession3 = new OASRealtimeSession();
        OASRealtimeSession realtimeSession4 = new OASRealtimeSession();

        System.assert(realtimeSession1.equals(realtimeSession2));
        System.assert(realtimeSession2.equals(realtimeSession1));
        System.assert(realtimeSession3.equals(realtimeSession4));
        System.assert(realtimeSession4.equals(realtimeSession3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSession realtimeSession1 = OASRealtimeSession.getExample();
        OASRealtimeSession realtimeSession2 = new OASRealtimeSession();

        System.assertEquals(false, realtimeSession1.equals('foo'));
        System.assertEquals(false, realtimeSession2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSession realtimeSession1 = OASRealtimeSession.getExample();
        OASRealtimeSession realtimeSession2 = new OASRealtimeSession();
        OASRealtimeSession realtimeSession3;

        System.assertEquals(false, realtimeSession1.equals(realtimeSession3));
        System.assertEquals(false, realtimeSession2.equals(realtimeSession3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSession realtimeSession1 = OASRealtimeSession.getExample();
        OASRealtimeSession realtimeSession2 = new OASRealtimeSession();

        System.assertEquals(realtimeSession1.hashCode(), realtimeSession1.hashCode());
        System.assertEquals(realtimeSession2.hashCode(), realtimeSession2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSession realtimeSession1 = OASRealtimeSession.getExample();
        OASRealtimeSession realtimeSession2 = OASRealtimeSession.getExample();
        OASRealtimeSession realtimeSession3 = new OASRealtimeSession();
        OASRealtimeSession realtimeSession4 = new OASRealtimeSession();

        System.assert(realtimeSession1.equals(realtimeSession2));
        System.assert(realtimeSession3.equals(realtimeSession4));
        System.assertEquals(realtimeSession1.hashCode(), realtimeSession2.hashCode());
        System.assertEquals(realtimeSession3.hashCode(), realtimeSession4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeSession realtimeSession = new OASRealtimeSession();
        Map<String, String> x-property-mappings = realtimeSession.getx-property-mappings();
        System.assertEquals('inputAudioFormat', x-property-mappings.get('input_audio_format'));
        System.assertEquals('outputAudioFormat', x-property-mappings.get('output_audio_format'));
        System.assertEquals('inputAudioTranscription', x-property-mappings.get('input_audio_transcription'));
        System.assertEquals('turnDetection', x-property-mappings.get('turn_detection'));
        System.assertEquals('toolChoice', x-property-mappings.get('tool_choice'));
        System.assertEquals('maxResponseOutputTokens', x-property-mappings.get('max_response_output_tokens'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRealtimeSession realtimeSession = new OASRealtimeSession();
        System.assertEquals(new List<String>(), realtimeSession.modalities);
        System.assertEquals(new List<OASRealtimeResponseCreateParamsTools>(), realtimeSession.tools);
        System.assertEquals(null, realtimeSession.id);
        System.assertEquals(null, realtimeSession.model);
        System.assertEquals(null, realtimeSession.instructions);
        System.assertEquals(null, realtimeSession.voice);
        System.assertEquals(null, realtimeSession.inputAudioFormat);
        System.assertEquals(null, realtimeSession.outputAudioFormat);
        System.assertEquals(null, realtimeSession.inputAudioTranscription);
        System.assertEquals(null, realtimeSession.turnDetection);
        System.assertEquals(null, realtimeSession.toolChoice);
        System.assertEquals(null, realtimeSession.temperature);
        System.assertEquals(null, realtimeSession.maxResponseOutputTokens);
    }
}
