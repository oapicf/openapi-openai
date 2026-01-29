@isTest
private class OASCreateTranslation200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranslation200Response createTranslation200Response1 = OASCreateTranslation200Response.getExample();
        OASCreateTranslation200Response createTranslation200Response2 = createTranslation200Response1;
        OASCreateTranslation200Response createTranslation200Response3 = new OASCreateTranslation200Response();
        OASCreateTranslation200Response createTranslation200Response4 = createTranslation200Response3;

        System.assert(createTranslation200Response1.equals(createTranslation200Response2));
        System.assert(createTranslation200Response2.equals(createTranslation200Response1));
        System.assert(createTranslation200Response1.equals(createTranslation200Response1));
        System.assert(createTranslation200Response3.equals(createTranslation200Response4));
        System.assert(createTranslation200Response4.equals(createTranslation200Response3));
        System.assert(createTranslation200Response3.equals(createTranslation200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranslation200Response createTranslation200Response1 = OASCreateTranslation200Response.getExample();
        OASCreateTranslation200Response createTranslation200Response2 = OASCreateTranslation200Response.getExample();
        OASCreateTranslation200Response createTranslation200Response3 = new OASCreateTranslation200Response();
        OASCreateTranslation200Response createTranslation200Response4 = new OASCreateTranslation200Response();

        System.assert(createTranslation200Response1.equals(createTranslation200Response2));
        System.assert(createTranslation200Response2.equals(createTranslation200Response1));
        System.assert(createTranslation200Response3.equals(createTranslation200Response4));
        System.assert(createTranslation200Response4.equals(createTranslation200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranslation200Response createTranslation200Response1 = OASCreateTranslation200Response.getExample();
        OASCreateTranslation200Response createTranslation200Response2 = new OASCreateTranslation200Response();

        System.assertEquals(false, createTranslation200Response1.equals('foo'));
        System.assertEquals(false, createTranslation200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranslation200Response createTranslation200Response1 = OASCreateTranslation200Response.getExample();
        OASCreateTranslation200Response createTranslation200Response2 = new OASCreateTranslation200Response();
        OASCreateTranslation200Response createTranslation200Response3;

        System.assertEquals(false, createTranslation200Response1.equals(createTranslation200Response3));
        System.assertEquals(false, createTranslation200Response2.equals(createTranslation200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranslation200Response createTranslation200Response1 = OASCreateTranslation200Response.getExample();
        OASCreateTranslation200Response createTranslation200Response2 = new OASCreateTranslation200Response();

        System.assertEquals(createTranslation200Response1.hashCode(), createTranslation200Response1.hashCode());
        System.assertEquals(createTranslation200Response2.hashCode(), createTranslation200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranslation200Response createTranslation200Response1 = OASCreateTranslation200Response.getExample();
        OASCreateTranslation200Response createTranslation200Response2 = OASCreateTranslation200Response.getExample();
        OASCreateTranslation200Response createTranslation200Response3 = new OASCreateTranslation200Response();
        OASCreateTranslation200Response createTranslation200Response4 = new OASCreateTranslation200Response();

        System.assert(createTranslation200Response1.equals(createTranslation200Response2));
        System.assert(createTranslation200Response3.equals(createTranslation200Response4));
        System.assertEquals(createTranslation200Response1.hashCode(), createTranslation200Response2.hashCode());
        System.assertEquals(createTranslation200Response3.hashCode(), createTranslation200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateTranslation200Response createTranslation200Response = new OASCreateTranslation200Response();
        System.assertEquals(new List<OASTranscriptionSegment>(), createTranslation200Response.segments);
        System.assertEquals(null, createTranslation200Response.text);
        System.assertEquals(null, createTranslation200Response.language);
        System.assertEquals(null, createTranslation200Response.duration);
    }
}
