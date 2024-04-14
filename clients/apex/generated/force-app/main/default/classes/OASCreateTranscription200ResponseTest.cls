@isTest
private class OASCreateTranscription200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranscription200Response createTranscription200Response1 = OASCreateTranscription200Response.getExample();
        OASCreateTranscription200Response createTranscription200Response2 = createTranscription200Response1;
        OASCreateTranscription200Response createTranscription200Response3 = new OASCreateTranscription200Response();
        OASCreateTranscription200Response createTranscription200Response4 = createTranscription200Response3;

        System.assert(createTranscription200Response1.equals(createTranscription200Response2));
        System.assert(createTranscription200Response2.equals(createTranscription200Response1));
        System.assert(createTranscription200Response1.equals(createTranscription200Response1));
        System.assert(createTranscription200Response3.equals(createTranscription200Response4));
        System.assert(createTranscription200Response4.equals(createTranscription200Response3));
        System.assert(createTranscription200Response3.equals(createTranscription200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranscription200Response createTranscription200Response1 = OASCreateTranscription200Response.getExample();
        OASCreateTranscription200Response createTranscription200Response2 = OASCreateTranscription200Response.getExample();
        OASCreateTranscription200Response createTranscription200Response3 = new OASCreateTranscription200Response();
        OASCreateTranscription200Response createTranscription200Response4 = new OASCreateTranscription200Response();

        System.assert(createTranscription200Response1.equals(createTranscription200Response2));
        System.assert(createTranscription200Response2.equals(createTranscription200Response1));
        System.assert(createTranscription200Response3.equals(createTranscription200Response4));
        System.assert(createTranscription200Response4.equals(createTranscription200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranscription200Response createTranscription200Response1 = OASCreateTranscription200Response.getExample();
        OASCreateTranscription200Response createTranscription200Response2 = new OASCreateTranscription200Response();

        System.assertEquals(false, createTranscription200Response1.equals('foo'));
        System.assertEquals(false, createTranscription200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranscription200Response createTranscription200Response1 = OASCreateTranscription200Response.getExample();
        OASCreateTranscription200Response createTranscription200Response2 = new OASCreateTranscription200Response();
        OASCreateTranscription200Response createTranscription200Response3;

        System.assertEquals(false, createTranscription200Response1.equals(createTranscription200Response3));
        System.assertEquals(false, createTranscription200Response2.equals(createTranscription200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranscription200Response createTranscription200Response1 = OASCreateTranscription200Response.getExample();
        OASCreateTranscription200Response createTranscription200Response2 = new OASCreateTranscription200Response();

        System.assertEquals(createTranscription200Response1.hashCode(), createTranscription200Response1.hashCode());
        System.assertEquals(createTranscription200Response2.hashCode(), createTranscription200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranscription200Response createTranscription200Response1 = OASCreateTranscription200Response.getExample();
        OASCreateTranscription200Response createTranscription200Response2 = OASCreateTranscription200Response.getExample();
        OASCreateTranscription200Response createTranscription200Response3 = new OASCreateTranscription200Response();
        OASCreateTranscription200Response createTranscription200Response4 = new OASCreateTranscription200Response();

        System.assert(createTranscription200Response1.equals(createTranscription200Response2));
        System.assert(createTranscription200Response3.equals(createTranscription200Response4));
        System.assertEquals(createTranscription200Response1.hashCode(), createTranscription200Response2.hashCode());
        System.assertEquals(createTranscription200Response3.hashCode(), createTranscription200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateTranscription200Response createTranscription200Response = new OASCreateTranscription200Response();
        System.assertEquals(new List<OASTranscriptionWord>(), createTranscription200Response.words);
        System.assertEquals(new List<OASTranscriptionSegment>(), createTranscription200Response.segments);
        System.assertEquals(null, createTranscription200Response.text);
        System.assertEquals(null, createTranscription200Response.language);
        System.assertEquals(null, createTranscription200Response.duration);
    }
}
