@isTest
private class OASRealtimeSessionCreateResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse1 = OASRealtimeSessionCreateResponse.getExample();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse2 = realtimeSessionCreateResponse1;
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse3 = new OASRealtimeSessionCreateResponse();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse4 = realtimeSessionCreateResponse3;

        System.assert(realtimeSessionCreateResponse1.equals(realtimeSessionCreateResponse2));
        System.assert(realtimeSessionCreateResponse2.equals(realtimeSessionCreateResponse1));
        System.assert(realtimeSessionCreateResponse1.equals(realtimeSessionCreateResponse1));
        System.assert(realtimeSessionCreateResponse3.equals(realtimeSessionCreateResponse4));
        System.assert(realtimeSessionCreateResponse4.equals(realtimeSessionCreateResponse3));
        System.assert(realtimeSessionCreateResponse3.equals(realtimeSessionCreateResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse1 = OASRealtimeSessionCreateResponse.getExample();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse2 = OASRealtimeSessionCreateResponse.getExample();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse3 = new OASRealtimeSessionCreateResponse();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse4 = new OASRealtimeSessionCreateResponse();

        System.assert(realtimeSessionCreateResponse1.equals(realtimeSessionCreateResponse2));
        System.assert(realtimeSessionCreateResponse2.equals(realtimeSessionCreateResponse1));
        System.assert(realtimeSessionCreateResponse3.equals(realtimeSessionCreateResponse4));
        System.assert(realtimeSessionCreateResponse4.equals(realtimeSessionCreateResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse1 = OASRealtimeSessionCreateResponse.getExample();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse2 = new OASRealtimeSessionCreateResponse();

        System.assertEquals(false, realtimeSessionCreateResponse1.equals('foo'));
        System.assertEquals(false, realtimeSessionCreateResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse1 = OASRealtimeSessionCreateResponse.getExample();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse2 = new OASRealtimeSessionCreateResponse();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse3;

        System.assertEquals(false, realtimeSessionCreateResponse1.equals(realtimeSessionCreateResponse3));
        System.assertEquals(false, realtimeSessionCreateResponse2.equals(realtimeSessionCreateResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse1 = OASRealtimeSessionCreateResponse.getExample();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse2 = new OASRealtimeSessionCreateResponse();

        System.assertEquals(realtimeSessionCreateResponse1.hashCode(), realtimeSessionCreateResponse1.hashCode());
        System.assertEquals(realtimeSessionCreateResponse2.hashCode(), realtimeSessionCreateResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse1 = OASRealtimeSessionCreateResponse.getExample();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse2 = OASRealtimeSessionCreateResponse.getExample();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse3 = new OASRealtimeSessionCreateResponse();
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse4 = new OASRealtimeSessionCreateResponse();

        System.assert(realtimeSessionCreateResponse1.equals(realtimeSessionCreateResponse2));
        System.assert(realtimeSessionCreateResponse3.equals(realtimeSessionCreateResponse4));
        System.assertEquals(realtimeSessionCreateResponse1.hashCode(), realtimeSessionCreateResponse2.hashCode());
        System.assertEquals(realtimeSessionCreateResponse3.hashCode(), realtimeSessionCreateResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse = new OASRealtimeSessionCreateResponse();
        Map<String, String> x-property-mappings = realtimeSessionCreateResponse.getx-property-mappings();
        System.assertEquals('clientSecret', x-property-mappings.get('client_secret'));
        System.assertEquals('inputAudioFormat', x-property-mappings.get('input_audio_format'));
        System.assertEquals('outputAudioFormat', x-property-mappings.get('output_audio_format'));
        System.assertEquals('inputAudioTranscription', x-property-mappings.get('input_audio_transcription'));
        System.assertEquals('turnDetection', x-property-mappings.get('turn_detection'));
        System.assertEquals('toolChoice', x-property-mappings.get('tool_choice'));
        System.assertEquals('maxResponseOutputTokens', x-property-mappings.get('max_response_output_tokens'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRealtimeSessionCreateResponse realtimeSessionCreateResponse = new OASRealtimeSessionCreateResponse();
        System.assertEquals(new List<String>(), realtimeSessionCreateResponse.modalities);
        System.assertEquals(new List<OASRealtimeResponseCreateParamsTools>(), realtimeSessionCreateResponse.tools);
        System.assertEquals(null, realtimeSessionCreateResponse.clientSecret);
        System.assertEquals(null, realtimeSessionCreateResponse.instructions);
        System.assertEquals(null, realtimeSessionCreateResponse.voice);
        System.assertEquals(null, realtimeSessionCreateResponse.inputAudioFormat);
        System.assertEquals(null, realtimeSessionCreateResponse.outputAudioFormat);
        System.assertEquals(null, realtimeSessionCreateResponse.inputAudioTranscription);
        System.assertEquals(null, realtimeSessionCreateResponse.turnDetection);
        System.assertEquals(null, realtimeSessionCreateResponse.toolChoice);
        System.assertEquals(null, realtimeSessionCreateResponse.temperature);
        System.assertEquals(null, realtimeSessionCreateResponse.maxResponseOutputTokens);
    }
}
