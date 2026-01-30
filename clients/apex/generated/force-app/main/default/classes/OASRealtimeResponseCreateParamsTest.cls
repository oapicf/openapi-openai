@isTest
private class OASRealtimeResponseCreateParamsTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseCreateParams realtimeResponseCreateParams1 = OASRealtimeResponseCreateParams.getExample();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams2 = realtimeResponseCreateParams1;
        OASRealtimeResponseCreateParams realtimeResponseCreateParams3 = new OASRealtimeResponseCreateParams();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams4 = realtimeResponseCreateParams3;

        System.assert(realtimeResponseCreateParams1.equals(realtimeResponseCreateParams2));
        System.assert(realtimeResponseCreateParams2.equals(realtimeResponseCreateParams1));
        System.assert(realtimeResponseCreateParams1.equals(realtimeResponseCreateParams1));
        System.assert(realtimeResponseCreateParams3.equals(realtimeResponseCreateParams4));
        System.assert(realtimeResponseCreateParams4.equals(realtimeResponseCreateParams3));
        System.assert(realtimeResponseCreateParams3.equals(realtimeResponseCreateParams3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseCreateParams realtimeResponseCreateParams1 = OASRealtimeResponseCreateParams.getExample();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams2 = OASRealtimeResponseCreateParams.getExample();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams3 = new OASRealtimeResponseCreateParams();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams4 = new OASRealtimeResponseCreateParams();

        System.assert(realtimeResponseCreateParams1.equals(realtimeResponseCreateParams2));
        System.assert(realtimeResponseCreateParams2.equals(realtimeResponseCreateParams1));
        System.assert(realtimeResponseCreateParams3.equals(realtimeResponseCreateParams4));
        System.assert(realtimeResponseCreateParams4.equals(realtimeResponseCreateParams3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseCreateParams realtimeResponseCreateParams1 = OASRealtimeResponseCreateParams.getExample();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams2 = new OASRealtimeResponseCreateParams();

        System.assertEquals(false, realtimeResponseCreateParams1.equals('foo'));
        System.assertEquals(false, realtimeResponseCreateParams2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseCreateParams realtimeResponseCreateParams1 = OASRealtimeResponseCreateParams.getExample();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams2 = new OASRealtimeResponseCreateParams();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams3;

        System.assertEquals(false, realtimeResponseCreateParams1.equals(realtimeResponseCreateParams3));
        System.assertEquals(false, realtimeResponseCreateParams2.equals(realtimeResponseCreateParams3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseCreateParams realtimeResponseCreateParams1 = OASRealtimeResponseCreateParams.getExample();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams2 = new OASRealtimeResponseCreateParams();

        System.assertEquals(realtimeResponseCreateParams1.hashCode(), realtimeResponseCreateParams1.hashCode());
        System.assertEquals(realtimeResponseCreateParams2.hashCode(), realtimeResponseCreateParams2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseCreateParams realtimeResponseCreateParams1 = OASRealtimeResponseCreateParams.getExample();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams2 = OASRealtimeResponseCreateParams.getExample();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams3 = new OASRealtimeResponseCreateParams();
        OASRealtimeResponseCreateParams realtimeResponseCreateParams4 = new OASRealtimeResponseCreateParams();

        System.assert(realtimeResponseCreateParams1.equals(realtimeResponseCreateParams2));
        System.assert(realtimeResponseCreateParams3.equals(realtimeResponseCreateParams4));
        System.assertEquals(realtimeResponseCreateParams1.hashCode(), realtimeResponseCreateParams2.hashCode());
        System.assertEquals(realtimeResponseCreateParams3.hashCode(), realtimeResponseCreateParams4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeResponseCreateParams realtimeResponseCreateParams = new OASRealtimeResponseCreateParams();
        Map<String, String> x-property-mappings = realtimeResponseCreateParams.getx-property-mappings();
        System.assertEquals('outputAudioFormat', x-property-mappings.get('output_audio_format'));
        System.assertEquals('toolChoice', x-property-mappings.get('tool_choice'));
        System.assertEquals('maxResponseOutputTokens', x-property-mappings.get('max_response_output_tokens'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRealtimeResponseCreateParams realtimeResponseCreateParams = new OASRealtimeResponseCreateParams();
        System.assertEquals(new List<String>(), realtimeResponseCreateParams.modalities);
        System.assertEquals(new List<OASRealtimeResponseCreateParamsTools>(), realtimeResponseCreateParams.tools);
        System.assertEquals(new List<OASRealtimeConversationItem>(), realtimeResponseCreateParams.input);
        System.assertEquals(null, realtimeResponseCreateParams.instructions);
        System.assertEquals(null, realtimeResponseCreateParams.voice);
        System.assertEquals(null, realtimeResponseCreateParams.outputAudioFormat);
        System.assertEquals(null, realtimeResponseCreateParams.toolChoice);
        System.assertEquals(null, realtimeResponseCreateParams.temperature);
        System.assertEquals(null, realtimeResponseCreateParams.maxResponseOutputTokens);
        System.assertEquals(null, realtimeResponseCreateParams.conversation);
        System.assertEquals(null, realtimeResponseCreateParams.metadata);
    }
}
