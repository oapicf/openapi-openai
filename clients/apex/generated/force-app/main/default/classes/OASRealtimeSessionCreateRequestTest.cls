@isTest
private class OASRealtimeSessionCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest1 = OASRealtimeSessionCreateRequest.getExample();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest2 = realtimeSessionCreateRequest1;
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest3 = new OASRealtimeSessionCreateRequest();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest4 = realtimeSessionCreateRequest3;

        System.assert(realtimeSessionCreateRequest1.equals(realtimeSessionCreateRequest2));
        System.assert(realtimeSessionCreateRequest2.equals(realtimeSessionCreateRequest1));
        System.assert(realtimeSessionCreateRequest1.equals(realtimeSessionCreateRequest1));
        System.assert(realtimeSessionCreateRequest3.equals(realtimeSessionCreateRequest4));
        System.assert(realtimeSessionCreateRequest4.equals(realtimeSessionCreateRequest3));
        System.assert(realtimeSessionCreateRequest3.equals(realtimeSessionCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest1 = OASRealtimeSessionCreateRequest.getExample();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest2 = OASRealtimeSessionCreateRequest.getExample();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest3 = new OASRealtimeSessionCreateRequest();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest4 = new OASRealtimeSessionCreateRequest();

        System.assert(realtimeSessionCreateRequest1.equals(realtimeSessionCreateRequest2));
        System.assert(realtimeSessionCreateRequest2.equals(realtimeSessionCreateRequest1));
        System.assert(realtimeSessionCreateRequest3.equals(realtimeSessionCreateRequest4));
        System.assert(realtimeSessionCreateRequest4.equals(realtimeSessionCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest1 = OASRealtimeSessionCreateRequest.getExample();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest2 = new OASRealtimeSessionCreateRequest();

        System.assertEquals(false, realtimeSessionCreateRequest1.equals('foo'));
        System.assertEquals(false, realtimeSessionCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest1 = OASRealtimeSessionCreateRequest.getExample();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest2 = new OASRealtimeSessionCreateRequest();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest3;

        System.assertEquals(false, realtimeSessionCreateRequest1.equals(realtimeSessionCreateRequest3));
        System.assertEquals(false, realtimeSessionCreateRequest2.equals(realtimeSessionCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest1 = OASRealtimeSessionCreateRequest.getExample();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest2 = new OASRealtimeSessionCreateRequest();

        System.assertEquals(realtimeSessionCreateRequest1.hashCode(), realtimeSessionCreateRequest1.hashCode());
        System.assertEquals(realtimeSessionCreateRequest2.hashCode(), realtimeSessionCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest1 = OASRealtimeSessionCreateRequest.getExample();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest2 = OASRealtimeSessionCreateRequest.getExample();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest3 = new OASRealtimeSessionCreateRequest();
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest4 = new OASRealtimeSessionCreateRequest();

        System.assert(realtimeSessionCreateRequest1.equals(realtimeSessionCreateRequest2));
        System.assert(realtimeSessionCreateRequest3.equals(realtimeSessionCreateRequest4));
        System.assertEquals(realtimeSessionCreateRequest1.hashCode(), realtimeSessionCreateRequest2.hashCode());
        System.assertEquals(realtimeSessionCreateRequest3.hashCode(), realtimeSessionCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest = new OASRealtimeSessionCreateRequest();
        Map<String, String> x-property-mappings = realtimeSessionCreateRequest.getx-property-mappings();
        System.assertEquals('inputAudioFormat', x-property-mappings.get('input_audio_format'));
        System.assertEquals('outputAudioFormat', x-property-mappings.get('output_audio_format'));
        System.assertEquals('inputAudioTranscription', x-property-mappings.get('input_audio_transcription'));
        System.assertEquals('turnDetection', x-property-mappings.get('turn_detection'));
        System.assertEquals('toolChoice', x-property-mappings.get('tool_choice'));
        System.assertEquals('maxResponseOutputTokens', x-property-mappings.get('max_response_output_tokens'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRealtimeSessionCreateRequest realtimeSessionCreateRequest = new OASRealtimeSessionCreateRequest();
        System.assertEquals(new List<String>(), realtimeSessionCreateRequest.modalities);
        System.assertEquals(new List<OASRealtimeResponseCreateParamsTools>(), realtimeSessionCreateRequest.tools);
        System.assertEquals(null, realtimeSessionCreateRequest.model);
        System.assertEquals(null, realtimeSessionCreateRequest.instructions);
        System.assertEquals(null, realtimeSessionCreateRequest.voice);
        System.assertEquals(null, realtimeSessionCreateRequest.inputAudioFormat);
        System.assertEquals(null, realtimeSessionCreateRequest.outputAudioFormat);
        System.assertEquals(null, realtimeSessionCreateRequest.inputAudioTranscription);
        System.assertEquals(null, realtimeSessionCreateRequest.turnDetection);
        System.assertEquals(null, realtimeSessionCreateRequest.toolChoice);
        System.assertEquals(null, realtimeSessionCreateRequest.temperature);
        System.assertEquals(null, realtimeSessionCreateRequest.maxResponseOutputTokens);
    }
}
