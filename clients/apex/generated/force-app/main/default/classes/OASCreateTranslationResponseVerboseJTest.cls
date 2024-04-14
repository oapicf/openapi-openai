@isTest
private class OASCreateTranslationResponseVerboseJTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson1 = OASCreateTranslationResponseVerboseJ.getExample();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson2 = createTranslationResponseVerboseJson1;
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson3 = new OASCreateTranslationResponseVerboseJ();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson4 = createTranslationResponseVerboseJson3;

        System.assert(createTranslationResponseVerboseJson1.equals(createTranslationResponseVerboseJson2));
        System.assert(createTranslationResponseVerboseJson2.equals(createTranslationResponseVerboseJson1));
        System.assert(createTranslationResponseVerboseJson1.equals(createTranslationResponseVerboseJson1));
        System.assert(createTranslationResponseVerboseJson3.equals(createTranslationResponseVerboseJson4));
        System.assert(createTranslationResponseVerboseJson4.equals(createTranslationResponseVerboseJson3));
        System.assert(createTranslationResponseVerboseJson3.equals(createTranslationResponseVerboseJson3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson1 = OASCreateTranslationResponseVerboseJ.getExample();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson2 = OASCreateTranslationResponseVerboseJ.getExample();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson3 = new OASCreateTranslationResponseVerboseJ();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson4 = new OASCreateTranslationResponseVerboseJ();

        System.assert(createTranslationResponseVerboseJson1.equals(createTranslationResponseVerboseJson2));
        System.assert(createTranslationResponseVerboseJson2.equals(createTranslationResponseVerboseJson1));
        System.assert(createTranslationResponseVerboseJson3.equals(createTranslationResponseVerboseJson4));
        System.assert(createTranslationResponseVerboseJson4.equals(createTranslationResponseVerboseJson3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson1 = OASCreateTranslationResponseVerboseJ.getExample();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson2 = new OASCreateTranslationResponseVerboseJ();

        System.assertEquals(false, createTranslationResponseVerboseJson1.equals('foo'));
        System.assertEquals(false, createTranslationResponseVerboseJson2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson1 = OASCreateTranslationResponseVerboseJ.getExample();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson2 = new OASCreateTranslationResponseVerboseJ();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson3;

        System.assertEquals(false, createTranslationResponseVerboseJson1.equals(createTranslationResponseVerboseJson3));
        System.assertEquals(false, createTranslationResponseVerboseJson2.equals(createTranslationResponseVerboseJson3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson1 = OASCreateTranslationResponseVerboseJ.getExample();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson2 = new OASCreateTranslationResponseVerboseJ();

        System.assertEquals(createTranslationResponseVerboseJson1.hashCode(), createTranslationResponseVerboseJson1.hashCode());
        System.assertEquals(createTranslationResponseVerboseJson2.hashCode(), createTranslationResponseVerboseJson2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson1 = OASCreateTranslationResponseVerboseJ.getExample();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson2 = OASCreateTranslationResponseVerboseJ.getExample();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson3 = new OASCreateTranslationResponseVerboseJ();
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson4 = new OASCreateTranslationResponseVerboseJ();

        System.assert(createTranslationResponseVerboseJson1.equals(createTranslationResponseVerboseJson2));
        System.assert(createTranslationResponseVerboseJson3.equals(createTranslationResponseVerboseJson4));
        System.assertEquals(createTranslationResponseVerboseJson1.hashCode(), createTranslationResponseVerboseJson2.hashCode());
        System.assertEquals(createTranslationResponseVerboseJson3.hashCode(), createTranslationResponseVerboseJson4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateTranslationResponseVerboseJ createTranslationResponseVerboseJson = new OASCreateTranslationResponseVerboseJ();
        System.assertEquals(new List<OASTranscriptionSegment>(), createTranslationResponseVerboseJson.segments);
        System.assertEquals(null, createTranslationResponseVerboseJson.language);
        System.assertEquals(null, createTranslationResponseVerboseJson.duration);
        System.assertEquals(null, createTranslationResponseVerboseJson.text);
    }
}
