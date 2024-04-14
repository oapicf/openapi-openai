@isTest
private class OASTranscriptionSegmentTest {
    @isTest
    private static void equalsSameInstance() {
        OASTranscriptionSegment transcriptionSegment1 = OASTranscriptionSegment.getExample();
        OASTranscriptionSegment transcriptionSegment2 = transcriptionSegment1;
        OASTranscriptionSegment transcriptionSegment3 = new OASTranscriptionSegment();
        OASTranscriptionSegment transcriptionSegment4 = transcriptionSegment3;

        System.assert(transcriptionSegment1.equals(transcriptionSegment2));
        System.assert(transcriptionSegment2.equals(transcriptionSegment1));
        System.assert(transcriptionSegment1.equals(transcriptionSegment1));
        System.assert(transcriptionSegment3.equals(transcriptionSegment4));
        System.assert(transcriptionSegment4.equals(transcriptionSegment3));
        System.assert(transcriptionSegment3.equals(transcriptionSegment3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTranscriptionSegment transcriptionSegment1 = OASTranscriptionSegment.getExample();
        OASTranscriptionSegment transcriptionSegment2 = OASTranscriptionSegment.getExample();
        OASTranscriptionSegment transcriptionSegment3 = new OASTranscriptionSegment();
        OASTranscriptionSegment transcriptionSegment4 = new OASTranscriptionSegment();

        System.assert(transcriptionSegment1.equals(transcriptionSegment2));
        System.assert(transcriptionSegment2.equals(transcriptionSegment1));
        System.assert(transcriptionSegment3.equals(transcriptionSegment4));
        System.assert(transcriptionSegment4.equals(transcriptionSegment3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTranscriptionSegment transcriptionSegment1 = OASTranscriptionSegment.getExample();
        OASTranscriptionSegment transcriptionSegment2 = new OASTranscriptionSegment();

        System.assertEquals(false, transcriptionSegment1.equals('foo'));
        System.assertEquals(false, transcriptionSegment2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTranscriptionSegment transcriptionSegment1 = OASTranscriptionSegment.getExample();
        OASTranscriptionSegment transcriptionSegment2 = new OASTranscriptionSegment();
        OASTranscriptionSegment transcriptionSegment3;

        System.assertEquals(false, transcriptionSegment1.equals(transcriptionSegment3));
        System.assertEquals(false, transcriptionSegment2.equals(transcriptionSegment3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTranscriptionSegment transcriptionSegment1 = OASTranscriptionSegment.getExample();
        OASTranscriptionSegment transcriptionSegment2 = new OASTranscriptionSegment();

        System.assertEquals(transcriptionSegment1.hashCode(), transcriptionSegment1.hashCode());
        System.assertEquals(transcriptionSegment2.hashCode(), transcriptionSegment2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTranscriptionSegment transcriptionSegment1 = OASTranscriptionSegment.getExample();
        OASTranscriptionSegment transcriptionSegment2 = OASTranscriptionSegment.getExample();
        OASTranscriptionSegment transcriptionSegment3 = new OASTranscriptionSegment();
        OASTranscriptionSegment transcriptionSegment4 = new OASTranscriptionSegment();

        System.assert(transcriptionSegment1.equals(transcriptionSegment2));
        System.assert(transcriptionSegment3.equals(transcriptionSegment4));
        System.assertEquals(transcriptionSegment1.hashCode(), transcriptionSegment2.hashCode());
        System.assertEquals(transcriptionSegment3.hashCode(), transcriptionSegment4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTranscriptionSegment transcriptionSegment = new OASTranscriptionSegment();
        Map<String, String> x-property-mappings = transcriptionSegment.getx-property-mappings();
        System.assertEquals('r_end', x-property-mappings.get('end'));
        System.assertEquals('avgLogprob', x-property-mappings.get('avg_logprob'));
        System.assertEquals('compressionRatio', x-property-mappings.get('compression_ratio'));
        System.assertEquals('noSpeechProb', x-property-mappings.get('no_speech_prob'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTranscriptionSegment transcriptionSegment = new OASTranscriptionSegment();
        System.assertEquals(new List<Integer>(), transcriptionSegment.tokens);
        System.assertEquals(null, transcriptionSegment.id);
        System.assertEquals(null, transcriptionSegment.seek);
        System.assertEquals(null, transcriptionSegment.start);
        System.assertEquals(null, transcriptionSegment.r_end);
        System.assertEquals(null, transcriptionSegment.text);
        System.assertEquals(null, transcriptionSegment.temperature);
        System.assertEquals(null, transcriptionSegment.avgLogprob);
        System.assertEquals(null, transcriptionSegment.compressionRatio);
        System.assertEquals(null, transcriptionSegment.noSpeechProb);
    }
}
