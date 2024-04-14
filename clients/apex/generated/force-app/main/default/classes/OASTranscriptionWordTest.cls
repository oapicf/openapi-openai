@isTest
private class OASTranscriptionWordTest {
    @isTest
    private static void equalsSameInstance() {
        OASTranscriptionWord transcriptionWord1 = OASTranscriptionWord.getExample();
        OASTranscriptionWord transcriptionWord2 = transcriptionWord1;
        OASTranscriptionWord transcriptionWord3 = new OASTranscriptionWord();
        OASTranscriptionWord transcriptionWord4 = transcriptionWord3;

        System.assert(transcriptionWord1.equals(transcriptionWord2));
        System.assert(transcriptionWord2.equals(transcriptionWord1));
        System.assert(transcriptionWord1.equals(transcriptionWord1));
        System.assert(transcriptionWord3.equals(transcriptionWord4));
        System.assert(transcriptionWord4.equals(transcriptionWord3));
        System.assert(transcriptionWord3.equals(transcriptionWord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTranscriptionWord transcriptionWord1 = OASTranscriptionWord.getExample();
        OASTranscriptionWord transcriptionWord2 = OASTranscriptionWord.getExample();
        OASTranscriptionWord transcriptionWord3 = new OASTranscriptionWord();
        OASTranscriptionWord transcriptionWord4 = new OASTranscriptionWord();

        System.assert(transcriptionWord1.equals(transcriptionWord2));
        System.assert(transcriptionWord2.equals(transcriptionWord1));
        System.assert(transcriptionWord3.equals(transcriptionWord4));
        System.assert(transcriptionWord4.equals(transcriptionWord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTranscriptionWord transcriptionWord1 = OASTranscriptionWord.getExample();
        OASTranscriptionWord transcriptionWord2 = new OASTranscriptionWord();

        System.assertEquals(false, transcriptionWord1.equals('foo'));
        System.assertEquals(false, transcriptionWord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTranscriptionWord transcriptionWord1 = OASTranscriptionWord.getExample();
        OASTranscriptionWord transcriptionWord2 = new OASTranscriptionWord();
        OASTranscriptionWord transcriptionWord3;

        System.assertEquals(false, transcriptionWord1.equals(transcriptionWord3));
        System.assertEquals(false, transcriptionWord2.equals(transcriptionWord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTranscriptionWord transcriptionWord1 = OASTranscriptionWord.getExample();
        OASTranscriptionWord transcriptionWord2 = new OASTranscriptionWord();

        System.assertEquals(transcriptionWord1.hashCode(), transcriptionWord1.hashCode());
        System.assertEquals(transcriptionWord2.hashCode(), transcriptionWord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTranscriptionWord transcriptionWord1 = OASTranscriptionWord.getExample();
        OASTranscriptionWord transcriptionWord2 = OASTranscriptionWord.getExample();
        OASTranscriptionWord transcriptionWord3 = new OASTranscriptionWord();
        OASTranscriptionWord transcriptionWord4 = new OASTranscriptionWord();

        System.assert(transcriptionWord1.equals(transcriptionWord2));
        System.assert(transcriptionWord3.equals(transcriptionWord4));
        System.assertEquals(transcriptionWord1.hashCode(), transcriptionWord2.hashCode());
        System.assertEquals(transcriptionWord3.hashCode(), transcriptionWord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTranscriptionWord transcriptionWord = new OASTranscriptionWord();
        Map<String, String> x-property-mappings = transcriptionWord.getx-property-mappings();
        System.assertEquals('r_end', x-property-mappings.get('end'));
    }
}
