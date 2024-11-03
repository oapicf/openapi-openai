@isTest
private class OASCreateTranscriptionResponseVerbosTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson1 = OASCreateTranscriptionResponseVerbos.getExample();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson2 = createTranscriptionResponseVerboseJson1;
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson3 = new OASCreateTranscriptionResponseVerbos();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson4 = createTranscriptionResponseVerboseJson3;

        System.assert(createTranscriptionResponseVerboseJson1.equals(createTranscriptionResponseVerboseJson2));
        System.assert(createTranscriptionResponseVerboseJson2.equals(createTranscriptionResponseVerboseJson1));
        System.assert(createTranscriptionResponseVerboseJson1.equals(createTranscriptionResponseVerboseJson1));
        System.assert(createTranscriptionResponseVerboseJson3.equals(createTranscriptionResponseVerboseJson4));
        System.assert(createTranscriptionResponseVerboseJson4.equals(createTranscriptionResponseVerboseJson3));
        System.assert(createTranscriptionResponseVerboseJson3.equals(createTranscriptionResponseVerboseJson3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson1 = OASCreateTranscriptionResponseVerbos.getExample();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson2 = OASCreateTranscriptionResponseVerbos.getExample();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson3 = new OASCreateTranscriptionResponseVerbos();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson4 = new OASCreateTranscriptionResponseVerbos();

        System.assert(createTranscriptionResponseVerboseJson1.equals(createTranscriptionResponseVerboseJson2));
        System.assert(createTranscriptionResponseVerboseJson2.equals(createTranscriptionResponseVerboseJson1));
        System.assert(createTranscriptionResponseVerboseJson3.equals(createTranscriptionResponseVerboseJson4));
        System.assert(createTranscriptionResponseVerboseJson4.equals(createTranscriptionResponseVerboseJson3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson1 = OASCreateTranscriptionResponseVerbos.getExample();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson2 = new OASCreateTranscriptionResponseVerbos();

        System.assertEquals(false, createTranscriptionResponseVerboseJson1.equals('foo'));
        System.assertEquals(false, createTranscriptionResponseVerboseJson2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson1 = OASCreateTranscriptionResponseVerbos.getExample();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson2 = new OASCreateTranscriptionResponseVerbos();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson3;

        System.assertEquals(false, createTranscriptionResponseVerboseJson1.equals(createTranscriptionResponseVerboseJson3));
        System.assertEquals(false, createTranscriptionResponseVerboseJson2.equals(createTranscriptionResponseVerboseJson3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson1 = OASCreateTranscriptionResponseVerbos.getExample();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson2 = new OASCreateTranscriptionResponseVerbos();

        System.assertEquals(createTranscriptionResponseVerboseJson1.hashCode(), createTranscriptionResponseVerboseJson1.hashCode());
        System.assertEquals(createTranscriptionResponseVerboseJson2.hashCode(), createTranscriptionResponseVerboseJson2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson1 = OASCreateTranscriptionResponseVerbos.getExample();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson2 = OASCreateTranscriptionResponseVerbos.getExample();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson3 = new OASCreateTranscriptionResponseVerbos();
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson4 = new OASCreateTranscriptionResponseVerbos();

        System.assert(createTranscriptionResponseVerboseJson1.equals(createTranscriptionResponseVerboseJson2));
        System.assert(createTranscriptionResponseVerboseJson3.equals(createTranscriptionResponseVerboseJson4));
        System.assertEquals(createTranscriptionResponseVerboseJson1.hashCode(), createTranscriptionResponseVerboseJson2.hashCode());
        System.assertEquals(createTranscriptionResponseVerboseJson3.hashCode(), createTranscriptionResponseVerboseJson4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateTranscriptionResponseVerbos createTranscriptionResponseVerboseJson = new OASCreateTranscriptionResponseVerbos();
        System.assertEquals(new List<OASTranscriptionWord>(), createTranscriptionResponseVerboseJson.words);
        System.assertEquals(new List<OASTranscriptionSegment>(), createTranscriptionResponseVerboseJson.segments);
        System.assertEquals(null, createTranscriptionResponseVerboseJson.language);
        System.assertEquals(null, createTranscriptionResponseVerboseJson.duration);
        System.assertEquals(null, createTranscriptionResponseVerboseJson.text);
    }
}
